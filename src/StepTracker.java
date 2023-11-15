public class StepTracker {
    static MonthData[] monthToData;
    static int goal = 1000;

    public StepTracker() {
        // заполнить массив месяцами, длина - 12
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public static class MonthData {
        // создать массив с днями - 30 дней
        int[] days = new int[30];
    }

    public static void stepPerDay(int month, int day, int steps) {
        monthToData[month].days[day - 1] = steps;
        System.out.println("Значение сохранено");
    }

    public static void goal(int newGoal) {
        if (goal < 0) {
            System.out.println("Цель не может быть отрицательной");
        } else {
            goal = newGoal;
            System.out.println("Новая цель: " + goal + "шагов в день");
        }
    }

    public static void statPerMonth(int month) {
        for (int i = 0; i < monthToData[month].days.length; i++) {
            System.out.println((i + 1) + "день: " + monthToData[month].days[i]);
        }

        int sumSteps = 0;
        int maxSteps = 0;
        for (int i = 0; i < monthToData[month].days.length; i++) {
            sumSteps += monthToData[month].days[i];

            if (monthToData[month].days[i] > maxSteps) {
                maxSteps += monthToData[month].days[i];
            }
        }
        int avgSteps = sumSteps / 30;

        int rangeSteps = 0;
        int bestRange = 0;
        for (int i = 0; i < monthToData[month].days.length; i++) {
            if (monthToData[month].days[i] > goal) {
                rangeSteps++;
            } else {
                rangeSteps = 0;
            }

            if (rangeSteps > bestRange) {
                bestRange = rangeSteps;
            }
        }

        // Вывод статистики
        System.out.println("В этом месяце: ");
        System.out.println("Всего пройдено: " + sumSteps + " шагов");
        System.out.println("Максимально пройдено шагов за день: " + maxSteps);
        System.out.println("Среднее количество в день: " + avgSteps + " шагов");
        System.out.println("Пройдено: " + Converter.km(sumSteps) + " километров");
        System.out.println("Ссожено: " + Converter.kilCal(sumSteps) + " калорий");
        System.out.println("Лучшая серия: " + bestRange + "дней подряд выполняли цель");
    }
}
