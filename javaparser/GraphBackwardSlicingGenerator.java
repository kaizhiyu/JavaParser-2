package javaparser;

import java.io.*;
import java.util.*;

public class GraphBackwardSlicingGenerator
{
    
    private FileWriter fileWriter;
    
    public GraphBackwardSlicingGenerator()
    {
        File directory = new File("BackwardSlicing");
        directory.mkdirs();
        File[] files = directory.listFiles();
        for (int i=0;i<files.length;i++)
        {
            files[i].delete();
        }
    }
    
    public void createNewFile(String nameFile, int id)
    {
        this.fileWriter = null;
        try {
            this.fileWriter = new FileWriter("BackwardSlicing/"+ nameFile + "_" + id + ".dot");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String text = "digraph ClassDiagram {\n";
        text += "\t fontname = \"Bitstream Vera Sans\"\n";
        text += "\t fontsize = 8\n\n";
        text += "\t node [\n";
        text += "\t\t fontname = \"Bistream Vera Sans\"\n";
        text += "\t\t fontsize = 8\n";
        text += "\t\t shape = \"record\"\n";
        text += "\t ]\n\n";
        text += "\t edge [\n";
        text += "\t\t fontname = \"Bistream Vera Sans\"\n";
        text += "\t\t fontsize = 8\n";
        text += "\t\t arrowhead = \"empty\"\n";
        text += "\t ]\n\n";
        
        try {
            this.fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void addMethodGraphBackwardSlicing(Method method)
    {
        String text = method.getBackwardSlicingGraphViz();
        try {
            this.fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void endWriter()
    {
        try {
            this.fileWriter.write("}");
            this.fileWriter.flush();
            this.fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
