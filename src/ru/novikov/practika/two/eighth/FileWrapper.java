package ru.novikov.practika.two.eighth;

import java.io.*;

public class FileWrapper {
    public void readAndPrint(String filepath) {
        try (FileReader reader = new
                FileReader(filepath)) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void write(String filepath, String... text) {
        try (FileWriter writer = new
                FileWriter(filepath, false)) {
            // запись всей строки
            writer.write(String.join("\n", text));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void replace(String filepath, String... text) {
        try (FileWriter writer = new
                FileWriter(filepath, false)) {
            // запись всей строки
            writer.write(String.join("\n", text));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void add(String filepath, String... text) {
        try (FileWriter writer = new
                FileWriter(filepath, true)) {
            // запись всей строки
            writer.write(String.join("\n", text));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
