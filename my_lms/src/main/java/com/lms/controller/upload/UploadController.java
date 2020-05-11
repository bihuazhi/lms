package com.lms.controller.upload;

import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Administrator on 2020/5/5/005.
 */
@RestController
@CrossOrigin
public class UploadController {

    @RequestMapping("/uploadImage")
    public Result uploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        System.out.println(file);
        Result result = null;
        if(!file.isEmpty()) {
            String fileName = file.getOriginalFilename(); //获取源文件名称
            String path = null;
            String type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;

            System.out.println(type);
            if (type != null && type.equals("jpg")) { //文件后缀名不为空
                    try {
                        // 设置存放图片文件的路径
                        String realPath = new String("my_lms/src/main/resources/" + "static/upload"); //上传路径
                        String trueFileName = System.currentTimeMillis() + "_" + fileName; //文件新名字
                        //构建上传文件的文件夹
                        File pathFile = new File(realPath);
                        File dest = new File(pathFile.getAbsolutePath() + File.separator + trueFileName);
                        //判断文件父目录是否存在
                        if (!dest.getParentFile().exists()) {
                            dest.getParentFile().mkdir();
                        }
                        file.transferTo(dest); //生成文件
                        String filePath = request.getScheme() + "://" + request.getServerName() +
                                ":" + request.getServerPort() + "/upload/" + trueFileName;
                        result = new Result(ResultCode.SUCCESS, filePath);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }else {
                result = new Result(ResultCode.FAIL);
            }
        }else {
            result = new Result(ResultCode.FAIL);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
