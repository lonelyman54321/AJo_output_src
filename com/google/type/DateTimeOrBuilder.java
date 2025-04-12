/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.Duration;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.type.DateTime$TimeOffsetCase;
import com.google.type.TimeZone;

public interface DateTimeOrBuilder
extends MessageLiteOrBuilder {
    public int getDay();

    public int getHours();

    public int getMinutes();

    public int getMonth();

    public int getNanos();

    public int getSeconds();

    public DateTime$TimeOffsetCase getTimeOffsetCase();

    public TimeZone getTimeZone();

    public Duration getUtcOffset();

    public int getYear();

    public boolean hasTimeZone();

    public boolean hasUtcOffset();
}

