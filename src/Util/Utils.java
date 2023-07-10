package Util;

import Entities.User;

import java.io.*;
import java.util.List;

public class Utils {

    public static void writeData(List<User> userList) {
        // Escribir el archivo "usuarios.txt"
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt"));

            for (User user : userList) {
                String linea = user.getName() + "," + user.getAge() + "," + user.getEmail();
                writer.write(linea);
                writer.newLine();
            }

            writer.close();
        }
        catch (IOException e){

            System.out.println("[!] Ha ocurrido un error al crear el archivo [!]");
            e.printStackTrace();

        }
    }

    public static void readData(List<User> userList) {
        // Leer el archivo "usuarios.txt"
        try (BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] chain = line.split(",");
                String name = chain[0];
                int age = Integer.parseInt(chain[1]);
                String email = chain[2];

                // Se guarda el usuario.
                User user = new User(name, age, email);
                userList.add(user);
            }
        } catch (Exception e) {
            System.out.println("[!] Error al leer el archivo [!]: " + e.getMessage());
        }
    }

}
