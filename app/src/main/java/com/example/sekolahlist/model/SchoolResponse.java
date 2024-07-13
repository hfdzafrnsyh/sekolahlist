package com.example.sekolahlist.model;

import java.util.List;

public class SchoolResponse {

    private String creator;
    private String status;
    private Object Donate;

    private List<SchollEntity> dataSekolah;

    private Long total_data;

    private int page;

    private int per_page;

    public SchoolResponse(String creator, String status, Object donate, List<SchollEntity> dataSekolah, Long total_data, int page, int per_page) {
        this.creator = creator;
        this.status = status;
        this.Donate = donate;
        this.dataSekolah = dataSekolah;
        this.total_data = total_data;
        this.page = page;
        this.per_page = per_page;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getDonate() {
        return Donate;
    }

    public void setDonate(Object donate) {
        Donate = donate;
    }

    public List<SchollEntity> getDataSekolah() {
        return dataSekolah;
    }

    public void setDataSekolah(List<SchollEntity> dataSekolah) {
        this.dataSekolah = dataSekolah;
    }

    public Long getTotal_data() {
        return total_data;
    }

    public void setTotal_data(Long total_data) {
        this.total_data = total_data;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }
}
