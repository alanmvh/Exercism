public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double salary = 0;
        return salary = (daysSkipped>=5) ? 0.85 : 1;
    }

    public int bonusMultiplier(int productsSold) {
        int bonus = 0;
        return bonus = (productsSold >= 20) ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        int bonusM = bonusMultiplier(productsSold);
        double bfp = bonusM * productsSold;
        return bfp;
        
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double bonus = bonusForProductsSold(productsSold);
        double Salary = (1000 * salaryMultiplier(daysSkipped)) + (bonus);
        double finalSalary = (Salary >= 2000) ? 2000 : Salary;
        return finalSalary;
        
    } 
}
