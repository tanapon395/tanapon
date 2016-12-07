package com.springsource.roo.productimport.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Product {

    /**
     */
    @NotNull
    @Size(min = 5)
    private String productid;

    /**
     */
    @NotNull
    private String productname;

    /**
     */
    @NotNull
    private Float price;

    /**
     */
    @NotNull
    private String manufacturer;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date manufacturerdate;

    /**
     */
    @ManyToOne
    private ProductType typeproduct;
}
