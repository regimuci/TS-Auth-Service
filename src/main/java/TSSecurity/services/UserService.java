package TSSecurity.services;

import TSSecurity.entities.User;
import TSSecurity.exceptions.UserExistException;
import TSSecurity.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        if(userRepository.findById(user.getEmail()).isPresent()){
            throw new UserExistException("User with email: "+user.getEmail()+" exists");
        }
        BCryptPasswordEncoder encoder = new  BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
