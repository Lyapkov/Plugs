package appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Model implements Serializable {
    private static final Model instance = new Model();

    private final Map<Integer, User> model;

    public static Model getInstance() {
        return instance;
    }

    public Model() {
        model = new HashMap<>();

        model.put(1, new User("Василий", "Рачков", 10000));
        model.put(1, new User("Петр", "Сидоров", 12000));
        model.put(1, new User("Иван", "Иванов", 15000));
    }

    public void add(User user, int id) {
        model.put(id, user);
    }

    public Map<Integer, User> getFromList() {
        return model;
    }

    public void updateUser(User user, int id) {
        model.put(id, user);
    }

    public void deleteUser(int id) {
        model.remove(id);
    }
}
