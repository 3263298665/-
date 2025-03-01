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
 * 放映厅表
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("halls")
@ApiModel(value="Halls对象", description="放映厅表")
public class Halls implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "放映厅唯一标识符")
    @TableId(value = "hall_id", type = IdType.AUTO)
    private Integer hallId;

    @ApiModelProperty(value = "所属影院ID")
    @TableField("cinema_id")
    private Integer cinemaId;

    @ApiModelProperty(value = "放映厅名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "放映厅容量（座位数）")
    @TableField("capacity")
    private Integer capacity;

    @ApiModelProperty(value = "放映厅添加时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "放映厅信息更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}
