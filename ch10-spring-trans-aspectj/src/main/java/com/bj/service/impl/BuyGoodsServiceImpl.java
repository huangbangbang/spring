package com.bj.service.impl;

import com.bj.dao.GoodsDao;
import com.bj.dao.SaleDao;
import com.bj.domain.Goods;
import com.bj.domain.Sale;
import com.bj.excep.NotEnoughException;
import com.bj.service.BuyGoodsService;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;
    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("start");
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods==null){
            throw new NullPointerException("not exist");
        }else if(goods.getAmount()<nums){
            throw new NotEnoughException("amount not enough");
        }
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("end");
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
