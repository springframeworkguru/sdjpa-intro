package guru.springframework.sdjpaintro.domain.composite;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * Created by jt on 8/18/21.
 */
@Entity
@Table(name = "author_composite")
public class AuthorEmbedded {

    @EmbeddedId
    private NameId nameId;

    private String country;

    public AuthorEmbedded() {
    }

    public AuthorEmbedded(NameId nameId) {
        this.nameId = nameId;
    }

    public NameId getNameId() {
        return nameId;
    }

    public void setNameId(NameId nameId) {
        this.nameId = nameId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
