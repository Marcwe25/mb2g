package com.mw.entties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {

    @Id
    private Long id;

    private String firstName,lastName,email;

    void ffff(){
        User other = new User();
        Object this$firstName = this.getFirstName();
        Object other$firstName = other.getFirstName();

    }

}
