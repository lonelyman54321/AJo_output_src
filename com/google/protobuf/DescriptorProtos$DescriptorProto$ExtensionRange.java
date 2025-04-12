/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.DescriptorProtos$1;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRange$Builder;
import com.google.protobuf.DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder;
import com.google.protobuf.DescriptorProtos$ExtensionRangeOptions;
import com.google.protobuf.DescriptorProtos$ExtensionRangeOptions$Builder;
import com.google.protobuf.DescriptorProtos$ExtensionRangeOptionsOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DescriptorProtos$DescriptorProto$ExtensionRange
extends GeneratedMessageLite
implements DescriptorProtos$DescriptorProto$ExtensionRangeOrBuilder {
    private static final DescriptorProtos$DescriptorProto$ExtensionRange DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int START_FIELD_NUMBER = 1;
    private int bitField0_;
    private int end_;
    private byte memoizedIsInitialized = (byte)2;
    private DescriptorProtos$ExtensionRangeOptions options_;
    private int start_;

    static {
        DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange;
        DEFAULT_INSTANCE = descriptorProtos$DescriptorProto$ExtensionRange = new DescriptorProtos$DescriptorProto$ExtensionRange();
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$DescriptorProto$ExtensionRange.class, descriptorProtos$DescriptorProto$ExtensionRange);
    }

    private DescriptorProtos$DescriptorProto$ExtensionRange() {
    }

    public static /* synthetic */ DescriptorProtos$DescriptorProto$ExtensionRange access$6200() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$6300(DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange, int n3) {
        descriptorProtos$DescriptorProto$ExtensionRange.setStart(n3);
    }

    public static /* synthetic */ void access$6400(DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        descriptorProtos$DescriptorProto$ExtensionRange.clearStart();
    }

    public static /* synthetic */ void access$6500(DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange, int n3) {
        descriptorProtos$DescriptorProto$ExtensionRange.setEnd(n3);
    }

    public static /* synthetic */ void access$6600(DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        descriptorProtos$DescriptorProto$ExtensionRange.clearEnd();
    }

    public static /* synthetic */ void access$6700(DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange, DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        descriptorProtos$DescriptorProto$ExtensionRange.setOptions(descriptorProtos$ExtensionRangeOptions);
    }

    public static /* synthetic */ void access$6800(DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange, DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        descriptorProtos$DescriptorProto$ExtensionRange.mergeOptions(descriptorProtos$ExtensionRangeOptions);
    }

    public static /* synthetic */ void access$6900(DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        descriptorProtos$DescriptorProto$ExtensionRange.clearOptions();
    }

    private void clearEnd() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.end_ = 0;
    }

    private void clearOptions() {
        int n3;
        this.options_ = null;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
    }

    private void clearStart() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.start_ = 0;
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        int n3;
        DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions2;
        descriptorProtos$ExtensionRangeOptions.getClass();
        DescriptorProtos$ExtensionRangeOptionsOrBuilder descriptorProtos$ExtensionRangeOptionsOrBuilder = this.options_;
        if (descriptorProtos$ExtensionRangeOptionsOrBuilder != null && descriptorProtos$ExtensionRangeOptionsOrBuilder != (descriptorProtos$ExtensionRangeOptions2 = DescriptorProtos$ExtensionRangeOptions.getDefaultInstance())) {
            descriptorProtos$ExtensionRangeOptionsOrBuilder = DescriptorProtos$ExtensionRangeOptions.newBuilder(this.options_);
            this.options_ = descriptorProtos$ExtensionRangeOptions = (DescriptorProtos$ExtensionRangeOptions)((DescriptorProtos$ExtensionRangeOptions$Builder)((GeneratedMessageLite$Builder)((Object)descriptorProtos$ExtensionRangeOptionsOrBuilder)).mergeFrom(descriptorProtos$ExtensionRangeOptions)).buildPartial();
        } else {
            this.options_ = descriptorProtos$ExtensionRangeOptions;
        }
        this.bitField0_ = n3 = this.bitField0_ | 4;
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange$Builder newBuilder() {
        return (DescriptorProtos$DescriptorProto$ExtensionRange$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange$Builder newBuilder(DescriptorProtos$DescriptorProto$ExtensionRange descriptorProtos$DescriptorProto$ExtensionRange) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange$Builder)DEFAULT_INSTANCE.createBuilder(descriptorProtos$DescriptorProto$ExtensionRange);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(ByteString byteString) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(CodedInputStream codedInputStream) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(byte[] byArray) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static DescriptorProtos$DescriptorProto$ExtensionRange parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (DescriptorProtos$DescriptorProto$ExtensionRange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEnd(int n3) {
        int n4;
        this.bitField0_ = n4 = this.bitField0_ | 2;
        this.end_ = n3;
    }

    private void setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
        int n3;
        descriptorProtos$ExtensionRangeOptions.getClass();
        this.options_ = descriptorProtos$ExtensionRangeOptions;
        this.bitField0_ = n3 = this.bitField0_ | 4;
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
                clazz = DescriptorProtos$DescriptorProto$ExtensionRange.class;
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
                objectArray[0] = "bitField0_";
                objectArray[n3] = "start_";
                objectArray[2] = "end_";
                objectArray[3] = "options_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1409\u0002", objectArray);
            }
            case 2: {
                return new DescriptorProtos$DescriptorProto$ExtensionRange$Builder(null);
            }
            case 1: 
        }
        return new DescriptorProtos$DescriptorProto$ExtensionRange();
    }

    public int getEnd() {
        return this.end_;
    }

    public DescriptorProtos$ExtensionRangeOptions getOptions() {
        DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
        if (descriptorProtos$ExtensionRangeOptions == null) {
            descriptorProtos$ExtensionRangeOptions = DescriptorProtos$ExtensionRangeOptions.getDefaultInstance();
        }
        return descriptorProtos$ExtensionRangeOptions;
    }

    public int getStart() {
        return this.start_;
    }

    public boolean hasEnd() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasOptions() {
        int n3 = this.bitField0_ & 4;
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

