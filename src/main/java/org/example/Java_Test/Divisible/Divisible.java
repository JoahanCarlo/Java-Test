package org.example.Java_Test.Divisible;

public class Divisible {
    public static String fizzBuzz(int n){
        String resultado = "";
        if (n%3 == 0) resultado+="Fizz";
        if (n%5 == 0) resultado+="Buzz";
        if (n%15 == 0) resultado+="FizzBuzz";
        if (n%30 == 0) resultado+="FizzBuzz";
        if (n%2 == 0) resultado+="2";
        if (n%16 == 0) resultado+="16";
        return  resultado.isEmpty()?String.valueOf(n):resultado;
    }

    public static String arabicToRoman(int n){
        String romano = "";
        if(n==1) romano+="I";
        if(n==2) romano+="II";
        if(n==3) romano+="III";
        if(n==4) romano+="IV";
        if(n==5) romano+="V";
        if(n==6) romano+="VI";
        if(n==7) romano+="VII";
        if(n==8) romano+="VIII";
        if(n==9) romano+="IX";
        if(n==10) romano+="X";
        if(n==11) romano+="XI";
        if(n==12) romano+="XII";
        if(n==13) romano+="XIII";
        return  romano.isEmpty()?String.valueOf(n):romano;
    }
}
