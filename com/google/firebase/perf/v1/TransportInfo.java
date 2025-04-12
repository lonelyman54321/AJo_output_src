/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.TransportInfo$1;
import com.google.firebase.perf.v1.TransportInfo$Builder;
import com.google.firebase.perf.v1.TransportInfo$DispatchDestination;
import com.google.firebase.perf.v1.TransportInfoOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class TransportInfo
extends GeneratedMessageLite
implements TransportInfoOrBuilder {
    private static final TransportInfo DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static {
        TransportInfo transportInfo;
        DEFAULT_INSTANCE = transportInfo = new TransportInfo();
        GeneratedMessageLite.registerDefaultInstance(TransportInfo.class, transportInfo);
    }

    private TransportInfo() {
    }

    public static /* synthetic */ TransportInfo access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(TransportInfo transportInfo, TransportInfo$DispatchDestination transportInfo$DispatchDestination) {
        transportInfo.setDispatchDestination(transportInfo$DispatchDestination);
    }

    public static /* synthetic */ void access$200(TransportInfo transportInfo) {
        transportInfo.clearDispatchDestination();
    }

    private void clearDispatchDestination() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.dispatchDestination_ = 0;
    }

    public static TransportInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static TransportInfo$Builder newBuilder() {
        return (TransportInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static TransportInfo$Builder newBuilder(TransportInfo transportInfo) {
        return (TransportInfo$Builder)DEFAULT_INSTANCE.createBuilder(transportInfo);
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream) {
        return (TransportInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransportInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TransportInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TransportInfo parseFrom(ByteString byteString) {
        return (TransportInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static TransportInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TransportInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TransportInfo parseFrom(CodedInputStream codedInputStream) {
        return (TransportInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static TransportInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TransportInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static TransportInfo parseFrom(InputStream inputStream) {
        return (TransportInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static TransportInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TransportInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer) {
        return (TransportInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static TransportInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TransportInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TransportInfo parseFrom(byte[] byArray) {
        return (TransportInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static TransportInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (TransportInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDispatchDestination(TransportInfo$DispatchDestination transportInfo$DispatchDestination) {
        int n3;
        this.dispatchDestination_ = n3 = transportInfo$DispatchDestination.getNumber();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object objectArray) {
        byte by2 = 1;
        objectArray = TransportInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object2 = object.ordinal();
        object2 = objectArray[object2];
        objectArray = null;
        switch (object2) {
            default: {
                object = new UnsupportedOperationException();
                throw object;
            }
            case 7: {
                return null;
            }
            case 6: {
                return by2;
            }
            case 5: {
                object = PARSER;
                if (object != null) return object;
                clazz = TransportInfo.class;
                synchronized (clazz) {
                    try {
                        object = PARSER;
                        if (object != null) return object;
                        objectArray = DEFAULT_INSTANCE;
                        object = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)objectArray);
                        PARSER = object;
                        return object;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 4: {
                return DEFAULT_INSTANCE;
            }
            case 3: {
                object = TransportInfo$DispatchDestination.internalGetVerifier();
                objectArray = new Object[3];
                objectArray[0] = "bitField0_";
                objectArray[by2] = "dispatchDestination_";
                objectArray[2] = object;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u180c\u0000", objectArray);
            }
            case 2: {
                return new TransportInfo$Builder(null);
            }
            case 1: 
        }
        return new TransportInfo();
    }

    public TransportInfo$DispatchDestination getDispatchDestination() {
        int n3 = this.dispatchDestination_;
        TransportInfo$DispatchDestination transportInfo$DispatchDestination = TransportInfo$DispatchDestination.forNumber(n3);
        if (transportInfo$DispatchDestination == null) {
            transportInfo$DispatchDestination = TransportInfo$DispatchDestination.SOURCE_UNKNOWN;
        }
        return transportInfo$DispatchDestination;
    }

    public boolean hasDispatchDestination() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

