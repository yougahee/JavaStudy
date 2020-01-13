package staticex;

public class CompanyTest {
    public static void main(String[] args) {
        //싱글톤 패턴
        Company company = Company.getInstance();

        Company company1 = Company.getInstance();

        System.out.println(company);
        System.out.println(company1);
    }
}
