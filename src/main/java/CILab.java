
public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {

        return myString;
    }

    @Override
    public void setString(String string) {

        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String capWord = getString();
        int caps = 0;
        for (int i = 0; i < capWord.length() ; i++) {
            if(Character.isUpperCase(capWord.charAt(i))) {
                caps++;
            }
        }
        if(caps == 1 || caps == capWord.length() || caps == 0) {
            return true;
        } else {
            return false;
        }
    }
}

