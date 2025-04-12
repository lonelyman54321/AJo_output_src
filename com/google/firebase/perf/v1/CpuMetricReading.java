/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.CpuMetricReading$1;
import com.google.firebase.perf.v1.CpuMetricReading$Builder;
import com.google.firebase.perf.v1.CpuMetricReadingOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class CpuMetricReading
extends GeneratedMessageLite
implements CpuMetricReadingOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final CpuMetricReading DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        CpuMetricReading cpuMetricReading;
        DEFAULT_INSTANCE = cpuMetricReading = new CpuMetricReading();
        GeneratedMessageLite.registerDefaultInstance(CpuMetricReading.class, cpuMetricReading);
    }

    private CpuMetricReading() {
    }

    public static /* synthetic */ CpuMetricReading access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(CpuMetricReading cpuMetricReading, long l2) {
        cpuMetricReading.setClientTimeUs(l2);
    }

    public static /* synthetic */ void access$200(CpuMetricReading cpuMetricReading) {
        cpuMetricReading.clearClientTimeUs();
    }

    public static /* synthetic */ void access$300(CpuMetricReading cpuMetricReading, long l2) {
        cpuMetricReading.setUserTimeUs(l2);
    }

    public static /* synthetic */ void access$400(CpuMetricReading cpuMetricReading) {
        cpuMetricReading.clearUserTimeUs();
    }

    public static /* synthetic */ void access$500(CpuMetricReading cpuMetricReading, long l2) {
        cpuMetricReading.setSystemTimeUs(l2);
    }

    public static /* synthetic */ void access$600(CpuMetricReading cpuMetricReading) {
        cpuMetricReading.clearSystemTimeUs();
    }

    private void clearClientTimeUs() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.clientTimeUs_ = 0L;
    }

    private void clearSystemTimeUs() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
        this.systemTimeUs_ = 0L;
    }

    private void clearUserTimeUs() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.userTimeUs_ = 0L;
    }

    public static CpuMetricReading getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static CpuMetricReading$Builder newBuilder() {
        return (CpuMetricReading$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static CpuMetricReading$Builder newBuilder(CpuMetricReading cpuMetricReading) {
        return (CpuMetricReading$Builder)DEFAULT_INSTANCE.createBuilder(cpuMetricReading);
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream) {
        return (CpuMetricReading)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CpuMetricReading parseFrom(ByteString byteString) {
        return (CpuMetricReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static CpuMetricReading parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static CpuMetricReading parseFrom(CodedInputStream codedInputStream) {
        return (CpuMetricReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static CpuMetricReading parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream) {
        return (CpuMetricReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static CpuMetricReading parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer) {
        return (CpuMetricReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static CpuMetricReading parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static CpuMetricReading parseFrom(byte[] byArray) {
        return (CpuMetricReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static CpuMetricReading parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (CpuMetricReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setClientTimeUs(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.clientTimeUs_ = l2;
    }

    private void setSystemTimeUs(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 4;
        this.systemTimeUs_ = l2;
    }

    private void setUserTimeUs(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 2;
        this.userTimeUs_ = l2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = CpuMetricReading$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = CpuMetricReading.class;
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
                objectArray[by2] = "clientTimeUs_";
                objectArray[2] = "userTimeUs_";
                objectArray[3] = "systemTimeUs_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002", objectArray);
            }
            case 2: {
                return new CpuMetricReading$Builder(null);
            }
            case 1: 
        }
        return new CpuMetricReading();
    }

    public long getClientTimeUs() {
        return this.clientTimeUs_;
    }

    public long getSystemTimeUs() {
        return this.systemTimeUs_;
    }

    public long getUserTimeUs() {
        return this.userTimeUs_;
    }

    public boolean hasClientTimeUs() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasSystemTimeUs() {
        int n3 = this.bitField0_ & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasUserTimeUs() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

