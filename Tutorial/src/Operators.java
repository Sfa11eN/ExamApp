public class Operators {
    int x = 5; // if

    {
        if (x > 0) {
            System.out.println("x положительное");
        }
    }

    int y = 5; //else

    {
        if (y > 0) {
            System.out.println("y положительное");
        } else {
            System.out.println("y неположительное");
        }
    }

    int z = 5; //else if

    {
        if (z > 0) {
            System.out.println("z положительное");
        } else if (z < 0) {
            System.out.println("z отрицательное");
        } else {
            System.out.println("z равно нулю");
        }
        int day = 1;//switch
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            default:
                System.out.println("Неизвестный день");
                break;
        }
    }
}