#include <iostream>

using namespace std;

int main() {
    char operador;
    double num1, num2;

    cout << "Digite um número: ";
    cin >> num1;

    cout << "Digite um operador (+, -, *, /): ";
    cin >> operador;

    cout << "Digite outro número: ";
    cin >> num2;

    switch (operador) {
        case '+':
            cout << "Resultado: " << num1 + num2 << endl;
            break;
        case '-':
            cout << "Resultado: " << num1 - num2 << endl;
            break;
        case '*':
            cout << "Resultado: " << num1 * num2 << endl;
            break;
        case '/':
            if (num2 != 0) {
                cout << "Resultado: " << num1 / num2 << endl;
            } else {
                cout << "Erro! Divisão por zero." << endl;
            }
            break;
        default:
            cout << "Operador inválido." << endl;
            break;
    }

    return 0;
}
