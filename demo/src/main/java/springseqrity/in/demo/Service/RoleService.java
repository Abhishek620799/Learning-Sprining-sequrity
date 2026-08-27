package springseqrity.in.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springseqrity.in.demo.Entity.Role;
import springseqrity.in.demo.Repositiory.Roleuser;

@Service
public class RoleService {
    @Autowired
    private Roleuser roleuser;
    public void addRole(Role role){
        roleuser.save(role);
    }

}
