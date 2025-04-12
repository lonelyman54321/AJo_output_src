/*
 * Decompiled with CFR 0.152.
 */
package com.google.type;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import com.google.type.Money$1;
import com.google.type.Money$Builder;
import com.google.type.MoneyOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Money
extends GeneratedMessageLite
implements MoneyOrBuilder {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    private static final Money DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int UNITS_FIELD_NUMBER = 2;
    private String currencyCode_ = "";
    private int nanos_;
    private long units_;

    static {
        Money money;
        DEFAULT_INSTANCE = money = new Money();
        GeneratedMessageLite.registerDefaultInstance(Money.class, money);
    }

    private Money() {
    }

    public static /* synthetic */ Money access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Money money, String string2) {
        money.setCurrencyCode(string2);
    }

    public static /* synthetic */ void access$200(Money money) {
        money.clearCurrencyCode();
    }

    public static /* synthetic */ void access$300(Money money, ByteString byteString) {
        money.setCurrencyCodeBytes(byteString);
    }

    public static /* synthetic */ void access$400(Money money, long l2) {
        money.setUnits(l2);
    }

    public static /* synthetic */ void access$500(Money money) {
        money.clearUnits();
    }

    public static /* synthetic */ void access$600(Money money, int n3) {
        money.setNanos(n3);
    }

    public static /* synthetic */ void access$700(Money money) {
        money.clearNanos();
    }

    private void clearCurrencyCode() {
        String string2;
        this.currencyCode_ = string2 = Money.getDefaultInstance().getCurrencyCode();
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    private void clearUnits() {
        this.units_ = 0L;
    }

    public static Money getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Money$Builder newBuilder() {
        return (Money$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Money$Builder newBuilder(Money money) {
        return (Money$Builder)DEFAULT_INSTANCE.createBuilder(money);
    }

    public static Money parseDelimitedFrom(InputStream inputStream) {
        return (Money)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Money parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Money)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Money parseFrom(ByteString byteString) {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Money parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Money parseFrom(CodedInputStream codedInputStream) {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Money parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Money parseFrom(InputStream inputStream) {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Money parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Money parseFrom(ByteBuffer byteBuffer) {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Money parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Money parseFrom(byte[] byArray) {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Money parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCurrencyCode(String string2) {
        string2.getClass();
        this.currencyCode_ = string2;
    }

    private void setCurrencyCodeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.currencyCode_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setNanos(int n3) {
        this.nanos_ = n3;
    }

    private void setUnits(long l2) {
        this.units_ = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Money$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Money.class;
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
                objectArray[0] = "currencyCode_";
                objectArray[by2] = "units_";
                objectArray[2] = "nanos_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0002\u0003\u0004", objectArray);
            }
            case 2: {
                return new Money$Builder(null);
            }
            case 1: 
        }
        return new Money();
    }

    public String getCurrencyCode() {
        return this.currencyCode_;
    }

    public ByteString getCurrencyCodeBytes() {
        return ByteString.copyFromUtf8(this.currencyCode_);
    }

    public int getNanos() {
        return this.nanos_;
    }

    public long getUnits() {
        return this.units_;
    }
}

