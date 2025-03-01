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
 * 角色权限表
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("roles")
@ApiModel(value="Roles对象", description="角色权限表")
public class Roles implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "角色唯一标识符")
    @TableId(value = "role_id", type = IdType.AUTO)
    private Integer roleId;

    @ApiModelProperty(value = "角色名称")
    @TableField("role_name")
    private String roleName;

    @ApiModelProperty(value = "角色添加时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "角色信息更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}
