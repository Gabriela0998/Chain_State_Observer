package com.company;
import java.util.List;
import java.util.ArrayList;

public class employees {

        public static void main(String[] args) {

            ActionMinder tm = new ActionMinder(40);

            Action fortuneTask = new Action();

            tm.addAction(fortuneTask, 1000);

            //List of file names to parse.
            List<String> fileList = populateFiles();

            Handler chainHandler = buildChain();

            //Pass the file name to the first handler in the chain.
            for (String fileName: fileList){
                chainHandler.parse(fileName);
            }
        }

        private static Handler buildChain() {
            //No successor for this handler because this is the last in chain.
            Handler ForAbroad = new ForAbroad();

            //chain.XmlHandler is the successor of chain.Mp3Handler.
            Handler ForCountry = new ForCountry(ForAbroad);

            return new ForCity(ForCountry);
        }

        private static List<String> populateFiles(){

            List<String> fileList = new ArrayList<String>();
            fileList.add("for.abroad");
            fileList.add("for.country");
            fileList.add("for.city");

            return fileList;
        }

}
