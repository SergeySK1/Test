import javax.swing.*;
/*Stepik*/
public class Test {

    public static void main(String[] args) {
        String [] rol = {"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String [] text = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?",
        "Артемий Филиппович: Как ревизор?",
        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
        "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем"};


        String temp = rollToTextRoll(rol,text);
        System.out.println(temp);


    }

    public static String rollToTextRoll(String []roll,String[]text) {

        StringBuilder temp = new StringBuilder("");

        for (int i = 0; i < roll.length; i++) {
            temp.append(roll[i] + ":" + '\n');
            for (int j = 0; j < text.length; j++) {
                if(text[j].regionMatches(0,(roll[i] + ":"),0,roll[i].length()+1)){
                    temp.append(j+1 + ")" +" " +text[j].substring(roll[i].length()+2, text[j].length()) + '\n');
                }
                else if(j == text.length){
                    temp.append(roll[i] + ":" + '\n');
                }
            }
            temp.append('\n');
        }
        return String.valueOf(temp);
        }

    }




