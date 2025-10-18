package com.meowu.starter.entity.domain;

import java.util.Date;

public interface Deletable{

    Date getDeleteTime();

    void setDeleteTime(Date deleteTime);
}
