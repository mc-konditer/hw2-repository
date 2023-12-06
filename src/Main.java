public class Main {

    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightBoxer1 =  78.2;
        var weightBoxer2 =  82.7;
        var weightTotal1 = weightBoxer1 + weightBoxer2;
        System.out.println("Общая масса боксеров = " + weightTotal1 + " кг.");
        var weightTotal2 = weightBoxer1 - weightBoxer2;
        System.out.println("Разница между массами бойцов = " + weightTotal2 + " кг.");

        var weightTotal3 = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между массами бойцов = " + weightTotal3 + " кг (Вычитание из большей массы).");
        var weightTotal4 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница между массами бойцов = " + weightTotal4 + " кг (Остаток от деления).");


        var allTime = 640;
        var workerTime = 8;
        var workers = allTime / workerTime;
        System.out.println("Всего работников в компании - " + workers + " человек");

        workers = workers + 94;
        allTime = workers * 8;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + allTime + " часов работы может быть поделено между сотрудниками.");

    }

}
