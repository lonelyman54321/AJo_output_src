/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.type.TimeOfDay$1;
import com.google.type.TimeOfDay$Builder;
import com.google.type.TimeOfDayOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class TimeOfDay
extends GeneratedMessageLite
implements TimeOfDayOrBuilder {
    private static final TimeOfDay DEFAULT_INSTANCE;
    public static final int HOURS_FIELD_NUMBER = 1;
    public static final int MINUTES_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 4;
    private static volatile Parser PARSER;
    public static final int SECONDS_FIELD_NUMBER = 3;
    private int hours_;
    private int minutes_;
    private int nanos_;
    private int seconds_;

    static {
        TimeOfDay timeOfDay;
        DEFAULT_INSTANCE = timeOfDay = new TimeOfDay();
        GeneratedMessageLite.registerDefaultInstance(TimeOfDay.class, timeOfDay);
    }

    private TimeOfDay() {
    }

    public static /* synthetic */ TimeOfDay access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(TimeOfDay timeOfDay, int n3) {
        timeOfDay.setHours(n3);
    }

    public static /* synthetic */ void access$200(TimeOfDay timeOfDay) {
        timeOfDay.clearHours();
    }

    public static /* synthetic */ void access$300(TimeOfDay timeOfDay, int n3) {
        timeOfDay.setMinutes(n3);
    }

    public static /* synthetic */ void access$400(TimeOfDay timeOfDay) {
        timeOfDay.clearMinutes();
    }

    public static /* synthetic */ void access$500(TimeOfDay timeOfDay, int n3) {
        timeOfDay.setSeconds(n3);
    }

    public static /* synthetic */ void access$600(TimeOfDay timeOfDay) {
        timeOfDay.clearSeconds();
    }

    public static /* synthetic */ void access$700(TimeOfDay timeOfDay, int n3) {
        timeOfDay.setNanos(n3);
    }

    public static /* synthetic */ void access$800(TimeOfDay timeOfDay) {
        timeOfDay.clearNanos();
    }

    private void clearHours() {
        this.hours_ = 0;
    }

    private void clearMinutes() {
        this.minutes_ = 0;
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    private void clearSeconds() {
        this.seconds_ = 0;
    }

    public static TimeOfDay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static TimeOfDay$Builder newBuilder() {
        return (TimeOfDay$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static TimeOfDay$Builder newBuilder(TimeOfDay timeOfDay) {
        return (TimeOfDay$Builder)DEFAULT_INSTANCE.createBuilder(timeOfDay);
    }

    public static TimeOfDay parseDelimitedFrom(InputStream inputStream) {
        return (TimeOfDay)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TimeOfDay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeOfDay)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(ByteString byteString) {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static TimeOfDay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(CodedInputStream codedInputStream) {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static TimeOfDay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(InputStream inputStream) {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static TimeOfDay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(ByteBuffer byteBuffer) {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static TimeOfDay parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(byte[] byArray) {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static TimeOfDay parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHours(int n3) {
        this.hours_ = n3;
    }

    private void setMinutes(int n3) {
        this.minutes_ = n3;
    }

    private void setNanos(int n3) {
        this.nanos_ = n3;
    }

    private void setSeconds(int n3) {
        this.seconds_ = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = TimeOfDay$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = TimeOfDay.class;
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
                objectArray = new Object[4];
                objectArray[0] = "hours_";
                objectArray[by2] = "minutes_";
                objectArray[2] = "seconds_";
                objectArray[3] = "nanos_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", objectArray);
            }
            case 2: {
                return new TimeOfDay$Builder(null);
            }
            case 1: 
        }
        return new TimeOfDay();
    }

    public int getHours() {
        return this.hours_;
    }

    public int getMinutes() {
        return this.minutes_;
    }

    public int getNanos() {
        return this.nanos_;
    }

    public int getSeconds() {
        return this.seconds_;
    }
}

