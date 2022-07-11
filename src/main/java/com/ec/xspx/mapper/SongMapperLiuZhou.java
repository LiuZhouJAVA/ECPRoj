package com.ec.xspx.mapper;

import com.ec.xspx.bean.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongMapperLiuZhou {
    List<Song> GetAllSongs();
}
