/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Duration;
import com.google.protobuf.Duration$1;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class Duration$Builder
extends GeneratedMessageLite$Builder
implements DurationOrBuilder {
    private Duration$Builder() {
        Duration duration = Duration.access$000();
        super(duration);
    }

    public /* synthetic */ Duration$Builder(Duration$1 duration$1) {
        this();
    }

    public Duration$Builder clearNanos() {
        this.copyOnWrite();
        Duration.access$400((Duration)this.instance);
        return this;
    }

    public Duration$Builder clearSeconds() {
        this.copyOnWrite();
        Duration.access$200((Duration)this.instance);
        return this;
    }

    public int getNanos() {
        return ((Duration)this.instance).getNanos();
    }

    public long getSeconds() {
        return ((Duration)this.instance).getSeconds();
    }

    public Duration$Builder setNanos(int n3) {
        this.copyOnWrite();
        Duration.access$300((Duration)this.instance, n3);
        return this;
    }

    public Duration$Builder setSeconds(long l2) {
        this.copyOnWrite();
        Duration.access$100((Duration)this.instance, l2);
        return this;
    }
}

