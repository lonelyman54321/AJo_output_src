/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.MessageInfo;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtoSyntax;

final class RawMessageInfo
implements MessageInfo {
    private static final int IS_EDITION_BIT = 4;
    private static final int IS_PROTO2_BIT = 1;
    private final MessageLite defaultInstance;
    private final int flags;
    private final String info;
    private final Object[] objects;

    public RawMessageInfo(MessageLite messageLite, String string2, Object[] objectArray) {
        this.defaultInstance = messageLite;
        this.info = string2;
        this.objects = objectArray;
        messageLite = null;
        int n3 = string2.charAt(0);
        int n4 = 55296;
        if (n3 < n4) {
            this.flags = n3;
        } else {
            n3 &= 0x1FFF;
            int n7 = 13;
            int n8 = 1;
            while (true) {
                int n10 = n8 + 1;
                if ((n8 = (int)string2.charAt(n8)) < n4) break;
                n8 = (n8 & 0x1FFF) << n7;
                n3 |= n8;
                n7 += 13;
                n8 = n10;
            }
            int n14 = n8 << n7;
            this.flags = n3 |= n14;
        }
    }

    public MessageLite getDefaultInstance() {
        return this.defaultInstance;
    }

    public Object[] getObjects() {
        return this.objects;
    }

    public String getStringInfo() {
        return this.info;
    }

    public ProtoSyntax getSyntax() {
        int n3 = this.flags;
        int n4 = n3 & 1;
        if (n4 != 0) {
            return ProtoSyntax.PROTO2;
        }
        n4 = 4;
        if ((n3 &= n4) == n4) {
            return ProtoSyntax.EDITIONS;
        }
        return ProtoSyntax.PROTO3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean isMessageSetWireFormat() {
        void var1_5;
        int bl2 = this.flags;
        int n3 = 2;
        int n4 = bl2 & n3;
        if (n4 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        return (boolean)var1_5;
    }
}

