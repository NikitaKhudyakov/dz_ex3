package HomeWork;

import HomeWork.FileWorks.FileWorks;
import HomeWork.FileWorks.WriteInFileException;
import HomeWork.InputWorks.InputString;

import static HomeWork.FileWorks.FileWorks.printAll;
import static HomeWork.InputWorks.InputString.*;

import static HomeWork.Preparing.Preparing.*;

public class Main {



    public static void main(String[] args) throws WriteInFileException {
        InputAb();
        if (more) {
            printAll(abonentArrayList);
        }
    }





}
