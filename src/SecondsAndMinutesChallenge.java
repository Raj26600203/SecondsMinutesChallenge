public class SecondsAndMinutesChallenge {
    public static void main (String[] args){
        int seconds = -1;
        if(validator(seconds)){
        String time = getDurationString(seconds);
        System.out.println(time);}else
            System.out.println("Invalid value is given to seconds");
    }

    public static String getDurationString(int seconds){
        int minutes = seconds/60;
        int remainderOfSec = seconds%60;

        String hoursAndMinutes = getDurationString(minutes,remainderOfSec);
        return (hoursAndMinutes+remainderOfSec+"s");
    }
    public static String getDurationString(int minutes,int seconds){
        if(validator(minutes,seconds)){
        int hours = minutes/60;
        int remainderOfMin =  minutes%60;
        return (hours+"h "+remainderOfMin+"m ");}
        return ("An Error happens at the calculation of hours");
    }

    public static boolean validator(int seconds){
        return seconds>=0;
    }
    public static boolean validator(int minutes,int seconds){
        return minutes<=59&&seconds>=0;
    }
}
