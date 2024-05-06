package br.com.alura.screenmatch.service;

public interface ICinverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
