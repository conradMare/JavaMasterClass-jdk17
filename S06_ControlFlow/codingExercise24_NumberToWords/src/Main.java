public class Main {
    public static void main(String[] args) {
        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));
        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(100));
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);
        NumberToWords.numberToWords(0);
        NumberToWords.numberToWords(1450);
    }

    public class NumberToWords {
        public static void numberToWords(int number) {
            if (number < 0) {
                System.out.println("Invalid Value");
                return;
            }

            int reversed = reverse(number);
            int digitDiff = getDigitCount(number) - getDigitCount(reversed);
            String words = "";

            if (number == 0)
                words = "Zero";

            while (reversed != 0) {
                int last = reversed % 10;

                switch (last) {
                    case 0:
                        words += "Zero ";
                        break;
                    case 1:
                        words += "One ";
                        break;
                    case 2:
                        words += "Two ";
                        break;
                    case 3:
                        words += "Three ";
                        break;
                    case 4:
                        words += "Four ";
                        break;
                    case 5:
                        words += "Five ";
                        break;
                    case 6:
                        words += "Six ";
                        break;
                    case 7:
                        words += "Seven ";
                        break;
                    case 8:
                        words += "Eight ";
                        break;
                    case 9:
                        words += "Nine ";
                        break;
                    default:
                        System.out.println("Invalid Value");
                        return;
                }

                reversed /= 10;
            }

            if (digitDiff > 0) {
                for (int i = 1; i <= digitDiff; i++)
                    words += "Zero ";
            }

            System.out.println(words.trim());
        }


        public static int reverse(int number) {
            int x = number;
            int reverse = 0;

            while (x != 0) {
                reverse = (reverse * 10) + x % 10;
                x /= 10;
            }

            return reverse;
        }

        public static int getDigitCount(int number) {
            if (number < 0)
                return -1;

            return String.valueOf(number).length();
        }
    }
}
