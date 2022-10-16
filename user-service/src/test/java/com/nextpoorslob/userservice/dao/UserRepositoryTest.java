package com.nextpoorslob.userservice.dao;

import com.nextpoorslob.userservice.model.Address;
import com.nextpoorslob.userservice.model.AddressType;
import com.nextpoorslob.userservice.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
@Transactional
class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Resource
    private AddressRepository addressRepository;

    @Resource
    private AddressTypeRepository addressTypeRepository;

    @Test
    void givenUser_whenSave_thenGetOk() {

        AddressType addressType = new AddressType(AddressType.Value.MAILING, "Mail-to address");
        addressType.setType("mailing");
        addressTypeRepository.save(addressType);

        User user = new User("John", "Smith");
        Address address = new Address("123 Main Street, Chicago, IL, 60656", addressType);
        user.addAddress(address);
        userRepository.save(user);
        addressRepository.save(address);

        assertThat(user, notNullValue());
        assertThat(user.getId(), notNullValue());
        assertThat(address, notNullValue());
        assertThat(address.getId(), notNullValue());
        assertThat(address.getUser(), notNullValue());
        assertThat(address.getUser().getId(), equalTo(user.getId()));

        Optional<User> retrievedUser = userRepository.findById(user.getId());
        if (retrievedUser.isPresent()) {
            assertThat(retrievedUser.get().getFirstName(), equalTo("John"));
        } else {
            fail("Could not retrieve saved user");
        }
    }

}