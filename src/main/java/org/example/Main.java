package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //  implementation for ContactService
        ContactService contactService = new DefaultContactService() {
            @Override
            public String getContactDetails(Integer id) {
                return "Contact details not available for ID: " + id;
            }
        };

        // Created an instance of IdmService with the ContactService
        IdmService idmService = new IdmService(contactService);


        // Used IdmService to create an Identity
        Identity identity1 = idmService.createIdentity("Binod", "Poudel", "RealState.com ");

        // Printed the display name of the created identity
        System.out.println("First: " + identity1.getDisplayName());

    // Switch to EnhancedContactService at runtime
    ContactService enhancedContactService = new EnhancedContactService();
        idmService.setContactService(enhancedContactService);

    // With EnhancedContactService
    String enhancedContactDetails = idmService.getContactDetails(1);
        System.out.println(enhancedContactDetails);
}
}

