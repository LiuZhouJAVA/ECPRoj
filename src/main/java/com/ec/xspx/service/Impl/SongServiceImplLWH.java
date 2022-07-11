package com.ec.xspx.service.Impl;

import com.ec.xspx.bean.Song;
import com.ec.xspx.bean.User;
import com.ec.xspx.mapper.SongMapperLWH;
import com.ec.xspx.service.SongServiceLWH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SongServiceImplLWH implements SongServiceLWH {

    @Autowired
    SongMapperLWH songMapperLWH;

    @Override
    public List<Song> getSong(User user){


        List<Song> songList = songMapperLWH.getSong(user);


        return  songList;
    }

}
