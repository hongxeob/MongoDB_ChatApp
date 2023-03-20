package hello.chatapp;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "chat")
@Data
public class Chat {
    @Id
    private String id;
    private String msg;
    private String sender;
    private String receiver;
    private LocalDateTime createdAt;
}
