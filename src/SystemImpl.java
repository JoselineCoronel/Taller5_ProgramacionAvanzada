import Entities.User;
import Forms.Form;
import Util.Utils;

import java.util.ArrayList;
import java.util.List;

public class SystemImpl implements ISystem {

    private Form form;
    private List<User> userList;

    public SystemImpl(){
        this.userList = new ArrayList<>();
        Utils.readData(userList);
    }

    @Override
    public void startProgram(){
        this.form = new Form(userList);
    }






}
