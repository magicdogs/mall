package com.symagic.mail.web.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.data.domain.Page;

import java.util.List;

public class PageWarp<T> {

    @JsonProperty("totalRow")
    private int totalRow;
    @JsonProperty("totalPage")
    private int totalPage;
    @JsonProperty("dataList")
    private List<T> dataList;


    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }

    public static PageWarp warp(Page page) {
        PageWarp pageWarp = new PageWarp();
        pageWarp.setDataList(page.getContent());
        pageWarp.setTotalRow((int)page.getTotalElements());
        pageWarp.setTotalPage(page.getTotalPages());
        return pageWarp;
    }
}
