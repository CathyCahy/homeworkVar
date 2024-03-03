public class Main {
    public static void main(String[] args) {

        // задача 1
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // задача 2
        var Dog = dog + 4;
        var Cat = cat + 4;
        var Paper = paper + 4;
        System.out.println("Теперь значение dog " + Dog);
        System.out.println("Теперь значение cat " + Cat);
        System.out.println("Теперь значение paper " + Paper);

        // задача 3
        var newDog = Dog - 3.5;
        var newCat = Cat - 1.6;
        var newPaper = Paper - 7639;
        System.out.println("После вычитания значение dog " + newDog);
        System.out.println("После вычитания значение cat " + newCat);
        System.out.println("После вычитания значение paper " + newPaper);

        // задача 4
        var friend = 19;
        System.out.println(friend);
        var Friend = friend + 2;
        System.out.println(Friend);
        var resultFriend = Friend/7;
        System.out.println(resultFriend);

        // задача 5
        var frog = 3.5;
        frog = frog * 10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // задача 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var sumWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса двух бойцов - "+sumWeight+" кг.");
        var diffWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе двух бойцов - "+diffWeight+" кг.");

        // задача 7
        var remainWeight = secondBoxerWeight%firstBoxerWeight;
        System.out.println("Остаток от деления веса второго бойца на вес первого - " + remainWeight + " кг.");

        // задача 8
        var hours = 640;
        var staff = hours/8;
        System.out.println("Всего работников в компании — " + staff + "человек");
        staff = staff+94;
        hours = staff*8;
        System.out.println("Если в компании работает " + staff +"  человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");
   // домашка выполнена
    }
}
