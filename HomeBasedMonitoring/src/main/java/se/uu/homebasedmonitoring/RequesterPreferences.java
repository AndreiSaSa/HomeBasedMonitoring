package se.uu.homebasedmonitoring;

public class RequesterPreferences extends Preferences{

    private String gender;
    private int age;

    public void updatePreferences() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void setPreferences() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
