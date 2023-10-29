package top.nekonyako.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Copyright (C),2021-2023
 * All rights reserved.
 * FileName: PageInfo
 * @author NEKOnyako
 * Description: 分页查询参数数据
 * Date: 2023/09/05 0005 0:39
 */

@Data
@ApiModel(value="分页参数",description="发往服务端的数据")
public class PageInfo<T> implements Serializable {
    @ApiModelProperty(value="查询参数")
    private T data;
    @ApiModelProperty(value="当前页数",example="0")
    private Integer page;
    @ApiModelProperty(value="每页条数",example="10")
    private Integer limit;
}
