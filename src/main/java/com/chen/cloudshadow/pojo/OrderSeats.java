package com.chen.cloudshadow.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单座位表
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order_seats")
@ApiModel(value="OrderSeats对象", description="订单座位表")
public class OrderSeats implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单座位唯一标识符")
    @TableId(value = "order_seat_id", type = IdType.AUTO)
    private Integer orderSeatId;

    @ApiModelProperty(value = "订单ID")
    @TableField("order_id")
    private Integer orderId;

    @ApiModelProperty(value = "座位ID")
    @TableField("seat_id")
    private Integer seatId;

    @ApiModelProperty(value = "订单座位添加时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "订单座位更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}
