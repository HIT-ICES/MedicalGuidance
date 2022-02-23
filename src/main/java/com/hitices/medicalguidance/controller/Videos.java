package com.hitices.medicalguidance.controller;


import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/videos")
public class Videos {


    @PostMapping(value="/uploadFile")
    public void uploadFile(@RequestParam("file")  MultipartFile file) {
        System.out.print("上传文件==="+"\n");
        if (file.isEmpty()) {
            return;
        }

        // 获取文件名
        String fileName = file.getOriginalFilename();
        //加个时间戳，尽量避免文件名称重复
        String path = "/fileUpload/" +fileName;
        System.out.print("保存文件绝对路径"+path+"\n");
        //创建文件路径
        File dest = new File(path);

        if (dest.exists()) {
            return;
        }

        //判断文件父目录是否存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdir();
        }

        try {
            file.transferTo(dest);
        } catch (IOException e) {
            System.out.println("上传失败");
            e.printStackTrace();
        }
        return;
    }
}
