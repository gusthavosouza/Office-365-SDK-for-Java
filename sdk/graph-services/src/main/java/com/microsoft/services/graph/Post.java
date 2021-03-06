/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;



/**
 * The type Post.
*/
public class Post extends OutlookItem {

    public Post(){
        setODataType("#Microsoft.Graph.Post");
    }

    private ItemBody Body;

    /**
    * Gets the Body.
    *
    * @return the ItemBody
    */
    public ItemBody getBody() {
        return this.Body;
    }

    /**
    * Sets the Body.
    *
    * @param value the ItemBody
    */
    public void setBody(ItemBody value) {
        this.Body = value;
        valueChanged("Body", value);

    }

    private java.util.Calendar DateTimeReceived;

    /**
    * Gets the Date Time Received.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getDateTimeReceived() {
        return this.DateTimeReceived;
    }

    /**
    * Sets the Date Time Received.
    *
    * @param value the java.util.Calendar
    */
    public void setDateTimeReceived(java.util.Calendar value) {
        this.DateTimeReceived = value;
        valueChanged("DateTimeReceived", value);

    }

    private Boolean HasAttachments;

    /**
    * Gets the Has Attachments.
    *
    * @return the Boolean
    */
    public Boolean getHasAttachments() {
        return this.HasAttachments;
    }

    /**
    * Sets the Has Attachments.
    *
    * @param value the Boolean
    */
    public void setHasAttachments(Boolean value) {
        this.HasAttachments = value;
        valueChanged("HasAttachments", value);

    }

    private Recipient From;

    /**
    * Gets the From.
    *
    * @return the Recipient
    */
    public Recipient getFrom() {
        return this.From;
    }

    /**
    * Sets the From.
    *
    * @param value the Recipient
    */
    public void setFrom(Recipient value) {
        this.From = value;
        valueChanged("From", value);

    }

    private Recipient Sender;

    /**
    * Gets the Sender.
    *
    * @return the Recipient
    */
    public Recipient getSender() {
        return this.Sender;
    }

    /**
    * Sets the Sender.
    *
    * @param value the Recipient
    */
    public void setSender(Recipient value) {
        this.Sender = value;
        valueChanged("Sender", value);

    }

    private String ConversationThreadId;

    /**
    * Gets the Conversation Thread Id.
    *
    * @return the String
    */
    public String getConversationThreadId() {
        return this.ConversationThreadId;
    }

    /**
    * Sets the Conversation Thread Id.
    *
    * @param value the String
    */
    public void setConversationThreadId(String value) {
        this.ConversationThreadId = value;
        valueChanged("ConversationThreadId", value);

    }

    private String ConversationId;

    /**
    * Gets the Conversation Id.
    *
    * @return the String
    */
    public String getConversationId() {
        return this.ConversationId;
    }

    /**
    * Sets the Conversation Id.
    *
    * @param value the String
    */
    public void setConversationId(String value) {
        this.ConversationId = value;
        valueChanged("ConversationId", value);

    }


    private java.util.List<Recipient> NewParticipants = null;



    /**
    * Gets the New Participants.
    *
    * @return the java.util.List<Recipient>
    */
    public java.util.List<Recipient> getNewParticipants() {
        return this.NewParticipants;
    }

    /**
    * Sets the New Participants.
    *
    * @param value the java.util.List<Recipient>
    */
    public void setNewParticipants(java.util.List<Recipient> value) {
        this.NewParticipants = value;
        valueChanged("NewParticipants", value);

    }


    private java.util.List<Attachment> Attachments = null;



    /**
    * Gets the Attachments.
    *
    * @return the java.util.List<Attachment>
    */
    public java.util.List<Attachment> getAttachments() {
        return this.Attachments;
    }

    /**
    * Sets the Attachments.
    *
    * @param value the java.util.List<Attachment>
    */
    public void setAttachments(java.util.List<Attachment> value) {
        this.Attachments = value;
        valueChanged("Attachments", value);

    }

    private Post InReplyTo;

    /**
    * Gets the In Reply To.
    *
    * @return the Post
    */
    public Post getInReplyTo() {
        return this.InReplyTo;
    }

    /**
    * Sets the In Reply To.
    *
    * @param value the Post
    */
    public void setInReplyTo(Post value) {
        this.InReplyTo = value;
        valueChanged("InReplyTo", value);

    }
}
