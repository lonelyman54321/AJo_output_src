/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.reporting;

import com.google.firebase.messaging.ProtoEncoderDoNotUse;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension$Builder;
import java.io.OutputStream;

public final class MessagingClientEventExtension {
    private static final MessagingClientEventExtension DEFAULT_INSTANCE;
    private final MessagingClientEvent messaging_client_event_;

    static {
        MessagingClientEventExtension$Builder messagingClientEventExtension$Builder = new MessagingClientEventExtension$Builder();
        DEFAULT_INSTANCE = messagingClientEventExtension$Builder.build();
    }

    public MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.messaging_client_event_ = messagingClientEvent;
    }

    public static MessagingClientEventExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static MessagingClientEventExtension$Builder newBuilder() {
        MessagingClientEventExtension$Builder messagingClientEventExtension$Builder = new MessagingClientEventExtension$Builder();
        return messagingClientEventExtension$Builder;
    }

    public MessagingClientEvent getMessagingClientEvent() {
        MessagingClientEvent messagingClientEvent = this.messaging_client_event_;
        if (messagingClientEvent == null) {
            messagingClientEvent = MessagingClientEvent.getDefaultInstance();
        }
        return messagingClientEvent;
    }

    public MessagingClientEvent getMessagingClientEventInternal() {
        return this.messaging_client_event_;
    }

    public byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public void writeTo(OutputStream outputStream) {
        ProtoEncoderDoNotUse.encode(this, outputStream);
    }
}

