package org.example;
import java.util.HashMap;

public class IdmService {
    private HashMap<Integer, Identity> identityHashMap = new HashMap<>();
    private static Integer idCounter = 1;
    private ContactService contactService;
    public IdmService(ContactService contactService) {
        this.contactService = contactService;
    }


    public Identity createIdentity(String firstName, String lastName, String organization,Integer id, String organizationEmail,
                                   String[] provisionedServices, String identityStatus){
        Identity identity = new Identity(firstName, lastName, id,
                organizationEmail, provisionedServices, identityStatus);
        identity.setId(idCounter);
        identityHashMap.put(idCounter, identity);

        idCounter++;
        return identity;
    }
    public String getContactDetails(Integer id) {
        return contactService.getContactDetails(id);
    }
    public void setContactService(ContactService contactService) {
        this.contactService = contactService;
    }
    public Identity getIdentityById(Integer id) {
        return identityHashMap.get(id);
    }
}

