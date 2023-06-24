// 20. A core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price]

public class CalculatePriceAfterDiscount {
        public static void main(String[] args) {
            String paragraph = "A core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk.";

            String[] words = paragraph.split("\\s+");
            int laptopPrice = 0;
            int mousePrice = 0;

            for (String word : words) {
                if (word.matches("\\d+")) {
                    int price = Integer.parseInt(word);
                    if (laptopPrice == 0) {
                        laptopPrice = price;
                    } else {
                        mousePrice = price;
                        break;
                    }
                }
            }

            double discountPercentage = 15.0; // 15%
            double discount = discountPercentage / 100.0;
            double laptopCost = laptopPrice - (laptopPrice * discount);
            double mouseCost = mousePrice - (mousePrice * discount);
            double totalCost = laptopCost + mouseCost;

            System.out.println("Laptop Price after 15% discount: " + laptopCost + " tk");
            System.out.println("Mouse Price after 15% discount: " + mouseCost + " tk");
            System.out.println("Total (Laptop+Mouse) cost after 15% discount: " + totalCost + " tk");
        }
    }



