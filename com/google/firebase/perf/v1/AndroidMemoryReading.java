/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.AndroidMemoryReading$1;
import com.google.firebase.perf.v1.AndroidMemoryReading$Builder;
import com.google.firebase.perf.v1.AndroidMemoryReadingOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class AndroidMemoryReading
extends GeneratedMessageLite
implements AndroidMemoryReadingOrBuilder {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final AndroidMemoryReading DEFAULT_INSTANCE;
    private static volatile Parser PARSER;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    static {
        AndroidMemoryReading androidMemoryReading;
        DEFAULT_INSTANCE = androidMemoryReading = new AndroidMemoryReading();
        GeneratedMessageLite.registerDefaultInstance(AndroidMemoryReading.class, androidMemoryReading);
    }

    private AndroidMemoryReading() {
    }

    public static /* synthetic */ AndroidMemoryReading access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(AndroidMemoryReading androidMemoryReading, long l2) {
        androidMemoryReading.setClientTimeUs(l2);
    }

    public static /* synthetic */ void access$200(AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.clearClientTimeUs();
    }

    public static /* synthetic */ void access$300(AndroidMemoryReading androidMemoryReading, int n3) {
        androidMemoryReading.setUsedAppJavaHeapMemoryKb(n3);
    }

    public static /* synthetic */ void access$400(AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.clearUsedAppJavaHeapMemoryKb();
    }

    private void clearClientTimeUs() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.clientTimeUs_ = 0L;
    }

    private void clearUsedAppJavaHeapMemoryKb() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.usedAppJavaHeapMemoryKb_ = 0;
    }

    public static AndroidMemoryReading getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static AndroidMemoryReading$Builder newBuilder() {
        return (AndroidMemoryReading$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AndroidMemoryReading$Builder newBuilder(AndroidMemoryReading androidMemoryReading) {
        return (AndroidMemoryReading$Builder)DEFAULT_INSTANCE.createBuilder(androidMemoryReading);
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidMemoryReading parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AndroidMemoryReading parseFrom(ByteString byteString) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AndroidMemoryReading parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AndroidMemoryReading parseFrom(CodedInputStream codedInputStream) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AndroidMemoryReading parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AndroidMemoryReading parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AndroidMemoryReading parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AndroidMemoryReading parseFrom(byte[] byArray) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AndroidMemoryReading parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AndroidMemoryReading)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setClientTimeUs(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.clientTimeUs_ = l2;
    }

    private void setUsedAppJavaHeapMemoryKb(int n3) {
        int n4;
        this.bitField0_ = n4 = this.bitField0_ | 2;
        this.usedAppJavaHeapMemoryKb_ = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = AndroidMemoryReading$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = AndroidMemoryReading.class;
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
                objectArray[by2] = "clientTimeUs_";
                objectArray[2] = "usedAppJavaHeapMemoryKb_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1004\u0001", objectArray);
            }
            case 2: {
                return new AndroidMemoryReading$Builder(null);
            }
            case 1: 
        }
        return new AndroidMemoryReading();
    }

    public long getClientTimeUs() {
        return this.clientTimeUs_;
    }

    public int getUsedAppJavaHeapMemoryKb() {
        return this.usedAppJavaHeapMemoryKb_;
    }

    public boolean hasClientTimeUs() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean hasUsedAppJavaHeapMemoryKb() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

