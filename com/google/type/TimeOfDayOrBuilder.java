/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.MessageLiteOrBuilder;

public interface TimeOfDayOrBuilder
extends MessageLiteOrBuilder {
    public int getHours();

    public int getMinutes();

    public int getNanos();

    public int getSeconds();
}

