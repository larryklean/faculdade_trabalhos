//Interpolação Inversa
//Basicamente utiliza o método de Newton invertendo o x com o y

clear
close
clc

x = [0.6; 0.7]     //Pontos X
y = [1.82; 2.01]    //Pontos f(x) ou Y
p1 = 2                 //Ponto que se deseja calcular
p2 = poly(0, 'p')        //Variavel usada para calculo do polinomio

aux = y
y = x
x = aux

n = size(x,1)

function [s] = f1(x1)
    s = y(x1,1)
endfunction

function [s] = f2(x1,x2)
    s = (f1(x2) - f1(x1)) / (x(x2,1) - x(x1,1))
endfunction

function [s] = f3(x1,x2,x3)
    s = (f2(x2,x3) - f2(x1,x2)) / (x(x3,1) - x(x1,1))
endfunction

function [s] = f4(x1,x2,x3,x4)
    s = (f3(x2,x3,x4) - f3(x1,x2,x3)) / (x(x4,1) - x(x1,1))
endfunction

function [s] = f5(x1,x2,x3,x4,x5)
    s = (f4(x2,x3,x4,x5) - f4(x1,x2,x3,x4)) / (x(x5,1) - x(x1,1))
endfunction

function [s] = f6(x1,x2,x3,x4,x5,x6)
    s = (f5(x2,x3,x4,x5,x6) - f5(x1,x2,x3,x4,x6)) / (x(x6,1) - x(x1,1))
endfunction

function [s] = f(opc)
    select opc
    case 1 then
        s = f1(1)
        
    case 2 then
        s = f2(1,2)
        
    case 3 then
        s = f3(1,2,3)
        
    case 4 then
        s = f4(1,2,3,4)
        
    case 5 then
        s = f5(1,2,3,4,5)
        
    case 6 then
        s = f6(1,2,3,4,5,6)
    end
endfunction

function [s] = main(p)
    resultado = 0
    for i = 1 : (n)
        aux = 1
        for j = 1 : (i-1)
            aux = aux * (p - x(j,1))
        end
        resultado = resultado + (aux * f(i))
    end
    s = resultado
endfunction

resultado = main(p1)
polinomio = main(p2)
disp (resultado, "Resultado: ", polinomio, "Polinomio: ", p1, "f(x): ")
