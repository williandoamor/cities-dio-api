package br.com.williandoamor.citiesapi.entities;

import br.com.williandoamor.citiesapi.utils.PointType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidade")
@TypeDefs(value = {
        @TypeDef(name = "point", typeClass = PointType.class)
})
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    private Integer uf;

    private Integer ibge;

    @Column(name = "lat_long")
    private String geolocation;

    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;
}
