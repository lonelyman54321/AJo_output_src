/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.rpc.ErrorInfo$1;
import com.google.rpc.ErrorInfo$Builder;
import com.google.rpc.ErrorInfo$MetadataDefaultEntryHolder;
import com.google.rpc.ErrorInfoOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;

public final class ErrorInfo
extends GeneratedMessageLite
implements ErrorInfoOrBuilder {
    private static final ErrorInfo DEFAULT_INSTANCE;
    public static final int DOMAIN_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int REASON_FIELD_NUMBER = 1;
    private String domain_;
    private MapFieldLite metadata_;
    private String reason_;

    static {
        ErrorInfo errorInfo;
        DEFAULT_INSTANCE = errorInfo = new ErrorInfo();
        GeneratedMessageLite.registerDefaultInstance(ErrorInfo.class, errorInfo);
    }

    private ErrorInfo() {
        Object object = MapFieldLite.emptyMapField();
        this.metadata_ = object;
        this.reason_ = object = "";
        this.domain_ = object;
    }

    public static /* synthetic */ ErrorInfo access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(ErrorInfo errorInfo, String string2) {
        errorInfo.setReason(string2);
    }

    public static /* synthetic */ void access$200(ErrorInfo errorInfo) {
        errorInfo.clearReason();
    }

    public static /* synthetic */ void access$300(ErrorInfo errorInfo, ByteString byteString) {
        errorInfo.setReasonBytes(byteString);
    }

    public static /* synthetic */ void access$400(ErrorInfo errorInfo, String string2) {
        errorInfo.setDomain(string2);
    }

    public static /* synthetic */ void access$500(ErrorInfo errorInfo) {
        errorInfo.clearDomain();
    }

    public static /* synthetic */ void access$600(ErrorInfo errorInfo, ByteString byteString) {
        errorInfo.setDomainBytes(byteString);
    }

    public static /* synthetic */ Map access$700(ErrorInfo errorInfo) {
        return errorInfo.getMutableMetadataMap();
    }

    private void clearDomain() {
        String string2;
        this.domain_ = string2 = ErrorInfo.getDefaultInstance().getDomain();
    }

    private void clearReason() {
        String string2;
        this.reason_ = string2 = ErrorInfo.getDefaultInstance().getReason();
    }

    public static ErrorInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map getMutableMetadataMap() {
        return this.internalGetMutableMetadata();
    }

    private MapFieldLite internalGetMetadata() {
        return this.metadata_;
    }

    private MapFieldLite internalGetMutableMetadata() {
        MapFieldLite mapFieldLite = this.metadata_;
        boolean bl2 = mapFieldLite.isMutable();
        if (!bl2) {
            this.metadata_ = mapFieldLite = this.metadata_.mutableCopy();
        }
        return this.metadata_;
    }

    public static ErrorInfo$Builder newBuilder() {
        return (ErrorInfo$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static ErrorInfo$Builder newBuilder(ErrorInfo errorInfo) {
        return (ErrorInfo$Builder)DEFAULT_INSTANCE.createBuilder(errorInfo);
    }

    public static ErrorInfo parseDelimitedFrom(InputStream inputStream) {
        return (ErrorInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ErrorInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ErrorInfo)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ErrorInfo parseFrom(ByteString byteString) {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static ErrorInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ErrorInfo parseFrom(CodedInputStream codedInputStream) {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static ErrorInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static ErrorInfo parseFrom(InputStream inputStream) {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static ErrorInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ErrorInfo parseFrom(ByteBuffer byteBuffer) {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static ErrorInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ErrorInfo parseFrom(byte[] byArray) {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static ErrorInfo parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ErrorInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDomain(String string2) {
        string2.getClass();
        this.domain_ = string2;
    }

    private void setDomainBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.domain_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setReason(String string2) {
        string2.getClass();
        this.reason_ = string2;
    }

    private void setReasonBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.reason_ = object = ((ByteString)object).toStringUtf8();
    }

    public boolean containsMetadata(String string2) {
        string2.getClass();
        return ((AbstractMap)this.internalGetMetadata()).containsKey(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object object, Object object2) {
        byte by2 = 1;
        object2 = ErrorInfo$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
        Object object3 = objectArray.ordinal();
        object3 = object2[object3];
        object2 = null;
        switch (object3) {
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
                object = ErrorInfo.class;
                synchronized (object) {
                    try {
                        objectArray = PARSER;
                        if (objectArray != null) return objectArray;
                        object2 = DEFAULT_INSTANCE;
                        PARSER = objectArray = new GeneratedMessageLite$DefaultInstanceBasedParser((GeneratedMessageLite)object2);
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
                objectArray[0] = "reason_";
                objectArray[by2] = "domain_";
                objectArray[2] = "metadata_";
                objectArray[3] = object = ErrorInfo$MetadataDefaultEntryHolder.defaultEntry;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u00032", objectArray);
            }
            case 2: {
                return new ErrorInfo$Builder(null);
            }
            case 1: 
        }
        return new ErrorInfo();
    }

    public String getDomain() {
        return this.domain_;
    }

    public ByteString getDomainBytes() {
        return ByteString.copyFromUtf8(this.domain_);
    }

    public Map getMetadata() {
        return this.getMetadataMap();
    }

    public int getMetadataCount() {
        return ((AbstractMap)this.internalGetMetadata()).size();
    }

    public Map getMetadataMap() {
        return Collections.unmodifiableMap(this.internalGetMetadata());
    }

    public String getMetadataOrDefault(String string2, String string3) {
        string2.getClass();
        MapFieldLite mapFieldLite = this.internalGetMetadata();
        boolean bl2 = mapFieldLite.containsKey(string2);
        if (bl2) {
            string3 = string2 = mapFieldLite.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getMetadataOrThrow(String object) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetMetadata();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            return (String)mapFieldLite.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public String getReason() {
        return this.reason_;
    }

    public ByteString getReasonBytes() {
        return ByteString.copyFromUtf8(this.reason_);
    }
}

