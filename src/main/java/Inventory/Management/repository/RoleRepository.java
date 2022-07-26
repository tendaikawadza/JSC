package Inventory.Management.repository;

import Inventory.Management.Entity.Role;
import Inventory.Management.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);


}
