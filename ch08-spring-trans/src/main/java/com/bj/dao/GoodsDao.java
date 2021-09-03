package com.bj.dao;

import com.bj.domain.Goods;

public interface GoodsDao {
    int updateGoods(Goods goods);

    Goods selectGoods(Integer id);
}
