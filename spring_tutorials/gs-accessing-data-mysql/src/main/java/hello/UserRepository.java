package hello;

import org.springframework.data.repository.CrudRepository;

// Bean에서 userRepository로 호출될 때 Spring에 의해 자동 구현(AUTO IMPLEMENTED)될 것이다. (Spring에서 미리 구현한 구현체가 자동 주입된다.)
// CRUD는 Create, Read, Update, Delete를 의미한다.
public interface UserRepository extends CrudRepository<User, Long> {
}
