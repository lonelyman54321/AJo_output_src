/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder;
import com.google.protobuf.DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DescriptorProtos$EnumDescriptorProto$EnumReservedRange
extends GeneratedMessageLite
implements DescriptorProtos$EnumDescriptorProto$EnumReservedRangeOrBuilder {
    private static final DescriptorProtos$EnumDescriptorProto$EnumReservedRange DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int START_FIELD_NUMBER = 1;
    private int bitField0_;
    private int end_;
    private int start_;

    static {
        DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange;
        DEFAULT_INSTANCE = descriptorProtos$EnumDescriptorProto$EnumReservedRange = new DescriptorProtos$EnumDescriptorProto$EnumReservedRange();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumDescriptorProto$EnumReservedRange.class, descriptorProtos$EnumDescriptorProto$EnumReservedRange);
    }

    private DescriptorProtos$EnumDescriptorProto$EnumReservedRange() {
    }

    public static /* synthetic */ DescriptorProtos$EnumDescriptorProto$EnumReservedRange access$17800() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$17900(DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange, int n3) {
        descriptorProtos$EnumDescriptorProto$EnumReservedRange.setStart(n3);
    }

    public static /* synthetic */ void access$18000(DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        descriptorProtos$EnumDescriptorProto$EnumReservedRange.clearStart();
    }

    public static /* synthetic */ void access$18100(DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange, int n3) {
        descriptorProtos$EnumDescriptorProto$EnumReservedRange.setEnd(n3);
    }

    public static /* synthetic */ void access$18200(DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        descriptorProtos$EnumDescriptorProto$EnumReservedRange.clearEnd();
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

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder newBuilder() {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder newBuilder(DescriptorProtos$EnumDescriptorProto$EnumReservedRange descriptorProtos$EnumDescriptorProto$EnumReservedRange) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumDescriptorProto$EnumReservedRange);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(ByteString byteString) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(byte[] byArray) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$EnumDescriptorProto$EnumReservedRange parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$EnumDescriptorProto$EnumReservedRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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
                clazz = DescriptorProtos$EnumDescriptorProto$EnumReservedRange.class;
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
                return new DescriptorProtos$EnumDescriptorProto$EnumReservedRange$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$EnumDescriptorProto$EnumReservedRange();
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

