/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkConnectionInfo$1;
import com.google.firebase.perf.v1.NetworkConnectionInfo$Builder;
import com.google.firebase.perf.v1.NetworkConnectionInfo$MobileSubtype;
import com.google.firebase.perf.v1.NetworkConnectionInfo$NetworkType;
import com.google.firebase.perf.v1.NetworkConnectionInfoOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class NetworkConnectionInfo
extends GeneratedMessageLite
implements NetworkConnectionInfoOrBuilder {
    private static final NetworkConnectionInfo DEFAULT_INSTANCE;
    public static final int MOBILE_SUBTYPE_FIELD_NUMBER = 2;
    public static final int NETWORK_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    private int bitField0_;
    private int mobileSubtype_;
    private int networkType_ = -1;

    static {
        NetworkConnectionInfo networkConnectionInfo;
        DEFAULT_INSTANCE = networkConnectionInfo = new NetworkConnectionInfo();
        GeneratedMessageLite.registerDefaultInstance(NetworkConnectionInfo.class, networkConnectionInfo);
    }

    private NetworkConnectionInfo() {
    }

    public static /* synthetic */ NetworkConnectionInfo access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(NetworkConnectionInfo networkConnectionInfo, NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType) {
        networkConnectionInfo.setNetworkType(networkConnectionInfo$NetworkType);
    }

    public static /* synthetic */ void access$200(NetworkConnectionInfo networkConnectionInfo) {
        networkConnectionInfo.clearNetworkType();
    }

    public static /* synthetic */ void access$300(NetworkConnectionInfo networkConnectionInfo, NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype) {
        networkConnectionInfo.setMobileSubtype(networkConnectionInfo$MobileSubtype);
    }

    public static /* synthetic */ void access$400(NetworkConnectionInfo networkConnectionInfo) {
        networkConnectionInfo.clearMobileSubtype();
    }

    private void clearMobileSubtype() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.mobileSubtype_ = 0;
    }

    private void clearNetworkType() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.networkType_ = -1;
    }

    public static NetworkConnectionInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static NetworkConnectionInfo$Builder newBuilder() {
        return (NetworkConnectionInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static NetworkConnectionInfo$Builder newBuilder(NetworkConnectionInfo networkConnectionInfo) {
        return (NetworkConnectionInfo$Builder)DEFAULT_INSTANCE.createBuilder(networkConnectionInfo);
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NetworkConnectionInfo parseFrom(ByteString byteString) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static NetworkConnectionInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NetworkConnectionInfo parseFrom(CodedInputStream codedInputStream) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static NetworkConnectionInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkConnectionInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static NetworkConnectionInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NetworkConnectionInfo parseFrom(byte[] byArray) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static NetworkConnectionInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkConnectionInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMobileSubtype(NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype) {
        int n3;
        this.mobileSubtype_ = n3 = networkConnectionInfo$MobileSubtype.getNumber();
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    private void setNetworkType(NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType) {
        int n3;
        this.networkType_ = n3 = networkConnectionInfo$NetworkType.getNumber();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = NetworkConnectionInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = object.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
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
                clazz = NetworkConnectionInfo.class;
                synchronized (clazz) {
                    try {
                        object = PARSER;
                        if (object != null) return object;
                        object2 = DEFAULT_INSTANCE;
                        object = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
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
                object = NetworkConnectionInfo$NetworkType.internalGetVerifier();
                object2 = NetworkConnectionInfo$MobileSubtype.internalGetVerifier();
                Object[] objectArray = new Object[5];
                objectArray[0] = "bitField0_";
                objectArray[by2] = "networkType_";
                objectArray[2] = object;
                objectArray[3] = "mobileSubtype_";
                objectArray[4] = object2;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u180c\u0001", objectArray);
            }
            case 2: {
                return new NetworkConnectionInfo$Builder(null);
            }
            case 1: 
        }
        return new NetworkConnectionInfo();
    }

    public NetworkConnectionInfo$MobileSubtype getMobileSubtype() {
        int n3 = this.mobileSubtype_;
        NetworkConnectionInfo$MobileSubtype networkConnectionInfo$MobileSubtype = NetworkConnectionInfo$MobileSubtype.forNumber(n3);
        if (networkConnectionInfo$MobileSubtype == null) {
            networkConnectionInfo$MobileSubtype = NetworkConnectionInfo$MobileSubtype.UNKNOWN_MOBILE_SUBTYPE;
        }
        return networkConnectionInfo$MobileSubtype;
    }

    public NetworkConnectionInfo$NetworkType getNetworkType() {
        int n3 = this.networkType_;
        NetworkConnectionInfo$NetworkType networkConnectionInfo$NetworkType = NetworkConnectionInfo$NetworkType.forNumber(n3);
        if (networkConnectionInfo$NetworkType == null) {
            networkConnectionInfo$NetworkType = NetworkConnectionInfo$NetworkType.NONE;
        }
        return networkConnectionInfo$NetworkType;
    }

    public boolean hasMobileSubtype() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasNetworkType() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

