package domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable{

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;

    @ManyToOne
    private Link link;
}
