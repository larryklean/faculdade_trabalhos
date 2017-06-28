#ifndef LIVRO_H_INCLUDED
#define LIVRO_H_INCLUDED

#include "ItemPedido.h"

class ItemPedido;

class Livro
{
private:
    char ISBN[100],titulo[100],autor[100];
    float preco;
    ItemPedido* itempedido;
public:
    Livro(char* = "",char* = "",char* = "",float = 0);
    void setISBN(char*);
    void settitulo(char*);
    void setautor(char*);
    void setpreco(float);
    void setitempedido(ItemPedido*);
    char* getISBN();
    char* gettitulo();
    char* getautor();
    float getpreco();
    void mostra();
    void grava(std::ofstream &);
    void recupera(std::ifstream &);
};

#endif // LIVRO_H_INCLUDED
