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
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 电影表
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("movies")
@ApiModel(value="Movies对象", description="电影表")
public class Movies implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "电影唯一标识符")
    @TableId(value = "movie_id", type = IdType.AUTO)
    private Integer movieId;

    @ApiModelProperty(value = "电影标题")
    @TableField("title")
    private String title;

    @ApiModelProperty(value = "电影描述")
    @TableField("description")
    private String description;

    @ApiModelProperty(value = "电影时长（分钟）")
    @TableField("duration")
    private Integer duration;

    @ApiModelProperty(value = "电影上映日期")
    @TableField("release_date")
    private LocalDate releaseDate;

    @ApiModelProperty(value = "电影类型")
    @TableField("genre")
    private String genre;

    @ApiModelProperty(value = "导演")
    @TableField("director")
    private String director;

    @ApiModelProperty(value = "主演")
    @TableField("cast")
    private String cast;

    @ApiModelProperty(value = "电影添加时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "电影信息更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}
