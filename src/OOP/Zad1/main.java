package OOP.Zad1;

public class main {
    public static void main(String[] args) {

        //OOP3 - Kreirati klasu Main gde cemo kreirati objekte
        //Kreirati klasu Student koja ce imati atribute Ime, Prezime, Broj indexa i Broj polozenih ispita
        //Svi atributi su final osim broj polozenih ispita
        //Kreirati objekat u Main klasi i promeniti mu broj polozenih ispita

        student student1 = new student();

        System.out.println(student1.brojPolozenihIspita);

        student1.brojPolozenihIspita = 40;
        System.out.println(student1.brojPolozenihIspita);

    }
}
