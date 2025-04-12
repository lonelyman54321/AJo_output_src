/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.u2f.api.common;

public class ChannelIdValue$UnsupportedChannelIdValueTypeException
extends Exception {
    public ChannelIdValue$UnsupportedChannelIdValueTypeException(int n3) {
        String string2 = Gj0.b(n3, "ChannelIdValueType ", " not supported");
        super(string2);
    }
}

