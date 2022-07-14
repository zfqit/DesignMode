package com.zhou.prototype.deepcopydemo3;

import java.io.*;

/**
 * @author zhoufuqi
 * @date 2022/7/14 20:03
 */
public class User implements Cloneable, Serializable {
    private String name;
    private Integer age;
    private Dog dog;

    public User() {
    }

    public User(String name, Integer age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = dog;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + ", dog=" + dog + '}';
    }

    /**
     * 通过实现 Cloneable 接口的 clone 方法实现深拷贝 (不推荐)
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = (User) super.clone();
        Dog dog = (Dog) user.getDog().clone();
        user.setDog(dog);
        return user;
    }


    /**
     * 通过序列化的形式进行深拷贝
     * 注意: 被克隆的对象或属性需要实现 Serializable 接口
     * @return
     */
    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (Exception e) {

        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


}
