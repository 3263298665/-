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
 * 影院表
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cinemas")
@ApiModel(value="Cinemas对象", description="影院表")
public class Cinemas implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "影院唯一标识符")
    @TableId(value = "cinema_id", type = IdType.AUTO)
    private Integer cinemaId;

    @ApiModelProperty(value = "影院商家ID")
    @TableField("owner_id")
    private Integer ownerId;

    @ApiModelProperty(value = "影院名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "影院地址")
    @TableField("location")
    private String location;

    @ApiModelProperty(value = "影院联系电话")
    @TableField("phone_number")
    private String phoneNumber;

    @ApiModelProperty(value = "影院添加时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "影院信息更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}
