//package src;

public class Company {

    public static void main(String[] args) {
        Companys companys = new Companys("Facebook", "Toyota", "Google", 2013, 2012, 2000);
        System.out.println(companys.getingcompany1Name());
        String com = companys.setCompany_2Name("youtube");
        System.out.println(com);
    }
}
