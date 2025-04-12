/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Timestamp$1;
import com.google.protobuf.TimestampOrBuilder;

public final class Timestamp$Builder
extends GeneratedMessageLite$Builder
implements TimestampOrBuilder {
    private Timestamp$Builder() {
        Timestamp timestamp = Timestamp.access$000();
        super(timestamp);
    }

    public /* synthetic */ Timestamp$Builder(Timestamp$1 timestamp$1) {
        this();
    }

    public Timestamp$Builder clearNanos() {
        this.copyOnWrite();
        Timestamp.access$400((Timestamp)this.instance);
        return this;
    }

    public Timestamp$Builder clearSeconds() {
        this.copyOnWrite();
        Timestamp.access$200((Timestamp)this.instance);
        return this;
    }

    public int getNanos() {
        return ((Timestamp)this.instance).getNanos();
    }

    public long getSeconds() {
        return ((Timestamp)this.instance).getSeconds();
    }

    public Timestamp$Builder setNanos(int n3) {
        this.copyOnWrite();
        Timestamp.access$300((Timestamp)this.instance, n3);
        return this;
    }

    public Timestamp$Builder setSeconds(long l2) {
        this.copyOnWrite();
        Timestamp.access$100((Timestamp)this.instance, l2);
        return this;
    }
}

