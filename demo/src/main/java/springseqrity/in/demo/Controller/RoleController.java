package springseqrity.in.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springseqrity.in.demo.Entity.Role;
import springseqrity.in.demo.Service.RoleService;

@RestController
@RequestMapping("/api/role")
public class RoleController {
    @Autowired
    private RoleService roleservice;

    @PostMapping("/roles")
    public ResponseEntity<String>addRole(@RequestBody Role role){
        roleservice.addRole(role);
        return ResponseEntity.ok("Done");

    }


}
