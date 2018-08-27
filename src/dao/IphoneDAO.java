package dao;

import entity.Iphone;

import java.util.List;

public interface IphoneDAO {
    //定义一个数组用来保存数据
    List<Iphone> listAll();
    //定义一个根据ID查找商品信息的方法
    Iphone getIphoneById(int id);
    //定义一个根据名字查找商品信息的方法
    List<Iphone> getIphonesByName(String name);
    //定义一个修改商品信息的方法
    boolean update(Iphone iphone);
    //定义一个删除商品的方法
    boolean delete(int id);
    Iphone add(Iphone iphone);
}
