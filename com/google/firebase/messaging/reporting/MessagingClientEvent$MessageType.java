/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;

public final class MessagingClientEvent$MessageType
extends Enum
implements ProtoEnum {
    private static final /* synthetic */ MessagingClientEvent$MessageType[] $VALUES;
    public static final /* enum */ MessagingClientEvent$MessageType DATA_MESSAGE;
    public static final /* enum */ MessagingClientEvent$MessageType DISPLAY_NOTIFICATION;
    public static final /* enum */ MessagingClientEvent$MessageType TOPIC;
    public static final /* enum */ MessagingClientEvent$MessageType UNKNOWN;
    private final int number_;

    private static /* synthetic */ MessagingClientEvent$MessageType[] $values() {
        MessagingClientEvent$MessageType messagingClientEvent$MessageType = UNKNOWN;
        messagingClientEvent$MessageType = DATA_MESSAGE;
        messagingClientEvent$MessageType = TOPIC;
        messagingClientEvent$MessageType = DISPLAY_NOTIFICATION;
        MessagingClientEvent$MessageType[] messagingClientEvent$MessageTypeArray = new MessagingClientEvent$MessageType[]{messagingClientEvent$MessageType, messagingClientEvent$MessageType, messagingClientEvent$MessageType, messagingClientEvent$MessageType};
        return messagingClientEvent$MessageTypeArray;
    }

    static {
        MessagingClientEvent$MessageType messagingClientEvent$MessageType;
        UNKNOWN = messagingClientEvent$MessageType = new MessagingClientEvent$MessageType("UNKNOWN", 0, 0);
        int n3 = 1;
        DATA_MESSAGE = messagingClientEvent$MessageType = new MessagingClientEvent$MessageType("DATA_MESSAGE", n3, n3);
        n3 = 2;
        TOPIC = messagingClientEvent$MessageType = new MessagingClientEvent$MessageType("TOPIC", n3, n3);
        n3 = 3;
        DISPLAY_NOTIFICATION = messagingClientEvent$MessageType = new MessagingClientEvent$MessageType("DISPLAY_NOTIFICATION", n3, n3);
        $VALUES = MessagingClientEvent$MessageType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MessagingClientEvent$MessageType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.number_ = var3_2;
    }

    public static MessagingClientEvent$MessageType valueOf(String string2) {
        return Enum.valueOf(MessagingClientEvent$MessageType.class, string2);
    }

    public static MessagingClientEvent$MessageType[] values() {
        return (MessagingClientEvent$MessageType[])$VALUES.clone();
    }

    public int getNumber() {
        return this.number_;
    }
}

