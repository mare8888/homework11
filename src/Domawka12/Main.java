import javax.management.monitor.Monitor;
import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) throws IOException {



        // Задание 1
        File file = new File("/Users/a.maretskij/Downloads/NewDir");
        File file1 = new File("/Users/a.maretskij/Downloads/NewDir/NewFile1.txt");
        File file2 = new File("/Users/a.maretskij/Downloads/NewDir/NewFile2.txt");

        boolean createdDir = file.mkdir();
        boolean createdFile1 = file1.createNewFile();
        boolean createdFile2 = file2.createNewFile();


        if (createdDir) {
            System.out.println("Dir was create");
        } else {
            System.out.println("Dir wasn't create");
        }
        if (createdFile1) {
            System.out.println("File1 was create");
        } else {
            System.out.println("File1 wasn't create");
        }
        if (createdFile2) {
            System.out.println("File2 was create");
        } else {
            System.out.println("File2 wasn't create");
        }

        try (FileWriter writer = new FileWriter("/Users/a.maretskij/Downloads/NewDir/NewFile1.txt")) {

            String s = "Java world";

            writer.write(s);
            writer.flush();


        }catch (IOException e){
            throw new RuntimeException(e);
        }
        try (FileReader reader = new FileReader("/Users/a.maretskij/Downloads/NewDir/NewFile1.txt")){
            int c;
            while ((c= reader.read())!=-1) {
                System.out.print((char) c);
                }
            }

        catch (IOException e){
            throw new RuntimeException(e);
        }

        FileInputStream input = new FileInputStream("/Users/a.maretskij/Downloads/NewDir/NewFile1.txt");
        FileOutputStream output = new FileOutputStream("/Users/a.maretskij/Downloads/NewDir/NewFile2.txt");

        while(input.available() > 0) {
            int data = input.read();
            output.write(data);
        }

        input.close();
        output.close();


        File file3 = new File("/Users/a.maretskij/Downloads/NewDir/NewFile1.txt");
        file3.delete();

        File file4 = new File("/Users/a.maretskij/Downloads/NewDir/NewFile2.txt");
        file4.delete();

        File file5 = new File("/Users/a.maretskij/Downloads/NewDir");
        file5.delete();

        // Задание 2

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Cat.txt"))){

            Cat cat = new Cat("Barsik", 2, 10);
            oos.writeObject(cat);

        } catch (IOException e){
            throw  new RuntimeException(e);
        }

        try(ObjectInputStream ooi = new ObjectInputStream(new FileInputStream("Cat.txt"))){
         Cat cat;
         cat = (Cat) ooi.readObject();
            System.out.println();
            System.out.println(cat);
        } catch (IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }

        //Задание 3

    }

}
