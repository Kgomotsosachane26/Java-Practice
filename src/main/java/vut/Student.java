
    package vut;

    public class Student {

        public String studentNumber;
        public int testMark;

        public Student(){

        }

        public void setStudentNumber(String studentNumber){

            //Check if the student number contains of 9 digits
            if(studentNumber.length() != 9){
                throw new IllegalArgumentException("Student number must have exactly 9 digits");
            }

            //Checks if the student number begins with 223 or 224
            if (!(studentNumber.indexOf("223") == 0 || studentNumber.indexOf("224") == 0)){
                throw new IllegalArgumentException("This student number does not\n" +
                        "correspond with 3rd year students’ student numbers.");
            }

            //Loop through the student number to check if it contains digits only
            for (int i = 0 ; i < studentNumber.length(); i++){
                if(!Character.isDigit(studentNumber.charAt(i))){
                    throw new IllegalArgumentException("Student number must contain digits only");
                }

            }

            this.studentNumber = studentNumber;
        }

        public String getStudentNumber(){
            return studentNumber;
        }


        public void setTestMark(int testMark){

            //Checks if the test mark is not valid then throw an exception
            if (testMark < 1 || testMark > 100){
                throw new IllegalArgumentException("Invalid test mark");
            }

            this.testMark = testMark;
        }

        public int getTestMark(){

            return testMark;
        }




    }



