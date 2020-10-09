package com.gq.service;


import com.gq.entity.WbeParameter;

public interface WbeParameterService {


    /**
     * 修改
     *
     */
    boolean editById(WbeParameter wbeParameter);





    /**
     * 得到网站参数设置
     *
     */
    WbeParameter getWbeParameter();



}
