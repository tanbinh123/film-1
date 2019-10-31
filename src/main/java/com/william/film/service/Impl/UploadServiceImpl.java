package com.william.film.service.Impl;

import com.william.film.service.UploadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Service
public class UploadServiceImpl{
//    @Override
//    public String transferToUUID(MultipartFile img) throws  Exception{
//        String img_name = img.getOriginalFilename();
//        if (img_name != null && img != null && img_name.length() > 0) {
//            // 向对应项目地址中,上传文件
//            String img_path = "D:\\Kadima’s\\Demo\\毕设相关\\movieSrc\\";
//            String newFileName = UUID.randomUUID() + img_name.substring(img_name.lastIndexOf("."));
//            File file = new File(img_path + newFileName);
//            // 图片使用IO流写入磁盘
//            img.transferTo(file);
//            // 将生成的图片名给User对象 用于存数据库中User表中的U_IMAGE字段中
//            System.out.println(newFileName);
//            return "success";
//        }
//        return "fail";
//    }
}
