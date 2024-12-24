package com.example.player_evaluation.mapper;

import com.example.player_evaluation.dto.req.IndexerReq;
import com.example.player_evaluation.dto.res.IndexerRes;
import com.example.player_evaluation.entity.Indexer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IndexerMapper {
    IndexerMapper INSTANCE = Mappers.getMapper(IndexerMapper.class);

    Indexer toEntity(IndexerReq req);
    IndexerRes toRes(Indexer indexer);
}
