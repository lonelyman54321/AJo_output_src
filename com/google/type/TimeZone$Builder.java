/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.TimeZone;
import com.google.type.TimeZone$1;
import com.google.type.TimeZoneOrBuilder;

public final class TimeZone$Builder
extends GeneratedMessageLite$Builder
implements TimeZoneOrBuilder {
    private TimeZone$Builder() {
        TimeZone timeZone = TimeZone.access$000();
        super(timeZone);
    }

    public /* synthetic */ TimeZone$Builder(TimeZone$1 timeZone$1) {
        this();
    }

    public TimeZone$Builder clearId() {
        this.copyOnWrite();
        TimeZone.access$200((TimeZone)this.instance);
        return this;
    }

    public TimeZone$Builder clearVersion() {
        this.copyOnWrite();
        TimeZone.access$500((TimeZone)this.instance);
        return this;
    }

    public String getId() {
        return ((TimeZone)this.instance).getId();
    }

    public ByteString getIdBytes() {
        return ((TimeZone)this.instance).getIdBytes();
    }

    public String getVersion() {
        return ((TimeZone)this.instance).getVersion();
    }

    public ByteString getVersionBytes() {
        return ((TimeZone)this.instance).getVersionBytes();
    }

    public TimeZone$Builder setId(String string2) {
        this.copyOnWrite();
        TimeZone.access$100((TimeZone)this.instance, string2);
        return this;
    }

    public TimeZone$Builder setIdBytes(ByteString byteString) {
        this.copyOnWrite();
        TimeZone.access$300((TimeZone)this.instance, byteString);
        return this;
    }

    public TimeZone$Builder setVersion(String string2) {
        this.copyOnWrite();
        TimeZone.access$400((TimeZone)this.instance, string2);
        return this;
    }

    public TimeZone$Builder setVersionBytes(ByteString byteString) {
        this.copyOnWrite();
        TimeZone.access$600((TimeZone)this.instance, byteString);
        return this;
    }
}

