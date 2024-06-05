package rstyle.softlab.resume.model.entity.contact;

import javax.persistence.*;
import javax.validation.constraints.Email;

import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    @CollectionTable(name = "contact_phones", joinColumns = @JoinColumn(name = "contact_id"))
    @Column(name = "phone_number")
    private Set<String> phoneNumbers;

    @ElementCollection
    @CollectionTable(name = "contact_emails", joinColumns = @JoinColumn(name = "contact_id"))
    @Column(name = "email_address")
    private Set<String> emailAddresses;

    @ElementCollection
    @CollectionTable(name = "contact_links", joinColumns = @JoinColumn(name = "contact_id"))
    @Column(name = "link")
    private Set<String> links;

}
