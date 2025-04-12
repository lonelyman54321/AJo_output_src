/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.TimeOfDay;
import com.google.type.TimeOfDay$1;
import com.google.type.TimeOfDayOrBuilder;

public final class TimeOfDay$Builder
extends GeneratedMessageLite$Builder
implements TimeOfDayOrBuilder {
    private TimeOfDay$Builder() {
        TimeOfDay timeOfDay = TimeOfDay.access$000();
        super(timeOfDay);
    }

    public /* synthetic */ TimeOfDay$Builder(TimeOfDay$1 timeOfDay$1) {
        this();
    }

    public TimeOfDay$Builder clearHours() {
        this.copyOnWrite();
        TimeOfDay.access$200((TimeOfDay)this.instance);
        return this;
    }

    public TimeOfDay$Builder clearMinutes() {
        this.copyOnWrite();
        TimeOfDay.access$400((TimeOfDay)this.instance);
        return this;
    }

    public TimeOfDay$Builder clearNanos() {
        this.copyOnWrite();
        TimeOfDay.access$800((TimeOfDay)this.instance);
        return this;
    }

    public TimeOfDay$Builder clearSeconds() {
        this.copyOnWrite();
        TimeOfDay.access$600((TimeOfDay)this.instance);
        return this;
    }

    public int getHours() {
        return ((TimeOfDay)this.instance).getHours();
    }

    public int getMinutes() {
        return ((TimeOfDay)this.instance).getMinutes();
    }

    public int getNanos() {
        return ((TimeOfDay)this.instance).getNanos();
    }

    public int getSeconds() {
        return ((TimeOfDay)this.instance).getSeconds();
    }

    public TimeOfDay$Builder setHours(int n3) {
        this.copyOnWrite();
        TimeOfDay.access$100((TimeOfDay)this.instance, n3);
        return this;
    }

    public TimeOfDay$Builder setMinutes(int n3) {
        this.copyOnWrite();
        TimeOfDay.access$300((TimeOfDay)this.instance, n3);
        return this;
    }

    public TimeOfDay$Builder setNanos(int n3) {
        this.copyOnWrite();
        TimeOfDay.access$700((TimeOfDay)this.instance, n3);
        return this;
    }

    public TimeOfDay$Builder setSeconds(int n3) {
        this.copyOnWrite();
        TimeOfDay.access$500((TimeOfDay)this.instance, n3);
        return this;
    }
}

