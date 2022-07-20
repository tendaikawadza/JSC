package Inventory.Management.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String fullname;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)

    private Collection<Role> roles=new ArrayList<>();




}
