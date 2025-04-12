/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.reporting;

import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;

public final class MessagingClientEventExtension$Builder {
    private MessagingClientEvent messaging_client_event_ = null;

    public MessagingClientEventExtension build() {
        MessagingClientEvent messagingClientEvent = this.messaging_client_event_;
        MessagingClientEventExtension messagingClientEventExtension = new MessagingClientEventExtension(messagingClientEvent);
        return messagingClientEventExtension;
    }

    public MessagingClientEventExtension$Builder setMessagingClientEvent(MessagingClientEvent messagingClientEvent) {
        this.messaging_client_event_ = messagingClientEvent;
        return this;
    }
}

