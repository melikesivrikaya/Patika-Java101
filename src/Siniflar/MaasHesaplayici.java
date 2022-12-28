package Patika.Java.entry.Siniflar;

public class MaasHesaplayici {
    public static class Employee{
        String name;
        double salary; 
        int workHours;
        int hireYear;

        double artis;
        public Employee(String name, double salary, int workhours, int hireYear){
            this.name = name;
            this.salary = salary;
            this.workHours = workhours;
            this.hireYear = hireYear;
        }
        public double tax(){
            double plus = 0;
            if(salary > 1000) {
                plus = salary * 0.03;
                salary = salary - plus;
            }
            return plus ;
        }
        public double bonus(){
            double plus = 0;
            if(workHours > 40){
                plus = ( workHours - 40) * 30;
                salary = salary + plus;
            }
            return plus;
        }
        public void raiseSalary(){
            int year = 2021 - hireYear;
            if( year < 10) {
                this.artis = salary * 0.05;
            }
            else if( year < 20) {
                this.artis = salary * 0.10;
            }
            else {
                this.artis = salary * 0.15;
            }
        }

        @Override
        public String toString() {
            raiseSalary();
            System.out.println("Adı : " + name);
            System.out.println("Maaşı : " + salary);
            System.out.println("Haftalık Çalışma Saati : " + workHours);
            System.out.println("İşe başlama Tarihi : " + hireYear);
            System.out.println("Vergisi : " + tax());
            System.out.println("Bonusu :  " + bonus());
            System.out.println("Maaş artışı : " + this.artis);
            System.out.println("Vergi ve bonuslarla maas : " + salary);
            salary += artis;
            System.out.println("Toplam maaş : " + salary);
            return super.toString();
        }




    }
}
