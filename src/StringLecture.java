public class StringLecture {

    public static void main(String[] args) {
//        String fruit = "apple";
//        String favFruit = "apple";
//        Boolean answer = fruit.equals(favFruit);
//        System.out.println(answer);
//        .equals(String anotherString)

//         String one = "1";
//         String two = "2";
//         System.out.println(one.equals(two));

//        if ("bob".equals("bob")) {
//            System.out.println("Strings match!");
//        }

//        .equalsIgnoreCase(String anotherString)

//         String greeting = "howdy";
//         System.out.println(greeting.equalsIgnoreCase("HoWDy"));


//        .startsWith(String prefix)

//         String title = " Dr. Doctor";
//         boolean isADoctor = title.toLowerCase()
//                 .trim()
//                 .startsWith("dr");
//         System.out.println(isADoctor);


//        .endsWith(String suffix)

//        String travisParkAddress = "311 E Travis St, San Antonio, TX 78205";
//        String codeUpZip = "78205";
//        boolean sameZipAsCodeup = travisParkAddress.trim().endsWith(codeUpZip);
//
//        System.out.println(sameZipAsCodeup);


//        .charAt(int index)
        // consider that this method returns a char type and not a String type

//        boolean firstLetterCapitalized = false;
//        String word = "test";
////
//        char firstLetter = word.charAt(0);
//// //
//        if (firstLetter == Character.toUpperCase(firstLetter)) {
//            firstLetterCapitalized = true;
//        }
// //
//        System.out.println(firstLetterCapitalized);


//        .indexOf(String subString)

//         String cat = "cat";
//         System.out.println(cat.indexOf("a"));



//        .lastIndexOf(String subString)

//         String good = "Good";
//         System.out.println(good.lastIndexOf("o"));


//        .length()

//         String longestWord = "pneumonoultramicroscopicsilicovolcanoconiosis";
//         System.out.println(longestWord.length());


//        .replace(char oldChar, char newChar)

         String search = "tiny cats looking cute cats";
         String parsedSearch = search.replace("cats", "dogs");
         System.out.println(parsedSearch);
/**
 * Left of here for the practice string questions
 */

//        .substring(int beginIndex[, int endIndex])

//         String name = "Justin Bob Reich";
//         String firstName = name.substring(0, name.indexOf(" "));
//          System.out.println(firstName);
//
//        String lastName = name.substring(name.lastIndexOf(" ") + 1);
//        System.out.println(firstName);
//        System.out.println(lastName);

//        String name = "Justin Reich";
//        String firstName = name.substring(0, name.indexOf(" "));
//        System.out.println(firstName);
//        String lastName = name.substring(firstName.length() + 1);
//        System.out.println(lastName);



//        .toLowerCase()
//        .toUpperCase()

//        String hello = "hELlo";
//        System.out.println(hello.toUpperCase());
//        System.out.println(hello.toLowerCase());
//        System.out.println(hello);


//        .trim()

//         String input = "   bob      smith \n\n  ";
//        String trimmedInput = input.trim();
//        System.out.println(trimmedInput);


//         convert word to pig latin word (assume word doesn't begin with a vowel or end in ay)

//        String word1 = "dog";
//        String pigLatinWord = word1
//            .trim() // "dog"
//            .toLowerCase() // "dog"
//            .substring(1) // "og"
//            .concat(word1.substring(0, 1).toLowerCase()) // "og" + "d"
//            .concat("ay"); // "ogday"
//        System.out.println(pigLatinWord);
//
//        String output = "Hello".concat("World");
//        System.out.println(output);



    }

}