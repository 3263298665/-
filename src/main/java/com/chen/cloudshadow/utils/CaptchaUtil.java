package com.chen.cloudshadow.utils;

import com.chen.cloudshadow.dto.CaptchaDto;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class CaptchaUtil {
    private static final int WIDTH = 100;
    private static final int HEIGHT = 50;
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int CHAR_COUNT = 6;

    private static final Map<String,Object> captchaMap = new ConcurrentHashMap<>();
    public static Map<String,Object> generateCaptcha(String username) {
        BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        // Set background color
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, WIDTH, HEIGHT);

        // Set font
        g2d.setFont(new Font("Arial", Font.BOLD, 30));
        g2d.setColor(Color.BLACK);

        // Draw random characters
        Random random = new Random();
        StringBuilder captchaText = new StringBuilder();
        for (int i = 0; i < CHAR_COUNT; i++) {
            char c = CHARACTERS.charAt(random.nextInt(CHARACTERS.length()));
            captchaText.append(c);
            int x = i * (WIDTH / CHAR_COUNT);
            int y = HEIGHT / 2;
            g2d.drawString(String.valueOf(c), x, y);
        }
        // Draw random lines
        g2d.setColor(Color.GRAY);
        for (int i = 0; i < 5; i++) {
            int x1 = random.nextInt(WIDTH);
            int y1 = random.nextInt(HEIGHT);
            int x2 = random.nextInt(WIDTH);
            int y2 = random.nextInt(HEIGHT);
            g2d.drawLine(x1, y1, x2, y2);
        }

        g2d.dispose();

        // Convert image to Base64 string
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(image, "png", baos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] imageBytes = baos.toByteArray();
        captchaMap.put(username,new CaptchaDto(captchaText.toString(),Base64.getEncoder().encodeToString(imageBytes)));
        return captchaMap;
    }
}