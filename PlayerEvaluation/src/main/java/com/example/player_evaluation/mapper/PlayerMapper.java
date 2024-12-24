package com.example.player_evaluation.mapper;

import com.example.player_evaluation.dto.req.PlayerReq;
import com.example.player_evaluation.dto.res.PlayerRes;
import com.example.player_evaluation.entity.Player;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlayerMapper {
    PlayerMapper INSTANCE = Mappers.getMapper(PlayerMapper.class);

    Player toEntity(PlayerReq req);
    PlayerRes toRes(Player player);
}
