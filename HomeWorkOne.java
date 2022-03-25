class HomeWorkOne {
    public static void main(String[] args) {
    printThreeWords();
    checkSumSing();
    printColor();
    compareNumbers();
    }
    
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    
    static void checkSumSing() {
		int a = 2, b = 3;
		if (a+b >= 0) {
			System.out.println("Сумма положительная");
	    } else {
			System.out.println("Сумма отрицательная");
	    }
    }			

    static void printColor() {
		int value = 5;
		if (value <= 0) {
			System.out.println("Красный");
		} else if (value <= 100) {
			System.out.println("Желтый");
		} else {
			System.out.println ("Зеленый");
	    } 
	}
	
	static void compareNumbers() {
		int a = 7;
		int b = 15;
		System.out.println(a>=b? "a>=b":"a<b");
	}
}
