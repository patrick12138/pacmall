package com.patrick.pacmall.search.service;


import com.patrick.pacmall.search.vo.SearchParamVo;
import com.patrick.pacmall.search.vo.SearchResult;

public interface MallSearchService {
    /**
     * 检索结果
     * @param paramVo
     * @return
     */
    SearchResult search(SearchParamVo paramVo);
}
