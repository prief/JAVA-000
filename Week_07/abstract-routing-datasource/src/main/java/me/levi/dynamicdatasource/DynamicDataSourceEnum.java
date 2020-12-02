package me.dh.dynamicdatasource;

import lombok.Getter;


@Getter
public enum DynamicDataSourceEnum {
    /**
     * 主库
     */
    PRIMARY("primary"),
    /**
     * 从库
     */
    REPLICA("replica");

    private String dataSourceName;

    DynamicDataSourceEnum(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }
}
