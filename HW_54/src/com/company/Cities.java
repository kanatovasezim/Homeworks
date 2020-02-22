package com.company;
public class Cities implements Comparable<Cities>{
    private Integer code;
    private String name;

    public Cities(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return code +
                " " + name ;
    }

    @Override
    public int compareTo(Cities o) {
        if (this.getCode()>o.getCode()){
        return -1;
        } else if (this.getCode()<o.getCode()){
        return 1;
        } else
        return 0;
    }
}
