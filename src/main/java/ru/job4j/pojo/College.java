package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student alexei = new Student();
        alexei.setDate("01.09.2010");
        alexei.setGroup(150202);
        alexei.setName("Alexei Yakovlev");
        System.out.println(alexei.getName() + " started study " + alexei.getDate()
                + " in group " + alexei.getGroup() + ".");
    }
}
