package com.li.backoffice.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
@RequestMapping("upload")
public class UploadeController {
    /**
     * 图片上传
     */
    @RequestMapping("itemspic")
    public void itemspic(HttpServletRequest request){
        System.out.println(request);
        MultipartHttpServletRequest multiRequest= (MultipartHttpServletRequest) request;

        MultipartFile file=multiRequest.getFile("itemspic1");
        System.out.println(file.getName());

        String uploadFolder=request.getServletContext().getContextPath()+"/upload";
        System.out.println("uploadFolder:"+uploadFolder);
        File uploadFolderFile=new File(uploadFolder);
        if (!uploadFolderFile.exists())
            uploadFolderFile.mkdir();
    }
}
