package com.goldencat.chatroom.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// here "lombok" is used to create getter and setter for all of these properties
@Getter
@Setter
// makes a constructor with all available properties
@AllArgsConstructor
// same goes for this it makes a constructor with no properties
@NoArgsConstructor
public class ChatMessage {
    private String username;
    private String content;
}