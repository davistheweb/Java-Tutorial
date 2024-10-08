//package src;

public class Companys {
    private String company_1Name;
    private String company_2Name;
    private String company_3Name;
    private int company_1year;
    private int company_2year;
    private int company_3year;

    public Companys(String company_1Name, String company_2Name, String company_3Name,
                    int company_1year, int company_2year, int company_3year){
        this.company_1Name = company_1Name;
        this.company_2Name = company_2Name;
        this.company_3Name = company_3Name;
        this.company_1year = company_1year;
        this.company_2year = company_2year;
        this.company_3year = company_3year;
    }
    public String getingcompany1Name(){
        return company_1Name;
    }

    public String setCompany_2Name(String company_2Name){
       return this.company_2Name = company_2Name;
    }
}
