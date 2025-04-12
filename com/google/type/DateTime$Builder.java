/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.Duration;
import com.google.protobuf.Duration$Builder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.type.DateTime;
import com.google.type.DateTime$1;
import com.google.type.DateTime$TimeOffsetCase;
import com.google.type.DateTimeOrBuilder;
import com.google.type.TimeZone;
import com.google.type.TimeZone$Builder;

public final class DateTime$Builder
extends GeneratedMessageLite$Builder
implements DateTimeOrBuilder {
    private DateTime$Builder() {
        DateTime dateTime = DateTime.access$000();
        super(dateTime);
    }

    public /* synthetic */ DateTime$Builder(DateTime$1 dateTime$1) {
        this();
    }

    public DateTime$Builder clearDay() {
        this.copyOnWrite();
        DateTime.access$700((DateTime)this.instance);
        return this;
    }

    public DateTime$Builder clearHours() {
        this.copyOnWrite();
        DateTime.access$900((DateTime)this.instance);
        return this;
    }

    public DateTime$Builder clearMinutes() {
        this.copyOnWrite();
        DateTime.access$1100((DateTime)this.instance);
        return this;
    }

    public DateTime$Builder clearMonth() {
        this.copyOnWrite();
        DateTime.access$500((DateTime)this.instance);
        return this;
    }

    public DateTime$Builder clearNanos() {
        this.copyOnWrite();
        DateTime.access$1500((DateTime)this.instance);
        return this;
    }

    public DateTime$Builder clearSeconds() {
        this.copyOnWrite();
        DateTime.access$1300((DateTime)this.instance);
        return this;
    }

    public DateTime$Builder clearTimeOffset() {
        this.copyOnWrite();
        DateTime.access$100((DateTime)this.instance);
        return this;
    }

    public DateTime$Builder clearTimeZone() {
        this.copyOnWrite();
        DateTime.access$2100((DateTime)this.instance);
        return this;
    }

    public DateTime$Builder clearUtcOffset() {
        this.copyOnWrite();
        DateTime.access$1800((DateTime)this.instance);
        return this;
    }

    public DateTime$Builder clearYear() {
        this.copyOnWrite();
        DateTime.access$300((DateTime)this.instance);
        return this;
    }

    public int getDay() {
        return ((DateTime)this.instance).getDay();
    }

    public int getHours() {
        return ((DateTime)this.instance).getHours();
    }

    public int getMinutes() {
        return ((DateTime)this.instance).getMinutes();
    }

    public int getMonth() {
        return ((DateTime)this.instance).getMonth();
    }

    public int getNanos() {
        return ((DateTime)this.instance).getNanos();
    }

    public int getSeconds() {
        return ((DateTime)this.instance).getSeconds();
    }

    public DateTime$TimeOffsetCase getTimeOffsetCase() {
        return ((DateTime)this.instance).getTimeOffsetCase();
    }

    public TimeZone getTimeZone() {
        return ((DateTime)this.instance).getTimeZone();
    }

    public Duration getUtcOffset() {
        return ((DateTime)this.instance).getUtcOffset();
    }

    public int getYear() {
        return ((DateTime)this.instance).getYear();
    }

    public boolean hasTimeZone() {
        return ((DateTime)this.instance).hasTimeZone();
    }

    public boolean hasUtcOffset() {
        return ((DateTime)this.instance).hasUtcOffset();
    }

    public DateTime$Builder mergeTimeZone(TimeZone timeZone) {
        this.copyOnWrite();
        DateTime.access$2000((DateTime)this.instance, timeZone);
        return this;
    }

    public DateTime$Builder mergeUtcOffset(Duration duration) {
        this.copyOnWrite();
        DateTime.access$1700((DateTime)this.instance, duration);
        return this;
    }

    public DateTime$Builder setDay(int n3) {
        this.copyOnWrite();
        DateTime.access$600((DateTime)this.instance, n3);
        return this;
    }

    public DateTime$Builder setHours(int n3) {
        this.copyOnWrite();
        DateTime.access$800((DateTime)this.instance, n3);
        return this;
    }

    public DateTime$Builder setMinutes(int n3) {
        this.copyOnWrite();
        DateTime.access$1000((DateTime)this.instance, n3);
        return this;
    }

    public DateTime$Builder setMonth(int n3) {
        this.copyOnWrite();
        DateTime.access$400((DateTime)this.instance, n3);
        return this;
    }

    public DateTime$Builder setNanos(int n3) {
        this.copyOnWrite();
        DateTime.access$1400((DateTime)this.instance, n3);
        return this;
    }

    public DateTime$Builder setSeconds(int n3) {
        this.copyOnWrite();
        DateTime.access$1200((DateTime)this.instance, n3);
        return this;
    }

    public DateTime$Builder setTimeZone(TimeZone$Builder timeZoneOrBuilder) {
        this.copyOnWrite();
        DateTime dateTime = (DateTime)this.instance;
        timeZoneOrBuilder = (TimeZone)timeZoneOrBuilder.build();
        DateTime.access$1900(dateTime, (TimeZone)timeZoneOrBuilder);
        return this;
    }

    public DateTime$Builder setTimeZone(TimeZone timeZone) {
        this.copyOnWrite();
        DateTime.access$1900((DateTime)this.instance, timeZone);
        return this;
    }

    public DateTime$Builder setUtcOffset(Duration$Builder durationOrBuilder) {
        this.copyOnWrite();
        DateTime dateTime = (DateTime)this.instance;
        durationOrBuilder = (Duration)durationOrBuilder.build();
        DateTime.access$1600(dateTime, (Duration)durationOrBuilder);
        return this;
    }

    public DateTime$Builder setUtcOffset(Duration duration) {
        this.copyOnWrite();
        DateTime.access$1600((DateTime)this.instance, duration);
        return this;
    }

    public DateTime$Builder setYear(int n3) {
        this.copyOnWrite();
        DateTime.access$200((DateTime)this.instance, n3);
        return this;
    }
}

