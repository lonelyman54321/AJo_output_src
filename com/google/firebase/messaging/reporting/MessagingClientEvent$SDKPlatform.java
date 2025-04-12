/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;

public final class MessagingClientEvent$SDKPlatform
extends Enum
implements ProtoEnum {
    private static final /* synthetic */ MessagingClientEvent$SDKPlatform[] $VALUES;
    public static final /* enum */ MessagingClientEvent$SDKPlatform ANDROID;
    public static final /* enum */ MessagingClientEvent$SDKPlatform IOS;
    public static final /* enum */ MessagingClientEvent$SDKPlatform UNKNOWN_OS;
    public static final /* enum */ MessagingClientEvent$SDKPlatform WEB;
    private final int number_;

    private static /* synthetic */ MessagingClientEvent$SDKPlatform[] $values() {
        MessagingClientEvent$SDKPlatform messagingClientEvent$SDKPlatform = UNKNOWN_OS;
        messagingClientEvent$SDKPlatform = ANDROID;
        messagingClientEvent$SDKPlatform = IOS;
        messagingClientEvent$SDKPlatform = WEB;
        MessagingClientEvent$SDKPlatform[] messagingClientEvent$SDKPlatformArray = new MessagingClientEvent$SDKPlatform[]{messagingClientEvent$SDKPlatform, messagingClientEvent$SDKPlatform, messagingClientEvent$SDKPlatform, messagingClientEvent$SDKPlatform};
        return messagingClientEvent$SDKPlatformArray;
    }

    static {
        MessagingClientEvent$SDKPlatform messagingClientEvent$SDKPlatform;
        UNKNOWN_OS = messagingClientEvent$SDKPlatform = new MessagingClientEvent$SDKPlatform("UNKNOWN_OS", 0, 0);
        int n3 = 1;
        ANDROID = messagingClientEvent$SDKPlatform = new MessagingClientEvent$SDKPlatform("ANDROID", n3, n3);
        n3 = 2;
        IOS = messagingClientEvent$SDKPlatform = new MessagingClientEvent$SDKPlatform("IOS", n3, n3);
        n3 = 3;
        WEB = messagingClientEvent$SDKPlatform = new MessagingClientEvent$SDKPlatform("WEB", n3, n3);
        $VALUES = MessagingClientEvent$SDKPlatform.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MessagingClientEvent$SDKPlatform() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.number_ = var3_2;
    }

    public static MessagingClientEvent$SDKPlatform valueOf(String string2) {
        return Enum.valueOf(MessagingClientEvent$SDKPlatform.class, string2);
    }

    public static MessagingClientEvent$SDKPlatform[] values() {
        return (MessagingClientEvent$SDKPlatform[])$VALUES.clone();
    }

    public int getNumber() {
        return this.number_;
    }
}

