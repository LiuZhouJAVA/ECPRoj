package com.ec.xspx.mapper;

import com.ec.xspx.bean.Song;
import com.ec.xspx.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongMapperLWH {

    List<Song> getSong(User user);

}