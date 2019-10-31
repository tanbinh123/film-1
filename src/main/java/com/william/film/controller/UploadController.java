package com.william.film.controller;

import com.william.film.service.Impl.UploadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
public class UploadController {
    @RequestMapping("/upload")
    public String upload()throws Exception{
//        System.out.println(uploadService.transferToUUID(img));
       return "upload";
    }
    @RequestMapping("/reform")
    @ResponseBody
    public String reForm(MultipartFile img)throws Exception{
        String img_name = img.getOriginalFilename();
        if (img_name != null && img != null && img_name.length() > 0) {
            // 向对应项目地址中,上传文件
            String img_path = "D:\\Kadima’s\\Demo\\毕设相关\\movieSrc\\film_photo\\";
            String newFileName = UUID.randomUUID() + img_name.substring(img_name.lastIndexOf("."));
            File file = new File(img_path + newFileName);
            // 图片使用IO流写入磁盘
            img.transferTo(file);
            // 将生成的图片名给User对象 用于存数据库中User表中的U_IMAGE字段中
            System.out.println(newFileName);
            return "{\"msg\":\"ok\"}";
        }
        return "{\"msg\":\"no\"}";
    }
}
