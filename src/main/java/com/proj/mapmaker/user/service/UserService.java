package com.proj.mapmaker.user.service;


import com.proj.mapmaker.user.model.KakaoDTO;
import com.proj.mapmaker.user.model.UserDTO;

public interface UserService {


    public UserDTO kakaoLogin(KakaoDTO kakaoDTO) throws Exception;


}
