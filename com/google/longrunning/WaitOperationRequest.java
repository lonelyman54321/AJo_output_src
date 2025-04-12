/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.WaitOperationRequest$1;
import com.google.longrunning.WaitOperationRequest$Builder;
import com.google.longrunning.WaitOperationRequestOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.Duration$Builder;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class WaitOperationRequest
extends GeneratedMessageLite
implements WaitOperationRequestOrBuilder {
    private static final WaitOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser PARSER;
    public static final int TIMEOUT_FIELD_NUMBER = 2;
    private String name_ = "";
    private Duration timeout_;

    static {
        WaitOperationRequest waitOperationRequest;
        DEFAULT_INSTANCE = waitOperationRequest = new WaitOperationRequest();
        GeneratedMessageLite.registerDefaultInstance(WaitOperationRequest.class, waitOperationRequest);
    }

    private WaitOperationRequest() {
    }

    public static /* synthetic */ WaitOperationRequest access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(WaitOperationRequest waitOperationRequest, String string2) {
        waitOperationRequest.setName(string2);
    }

    public static /* synthetic */ void access$200(WaitOperationRequest waitOperationRequest) {
        waitOperationRequest.clearName();
    }

    public static /* synthetic */ void access$300(WaitOperationRequest waitOperationRequest, ByteString byteString) {
        waitOperationRequest.setNameBytes(byteString);
    }

    public static /* synthetic */ void access$400(WaitOperationRequest waitOperationRequest, Duration duration) {
        waitOperationRequest.setTimeout(duration);
    }

    public static /* synthetic */ void access$500(WaitOperationRequest waitOperationRequest, Duration duration) {
        waitOperationRequest.mergeTimeout(duration);
    }

    public static /* synthetic */ void access$600(WaitOperationRequest waitOperationRequest) {
        waitOperationRequest.clearTimeout();
    }

    private void clearName() {
        String string2;
        this.name_ = string2 = WaitOperationRequest.getDefaultInstance().getName();
    }

    private void clearTimeout() {
        this.timeout_ = null;
    }

    public static WaitOperationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeTimeout(Duration duration) {
        Duration duration2;
        duration.getClass();
        DurationOrBuilder durationOrBuilder = this.timeout_;
        if (durationOrBuilder != null && durationOrBuilder != (duration2 = Duration.getDefaultInstance())) {
            durationOrBuilder = Duration.newBuilder(this.timeout_);
            this.timeout_ = duration = (Duration)((Duration$Builder)((GeneratedMessageLite$Builder)((Object)durationOrBuilder)).mergeFrom(duration)).buildPartial();
        } else {
            this.timeout_ = duration;
        }
    }

    public static WaitOperationRequest$Builder newBuilder() {
        return (WaitOperationRequest$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static WaitOperationRequest$Builder newBuilder(WaitOperationRequest waitOperationRequest) {
        return (WaitOperationRequest$Builder)DEFAULT_INSTANCE.createBuilder(waitOperationRequest);
    }

    public static WaitOperationRequest parseDelimitedFrom(InputStream inputStream) {
        return (WaitOperationRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WaitOperationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (WaitOperationRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WaitOperationRequest parseFrom(ByteString byteString) {
        return (WaitOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static WaitOperationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (WaitOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static WaitOperationRequest parseFrom(CodedInputStream codedInputStream) {
        return (WaitOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static WaitOperationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (WaitOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static WaitOperationRequest parseFrom(InputStream inputStream) {
        return (WaitOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static WaitOperationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (WaitOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static WaitOperationRequest parseFrom(ByteBuffer byteBuffer) {
        return (WaitOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static WaitOperationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (WaitOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static WaitOperationRequest parseFrom(byte[] byArray) {
        return (WaitOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static WaitOperationRequest parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (WaitOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
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

    private void setTimeout(Duration duration) {
        duration.getClass();
        this.timeout_ = duration;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = WaitOperationRequest$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = WaitOperationRequest.class;
                synchronized (clazz) {
                    try {
                        object = PARSER;
                        if (object != null) return object;
                        object2 = DEFAULT_INSTANCE;
                        PARSER = object = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
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
                object = new Object[2];
                object[0] = "name_";
                object[by2] = "timeout_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", object);
            }
            case 2: {
                return new WaitOperationRequest$Builder(null);
            }
            case 1: 
        }
        return new WaitOperationRequest();
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public Duration getTimeout() {
        Duration duration = this.timeout_;
        if (duration == null) {
            duration = Duration.getDefaultInstance();
        }
        return duration;
    }

    public boolean hasTimeout() {
        boolean bl2;
        Duration duration = this.timeout_;
        if (duration != null) {
            bl2 = true;
        } else {
            bl2 = false;
            duration = null;
        }
        return bl2;
    }
}

