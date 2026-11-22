package com.linear.framework.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum StatusEnum {
    // 启用
    ENABLE(Boolean.TRUE),
    // 禁用
    DISABLED(Boolean.FALSE);

    private final Boolean value;
}
