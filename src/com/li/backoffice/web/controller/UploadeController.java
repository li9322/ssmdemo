package com.li.backoffice.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static com.fasterxml.jackson.databind.util.ISO8601Utils.format;

@Controller
@RequestMapping("upload")
public class UploadeController {
    /**
     * 图片上传
     */
    @RequestMapping("itemsPic")
    public void itemspic(HttpServletRequest request, String fileName, PrintWriter writer) throws Exception{
//        System.out.println(request);
        MultipartHttpServletRequest multiRequest= (MultipartHttpServletRequest) request;

        MultipartFile file1=multiRequest.getFile(fileName);
        System.out.println(fileName + ":上传文件大小" + file1.getSize());

        //格式化文件名
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String saveName = format.format(new Date());
        Random rd = new Random();
        for (int i=0;i<3;i++)
            saveName += rd.nextInt(10);

        //文件后缀名
        String suffix = file1.getOriginalFilename().split("\\.")[1];

        String saveFileName = saveName + "." + suffix;

        //文件保存目录
        String dir=request.getServletContext().getRealPath("/upload");
        File dirFile=new File(dir);
        if (!dirFile.exists())
            dirFile.mkdirs();

        //文件保存路径
        String relativePath = "/upload/" +saveFileName;
        String totalPath = request.getServletContext().getRealPath(relativePath);
        System.out.println(totalPath);

        File newFile = new File(totalPath);

        //保存
        FileCopyUtils.copy(file1.getInputStream(),new FileOutputStream(newFile));
        Thread.sleep(2000);

        //返回一个相对路径
        String serverIp = "http://127.0.0.1:8080" + request.getServletContext().getContextPath();
        String respJson = "{\"imgUrl\":\"" + serverIp + relativePath +"\"}";

        writer.write(respJson);
    }

}
