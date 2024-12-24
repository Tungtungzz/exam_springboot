package com.example.player_evaluation.mapper;

import com.example.player_evaluation.dto.res.IndexerRes;
import com.example.player_evaluation.entity.Indexer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IndexerMapper {

    IndexerRes toRes(Indexer indexer);
}
