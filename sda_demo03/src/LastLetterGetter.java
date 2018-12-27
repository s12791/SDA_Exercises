public class LastLetterGetter {

    public LastLetterGetter(){
        System.out.println("initialing the LastLetterGetter");
    }

    public String getLastLetter(String word){
        return word.substring(word.length() - 2);
    }
}
