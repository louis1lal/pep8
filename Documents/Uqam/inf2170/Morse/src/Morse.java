/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Programme qui prend comme entré des caractères du code morse et les convertis
 * en caractères de l'alphabet.
 *
 * Chaque lettre est séparée par un espace Chaque mot est séparée par un retour
 * à la ligne le programme ne prend en entré que des ligne et des points On peut
 * entrer au maximum quatre caractères pour désigner un lettre.
 *
 * le programme se termine lorsqu'il rencontre le caractère $. Ce programme est
 * conçu en utilisant des variables, des boucles et des systèmes de conditions.
 *
 * @author Louis-Alexandre Lapointe, bk491344
 */
public class Morse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char symbol = 0;

        // variable qui additionne le code des caractères
        int symbolAddition;

        // compteur qui permet de sélectionner les bonnes cases du tableaux
        // en fonction du nombre de caractères qui représente une lettre.
        int compteur;

        //on utilise 4 variables pour simuler des indices de tableaux
        char indice0 = 0;
        char indice1 = 0;
        char indice2 = 0;
        char indice3 = 0;

        //tant que le caractère saisie est différent du caractère $
        //la boucle continue son exécution
        while (symbol != 36) {

            compteur = 0;
            symbolAddition = 0;
            symbol = Pep8.chari();

            //boucle qui s'exécute tant que le caractère 
            //saisis est différent du caractère espace ou 
            //du caractère retour chariot
            while (symbol != ' ' && symbol != '\n' && symbol != '$') {

                symbolAddition = symbolAddition + symbol;

                switch (compteur) {
                    case 0:
                        indice0 = symbol;
                        break;
                    case 1:
                        indice1 = symbol;
                        break;
                    case 2:
                        indice2 = symbol;
                        break;
                    case 3:
                        indice3 = symbol;
                        break;
                }
                symbol = Pep8.chari();
                compteur++;
            }

            switch (symbolAddition) {

                // . = e
                case 46:
                    if (indice0 == '.') {
                        Pep8.charo('e');
                    }
                    break;

                // - = t
                case 45:
                    if (indice0 == '-') {
                        Pep8.charo('t');
                    }
                    break;

                // si == retour charriot.
                case 10:
                    System.out.println();
                    symbol = 0;
                    break;

                case 32:
                    symbol = 0;
                    break;

                case 90:
                    Pep8.charo('m');
                    break;

                case 91:
                    if (indice0 == '-' && indice1 == '.') {
                        Pep8.charo('n');
                    } else {
                        Pep8.charo('a');
                    }
                    break;

                case 92:
                    Pep8.charo('i');
                    break;

                case 135:
                    Pep8.charo('o');
                    break;

                // --. = g
                // -.- = k
                //.-- = w
                case 136:
                    if (indice0 == '-' && indice1 == '-' && indice2 == '.') {
                        Pep8.charo('g');
                    } else if (indice0 == '-' && indice1 == '.' 
                            && indice2 == '-') {
                        Pep8.charo('k');
                    } else if (indice0 == '.' && indice1 == '-' 
                            && indice2 == '-') {
                        Pep8.charo('w');
                    }
                    break;

                // ..- = u
                //.-. = r
                // -.. = d
                case 137:
                    if (indice0 == '.' && indice1 == '.' && indice2 == '-') {
                        Pep8.charo('u');
                    } else if (indice0 == '.' && indice1 == '-' 
                            && indice2 == '.') {
                        Pep8.charo('r');
                    } else if (indice0 == '-' && indice1 == '.' 
                            && indice2 == '.') {
                        Pep8.charo('d');
                    }
                    break;

                case 138:
                    Pep8.charo('s');
                    break;

                // --.. = z
                // -..- = x
                // -.-. = c
                // .--. = p
                case 182:
                    if (indice0 == '-' && indice1 == '-' && indice2 == '.'
                            && indice3 == '.') {
                        Pep8.charo('z');
                    } else if (indice0 == '-' && indice1 == '.'
                            && indice2 == '.' && indice3 == '-') {
                        Pep8.charo('x');
                    } else if (indice0 == '-' && indice1 == '.'
                            && indice2 == '-' && indice3 == '.') {
                        Pep8.charo('c');
                    } else if (indice0 == '.' && indice1 == '-'
                            && indice2 == '-' && indice3 == '.') {
                        Pep8.charo('p');
                    }
                    break;

                // -.-- = y
                // .--- = j
                // --.- = q
                case 181:
                    if (indice0 == '-' && indice1 == '.' && indice2 == '-'
                            && indice3 == '-') {
                        Pep8.charo('y');
                    } else if (indice0 == '.' && indice1 == '-'
                            && indice2 == '-' && indice3 == '-') {
                        Pep8.charo('j');
                    } else {
                        Pep8.charo('q');
                    }
                    break;

                // ...- = v
                // ..-. = f
                // -... = b
                // .-.. = l
                case 183:
                    if (indice0 == '.' && indice1 == '.' && indice2 == '.'
                            && indice3 == '-') {
                        Pep8.charo('v');
                    } else if (indice0 == '.' && indice1 == '.'
                            && indice2 == '-' && indice3 == '.') {
                        Pep8.charo('f');
                    } else if (indice0 == '-' && indice1 == '.'
                            && indice2 == '.' && indice3 == '.') {
                        Pep8.charo('b');
                    } else {
                        Pep8.charo('l');
                    }
                    break;

                // .... = h
                case 184:
                    Pep8.charo('h');

                case 36:
                    break;

                default:
                    if (symbol == 36) {
                        break;
                    }
                    if (indice0 != 0 || indice1 != 0 || indice2 != 0
                            || indice3 != 0) {
                        if (indice0 != '.' && indice0 != '-') {
                            System.out.println("\nErreur!!");
                            symbol = 36;
                            break;
                        } else if (indice1 != '.' && indice1 != '-') {
                            System.out.println("\nErreur!!");
                            symbol = 36;
                            break;
                        } else if (indice2 != '.' && indice2 != '-') {
                            System.out.println("\nErreur!!");
                            symbol = 36;
                            break;
                        } else if (indice3 != '.' && indice3 != '-') {
                            System.out.println("\nErreur!!");
                            symbol = 36;
                            break;
                        }

                    }

                    Pep8.charo('?');
                    break;
            }

            if (symbol == ' ') {
                symbol = 0;

            } else if (symbol == '\n') {
                symbol = 0;
                System.out.println();
            }
        }

    }

}
