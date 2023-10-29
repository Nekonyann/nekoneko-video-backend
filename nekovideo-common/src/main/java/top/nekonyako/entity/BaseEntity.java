package top.nekonyako.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Copyright (C),2021-2023
 * All rights reserved.
 * FileName: BaseEntity
 * @author NEKOnyako
 * Description: 日期自动填充
 * Date: 2023/09/22 0022 11:33
 */

@Data
public abstract class BaseEntity implements Serializable {
    @TableId
    private Long id; //主键id

    @TableField(fill = FieldFill.INSERT) //MP自动填充
    private LocalDateTime created;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updated;
}
