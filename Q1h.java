import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Task_1 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> phoneBook = new HashMap<Integer, ArrayList<String>>();
        Map<Integer, String> nameBook = new HashMap<Integer, String>();
        nameBook.put(0, "Иванов И.И.");
        nameBook.put(1, "Петров П.П.");
        nameBook.put(2, "Иванов А.П.");
        nameBook.put(3, "Сидоров С.С.");
        for (int i=0;i< nameBook.size();i++){
        if (phoneBook.get(i)==null){
            phoneBook.put(i, new ArrayList<String>()); 
            phoneBook.get(i).add("8-965-123-45-"+i+i+";"+"8-920-999-99-"+i+i);
        }
        System.out.println("Телефонные номера абонента"+" "+nameBook.get(i)+" :"+phoneBook.get(i));
        }
               
    }
}
