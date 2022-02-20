package com;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.nio.file.Path;
import java.io.IOException;
import java.sql.Timestamp;
import java.nio.file.Files;

public class FileWrite {
    public final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
    public Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    public Path fileName = Path.of("/home/arun/Documents/Arun/gcp-questions/gcp-qp1"+sdf1.format(timestamp)+".tex");
    public Path ansfileName = Path.of("/home/arun/Documents/Arun/gcp-questions/ans-gcp-qp1"+sdf1.format(timestamp)+".tex");
    public void writeFile(ArrayList cache) throws IOException{

        // Assigning the content of the file
        String startingText
                = "\\documentclass[11pt,paper=a4]{exam}\n" +
                "\\usepackage[T1]{fontenc}\n" +
                "\\usepackage{tgbonum}\n" +
                "\\begin{document}\n" +
                "\\begin{questions}\n";
        String endingText = "\\end{questions}\n" +
                "\\end{document}";

        String questionText="";
        for (int i=0;i<cache.size();i++)
            questionText=questionText+DataSet.questionSet[Integer.parseInt(cache.get(i).toString())];

        // Writing into the file
        Files.writeString(fileName, startingText + questionText + endingText);

        /*System.out.println("Array Matching");
        System.out.println(DataSet.answerSet.length);
        System.out.println(DataSet.questionSet.length);
        */
        // Reading the content of the file
        String file_content = Files.readString(fileName);

        // Printing the content inside the file
        // System.out.println(file_content);
        //return 1;
    }
    public void generateText() {
        Process process = null;
        //System.out.println("generate text");
        try {
            process = Runtime.getRuntime().exec("/usr/bin/pdflatex -output-directory /home/arun/Documents/Arun/gcp-questions/" +
                    " -synctex=1 -interaction=nonstopmode "+ fileName.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeFileAns(ArrayList cache) throws IOException{
        // Assigning the content of the file
        String startingText
                = "\\documentclass[11pt,paper=a4]{exam} \n "+
                    " \\usepackage[T1]{fontenc} \n"+
                    " \\usepackage{tgbonum} \n" +
                    " \\begin{document} \n"+
                    " \\begin{enumerate} \n";
        String endingText = "\\end{enumerate}\n" +
                "\\end{document}";

        String questionText="";
        for (int i=0;i<cache.size();i++)
            questionText=questionText+DataSet.answerSet[Integer.parseInt(cache.get(i).toString())];

        // Writing into the file
        Files.writeString(ansfileName, startingText + questionText + endingText);

        // Reading the content of the file
        //String file_content = Files.readString(ansfileName);

        // Printing the content inside the file
        //System.out.println(file_content);
        //return 1;
        Process process = null;
        //System.out.println("generate text");
        try {
            process = Runtime.getRuntime().exec("/usr/bin/pdflatex -output-directory /home/arun/Documents/Arun/gcp-questions/" +
                    " -synctex=1 -interaction=nonstopmode "+ ansfileName.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
