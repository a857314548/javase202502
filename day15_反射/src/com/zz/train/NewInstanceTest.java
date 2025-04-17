package com.zz.train;

import com.zz.train.entity.Person;

import java.util.Random;

public class NewInstanceTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        System.out.println(person);

        //体会反射的动态性
        refactionDyan();

    }

    private static void refactionDyan() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String path = null;

        for (int i = 0; i < 100; i++) {

            int num = new Random().nextInt(3);
            switch (num) {
                case 0:
                    path = "java.lang.String";
                    break;
                case 1:
                    path = "java.util.Date";
                    break;
                case 2:
                    path = "com.zz.train.entity.Person";
                    break;
            }

            System.out.println(newInstance(path));
        }


    }

    private static Object newInstance(String classPath) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return Class.forName(classPath).newInstance();
    }
}
