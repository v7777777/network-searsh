package main.data.response.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import main.model.MessagesPermission;
import main.model.Person;

@Data
public class PersonInLogin {
    private int id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("reg_date")
    private long regDate;

    @JsonProperty("birth_date")
    private long birthDate;

    private String email;
    private String phone;
    private String photo;
    private String about;

    @JsonProperty("messages_permission")
    private MessagesPermission messagesPermission;

    @JsonProperty("last_online_time")
    private long lastOnlineTime;

    @JsonProperty("is_blocked")
    private boolean isBlocked;

    private String token;

    public PersonInLogin(Person person) {
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.email = person.getEmail();
        this.isBlocked = person.isBlocked();
        this.messagesPermission = person.getMessagesPermission();
        this.about = person.getAbout();
        this.id = person.getId();
        this.photo = person.getPhotoURL();
        this.lastOnlineTime = person.getLastOnlineTime() != null ? person.getLastOnlineTime().toEpochMilli() : 0;
        this.regDate = person.getRegDate() != null ? person.getRegDate().toEpochMilli() : 0;
        this.birthDate = person.getBirthDate() != null ? person.getBirthDate().getTime() : 0;
    }
}