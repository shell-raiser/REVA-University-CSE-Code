class Student4{
    String SRN ;
    String name;
    static String collegeName;
    public static void main(String[] args) {
        Student4 s1 = new Student4();
        Student4 s2 = new Student4();
        Student4 s3 = new Student4();
        Student4.collegeName = "REVA UNIVERSITY";
        s1.SRN = "r18CS001";
        s1.name = "stud1";
        s2.SRN = "r18CS002";
        s2.name = "stud2";
        s3.SRN = "r18CS003";
        s3.name = "stud3";
        System.out.println("S1 SRN ="+s1.SRN+"S1 Name ="+s1.name+"S1 College Name ="+s1.collegeName);
        System.out.println("S2 SRN ="+s2.SRN+"S2 Name ="+s2.name+"S2 College Name ="+s2.collegeName);
        System.out.println("S3 SRN ="+s3.SRN+"S3 Name ="+s3.name+"S3 College Name ="+s3.collegeName);
        s2.collegeName = "REVA";
        s2.name = "JAMES";
        System.out.println("S1 SRN ="+s1.SRN+"S1 Name ="+s1.name+"S1 College Name ="+s1.collegeName);
        System.out.println("S2 SRN ="+s2.SRN+"S2 Name ="+s2.name+"S2 College Name ="+s2.collegeName);
        System.out.println("S3 SRN ="+s3.SRN+"S3 Name ="+s3.name+"S3 College Name ="+s3.collegeName);
    }    
}