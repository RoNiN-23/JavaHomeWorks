package ru.mirea.ikbo1319.Practical_20;

import java.util.HashMap;

public class Sort {
    private int num = 0;
    private int s = 0;
    private boolean check = false;
    private String strHelp1 = null;
    private String strHelp2 = null;
    private int help;
    private String shelp;

//Считает кол-во повторений слов
    public void quantityWords(String mass, HashMap<Integer, String> words, HashMap<Integer, Integer> sum) {
        if (words.size() == 0) {
            words.put(1, mass);
            sum.put(1, 1);
        } else {
            s = words.size() + 1;
            for (int j = 1; j < s; j++) {
                if (words.get(j).equals(mass)) {
                    num = sum.get(j) + 1;
                    sum.remove(j);
                    sum.put(j, num);
                    check = true;
                    break;
                }
            }

            if (!check) {
                num = words.size() + 1;
                words.put(num, mass);
                sum.put(num, 1);
            }
            check = false;
        }
    }

    //Удаляем из строки все знаки препинания
    public String delete(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?' || str.charAt(i) == ':' || str.charAt(i) == ';' || str.charAt(i) == '"' || str.charAt(i) == '\'' || str.charAt(i) == '(' || str.charAt(i) == ')' || str.charAt(i) == '[' || str.charAt(i) == ']' || str.charAt(i) == '-') {
                    strHelp1 = str.substring(0, i);
                    strHelp2 = str.substring(i + 1);
                    str = strHelp1 + strHelp2;
            }
        }
        for(int i = 0; i < 2; i++) {
            if (str.charAt(str.length() - 1) == ',' || str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '!' || str.charAt(str.length() - 1) == '?' || str.charAt(str.length() - 1) == ':' || str.charAt(str.length() - 1) == ';' || str.charAt(str.length() - 1) == '"' || str.charAt(str.length() - 1) == '\'' || str.charAt(str.length() - 1) == '(' || str.charAt(str.length() - 1) == ')' || str.charAt(str.length() - 1) == '[' || str.charAt(str.length() - 1) == ']' || str.charAt(str.length() - 1) == '-') {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }

    //Метод сортировки
    public void sortWords(HashMap<Integer, String> words, HashMap<Integer, Integer> sum) {
        for (int k = 0; k < sum.size();k++) {
            for (int i = 1; i < sum.size(); i++) {
                if (sum.get(i) < sum.get(i + 1)) {
                    help = sum.get(i);
                    sum.put(i, sum.get(i + 1));
                    sum.put(i + 1, help);

                    shelp = words.get(i);
                    words.put(i, words.get(i + 1));
                    words.put(i + 1, shelp);
                }
            }
        }
    }

    public String swit4(String mass[]){
        shelp = null;
        for(int i = 0; i < mass.length - 1;i++){
            shelp+=mass[i] + "#";
        }
        shelp+=mass[mass.length-1];
        return shelp;
    }
}
