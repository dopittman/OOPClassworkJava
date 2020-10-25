package JavaExamples.Polymorphism;

public class Overloading {


    int multiplyNums(int one, int two){
        return one * two;
    }

    //  Overload with additional parameters
    int multiplyNums(int one, int two, int three){
        return one* two* three;
    }

    //  Overload with different types
    int multiplyNums(int one, float two){
        //  Convert to return an int
        return Math.round(one * two);
    }

    //  Overload with types switched
    int multiplyNums(float one, int two){
        //  Convert to return an int
        return Math.round(two * one);
    }

    public void main(String[] args) {
        System.out.println(multiplyNums(2,3));
        System.out.println(multiplyNums(2,3,4));
        System.out.println(multiplyNums(1,  2.3455f));
        System.out.println(multiplyNums(2.55f, 5));
    }
}

