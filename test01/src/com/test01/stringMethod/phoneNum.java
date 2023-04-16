package com.test01.stringMethod;

public class phoneNum {
    private String phoneNum;

    public phoneNum() {
    }

    public phoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 获取
     *
     * @return phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置
     *
     */
    public void setPhoneNum(String phoneNum) {
        String qian = phoneNum.substring(3, 7);
        phoneNum = phoneNum.replace(qian, "****");

        this.phoneNum = phoneNum;
    }


}
