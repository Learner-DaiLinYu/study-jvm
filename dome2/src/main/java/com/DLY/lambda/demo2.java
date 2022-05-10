package com.DLY.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo2 {
    public static void main(String[] args) {
//        ArrayList<User> strings = new ArrayList<User>(){{
//            add(new User().setAddress("er"));
//            add(new User().setAddress("ab"));
//            add(new User().setAddress("er"));
//            add(new User().setAddress("ac"));
//        }};
//        strings.stream().filter(v->{
//            System.out.println(234);
//            return  v.isform("er");
//        }).count();
        List<User> collect = Stream.of(new User().setAddress("er"), new User().setAddress("ab"), new User().setAddress("er"), new User().setAddress("ac"))
                .collect(Collectors.toList());
        List<User> users = Arrays.asList(new User().setAddress("er"), new User().setAddress("ab"), new User().setAddress("er"), new User().setAddress("ac"));
        String[] a={"1","2","3"};
        List<String> collect1 = Stream.of(a).filter(v -> {
            if ("1".equals(v)) {
                return true;
            } else {
                return false;
            }
        }).collect(Collectors.toList());
        collect1.forEach(System.out::println);
    }
}
class User{
    private String address;
    public User setAddress(String str){
        this.address=str;
        return this;
    }

    public boolean isform(String ad){
        return ad.equals(address);
    }
}
