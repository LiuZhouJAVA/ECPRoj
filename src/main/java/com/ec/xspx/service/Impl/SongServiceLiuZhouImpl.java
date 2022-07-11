package com.ec.xspx.service.Impl;

import com.ec.xspx.bean.Song;
import com.ec.xspx.mapper.SongMapperLiuZhou;
import com.ec.xspx.service.SongServiceLiuZhou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceLiuZhouImpl  implements SongServiceLiuZhou {

    @Autowired
    SongMapperLiuZhou songMapperLiuZhou;

    @Override
    public List<Song> GetAllSongs() {
        List<Song> songList=songMapperLiuZhou.GetAllSongs();
        return songList;
    }
}
