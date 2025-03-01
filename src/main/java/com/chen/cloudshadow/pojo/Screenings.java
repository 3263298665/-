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
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 场次表
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("screenings")
@ApiModel(value="Screenings对象", description="场次表")
public class Screenings implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "场次唯一标识符")
    @TableId(value = "screening_id", type = IdType.AUTO)
    private Integer screeningId;

    @ApiModelProperty(value = "电影ID")
    @TableField("movie_id")
    private Integer movieId;

    @ApiModelProperty(value = "放映厅ID")
    @TableField("hall_id")
    private Integer hallId;

    @ApiModelProperty(value = "场次开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "场次结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "票价")
    @TableField("price")
    private BigDecimal price;

    @ApiModelProperty(value = "场次添加时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "场次信息更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}
