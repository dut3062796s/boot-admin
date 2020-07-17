package com.hb0730.boot.admin.commons.domain.service.base;

import com.hb0730.boot.admin.commons.domain.model.web.BusinessVO;
import org.springframework.lang.NonNull;

/**
 * @author bing_huang
 * @date 2020/07/17 7:40
 * @since V1.0
 */
public interface ISuperBaseSaveService<V extends BusinessVO> {

    /**
     * 保存
     *
     * @param vo 保存参数
     * @return 是否成功
     */
    boolean save(@NonNull V vo);
}