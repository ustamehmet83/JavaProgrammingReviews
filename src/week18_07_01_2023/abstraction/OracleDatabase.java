package week18_07_01_2023.abstraction;

import week18_07_01_2023.abstraction.Database;

public class OracleDatabase extends Database {

    @Override
    void save(String name) {
        System.out.println("I will add " + name + " inside the database");
        names.add(name);
    }

    @Override
    void delete(String name) {
        System.out.println("I will delete " + name +" from database FYI");
        names.remove(name);
    }

    @Override
    void update(String oldName, String newName) {
        names.remove(oldName);
        names.add(newName);

    }
}