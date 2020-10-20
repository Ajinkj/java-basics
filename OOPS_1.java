//package class_materials;
//create a class fraction which supports operations like addition, subtraction,
// division and multiplication
class Fraction{
    int num;
    int denom;
    //constructor
    Fraction(int num, int denom)
    {
        //this refers to the present object 
        this.num = num;
        this.denom = denom;
    }

    //Add a fraction with the present one
    //the function returns another instance of class Fraction
        Fraction add(Fraction f)
           {
               Fraction sum = new Fraction(1,1);
               sum.num = this.num*f.denom + this.denom*f.num;
               sum.denom = this.denom*f.denom;
               System.out.println("\n");
               System.out.print("Addition");
               return sum;
           }
    //Multiply a fraction with the present one
    Fraction multiply(Fraction f)
    {
        Fraction prod = new Fraction(1,1);
        prod.num = this.num*f.num;
        prod.denom = this.denom*f.denom;
        System.out.println("\n");
        System.out.print("Multiplication");
        return prod;
    }

    //Subtraction of a fraction from the present fraction
    Fraction substraction(Fraction f)
    {
        Fraction sub = new Fraction(1,1);
        sub.num = this.num*f.denom - this.denom*f.num;
        sub.denom = this.denom*f.denom;
        System.out.println("\n");
        System.out.print("Substraction");
        return sub;
    }


    //Divide the present fraction by another fraction.
    Fraction division(Fraction f)
    {
        Fraction div = new Fraction(1,1);
        div.num = this.num*f.denom;
        div.denom = this.denom*f.num;
        System.out.println("\n");
        System.out.print("Division");
        return div;
    }


    void printFrac()
    {
        System.out.println("\n");
        System.out.println(this.num + "/"+this.denom);
        System.out.println("\n");
    }


}







public class OOPS_1 {
    public static void main(String [] args)
    {
       Fraction f = new Fraction(1,4); //  4/5 
       Fraction g = new Fraction(1,4); // 3/6
       Fraction add = f.add(g);
       add.printFrac();
       Fraction sub = f.substraction(g);
       sub.printFrac();
       Fraction div = f.division(g);
       div.printFrac();
       Fraction mul = f.multiply(g);
       mul.printFrac();
    
    }
    
}
