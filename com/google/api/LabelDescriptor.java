/*
 * Decompiled with CFR 0.152.
 */
package com.google.api;

import com.google.api.LabelDescriptor$1;
import com.google.api.LabelDescriptor$Builder;
import com.google.api.LabelDescriptor$ValueType;
import com.google.api.LabelDescriptorOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LabelDescriptor
extends GeneratedMessageLite
implements LabelDescriptorOrBuilder {
    private static final LabelDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private String description_;
    private String key_;
    private int valueType_;

    static {
        LabelDescriptor labelDescriptor;
        DEFAULT_INSTANCE = labelDescriptor = new LabelDescriptor();
        GeneratedMessageLite.registerDefaultInstance(LabelDescriptor.class, labelDescriptor);
    }

    private LabelDescriptor() {
        String string2;
        this.key_ = string2 = "";
        this.description_ = string2;
    }

    public static /* synthetic */ LabelDescriptor access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(LabelDescriptor labelDescriptor, String string2) {
        labelDescriptor.setKey(string2);
    }

    public static /* synthetic */ void access$200(LabelDescriptor labelDescriptor) {
        labelDescriptor.clearKey();
    }

    public static /* synthetic */ void access$300(LabelDescriptor labelDescriptor, ByteString byteString) {
        labelDescriptor.setKeyBytes(byteString);
    }

    public static /* synthetic */ void access$400(LabelDescriptor labelDescriptor, int n3) {
        labelDescriptor.setValueTypeValue(n3);
    }

    public static /* synthetic */ void access$500(LabelDescriptor labelDescriptor, LabelDescriptor$ValueType labelDescriptor$ValueType) {
        labelDescriptor.setValueType(labelDescriptor$ValueType);
    }

    public static /* synthetic */ void access$600(LabelDescriptor labelDescriptor) {
        labelDescriptor.clearValueType();
    }

    public static /* synthetic */ void access$700(LabelDescriptor labelDescriptor, String string2) {
        labelDescriptor.setDescription(string2);
    }

    public static /* synthetic */ void access$800(LabelDescriptor labelDescriptor) {
        labelDescriptor.clearDescription();
    }

    public static /* synthetic */ void access$900(LabelDescriptor labelDescriptor, ByteString byteString) {
        labelDescriptor.setDescriptionBytes(byteString);
    }

    private void clearDescription() {
        String string2;
        this.description_ = string2 = LabelDescriptor.getDefaultInstance().getDescription();
    }

    private void clearKey() {
        String string2;
        this.key_ = string2 = LabelDescriptor.getDefaultInstance().getKey();
    }

    private void clearValueType() {
        this.valueType_ = 0;
    }

    public static LabelDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static LabelDescriptor$Builder newBuilder() {
        return (LabelDescriptor$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static LabelDescriptor$Builder newBuilder(LabelDescriptor labelDescriptor) {
        return (LabelDescriptor$Builder)DEFAULT_INSTANCE.createBuilder(labelDescriptor);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (LabelDescriptor)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LabelDescriptor)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(ByteString byteString) {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static LabelDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(CodedInputStream codedInputStream) {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static LabelDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream) {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static LabelDescriptor parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(byte[] byArray) {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static LabelDescriptor parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(String string2) {
        string2.getClass();
        this.description_ = string2;
    }

    private void setDescriptionBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.description_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setKey(String string2) {
        string2.getClass();
        this.key_ = string2;
    }

    private void setKeyBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.key_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setValueType(LabelDescriptor$ValueType labelDescriptor$ValueType) {
        int n3;
        this.valueType_ = n3 = labelDescriptor$ValueType.getNumber();
    }

    private void setValueTypeValue(int n3) {
        this.valueType_ = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = LabelDescriptor$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = LabelDescriptor.class;
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
                objectArray[0] = "key_";
                objectArray[by2] = "valueType_";
                objectArray[2] = "description_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u0208", objectArray);
            }
            case 2: {
                return new LabelDescriptor$Builder(null);
            }
            case 1: 
        }
        return new LabelDescriptor();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8(this.description_);
    }

    public String getKey() {
        return this.key_;
    }

    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8(this.key_);
    }

    public LabelDescriptor$ValueType getValueType() {
        int n3 = this.valueType_;
        LabelDescriptor$ValueType labelDescriptor$ValueType = LabelDescriptor$ValueType.forNumber(n3);
        if (labelDescriptor$ValueType == null) {
            labelDescriptor$ValueType = LabelDescriptor$ValueType.UNRECOGNIZED;
        }
        return labelDescriptor$ValueType;
    }

    public int getValueTypeValue() {
        return this.valueType_;
    }
}

