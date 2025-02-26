package az.tarlan.corerdbms.domain;

import az.tarlan.corerdbms.enums.TagStatuses;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class AccountTag {
    @Id
    private long id;
    @NotNull
    @Size(max = 255)
    private String description;
    @NotNull
    private TagStatuses status;

    public AccountTag() {
    }

    public AccountTag(long id, String description, TagStatuses status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TagStatuses getStatus() {
        return status;
    }

    public void setStatus(TagStatuses status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        AccountTag tag = (AccountTag) o;
        return id == tag.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}
