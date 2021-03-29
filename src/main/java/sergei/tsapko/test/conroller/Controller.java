package sergei.tsapko.test.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import sergei.tsapko.test.model.Service;
import sergei.tsapko.test.model.UserDAO;
import sergei.tsapko.test.model.entity.User;
import sergei.tsapko.test.view.View;

import java.io.IOException;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    UserDAO userDAO;

    public List<User> getUsersFromURL() throws IOException {
      return Service.getData().getResults();
    }

    public void saveListToDB(List<User> users){
        userDAO.saveAll(users);
    }

    public List<User> getUsersFromDB(){
        return (List<User>) userDAO.findAll();
    }

    public void showInConsole(List<User> users){
        View.show(users);
    }

}
