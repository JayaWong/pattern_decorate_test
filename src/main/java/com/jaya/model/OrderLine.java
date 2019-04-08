package com.jaya.model;

/**
 * @author wangjianying
 * @Title: OrderLine
 * @Description: ${END}
 * @date 2019/4/316:25
 */
public class OrderLine {
    private String name;
    private Long money;
    private Integer num;

    public Double getFormatMoney() {
//        return num
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
