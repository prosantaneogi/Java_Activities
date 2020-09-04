package javaActivity4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Activity4_2 {

	public static void main(String[] args) {
		try {
            File file = new File("resources/newfile.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

            // Write into text file
            //FileWriter writer = new FileWriter("MyFile.txt", true);
            //BufferedWriter fwriter = new BufferedWriter(writer);
            FileWriter myWriter = new FileWriter(file);
            //FileWriter mywriter = new FileWriter(file);
            myWriter.write("Sample Text Written");
            myWriter.write("23");
            myWriter.append("Append Text");
            myWriter.close();
            
            //get the file Object
            File fileUtil = FileUtils.getFile("resources/newfile.txt");
            //Read file
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            //Create directory
            File destDir = new File("resources_n");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

            //Get file from new directory
            File newFile = FileUtils.getFile(destDir, "newfile.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            //Print it
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
	

}
