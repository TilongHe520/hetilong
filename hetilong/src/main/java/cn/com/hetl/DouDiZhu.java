package cn.com.hetl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DouDiZhu {
    public static void main(String[] args){
        HashMap<Integer,String> pooker = new HashMap<Integer, String>();
        ArrayList<Integer> pookerNumber = new ArrayList<Integer>();
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        String[] colors ={"♠","♥","♣","♦"};
        int index = 2;
        for(String number:numbers){
            for(String color:colors){
                pooker.put(index,color+number);
                pookerNumber.add(index);
                index++;
            }
        }

        pooker.put(0,"bigking");
        pookerNumber.add(0);
        pooker.put(1,"smallking");
        pookerNumber.add(1);

        Collections.shuffle(pookerNumber);
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> bottom = new ArrayList<Integer>();

        for(int i = 0 ; i < pookerNumber.size() ; i++){
            //先将底牌做好
            if(i < 3){
                //存到底牌去
                bottom.add( pookerNumber.get(i));
                //对索引%3判断
            }else if(i % 3 == 0){
                //索引上的编号,发给玩家1
                player1.add( pookerNumber.get(i) );
            }else if( i % 3 == 1){
                //索引上的编号,发给玩家2
                player2.add( pookerNumber.get(i) );
            }else if( i % 3 == 2){
                //索引上的编号,发给玩家3
                player3.add( pookerNumber.get(i) );
            }
        }
        //对玩家手中的编号排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        //看牌,将玩家手中的编号,到Map集合中查找,根据键找值
        //定义方法实现
        look("刘德华",player1,pooker);
        look("张曼玉",player2,pooker);
        look("林青霞",player3,pooker);
        look("底牌",bottom,pooker);
    }
    public static void look(String name,ArrayList<Integer> player,HashMap<Integer,String> pooker){
        //遍历ArrayList集合,获取元素,作为键,到集合Map中找值
        System.out.print(name+" ");
        for(Integer key : player){
            String value = pooker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }

}
