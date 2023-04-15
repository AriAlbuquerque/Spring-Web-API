package dio.web.api.Repository;

import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save (User user){
        if (user.getId() == null)
            System.out.println("SAVE - Recebendo o usuário na camada de repository");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repository");
        System.out.println(user);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("Delete/id - Recebendo o id: %d para excluir um usuário.", id));
        System.out.println(id);
    }
    public List<User> findAll() {
        System.out.println("LIST - Listando usuários no sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("Ariane", "061289"));
        users.add(new User("Nicolas", "270994"));
        users.add(new User("Elisabett", "060566"));
        users.add(new User("Valdir", "040465"));
        return users;
    }

    public User findById(Integer id){
        System.out.println(String.format("FIND/Id - Recebendo o username e password"));
        return new User("Ariane", "061289");
    }


    public User findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar ususário"));
    return new User("Ariane","061289");
    }
}
