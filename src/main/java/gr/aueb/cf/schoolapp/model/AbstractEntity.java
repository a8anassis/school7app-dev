package gr.aueb.cf.schoolapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    @Column(name = "created_at", nullable = false, updatable = false)
//    @CreationTimestamp      // Hibernate Specific, Hibernate handles null checks automatically
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
//    @UpdateTimestamp        // Hibernate Specific
    private LocalDateTime updatedAt;

    @Column(unique = true, updatable = false, nullable = false, length = 36)
    private String uuid = UUID.randomUUID().toString();

//   JPA-compliant
    @PrePersist
    protected void onCreate() {
        if (createdAt == null) createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }
}


