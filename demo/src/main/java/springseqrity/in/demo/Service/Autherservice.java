package springseqrity.in.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import springseqrity.in.demo.Dto.UserRegisterRequest;
import springseqrity.in.demo.Dto.Userregisterresponsedto;
import springseqrity.in.demo.Entity.User;
import springseqrity.in.demo.Repositiory.UserRepository;
@Service
public class Autherservice {

    private UserRepository userRepository;
    public Autherservice(UserRepository userRepository){
        this.userRepository=userRepository;
    }

   // @Autowired
    private PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();

    public Userregisterresponsedto register(UserRegisterRequest userRegisterRequest){
        User user = new User();
        user.setUsername(userRegisterRequest.getUsername());
        //user.setPassword(userRegisterRequest.getPassword());
        String encoderpassword = passwordEncoder.encode(userRegisterRequest.getPassword());
        user.setPassword(encoderpassword);
        user.setEnabled(true);
        //userRepository.save(user);
        userRepository.save(user);
        Userregisterresponsedto responsedto = new Userregisterresponsedto();
        responsedto.setUsername(user.getUsername());
        responsedto.setMessage("User saved sucessfully");
        return responsedto;


    }

}
