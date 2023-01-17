package com.example.customspinner;

public class CountryModal {
    String country;
    int code,cflag;

    public CountryModal(String country, int code, int cflag) {
        this.country = country;
        this.code = code;
        this.cflag = cflag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCflag() {
        return cflag;
    }

    public void setCflag(int cflag) {
        this.cflag = cflag;
    }
}
