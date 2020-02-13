package org.humingk.movie.dal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 网易云音乐专辑热门评论
 *
 * @author humingk
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentNetease implements Serializable {
  private static final long serialVersionUID = 1L;
  /** 歌曲ID */
  private Long idSongNetease;
  /** 网易云音乐专辑热门评论ID 0-暂无评论 */
  private Long id;
  /** 网易云音乐用户ID */
  private Long idUserNetease;
  /** 创建时间 /unix */
  private Long createDatetime;
  /** 评论内容 */
  private String content;
  /** 赞同数 */
  private Integer agreeVote;
}
