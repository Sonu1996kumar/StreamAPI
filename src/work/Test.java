package work;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Login> logins = Arrays.asList(
                new Login("mike","testing"),
                new Login("stallin","testing"),
                new Login("adam","testing")

        );
        System.out.println(logins);//ye login ka address print kar rha hai

        //supply this address to LoginDto
        List<LoginDto> dtos = logins.stream().map(login -> mapToDto(login)).collect(Collectors.toList());
        System.out.println(dtos);
    }
    static  LoginDto mapToDto(Login login){
        LoginDto dto = new LoginDto();
        dto.setName(login.getName());
        dto.setPassword(login.getPassword());
        return dto;
    }
}
