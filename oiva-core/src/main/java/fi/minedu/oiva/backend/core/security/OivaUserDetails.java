package fi.minedu.oiva.backend.core.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class OivaUserDetails extends User {

    private final String organisationOid;
    private final boolean permissionsDecreased;

    public OivaUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities,
                           String organisationOid, boolean permissionDecreased) {
        super(username, password, authorities);
        this.organisationOid = organisationOid;
        this.permissionsDecreased = permissionDecreased;
    }

    public String getOrganisationOid() {
        return organisationOid;
    }

    public boolean isPermissionsDecreased() {
        return permissionsDecreased;
    }

    @Override
    public String toString() {
        return "OivaUserDetails{" +
                "username='"+ getUsername() + '\'' +
                ", organisationOid='" + organisationOid + '\'' +
                ", authorities='" + getAuthorities() + '\'' +
                ", permissionsDecreased=" + permissionsDecreased +
                '}';
    }
}
