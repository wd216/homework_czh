package dao;

import entity.Iphone;

import java.util.ArrayList;
import java.util.List;

public class IphoneInMemoryDAO implements IphoneDAO {

    private static List<Iphone> iphoneDB = new ArrayList<>();

    static {
        Iphone ip1 = new Iphone(1, "一加", "2280x1080", "1600万像素", "安卓系统", "8GB");
        Iphone ip2 = new Iphone(2, "魅族", "1700x2000", "2000万像素", "安卓系统", "4GB");
        Iphone ip3 = new Iphone(3, "华为", "1600x1680", "1800万像素", "安卓系统", "4GB");
        Iphone ip4 = new Iphone(4, "三星", "2080x1280", "1900万像素", "安卓系统", "8GB");
        Iphone ip5 = new Iphone(5, "锤子", "1800x1080", "1400万像素", "安卓系统", "6GB");
        Iphone ip6 = new Iphone(6, "苹果", "2880x1080", "2000万像素", "苹果系统", "8GB");
        iphoneDB.add(ip1);
        iphoneDB.add(ip2);
        iphoneDB.add(ip3);
        iphoneDB.add(ip4);
        iphoneDB.add(ip5);
        iphoneDB.add(ip6);
    }

    @Override
    public List<Iphone> listAll() {
        return iphoneDB;
    }

    @Override
    public Iphone getIphoneById(int id) {
        for (Iphone iphone : iphoneDB) {
            if (iphone.getId() == id) {
                return iphone;
            }
        }
        return null;
    }

    @Override
    public List<Iphone> getIphonesByName(String name) {
        List<Iphone> iphones = new ArrayList<>();
        for (Iphone iphone : iphoneDB) {
            String realName = iphone.getName().toLowerCase();
            if (realName.contains(name.toLowerCase())) {
                iphones.add(iphone);
            }
        }
        return iphones;
    }

    @Override
    public boolean update(Iphone iphone) {
        for (Iphone ip : iphoneDB) {
            if (ip.getId() == iphone.getId()) {
                ip.setName(iphone.getName());
                ip.setResolution(iphone.getResolution());
                ip.setCamera(iphone.getCamera());
                ip.setSystem(iphone.getSystem());
                ip.setMemory(ip.getMemory());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for (Iphone iphone : iphoneDB) {
            if (iphone.getId() == id) {
                return iphoneDB.remove(iphone);
            }
        }
        return false;
    }

    @Override
    public Iphone add(Iphone iphone) {
        if (iphoneDB.add(iphone)){
            return iphone;
        }
        return null;
    }
}
