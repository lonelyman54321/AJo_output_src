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
import com.google.type.Date$1;
import com.google.type.Date$Builder;
import com.google.type.DateOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Date
extends GeneratedMessageLite
implements DateOrBuilder {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final Date DEFAULT_INSTANCE;
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int month_;
    private int year_;

    static {
        Date date;
        DEFAULT_INSTANCE = date = new Date();
        GeneratedMessageLite.registerDefaultInstance(Date.class, date);
    }

    private Date() {
    }

    public static /* synthetic */ Date access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Date date, int n3) {
        date.setYear(n3);
    }

    public static /* synthetic */ void access$200(Date date) {
        date.clearYear();
    }

    public static /* synthetic */ void access$300(Date date, int n3) {
        date.setMonth(n3);
    }

    public static /* synthetic */ void access$400(Date date) {
        date.clearMonth();
    }

    public static /* synthetic */ void access$500(Date date, int n3) {
        date.setDay(n3);
    }

    public static /* synthetic */ void access$600(Date date) {
        date.clearDay();
    }

    private void clearDay() {
        this.day_ = 0;
    }

    private void clearMonth() {
        this.month_ = 0;
    }

    private void clearYear() {
        this.year_ = 0;
    }

    public static Date getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Date$Builder newBuilder() {
        return (Date$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Date$Builder newBuilder(Date date) {
        return (Date$Builder)DEFAULT_INSTANCE.createBuilder(date);
    }

    public static Date parseDelimitedFrom(InputStream inputStream) {
        return (Date)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Date parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Date)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Date parseFrom(ByteString byteString) {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Date parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Date parseFrom(CodedInputStream codedInputStream) {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Date parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Date parseFrom(InputStream inputStream) {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Date parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Date parseFrom(ByteBuffer byteBuffer) {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Date parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Date parseFrom(byte[] byArray) {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Date parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDay(int n3) {
        this.day_ = n3;
    }

    private void setMonth(int n3) {
        this.month_ = n3;
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
        object = Date$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Date.class;
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
                objectArray = new Object[3];
                objectArray[0] = "year_";
                objectArray[by2] = "month_";
                objectArray[2] = "day_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", objectArray);
            }
            case 2: {
                return new Date$Builder(null);
            }
            case 1: 
        }
        return new Date();
    }

    public int getDay() {
        return this.day_;
    }

    public int getMonth() {
        return this.month_;
    }

    public int getYear() {
        return this.year_;
    }
}

