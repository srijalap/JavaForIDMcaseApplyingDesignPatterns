package org.example;

public class ContactServiceAdapter implements ContactService{
    private IdmService idmService;

    public ContactServiceAdapter(IdmService idmService) {
        this.idmService = idmService;
    }

    @Override
    public String getContactDetails(Integer id) {
        // Used the IdmService to fetch identity details
        Identity identity = idmService.getIdentityById(id);
        return "Contact: " + identity.getDisplayName();
    }
}
