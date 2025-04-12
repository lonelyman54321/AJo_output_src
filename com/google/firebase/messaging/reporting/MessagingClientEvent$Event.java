/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;

public final class MessagingClientEvent$Event
extends Enum
implements ProtoEnum {
    private static final /* synthetic */ MessagingClientEvent$Event[] $VALUES;
    public static final /* enum */ MessagingClientEvent$Event MESSAGE_DELIVERED;
    public static final /* enum */ MessagingClientEvent$Event MESSAGE_OPEN;
    public static final /* enum */ MessagingClientEvent$Event UNKNOWN_EVENT;
    private final int number_;

    private static /* synthetic */ MessagingClientEvent$Event[] $values() {
        MessagingClientEvent$Event messagingClientEvent$Event = UNKNOWN_EVENT;
        messagingClientEvent$Event = MESSAGE_DELIVERED;
        messagingClientEvent$Event = MESSAGE_OPEN;
        MessagingClientEvent$Event[] messagingClientEvent$EventArray = new MessagingClientEvent$Event[]{messagingClientEvent$Event, messagingClientEvent$Event, messagingClientEvent$Event};
        return messagingClientEvent$EventArray;
    }

    static {
        MessagingClientEvent$Event messagingClientEvent$Event;
        UNKNOWN_EVENT = messagingClientEvent$Event = new MessagingClientEvent$Event("UNKNOWN_EVENT", 0, 0);
        int n3 = 1;
        MESSAGE_DELIVERED = messagingClientEvent$Event = new MessagingClientEvent$Event("MESSAGE_DELIVERED", n3, n3);
        n3 = 2;
        MESSAGE_OPEN = messagingClientEvent$Event = new MessagingClientEvent$Event("MESSAGE_OPEN", n3, n3);
        $VALUES = MessagingClientEvent$Event.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MessagingClientEvent$Event() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.number_ = var3_2;
    }

    public static MessagingClientEvent$Event valueOf(String string2) {
        return Enum.valueOf(MessagingClientEvent$Event.class, string2);
    }

    public static MessagingClientEvent$Event[] values() {
        return (MessagingClientEvent$Event[])$VALUES.clone();
    }

    public int getNumber() {
        return this.number_;
    }
}

