package com.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class MessageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private ChatRoomEntity room;
    
    @Enumerated(EnumType.STRING)
    private MessageType type;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sender_id", nullable = false ,referencedColumnName = "id")
    private UserEntity sender;

	public MessageEntity() {
	}

	public MessageEntity(String content, ChatRoomEntity room, MessageType type, UserEntity sender) {
		super();
		this.content = content;
		this.room = room;
		this.type = type;
		this.sender = sender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public ChatRoomEntity getRoom() {
		return room;
	}

	public void setRoom(ChatRoomEntity room) {
		this.room = room;
	}

	public UserEntity getSender() {
		return sender;
	}

	public void setSender(UserEntity sender) {
		this.sender = sender;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}  
}
