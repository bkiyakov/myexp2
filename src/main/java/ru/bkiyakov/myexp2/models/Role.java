package ru.bkiyakov.myexp2.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

import java.util.List;

@Document(collection = "roles")
@Data
public class Role implements GrantedAuthority {
    @Id
    private Long roleId;
    private String roleName;
    @DBRef
    private List<User> userIds;

    public Role(Long roleId){
        this.roleId = roleId;
    }

    public Role(Long roleId, String roleName){
        this.roleId = roleId;
        this.roleName = roleName;
    }

    @Override
    public String getAuthority() {
        return getRoleName();
    }
}
