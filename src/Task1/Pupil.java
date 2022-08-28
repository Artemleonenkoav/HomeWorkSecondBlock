package Task1;

public class Pupil {


    public static Pupil BadPupil = new BadPupil();
    public static Pupil GoodPupil = new GoodPupil();
    public static Pupil ExcelentPupil = new ExcelentPupil();


    public void study() {

    }


    public void read() {
    }


    public void write() {
    }


    public void relax() {
        System.out.println("Relax");
    }


    //    BaseClass up = new DerivedClass();
    static class ExcelentPupil extends Pupil {
        public ExcelentPupil() {
            run();
        }

        public void run() {
            study();
            write();
            read();
            relax();
        }

        @Override
        public void study() {
            System.out.println("Excelent");
        }

        @Override
        public void read() {
            System.out.println("Excelent");
        }

        @Override
        public void write() {
            System.out.println("Excelent");
        }

        @Override
        public void relax() {
            System.out.println("Excelent");
        }
    }

    public static class GoodPupil extends Pupil {

        public GoodPupil() {
            run();
        }

        public void run() {
            study();
            write();
            read();
            relax();
        }

        @Override
        public void study() {
            System.out.println("Good");
        }

        @Override
        public void read() {
            System.out.println("Good");
        }

        @Override
        public void write() {
            System.out.println("Good");
        }

        @Override
        public void relax() {
            System.out.println("Good");
        }
    }

    public static class BadPupil extends Pupil {

        public BadPupil() {
            run();
        }

        public void run() {
            study();
            write();
            read();
            relax();
        }

        @Override
        public void study() {
            System.out.println("Bad");
        }

        @Override
        public void read() {
            System.out.println("Bad");
        }

        @Override
        public void write() {
            System.out.println("Bad");
        }

        @Override
        public void relax() {
            System.out.println("Bad");
        }
    }

}

