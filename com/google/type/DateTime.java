/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.Duration$Builder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.type.DateTime$1;
import com.google.type.DateTime$Builder;
import com.google.type.DateTime$TimeOffsetCase;
import com.google.type.DateTimeOrBuilder;
import com.google.type.TimeZone;
import com.google.type.TimeZone$Builder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DateTime
extends GeneratedMessageLite
implements DateTimeOrBuilder {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final DateTime DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 4;
    public static final int MINUTES_FIELD_NUMBER = 5;
    public static final int MONTH_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 7;
    private static volatile Parser PARSER;
    public static final int SECONDS_FIELD_NUMBER = 6;
    public static final int TIME_ZONE_FIELD_NUMBER = 9;
    public static final int UTC_OFFSET_FIELD_NUMBER = 8;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int hours_;
    private int minutes_;
    private int month_;
    private int nanos_;
    private int seconds_;
    private int timeOffsetCase_ = 0;
    private Object timeOffset_;
    private int year_;

    static {
        DateTime dateTime;
        DEFAULT_INSTANCE = dateTime = new DateTime();
        GeneratedMessageLite.registerDefaultInstance(DateTime.class, dateTime);
    }

    private DateTime() {
    }

    public static /* synthetic */ DateTime access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(DateTime dateTime) {
        dateTime.clearTimeOffset();
    }

    public static /* synthetic */ void access$1000(DateTime dateTime, int n3) {
        dateTime.setMinutes(n3);
    }

    public static /* synthetic */ void access$1100(DateTime dateTime) {
        dateTime.clearMinutes();
    }

    public static /* synthetic */ void access$1200(DateTime dateTime, int n3) {
        dateTime.setSeconds(n3);
    }

    public static /* synthetic */ void access$1300(DateTime dateTime) {
        dateTime.clearSeconds();
    }

    public static /* synthetic */ void access$1400(DateTime dateTime, int n3) {
        dateTime.setNanos(n3);
    }

    public static /* synthetic */ void access$1500(DateTime dateTime) {
        dateTime.clearNanos();
    }

    public static /* synthetic */ void access$1600(DateTime dateTime, Duration duration) {
        dateTime.setUtcOffset(duration);
    }

    public static /* synthetic */ void access$1700(DateTime dateTime, Duration duration) {
        dateTime.mergeUtcOffset(duration);
    }

    public static /* synthetic */ void access$1800(DateTime dateTime) {
        dateTime.clearUtcOffset();
    }

    public static /* synthetic */ void access$1900(DateTime dateTime, TimeZone timeZone) {
        dateTime.setTimeZone(timeZone);
    }

    public static /* synthetic */ void access$200(DateTime dateTime, int n3) {
        dateTime.setYear(n3);
    }

    public static /* synthetic */ void access$2000(DateTime dateTime, TimeZone timeZone) {
        dateTime.mergeTimeZone(timeZone);
    }

    public static /* synthetic */ void access$2100(DateTime dateTime) {
        dateTime.clearTimeZone();
    }

    public static /* synthetic */ void access$300(DateTime dateTime) {
        dateTime.clearYear();
    }

    public static /* synthetic */ void access$400(DateTime dateTime, int n3) {
        dateTime.setMonth(n3);
    }

    public static /* synthetic */ void access$500(DateTime dateTime) {
        dateTime.clearMonth();
    }

    public static /* synthetic */ void access$600(DateTime dateTime, int n3) {
        dateTime.setDay(n3);
    }

    public static /* synthetic */ void access$700(DateTime dateTime) {
        dateTime.clearDay();
    }

    public static /* synthetic */ void access$800(DateTime dateTime, int n3) {
        dateTime.setHours(n3);
    }

    public static /* synthetic */ void access$900(DateTime dateTime) {
        dateTime.clearHours();
    }

    private void clearDay() {
        this.day_ = 0;
    }

    private void clearHours() {
        this.hours_ = 0;
    }

    private void clearMinutes() {
        this.minutes_ = 0;
    }

    private void clearMonth() {
        this.month_ = 0;
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    private void clearSeconds() {
        this.seconds_ = 0;
    }

    private void clearTimeOffset() {
        this.timeOffsetCase_ = 0;
        this.timeOffset_ = null;
    }

    private void clearTimeZone() {
        int n3 = this.timeOffsetCase_;
        int n4 = 9;
        if (n3 == n4) {
            this.timeOffsetCase_ = 0;
            n3 = 0;
            this.timeOffset_ = null;
        }
    }

    private void clearUtcOffset() {
        int n3 = this.timeOffsetCase_;
        int n4 = 8;
        if (n3 == n4) {
            this.timeOffsetCase_ = 0;
            n3 = 0;
            this.timeOffset_ = null;
        }
    }

    private void clearYear() {
        this.year_ = 0;
    }

    public static DateTime getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeTimeZone(TimeZone generatedMessageLite) {
        TimeZone timeZone;
        Object object;
        generatedMessageLite.getClass();
        int n3 = this.timeOffsetCase_;
        int n4 = 9;
        if (n3 == n4 && (object = this.timeOffset_) != (timeZone = TimeZone.getDefaultInstance())) {
            object = TimeZone.newBuilder((TimeZone)this.timeOffset_);
            generatedMessageLite = ((TimeZone$Builder)((GeneratedMessageLite$Builder)object).mergeFrom(generatedMessageLite)).buildPartial();
            this.timeOffset_ = generatedMessageLite;
        } else {
            this.timeOffset_ = generatedMessageLite;
        }
        this.timeOffsetCase_ = n4;
    }

    private void mergeUtcOffset(Duration generatedMessageLite) {
        Duration duration;
        Object object;
        generatedMessageLite.getClass();
        int n3 = this.timeOffsetCase_;
        int n4 = 8;
        if (n3 == n4 && (object = this.timeOffset_) != (duration = Duration.getDefaultInstance())) {
            object = Duration.newBuilder((Duration)this.timeOffset_);
            generatedMessageLite = ((Duration$Builder)((GeneratedMessageLite$Builder)object).mergeFrom(generatedMessageLite)).buildPartial();
            this.timeOffset_ = generatedMessageLite;
        } else {
            this.timeOffset_ = generatedMessageLite;
        }
        this.timeOffsetCase_ = n4;
    }

    public static DateTime$Builder newBuilder() {
        return (DateTime$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DateTime$Builder newBuilder(DateTime dateTime) {
        return (DateTime$Builder)DEFAULT_INSTANCE.createBuilder(dateTime);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream) {
        return (DateTime)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DateTime)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DateTime parseFrom(ByteString byteString) {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DateTime parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DateTime parseFrom(CodedInputStream codedInputStream) {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DateTime parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DateTime parseFrom(InputStream inputStream) {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DateTime parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer) {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DateTime parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DateTime parseFrom(byte[] byArray) {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DateTime parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DateTime)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDay(int n3) {
        this.day_ = n3;
    }

    private void setHours(int n3) {
        this.hours_ = n3;
    }

    private void setMinutes(int n3) {
        this.minutes_ = n3;
    }

    private void setMonth(int n3) {
        this.month_ = n3;
    }

    private void setNanos(int n3) {
        this.nanos_ = n3;
    }

    private void setSeconds(int n3) {
        this.seconds_ = n3;
    }

    private void setTimeZone(TimeZone timeZone) {
        timeZone.getClass();
        this.timeOffset_ = timeZone;
        this.timeOffsetCase_ = 9;
    }

    private void setUtcOffset(Duration duration) {
        duration.getClass();
        this.timeOffset_ = duration;
        this.timeOffsetCase_ = 8;
    }

    private void setYear(int n3) {
        this.year_ = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = DateTime$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = objectArray.ordinal();
        object2 = object[object2];
        object = null;
        switch (object2) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = DateTime.class;
                synchronized (clazz) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                objectArray = new Object[11];
                objectArray[0] = "timeOffset_";
                objectArray[by2] = "timeOffsetCase_";
                objectArray[2] = "year_";
                objectArray[3] = "month_";
                objectArray[4] = "day_";
                objectArray[5] = "hours_";
                objectArray[6] = "minutes_";
                objectArray[7] = "seconds_";
                objectArray[8] = "nanos_";
                objectArray[9] = Duration.class;
                objectArray[10] = TimeZone.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b<\u0000\t<\u0000", objectArray);
            }
            case 2: {
                return new DateTime$Builder(null);
            }
            case 1: 
        }
        return new DateTime();
    }

    public int getDay() {
        return this.day_;
    }

    public int getHours() {
        return this.hours_;
    }

    public int getMinutes() {
        return this.minutes_;
    }

    public int getMonth() {
        return this.month_;
    }

    public int getNanos() {
        return this.nanos_;
    }

    public int getSeconds() {
        return this.seconds_;
    }

    public DateTime$TimeOffsetCase getTimeOffsetCase() {
        return DateTime$TimeOffsetCase.forNumber(this.timeOffsetCase_);
    }

    public TimeZone getTimeZone() {
        int n3 = this.timeOffsetCase_;
        int n4 = 9;
        if (n3 == n4) {
            return (TimeZone)this.timeOffset_;
        }
        return TimeZone.getDefaultInstance();
    }

    public Duration getUtcOffset() {
        int n3 = this.timeOffsetCase_;
        int n4 = 8;
        if (n3 == n4) {
            return (Duration)this.timeOffset_;
        }
        return Duration.getDefaultInstance();
    }

    public int getYear() {
        return this.year_;
    }

    public boolean hasTimeZone() {
        int n3 = this.timeOffsetCase_;
        int n4 = 9;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasUtcOffset() {
        int n3 = this.timeOffsetCase_;
        int n4 = 8;
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }
}

