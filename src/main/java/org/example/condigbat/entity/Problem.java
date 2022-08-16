package org.example.condigbat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.example.condigbat.entity.template.AbsIntegerEntity;
import org.example.condigbat.entity.template.AbsTitleIntegerEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(uniqueConstraints =
@UniqueConstraint(
        columnNames = {"methodSignature", "section_id"}
))
public class Problem extends AbsTitleIntegerEntity {

    @Column(nullable = false, columnDefinition = "text")
    private String description;

    @Column(nullable = false)
    private String methodSignature;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Section section;
}
