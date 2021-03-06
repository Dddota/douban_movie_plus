package org.humingk.movie.service.scene.service;

import org.humingk.movie.dal.entity.PlaceScene;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * 场景地点服务
 *
 * @author humingk
 */
@Validated
public interface ScenePlaceService {
  /**
   * 获取场景地点列表
   *
   * @param keyword 地点名称关键字,包括%
   * @param offset 偏移量
   * @param limit 限制数
   * @return
   */
  List<PlaceScene> getPlaceSceneListByKeyword(String keyword, int offset, int limit);

  /**
   * 获取场景地点列表
   *
   * @param keyword 地点名称关键字
   * @param offset 偏移量
   * @param limit 限制数
   * @return
   */
  List<PlaceScene> getPlaceSceneListByPlaceKeywordStart(String keyword, int offset, int limit);
}
