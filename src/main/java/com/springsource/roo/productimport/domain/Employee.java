package com.springsource.roo.productimport.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Employee {

    /**
     */
    @NotNull
    @Size(min = 5)
    private String employeeid;

    /**
     */
    @NotNull
    private String employeename;

    /**
     */
    private String email;

    /**
     */
    private String tel;

    /**
     */
    private String address;

    /**
     */
    @NotNull
    private String department;

    /**
     */
    @Enumerated
    private Sex sex;
}
