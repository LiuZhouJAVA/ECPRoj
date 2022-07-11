package com.ec.xspx.controller;

import com.ec.xspx.bean.JsonResult;
import com.ec.xspx.bean.Song;
import com.ec.xspx.bean.User;
import com.ec.xspx.service.SongServiceLWH;
import com.ec.xspx.service.SongServiceLiuZhou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/LZ")
public class SongControllerLiuZhou {

    @Autowired
    SongServiceLiuZhou songServiceLiuZhou;

    @RequestMapping(value = "/getAllSong", method = RequestMethod.POST)
    public JsonResult getSong() {

        System.out.println("接口开始");

        List<Song> res =songServiceLiuZhou.GetAllSongs();
        //int a = 2/0;


        if (res != null && !res.isEmpty()) {
//            System.out.println(res);
            System.out.println("接口结束返回");
            return new JsonResult(200, "查询全部歌曲成功", res);
        }
        //System.out.println("接口结束返回");
        return new JsonResult(501, "查询歌曲失败，该用户没有歌曲", null);
    }

}
