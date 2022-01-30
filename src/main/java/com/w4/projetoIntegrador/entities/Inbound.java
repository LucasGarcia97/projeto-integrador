package com.w4.projetoIntegrador.entities;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "inbounds")
public class Inbound {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonAlias("orderDate")
    private LocalDateTime date;

    @ManyToOne
    private Section section;

    @Transient
    private Long sectionId;

    @OneToMany(mappedBy = "inbound", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Batch> batchList;
}
