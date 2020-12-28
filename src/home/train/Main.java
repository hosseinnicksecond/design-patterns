package home.train;

import home.train.singleton.Lazy;

public class Main {

    public static void main(String[] args) {

        Lazy lazy=Lazy.getInstance();
        lazy.setId(1);
        lazy.setName("lazy singleton");

        System.out.println("instance that create first time:  "+
                lazy+" and id :"+lazy.getId()+" and name : "+lazy.getName());

        lazy=null;
        Lazy lazy2= Lazy.getInstance();
        System.out.println("instance that create first time:  "+
                lazy2+" and id :"+lazy2.getId()+" and name : "+lazy2.getName());


    }

}
