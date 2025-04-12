/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Option$1;
import com.google.protobuf.Option$Builder;
import com.google.protobuf.OptionOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Option
extends GeneratedMessageLite
implements OptionOrBuilder {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String name_ = "";
    private Any value_;

    static {
        Option option;
        DEFAULT_INSTANCE = option = new Option();
        GeneratedMessageLite.registerDefaultInstance(Option.class, option);
    }

    private Option() {
    }

    public static /* synthetic */ Option access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(Option option, String string2) {
        option.setName(string2);
    }

    public static /* synthetic */ void access$200(Option option) {
        option.clearName();
    }

    public static /* synthetic */ void access$300(Option option, ByteString byteString) {
        option.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(Option option, Any any) {
        option.setValue(any);
    }

    public static /* synthetic */ void access$500(Option option, Any any) {
        option.mergeValue(any);
    }

    public static /* synthetic */ void access$600(Option option) {
        option.clearValue();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = Option.getDefaultInstance().getName();
    }

    private void clearValue() {
        int n3;
        this.value_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
    }

    public static Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeValue(Any any) {
        int n3;
        Any any2;
        any.getClass();
        AnyOrBuilder anyOrBuilder = this.value_;
        if (anyOrBuilder != null && anyOrBuilder != (any2 = Any.getDefaultInstance())) {
            anyOrBuilder = Any.newBuilder(this.value_);
            this.value_ = any = (Any)((Any$Builder)((GeneratedMessageLite$Builder)((Object)anyOrBuilder)).mergeFrom(any)).buildPartial();
        } else {
            this.value_ = any;
        }
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    public static Option$Builder newBuilder() {
        return (Option$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static Option$Builder newBuilder(Option option) {
        return (Option$Builder)DEFAULT_INSTANCE.createBuilder(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream) {
        return (Option)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Option)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Option parseFrom(ByteString byteString) {
        return (Option)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static Option parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Option)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Option parseFrom(CodedInputStream codedInputStream) {
        return (Option)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static Option parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Option)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Option parseFrom(InputStream inputStream) {
        return (Option)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Option)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) {
        return (Option)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static Option parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Option)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Option parseFrom(byte[] byArray) {
        return (Option)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static Option parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Option)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String string2) {
        string2.getClass();
        this.name_ = string2;
    }

    private void setNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.name_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setValue(Any any) {
        int n3;
        any.getClass();
        this.value_ = any;
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = Option$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = Option.class;
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
                objectArray[0] = "bitField0_";
                objectArray[by2] = "name_";
                objectArray[2] = "value_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000", objectArray);
            }
            case 2: {
                return new Option$Builder(null);
            }
            case 1: 
        }
        return new Option();
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public Any getValue() {
        Any any = this.value_;
        if (any == null) {
            any = Any.getDefaultInstance();
        }
        return any;
    }

    public boolean hasValue() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

