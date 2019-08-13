public class CallStudent {
   
    public static void main(String[] args) {
        System.out.println("Hello Wold");
        Student arinda = new Student();
        System.out.println("Opject arinda = "+arinda);
        arinda.addCourse();
        arinda.dropCourse();
        arinda.payment();
        arinda.enrollment();
        
        //crete object GraduateStudent
        GraduateStudent rin = new GraduateStudent();
        System.out.println("Opject rin = "+rin);
        rin.oralExamination();
        rin.thesisExamination();
        rin.enrollment();
        rin.dropCourse();
        rin.payment();
    }
     
}
