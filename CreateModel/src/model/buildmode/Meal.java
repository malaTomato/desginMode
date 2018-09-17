package model.buildmode;

import model.buildmode.interfaceClass.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xiongwu
 **/
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        this.items.add(item);
    }

    public BigDecimal getCost(){
        BigDecimal cost = new BigDecimal("0");
        for(Item item:items){
            cost = cost.add(item.price());
        }
        return cost;
    }

    public void showItems(){
        items.forEach(v->{
            System.out.println("*****-----*****");
            System.out.println(v.name());
            System.out.println(v.price()+"元");
            System.out.println(v.packing().pack());

        });
    }
}
