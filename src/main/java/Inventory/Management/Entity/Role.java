package Inventory.Management.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;


import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role    {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    String name;




}
