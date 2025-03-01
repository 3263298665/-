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
 * 座位表
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("seats")
@ApiModel(value="Seats对象", description="座位表")
public class Seats implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "座位唯一标识符")
    @TableId(value = "seat_id", type = IdType.AUTO)
    private Integer seatId;

    @ApiModelProperty(value = "放映厅ID")
    @TableField("hall_id")
    private Integer hallId;

    @ApiModelProperty(value = "座位行号")
    @TableField("seat_row")
    private Integer seatRow;

    @ApiModelProperty(value = "座位号")
    @TableField("number")
    private Integer number;

    @ApiModelProperty(value = "座位添加时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "座位信息更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}
