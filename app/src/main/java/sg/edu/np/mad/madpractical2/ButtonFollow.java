package sg.edu.np.mad.madpractical2;

public class ButtonFollow {
    public String name;

    public ButtonFollow(String name){
        this.name = name;
    }

    public boolean changeState(){
        boolean state = true;
        if(name == "Follow"){
            state = false;

        }
        else if (name == "Unfollow"){

        }
        return state;

    }


}
