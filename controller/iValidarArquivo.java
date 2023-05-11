package controller;

import java.io.File;


public interface iValidarArquivo {
    
    public boolean validarArquivo(File file, int tipo, File hash);

}
