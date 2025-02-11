package com.chen.cloudshadow.pojo;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 电影详情表
 * </p>
 *
 * @author wangchen
 * @since 2025-02-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("goods_info")
@ApiModel(value="GoodsInfo对象", description="电影详情表")
public class GoodsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "电影名称")
    private String name;

    @ApiModelProperty(value = "电影描述")
    private String description;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "折扣")
    private Double discount;

    @ApiModelProperty(value = "销量")
    private Integer sales;

    @ApiModelProperty(value = "点赞数")
    private Integer hot;

    @ApiModelProperty(value = "是否推荐")
    private String recommend;

    @ApiModelProperty(value = "演员")
    private String actor;

    @ApiModelProperty(value = "放映时间")
    private LocalDateTime beginTime;

    @ApiModelProperty(value = "放映时长")
    private Integer time;

    @ApiModelProperty(value = "所属类型")
    private Long typeId;

    @ApiModelProperty(value = "图片id,用英文逗号隔开")
    private String fields;


}
