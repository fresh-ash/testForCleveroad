package sergei.tsapko.test.view;


import sergei.tsapko.test.model.entity.User;
import java.util.List;

public class View {

    public static void show(List<User> users){
        for (User user: users){
            String name = "Name: " + user.getName().getTitle() + " " + user.getName().getFirst() + " " +user.getName().getLast() + "\n";
            System.out.println(name + "E-mail: " + user.getEmail());
        }
    }

}
