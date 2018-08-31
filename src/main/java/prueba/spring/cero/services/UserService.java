package prueba.spring.cero.services;

import java.util.List;

public interface UserService {
	
    User findById(Long id);
    
    List<User> findAll();
 
    User save(User user);
 
    User update(User user);
 
    void delete(Long id);

}
