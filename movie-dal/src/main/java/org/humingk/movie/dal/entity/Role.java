package org.humingk.movie.dal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户角色
 *
 * @author humingk
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable {
  private static final long serialVersionUID = 1L;
  /** 用户角色ID */
  private Byte id;
  /** 角色名称 */
  private String nameZh;
  /** 角色描述 */
  private String description;
}
