package com.william.film.service;

import com.sun.webkit.dom.MutationEventImpl;
import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    /**
     * 上传图片转化为UUID名
     */
    public String transferToUUID(MultipartFile img)throws Exception;
}
