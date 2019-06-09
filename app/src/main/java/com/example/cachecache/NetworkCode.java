package com.example.cachecache;

public enum NetworkCode {
    MCC("mcc"),
    MNC("mnc");

    private String toString;

    NetworkCode(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}