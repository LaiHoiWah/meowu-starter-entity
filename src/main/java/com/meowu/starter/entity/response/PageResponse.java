package com.meowu.starter.entity.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageResponse<T>{

    private Integer currentPage;
    private Long total;
    private List<T> content;
}
