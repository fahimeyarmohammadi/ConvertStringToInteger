public class ConvertStringToInteger {
    public static int convertStringToInteger(String value){
        int number;
        if(value.matches("-?[1-9]\\d*|0")){
            number=Integer.valueOf(value);
        }
        else
            throw new NumberFormatException("please just enter digit");
        if(number>(-32767)&&number<32767)
            return number;
        else
            throw new IllegalArgumentException("number nut in range");
    }
}
