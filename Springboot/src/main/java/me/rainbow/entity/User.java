package me.rainbow.entity;

import me.rainbow.poi.Excel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author guojinpeng
 * @date 17.11.13 16:48
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    @Excel(name = "编号",order = 2)
    private Integer id;
    @Column
    @Excel(name = "姓名")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
