/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRange$Builder;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DescriptorProtos$DescriptorProto$ReservedRange
extends GeneratedMessageLite
implements DescriptorProtos$DescriptorProto$ReservedRangeOrBuilder {
    private static final DescriptorProtos$DescriptorProto$ReservedRange DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int START_FIELD_NUMBER = 1;
    private int bitField0_;
    private int end_;
    private int start_;

    static {
        DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange;
        DEFAULT_INSTANCE = descriptorProtos$DescriptorProto$ReservedRange = new DescriptorProtos$DescriptorProto$ReservedRange();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$DescriptorProto$ReservedRange.class, descriptorProtos$DescriptorProto$ReservedRange);
    }

    private DescriptorProtos$DescriptorProto$ReservedRange() {
    }

    public static /* synthetic */ DescriptorProtos$DescriptorProto$ReservedRange access$7100() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$7200(DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange, int n3) {
        descriptorProtos$DescriptorProto$ReservedRange.setStart(n3);
    }

    public static /* synthetic */ void access$7300(DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        descriptorProtos$DescriptorProto$ReservedRange.clearStart();
    }

    public static /* synthetic */ void access$7400(DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange, int n3) {
        descriptorProtos$DescriptorProto$ReservedRange.setEnd(n3);
    }

    public static /* synthetic */ void access$7500(DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        descriptorProtos$DescriptorProto$ReservedRange.clearEnd();
    }

    private void clearEnd() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.end_ = 0;
    }

    private void clearStart() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.start_ = 0;
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange$Builder newBuilder() {
        return (DescriptorProtos$DescriptorProto$ReservedRange$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange$Builder newBuilder(DescriptorProtos$DescriptorProto$ReservedRange descriptorProtos$DescriptorProto$ReservedRange) {
        return (DescriptorProtos$DescriptorProto$ReservedRange$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$DescriptorProto$ReservedRange);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseFrom(ByteString byteString) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseFrom(byte[] byArray) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$DescriptorProto$ReservedRange parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEnd(int n3) {
        int n4;
        this.bitField0_ = n4 = this.bitField0_ | 2;
        this.end_ = n3;
    }

    private void setStart(int n3) {
        int n4;
        this.bitField0_ = n4 = this.bitField0_ | 1;
        this.start_ = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = DescriptorProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = DescriptorProtos$DescriptorProto$ReservedRange.class;
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
                objectArray[by2] = "start_";
                objectArray[2] = "end_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", objectArray);
            }
            case 2: {
                return new DescriptorProtos$DescriptorProto$ReservedRange$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$DescriptorProto$ReservedRange();
    }

    public int getEnd() {
        return this.end_;
    }

    public int getStart() {
        return this.start_;
    }

    public boolean hasEnd() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasStart() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

