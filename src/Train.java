import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Train {
    //Ваша задача - отсортировать заданную строку. Каждое слово в строке будет содержать одно число.
    // Это число - позиция, которую должно занимать слово в результате.
//    public static String order(String words) {
//        String[] word = words.split(" ");
//        String[] result = new String[word.length];
//        for (int i = 0; i < word.length; i++) {
//            Pattern p = Pattern.compile("[123456789]");
//            Matcher m = p.matcher(word[i]);
//            if (m.find()) {
//                result[Integer.parseInt(m.group()) - 1] = word[i];
//            } else return "";
//        }
//        return String.join(" ", result);
//    }

    //Существует массив с некоторыми числами. Все числа равны, кроме одного. Попробуйте найти его!
//    public static double findUniq(double arr[]) {
//        double val = 0;
//        int count = 0;
//        Set<Double> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//        }
//        Double[] a = set.toArray(new Double[2]);
//        for (int i = 0; i < arr.length; i++) {
//            if (a[0] == arr[i]) count++;
//            else count = count;
//        }
//        if (count > 1) val = a[1];
//        else val = a[0];
//        return val;
//    }

    //Учитывая список целых чисел, определите, является ли сумма его элементов четной или нечетной.
    //Дайте свой ответ в виде строки, соответствующей "odd"или "even".
    //    public static String oddOrEven(int[] array) {
//        int num = 0;
//        for (int i = 0; i < array.length; i++) {
//            num += array[i];
//        }
//        if (num % 2 == 0 && num != 0) return "even";
//        else return "odd";
//    }

    //принимает массив слов, объединяет их в предложение и возвращает предложение. Вы можете игнорировать
    // любую необходимость очистки слов или добавления знаков препинания, но вы должны добавлять пробелы
    // между каждым словом. Будьте осторожны, в начале или конце предложения не должно быть пробелов!
//    public static String smash(String... words) {
//        String res = "";
//        for (int i = 0; i < words.length; i++) {
//            words[i]=words[i].trim();
//            res = String.join(" ", words);
//        }
//       return res;
//}

    //Учитывая строку, определите, является ли она панграммой.
    // Верните True, если это так, False, если нет. Игнорируйте цифры и знаки препинания.
//    public static boolean check(String sentence){
//        return sentence.toLowerCase()
    //заменяем на "" все кроме алфавитных букв
//                .replaceAll("[^a-z]", "")
    // заменяем все знаки препинания и дубли символов и букв
//                .replaceAll("(.)(?=.*\\1)", "")
    // остается 26 букв алфавита, т.к. длинна латинского алфавита 26 символов
//                .length() == 26;
//    }

//Ребенок играет с мячом на n-м этаже высокого здания. Высота этого этажа, h, известна.
//Он выбрасывает мяч из окна. Мяч отскакивает (например) на две трети своей высоты (отскок 0,66).
//Его мать выглядывает из окна в 1,5 метрах от земли.
//Сколько раз мать будет видеть, как мяч пролетает перед ее окном (в том числе, когда он падает и отскакивает?

//    public static int bouncingBall(double h, double bounce, double window) {
//        int count = 1;
//        if (h > 0 && bounce > 0 && bounce < 1 && window < h) {
//            do {
//                h *= bounce;
//                if(h<=window){
//                    count=count;
//                }else count = count + 2;
//            }
//            while (h * bounce > window);
//        } else count = -1;
//            return count;
//    }

    //Вы получаете массив с результатами тестов ваших коллег.
    // Теперь рассчитайте среднее значение и сравните свой результат!
    //Возвращайся True, если ты лучше, иначе False!
//    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
//        double mid = 0;
//        int sum = 0;
//        for (int i = 0; i < classPoints.length; i++) {
//            sum+=classPoints[i];
//        }
//        sum = sum+yourPoints;
//        mid = sum / (classPoints.length+1);
//        if (mid < (double) yourPoints) return true;
//        else if(mid==yourPoints) return false;
//        else return false;
//    }


    //Учитывая строку, вы должны вернуть строку, в которой каждый символ
    // (с учетом регистра) повторяется один раз.

//    public static String doubleChar(String s) {
//        String single = "";
//        String[] arr = s.trim().split("");
//        int count = 1;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i].equals(arr[i + 1])) {
//                count++;
//            }else {
//                count = 1;
//            }
//            if(count == 2 || count == 4) arr[i]="";
//        }
//        single = String.join("", arr);
//        return single;
//    }

    //Суммируйте все числа данного массива ( cq. list ),
    // кроме самого высокого и самого низкого элемента (по значению, а не по индексу!).
    //Самый высокий или самый низкий элемент соответственно - это один элемент на каждом ребре,
    // даже если их несколько с одинаковым значением.

//    public static int sum(int[] numbers) {
//        try {
//            Arrays.sort(numbers);
//            if (numbers[0] == numbers[numbers.length - 1]|| Arrays.asList(numbers).contains(null)) return 0;
//            else return Arrays.stream(numbers).sum() - numbers[0] - numbers[numbers.length - 1];
//        }catch (Exception e){
//            return 0;
//        }
//    }

    //Создайте функцию, которая выдает персонализированное приветствие.
    // Эта функция принимает два параметра: nameи owner.
//    static String greet(String name, String owner) {
//        if (name.equals(owner))return "Hello boss";
//        else return "Hello guest";
//    }


    //Напишите функцию RemoveExclamationMarks, которая удаляет все восклицательные знаки из заданной строки.
//    static String removeExclamationMarks(String s) {
//        return s.replaceAll("!","");
//    }

    //Завершите решение так, чтобы функция разбивала верблюжью оболочку, используя пробел между словами.
//    public static String camelCase(String input) {
//        String[] arr = input.split("");
//        for (int i = 0; i < arr.length; i++) {
//            Pattern pattern = Pattern.compile("[A-Z]");
//            Matcher matcher = pattern.matcher(arr[i]);
//            if (matcher.find()) {
//                arr [i] = " " + arr[i];
//            }
//        }
//        return String.join("",arr);
//    }

//Таракан - одно из самых быстрых насекомых. Напишите функцию, которая принимает скорость
// в километрах в час и возвращает ее в сантиметрах в секунду, округленную до целого числа (= floored).
//    public static int cockroachSpeed(double x){
//        int speed = (int) (x*100000/3600);
//        return speed;
//    }

    //Напишите функциюfindNeedle(), которая принимает array полный мусор, но содержит один "needle"
    //После того, как ваша функция найдет иглу, она должна вернуть сообщение (в виде строки),
    // в котором говорится: "found the needle at position " плюс index

//    public static String findNeedle(Object[] haystack) {
//        int ind = 0;
//        String str = "";
//        for (int i = 0; i < haystack.length; i++) {
//            str = String.valueOf(haystack[i]);
//            if (str.equals("needle")) ind = i;
//        }
//        return "found the needle at position " + ind;
//    }

    //Каждый день аренды автомобиля стоит 40 долларов. Если вы арендуете автомобиль на 7 или более дней,
    // вы получаете 50 долларов от общей суммы. Кроме того, если вы арендуете автомобиль на 3 или более дней,
    // вы получаете 20 долларов от общей суммы.
    //Напишите код, который выдает общую сумму за разные дни (d).

//    public static int rentalCarCost(int d) {
//        int result = 0;
//        if (d < 3) result = 40 * d;
//        else if (7 > d && d >= 3) result = 40 * d - 20;
//        else if (d >= 7) result = 40 * d - 50;
//        return result;
//    }

    //Перевести в противоположный кейс(из строчных в заглавные, и наоборот)
//    public static String toAlternativeString(String string) {
//       char[] arr = string.toCharArray();
//       String[] str = new String[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            char c = arr[i];
//            if(Character.isLowerCase(c)){
//                arr [i]=Character.toUpperCase(c);
//            }else {
//                arr [i]=Character.toLowerCase(c);
//            }
//            str[i] = String.valueOf(arr[i]);
//        }
//        return String.join("",str);
//    }

    //Учитывая массив целых чисел nums и целочисленное целевое значение, верните индексы двух чисел таким образом, чтобы они суммировались с целевым значением.
    //
    //Вы можете предположить, что каждый ввод будет иметь ровно одно решение,
    // и вы не можете использовать один и тот же элемент дважды.
//    public static int[] twoSum(int[] nums, int target) {
//        int[] res = new int [2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target&&i!=j) {
//                    res[1] = i;
//                    res[0] = j;
//                }
//            }
//        }
//        for (int i = 0; i < res.length; i++) {
//            System.out.println(res[i]);
//        }
//        return res;
//    }

    //Напишите функцию, которая будет принимать количество
    // лепестков каждого цветка и возвращать true, если они влюблены, и false, если нет.

//    public static boolean isLove(final int flower1, final int flower2) {
//        boolean isLove = true;
//        if (flower1%2==0&&flower2%2!=0||flower1%2!=0&&flower2%2==0) isLove=true;
//        else isLove = false;
//        return isLove;
//    }


//Учитывая случайное неотрицательное число, вы должны вернуть цифры этого числа в массиве в обратном порядке.
//    public static int[] digitize(long n) {
//        String word = ""+n;
//        StringBuffer sb = new StringBuffer(word);
//        word = sb.reverse().toString();
//        String[]title = word.split("");
//        int [] arr = new int[title.length];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = Integer.parseInt(title[i]);
//        }return arr;
//    }

    //Реализуйте функцию, которая принимает массив, содержащий имена людей, которым нравится элемент.
    // Он должен возвращать отображаемый текст, как показано в примерах:
    //[]                                -->  "no one likes this"
    //["Peter"]                         -->  "Peter likes this"
    //["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
    //["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"

//    public static String whoLikesIt(String... names) {
//        String result = "no one likes this";
//        int x = names.length - 2;
//        if(names.length==3){
//            result = names[0] + ", " + names[1] + " and " + names[2] + " likes this";
//        }else if (names.length > 3){
//            result = names[0] + ", " + names[1]  + " and " + x + " others likes this";
//        }else if(names.length==1){
//            result = names[0] + " likes this";
//        }else if(names.length==2){
//            result = names[0] + ", " + names[1] + " likes this";
//        }
//         return result;
//    }

    //В этом небольшом задании вам дается строка чисел, разделенных пробелами,
    // и вы должны вернуть наибольшее и наименьшее число.

//    public static String highAndLow(String numbers) {
//        String[] arrNum = numbers.split(" ");
//        int[] arr = new int[arrNum.length];
//        for (int i = 0; i < arrNum.length; i++) {
//            if (!arrNum[i].equals("-")) {
//                arr[i] = Integer.parseInt(arrNum[i]);
//            } else {
//                arr[i] = Integer.parseInt(arrNum[i + 1]) * -1;
//            }
//        }
//        Arrays.sort(arr);
//        return "" + arr[arr.length - 1] + " " + arr[0];
//    }

    // Метод принимает обычную строку, а возвращает строку все слова в которой начинаются с заглавной буквы
//    public static String toJadenCase(String phrase) {
//        String res = "null";
//        try{
//            String[] word = phrase.split(" ");
//            for (int i = 0; i < word.length; i++) {
//                String[] title = word[i].split("");
//                title[0] = title[0].toUpperCase();
//                word[i] = String.join("", title);
//
//            } res = String.join(" ", word);
//        }catch (Exception e){
//            return null;
//        }
//        return res;
//    }

    //Существует ли целое число k, такое как : (a ^ p + b ^ (p + 1) + c ^(p + 2) + d ^ (p + 3) + ...) = n * k
    //Если это так, мы вернем k, если нет, вернем -1.
    //Примечание: n и p всегда будут заданы как строго положительные целые числа.

//    public static long digPow(int n, int p) {
//        String[] num = ("" + n).split("");
//        long [] arr = new long[num.length];
//        for (int i = 0; i < num.length; i++) {
//            arr[i] = (long) Math.pow(Integer.parseInt(num[i]), p++);
//            System.out.println(arr[i]);
//        }
//        long sumArr = Arrays.stream(arr).sum();
//        if (sumArr%n==0)return sumArr/n;
//        else return -1;
//    }

    //Подсчитайте количество делителей положительного целого n числа.
    //Случайные тесты доходят до n = 500000.

//    public static long numberOfDivisors(int n) {
//        long count = 0;
//        int [] arrDel = new int[n];
//        for (int i = 1; i <= n ; i++) {
//            if (n%i==0)count++;
//        }return count;
//    }

    //Напишите функцию, которая вернет количество различных буквенных символов без учета регистра
    // и цифровых цифр, которые встречаются более одного раза во входной строке. Можно предположить,
    // что входная строка содержит только буквы алфавита (как в верхнем, так и в нижнем регистре)
    // и числовые цифры.
    //"abcde" -> 0 # no characters repeats more than once
    //"aabbcde" -> 2 # 'a' and 'b'
    //"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)

    public static int countOfCoincidence (String s){
        String[] arr = s.toLowerCase().split("");
        Set<String> a = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])&&arr[i]!=arr[j]) a.add(arr[i]);
            }
        }
        return  a.size();
    }
}
