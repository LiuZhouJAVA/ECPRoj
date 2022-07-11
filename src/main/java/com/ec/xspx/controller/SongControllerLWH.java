package com.ec.xspx.controller;

import com.ec.xspx.bean.JsonResult;
import com.ec.xspx.bean.Song;
import com.ec.xspx.bean.User;
import com.ec.xspx.service.SongServiceLWH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/LWH")
public class SongControllerLWH {

    @Autowired
    SongServiceLWH songServiceLWH;

    /**
     * 测试登录接口
     * @param user
     * @return 歌曲数组
     */
    //测试
    @RequestMapping(value = "/getSong", method = RequestMethod.POST)
    public JsonResult getSong(@RequestBody User user) {

        System.out.println("接口开始");

        List<Song> res = songServiceLWH.getSong(user);
        //int a = 2/0;


        if (res != null && !res.isEmpty()) {
//            System.out.println(res);
            System.out.println("接口结束返回");
            return new JsonResult(200, "查询歌曲成功", res);
        }
        //System.out.println("接口结束返回");
        return new JsonResult(501, "查询歌曲失败，该用户没有歌曲", null);
    }

}
