package org.humingk.movie.server.search.controller;

import org.humingk.movie.api.common.converter.movie.SearchResultMovieDoubanVoConverter;
import org.humingk.movie.api.common.converter.movie.SearchTipsMovieDoubanVoConverter;
import org.humingk.movie.api.common.vo.movie.SearchResultMovieDoubanVo;
import org.humingk.movie.api.common.vo.movie.SearchTipsMovieDoubanVo;
import org.humingk.movie.api.search.SearchMovieDoubanApi;
import org.humingk.movie.common.entity.Result;
import org.humingk.movie.service.douban.service.MovieDoubanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

/** @author humingk */
@RestController
public class SearchMovieDoubanController implements SearchMovieDoubanApi {
  @Autowired private MovieDoubanService movieDoubanService;

  @Autowired private SearchTipsMovieDoubanVoConverter searchTipsMovieDoubanVoConverter;
  @Autowired private SearchResultMovieDoubanVoConverter searchResultMovieDoubanVoConverter;

  @Override
  public Result<List<SearchTipsMovieDoubanVo>> searchTips(
      @NotBlank String keyword, @PositiveOrZero Integer offset, @PositiveOrZero Integer limit) {
    return Result.success(
        searchTipsMovieDoubanVoConverter.toList(
            movieDoubanService.getSearchTipsMovieDoubanListByMovieDoubanKeywordStart(
                keyword.trim(), offset, limit)));
  }

  @Override
  public Result<List<SearchResultMovieDoubanVo>> searchDetails(
      @NotBlank String keyword, @PositiveOrZero Integer offset, @PositiveOrZero Integer limit) {
    return Result.success(
        searchResultMovieDoubanVoConverter.toList(
            movieDoubanService.getSearchResultMovieDoubanListByMovieDoubanKeyword(
                keyword, offset, limit)));
  }
}
