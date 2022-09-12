public class InheritanceAC {

    // Inherit krna mtlb ek generation se dusri generation ko milna mtlb virasat me zammen mil gyi ya kuch aur

    //  in java ek class ki property dusri class lena chati h to it's called inheritance.

    // resuabilty badh jati h inheritance se kyuki agr same chez hogi to hme sirf ek baar hi defined krna padega

    // Base class or Parent class :- jo properties de rha h 
    // Sub Class or child class :- jo properties le rha h
    public static void main(String[] args) {
        tri t1=new tri();
        t1.color="red";
    }
}
class shape{
    String color;
}

class tri extends shape{

}
