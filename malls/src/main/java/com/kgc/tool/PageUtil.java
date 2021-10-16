package com.kgc.tool;

import lombok.Data;

import java.util.List;
@Data
public class PageUtil<T> {
    private Integer pageIndex;
    private Integer pageCount;
    private Integer pageSize;
    private Integer totalCount;
    private List<T> list;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        this.pageCount=this.totalCount%this.pageSize==0?
                this.totalCount/this.pageSize:
                this.totalCount/this.pageSize+1;

    }
}
