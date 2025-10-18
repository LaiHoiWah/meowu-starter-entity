package com.meowu.starter.entity.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Identity<T>{

    private T id;

    @Override
    public boolean equals(Object compare){
        if(this.getClass() != compare.getClass()){
            return false;
        }else if(this.getId().getClass() != ((Identity<?>) compare).getId().getClass()){
            return false;
        }

        Identity<?> convert = (Identity<?>) compare;
        return this.getId() == convert.getId() || this.getId().equals(convert.getId());
    }
}
