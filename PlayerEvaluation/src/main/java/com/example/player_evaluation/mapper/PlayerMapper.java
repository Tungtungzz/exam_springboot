package com.example.player_evaluation.mapper;

import com.example.player_evaluation.dto.req.PlayerReq;
import com.example.player_evaluation.dto.res.PlayerRes;
import com.example.player_evaluation.entity.Indexer;
import com.example.player_evaluation.entity.Player;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", uses = {IndexerMapper.class})
public interface PlayerMapper {

    @Mapping(source = "indexId", target = "indexer.indexId")
    Player toEntity(PlayerReq req);

    PlayerRes toRes(Player player);
}
