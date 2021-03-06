package org.humingk.movie.api.common.converter.movie.details;

import org.humingk.movie.api.common.vo.movie.details.TrailerMovieDoubanVo;
import org.humingk.movie.common.util.BaseConverter;
import org.humingk.movie.dal.entity.TrailerMovieDouban;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import javax.validation.constraints.NotNull;

/** @author humingk */
@Mapper(componentModel = "spring")
public interface TrailerMovieDoubanVoConverter
    extends BaseConverter<TrailerMovieDoubanVo, TrailerMovieDouban> {

  @Override
  @Mappings({
    @Mapping(
        target = "urlTrailer",
        expression = "java(\"https://movie.douban.com/trailer/\"+trailerMovieDouban.getId())")
  })
  TrailerMovieDoubanVo to(@NotNull TrailerMovieDouban trailerMovieDouban);
}
