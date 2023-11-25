package org.example;

public class EnhancedContactService implements ContactService{
    @Override
    public String getContactDetails(Integer id) {
        return "Enhanced contacts: " + id;
    }
}
