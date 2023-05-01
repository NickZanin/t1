package org.example;

public class Main {




        System.out.println("Hello world!");


    Employee Worker01 = new Worker("Wrk01",1200);
    Employee Manager01 = new Manager ("Mng01",1200,10);
    Employee Manager02 = new Manager ("Mng02",1200,120);

    Employee[] arr = new Employee[]{Worker01, Manager01, Manager02};

    for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i].getName() + " - " + arr[i].getSalary());
    }

        System.out.println("== findByName " + Utils.findByName("Mng01",arr) + " ==") ;
    System.out.println(" The end ");
    }

}