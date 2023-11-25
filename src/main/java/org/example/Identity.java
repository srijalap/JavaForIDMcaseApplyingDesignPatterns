package org.example;

import javax.naming.Name;

public class Identity {
    private String displayName;
    private Integer id;
    private String first;
    private String last;
    private String[] provisionedServices;
    private String identityStatus;
    private String password;
    private String organizationEmail;


    public Identity(String firstName, String lastName,Integer id,
                    String organizationEmail, String[] provisionedServices, String identityStatus) {
        this.first = firstName;
        this.last = lastName;
        this.id = id;
        this.organizationEmail = organizationEmail;
        this.provisionedServices = provisionedServices;
        this.identityStatus = identityStatus;

        this.displayName = first + " " + last;
        if (!organizationEmail.isEmpty()) {
            this.displayName += " (" + organizationEmail + ")";
        }
    }

    // Getters and setters for other fields

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }
    public String getOrganizationEmail() {
        return organizationEmail;
    }
    public void setOrganizationEmail(String organizationEmail) {
        this.organizationEmail = organizationEmail;
    }
    public String[] getProvisionedServices() {
        return provisionedServices;
    }
    public void setProvisionedServices(String[] provisionedServices) {
        this.provisionedServices = provisionedServices;
    }
    public String getIdentityStatus() {
        return identityStatus;
    }
    public void setIdentityStatus(String identityStatus) {
        this.identityStatus = identityStatus;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        // TODO: Implement secure password storage
        this.password = password;
    }
    public String getContactDetails() {
        return "Contact: " + getDisplayName();
    }
}
