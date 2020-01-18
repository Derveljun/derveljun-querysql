package com.derveljun.querysql.domain.memo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "MEMO")
public class Memo {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "create_date")
    private LocalDate createDate;

    @Column(name = "create_date")
    private LocalDate modifyDate;

    @Column(name = "title")
    private String title;

    @Column(name = "desc")
    private String desc;

}
