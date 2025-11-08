class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

public class Main {
    static void checkAge (int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Under age!");
        }
        else{
            System.out.println(age + " years old can drive.");
        }
    }
    public static void main(String[] args){
        int age[] = {19, 20, 17, 21, 18};
        for (int i = 0; i < age.length; i++){
            try{
                checkAge(age[i]);
            }
            catch (InvalidAgeException e){
                System.out.println(age[i] + " years old can not drive, " + e.getMessage());
            }
        }
    }
}

//Create a user-defined exception InvalidAgeException when the age of a
//person is below 18 years. Use this exception at appropriate place.