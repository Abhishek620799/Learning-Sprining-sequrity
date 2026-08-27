package springseqrity.in.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;
import springseqrity.in.demo.Dto.UserRegisterRequest;
import springseqrity.in.demo.Dto.Userregisterresponsedto;
import springseqrity.in.demo.Service.Autherservice;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private Autherservice autherservice;

@GetMapping("/hello")
    public String sayHello(){
    return "hello";
}


@PostMapping("/register")
    public ResponseEntity<Userregisterresponsedto>register(@RequestBody
                                                           UserRegisterRequest userRegisterRequest){
  Userregisterresponsedto userregisterresponsedto = autherservice.register(userRegisterRequest);
return  ResponseEntity.ok(userregisterresponsedto);
}
@GetMapping("/token")
public CsrfToken getToken(CsrfToken csrfToken){
    return csrfToken;
}


}
