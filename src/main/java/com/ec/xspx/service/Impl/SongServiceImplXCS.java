package com.ec.xspx.service.Impl;

import com.ec.xspx.bean.Song;
import com.ec.xspx.bean.User;
import com.ec.xspx.mapper.SongMapperXCS;
import com.ec.xspx.service.SongServiceXCS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SongServiceImplXCS implements SongServiceXCS {

    @Autowired
    SongMapperXCS songMapperXCS;

    @Override
    public List<Song> getSong(User user){


        List<Song> songList = songMapperXCS.getSong(user);


        return  songList;
    }

}
