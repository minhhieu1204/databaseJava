package com.db.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name="chatroom")
public class ChatRoomEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
	@Column(name = "lastmessage")
	private String lastMessage;
	
	@Column(name = "dateTime")
	private Timestamp dateTime;
	
	@Column(name = "isseen")
	private Boolean isSeen;
	
	
    @ManyToOne
    @JoinColumn(name = "participant_2", nullable = false)
    private UserEntity  participant2;

    @ManyToOne
    @JoinColumn(name = "participant_1", nullable = false)
    private UserEntity participant1;
    
    @OrderBy("id ASC")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "room")
    private List<MessageEntity> listChatMessage = new ArrayList<>();

	public ChatRoomEntity() {
	}

	public ChatRoomEntity(UserEntity participant2, UserEntity participant1, List<MessageEntity> listChatMessage) {
		this.participant2 = participant2;
		this.participant1 = participant1;
		this.listChatMessage = listChatMessage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserEntity getParticipant2() {
		return participant2;
	}

	public void setParticipant2(UserEntity participant2) {
		this.participant2 = participant2;
	}

	public UserEntity getParticipant1() {
		return participant1;
	}

	public void setParticipant1(UserEntity participant1) {
		this.participant1 = participant1;
	}

	public List<MessageEntity> getListChatMessage() {
		return listChatMessage;
	}

	public void setListChatMessage(List<MessageEntity> listChatMessage) {
		this.listChatMessage = listChatMessage;
	}

	public String getLastMessage() {
		return lastMessage;
	}

	public void setLastMessage(String lastMessage) {
		this.lastMessage = lastMessage;
	}


	public Timestamp getDateTime() {
		return dateTime;
	}

	public void setDateTime(Timestamp dateTime) {
		this.dateTime = dateTime;
	}

	public Boolean getIsSeen() {
		return isSeen;
	}

	public void setIsSeen(Boolean isSeen) {
		this.isSeen = isSeen;
	}  
	
	
		
}
