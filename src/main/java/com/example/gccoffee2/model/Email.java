package com.example.gccoffee2.model;

import org.springframework.util.Assert;

import java.util.Objects;
import java.util.regex.Pattern;

public class Email {
    private final String address;

    public Email(String address) {
        Assert.notNull(address, "address should not be null"); // 이메일을 검증해야 함. Spring 프레임워크의 Assert 를 이용해서 notNull 이다. 메시지를 전달할 수 있음
        Assert.isTrue(address.length() >= 4 && address.length() <= 50, "address length must be between 4 and 50 characters.");  // length 가 문자열에 대한 유효검증이 실패시 메시지 전달 가능
        Assert.isTrue(checkAddress(address),"Invalid email address"); // 정규표현식을 이용해서 address 가 맞는지 검증을 할 수 있음.
        this.address = address;
    }

    private static boolean checkAddress(String address) {  // 이메일의 형태가 맞는지 체크해줌
        return Pattern.matches("\\b[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,4}\\b", address);
    }


    public String getAddress() {
        return address;
    }

    @Override  // equals 와 hashCode 를 이용해서 이메일이 address 가 같으면 같다라는 value object 를 할때는 직접 구현을 해주는게 좋음. 필요시 toString()도 !
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(address, email.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Email{");
        sb.append("address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
