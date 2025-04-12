/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePart$Builder;
import com.google.protobuf.DescriptorProtos$UninterpretedOption$NamePartOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DescriptorProtos$UninterpretedOption$NamePart
extends GeneratedMessageLite
implements DescriptorProtos$UninterpretedOption$NamePartOrBuilder {
    private static final DescriptorProtos$UninterpretedOption$NamePart DEFAULT_INSTANCE;
    public static final int IS_EXTENSION_FIELD_NUMBER = 2;
    public static final int NAME_PART_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private int bitField0_;
    private boolean isExtension_;
    private byte memoizedIsInitialized = (byte)2;
    private String namePart_ = "";

    static {
        DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart;
        DEFAULT_INSTANCE = descriptorProtos$UninterpretedOption$NamePart = new DescriptorProtos$UninterpretedOption$NamePart();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$UninterpretedOption$NamePart.class, descriptorProtos$UninterpretedOption$NamePart);
    }

    private DescriptorProtos$UninterpretedOption$NamePart() {
    }

    public static /* synthetic */ DescriptorProtos$UninterpretedOption$NamePart access$39700() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$39800(DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart, String string2) {
        descriptorProtos$UninterpretedOption$NamePart.setNamePart(string2);
    }

    public static /* synthetic */ void access$39900(DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        descriptorProtos$UninterpretedOption$NamePart.clearNamePart();
    }

    public static /* synthetic */ void access$40000(DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart, ByteString byteString) {
        descriptorProtos$UninterpretedOption$NamePart.setNamePartBytes(byteString);
    }

    public static /* synthetic */ void access$40100(DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart, boolean bl2) {
        descriptorProtos$UninterpretedOption$NamePart.setIsExtension(bl2);
    }

    public static /* synthetic */ void access$40200(DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        descriptorProtos$UninterpretedOption$NamePart.clearIsExtension();
    }

    private void clearIsExtension() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.isExtension_ = false;
    }

    private void clearNamePart() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.namePart_ = string2 = DescriptorProtos$UninterpretedOption$NamePart.getDefaultInstance().getNamePart();
    }

    public static DescriptorProtos$UninterpretedOption$NamePart getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$UninterpretedOption$NamePart$Builder newBuilder() {
        return (DescriptorProtos$UninterpretedOption$NamePart$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$UninterpretedOption$NamePart$Builder newBuilder(DescriptorProtos$UninterpretedOption$NamePart descriptorProtos$UninterpretedOption$NamePart) {
        return (DescriptorProtos$UninterpretedOption$NamePart$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$UninterpretedOption$NamePart);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(ByteString byteString) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(InputStream inputStream) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(byte[] byArray) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$UninterpretedOption$NamePart parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$UninterpretedOption$NamePart)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIsExtension(boolean bl2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 2;
        this.isExtension_ = bl2;
    }

    private void setNamePart(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.namePart_ = string2;
    }

    private void setNamePartBytes(ByteString object) {
        int n3;
        this.namePart_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        int n3 = 1;
        int[] nArray = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        int n4 = objectArray.ordinal();
        n4 = nArray[n4];
        nArray = null;
        switch (n4) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 7: {
                if (clazz == null) {
                    n3 = 0;
                    object = null;
                }
                n4 = (byte)n3;
                this.memoizedIsInitialized = (byte)n4;
                return null;
            }
            case 6: {
                return this.memoizedIsInitialized;
            }
            case 5: {
                objectArray = PARSER;
                if (objectArray != null) return objectArray;
                clazz = DescriptorProtos$UninterpretedOption$NamePart.class;
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
                objectArray[n3] = "namePart_";
                objectArray[2] = "isExtension_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1508\u0000\u0002\u1507\u0001", objectArray);
            }
            case 2: {
                return new DescriptorProtos$UninterpretedOption$NamePart$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$UninterpretedOption$NamePart();
    }

    public boolean getIsExtension() {
        return this.isExtension_;
    }

    public String getNamePart() {
        return this.namePart_;
    }

    public ByteString getNamePartBytes() {
        return ByteString.copyFromUtf8(this.namePart_);
    }

    public boolean hasIsExtension() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasNamePart() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

