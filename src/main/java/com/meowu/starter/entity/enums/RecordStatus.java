package com.meowu.starter.entity.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum RecordStatus{

    ACTIVE("A", "ACTIVE"),

    INACTIVE("I", "INACTIVE"),

    DELETE("D", "DELETE"),

    DEPRECATE("DP", "DEPRECATE"),

    ;

    private final String code;
    private final String description;

    public static RecordStatus getByCode(String code){
        if(StringUtils.isNotBlank(code)){
            for(RecordStatus status : RecordStatus.values()){
                if(status.getCode().equals(code)){
                    return status;
                }
            }
            throw new IllegalArgumentException("No matched with code: " + code);
        }else{
            return null;
        }
    }
}
