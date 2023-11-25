package org.example;

public class DefaultContactService implements ContactService{
    @Override
    public String getContactDetails(Integer id) {
        return "Contact details not available for ID: " + id;
    }
}
