package org.example;

public class Identity {
    private String displayName;
    private Integer id;
    private String first;
    private String last;

    public Identity(String firstName, String lastName, String organization) {
        this.first = firstName;
        this.last = lastName;

        this.displayName = first + " " + last;
        if (!organization.isEmpty()) {
            this.displayName += " (" + organization + ")";
        }
    }

    // Getters and setters for other fields


    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getContactDetails() {
        return "Contact: " + getDisplayName();
    }
}
