package be.intecbrussel;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Hallo");
        stringList.add("World");
        stringList.add("Jean");
        //هنا نكدر نضيف عنصر باي مكان نريده نحدد موقعه وبعدين نكتب شنو هو "هنا"
        stringList.add(1,"INDEX 1");
// اذا نريد نغير ونخلي كلمه مكان كمله
        stringList.set(0,"goodbye");
      /*   for (String s : stringList) {
            System.out.println(s);
        }
*/
        stringList.remove(2);
        stringList.remove("Jean");
        stringList.removeIf(word->word.contains("oo"));
        //نشوف كم عنصر بالمصفوفه
        stringList.size();
        System.out.println(stringList.size());

        stringList.add("Muhammed");
        stringList.add(",");
        stringList.add("bone apple tea");
        //System.out.println(stringList.get(3));
        int firstInstanceOfComma = stringList.indexOf(",");
        stringList.set(firstInstanceOfComma,"hhh");

        //bij gebruik van contains moet we de equals methode implementeren.
        System.out.println(stringList.contains("hhh"));

       stringList.forEach(sentence -> System.out.println(sentence));

    }
}
