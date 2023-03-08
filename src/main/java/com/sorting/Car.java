package com.sorting;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;

@AllArgsConstructor
@ToString
public class Car implements Comparable<Car> {

    protected String id;
    protected String brand;
    protected String model;
    protected LocalDateTime creation;
    protected String color;
    protected int seats;


    @Override
    public int compareTo(Car o) {

        ArrayList<Integer> id1 = digitizeId(this.id);
        ArrayList<Integer> id2 = digitizeId(o.id);
        ArrayList<Integer> biggerList;
        ArrayList<Integer> smallerList;
        if(id1.size() != id2.size()){
            if(id1.size() > id2.size()){
                biggerList = id1;
                smallerList = id2;
            } else{
                biggerList = id2;
                smallerList = id1;
            }
            for(int i = 0; i < biggerList.size(); i++) {
                if(i > smallerList.size() - 1) {
                    smallerList.add(0);
                }
            }
            id1 = biggerList;
            id2 = smallerList;
        }
        int signVal = 0;
        for(int i = 0; i < id1.size(); i++) {
            if(id1.get(i) - id2.get(i) != 0) {
                signVal = id1.get(i) - id2.get(i);
                break;
            }
        }
        return signVal;
    }

    private ArrayList<Integer> digitizeId(String currentId){
        String[] idSplitted = currentId.split("-");
        ArrayList<Integer> idAsNumbers = new ArrayList<>();
        int partInt = -1;
        for(String part: idSplitted){
            try {
                partInt = Integer.parseInt(part);
                idAsNumbers.add(partInt);
            }catch(Exception e){

            }
        }
        return  idAsNumbers;
        }

}
