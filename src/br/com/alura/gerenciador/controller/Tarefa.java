package br.com.alura.gerenciador.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Tarefa {
    
    String executa(HttpServletRequest request, HttpServletResponse response);

}
