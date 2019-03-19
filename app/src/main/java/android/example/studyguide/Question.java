package android.example.studyguide;

public class Question {

    public int location;
    public int question;
    public int photoId;
    public boolean isTrue;

    public int getLocation(){return location;}

    public void setLocation(int location){this.location=location;}

    public int getQuestion(){return question;}

    public void setQuestion(int question){this.question=question;}

    public int getPhotoId(){return photoId;}

    public void setPhotoId(int photoId){this.photoId=photoId;}

    public boolean getIsTrue(){return isTrue; }

    public void setIsTrue(boolean aTrue){isTrue=aTrue;}

    public Question(int location, int question, int photoId, boolean isTrue){
        this.location=location;
        this.question=question;
        this.photoId=photoId;
        this.isTrue=isTrue;
    }

    public Question(){}
}
