/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Timestamp$Builder;
import com.google.protobuf.TimestampOrBuilder;
import com.google.rpc.context.AttributeContext$1;
import com.google.rpc.context.AttributeContext$Response$Builder;
import com.google.rpc.context.AttributeContext$Response$HeadersDefaultEntryHolder;
import com.google.rpc.context.AttributeContext$ResponseOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;

public final class AttributeContext$Response
extends GeneratedMessageLite
implements AttributeContext$ResponseOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final AttributeContext$Response DEFAULT_INSTANCE;
    public static final int HEADERS_FIELD_NUMBER = 3;
    private static volatile Parser PARSER;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final int TIME_FIELD_NUMBER = 4;
    private long code_;
    private MapFieldLite headers_;
    private long size_;
    private Timestamp time_;

    static {
        AttributeContext$Response attributeContext$Response;
        DEFAULT_INSTANCE = attributeContext$Response = new AttributeContext$Response();
        GeneratedMessageLite.registerDefaultInstance(AttributeContext$Response.class, attributeContext$Response);
    }

    private AttributeContext$Response() {
        MapFieldLite mapFieldLite;
        this.headers_ = mapFieldLite = MapFieldLite.emptyMapField();
    }

    public static /* synthetic */ AttributeContext$Response access$8400() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$8500(AttributeContext$Response attributeContext$Response, long l2) {
        attributeContext$Response.setCode(l2);
    }

    public static /* synthetic */ void access$8600(AttributeContext$Response attributeContext$Response) {
        attributeContext$Response.clearCode();
    }

    public static /* synthetic */ void access$8700(AttributeContext$Response attributeContext$Response, long l2) {
        attributeContext$Response.setSize(l2);
    }

    public static /* synthetic */ void access$8800(AttributeContext$Response attributeContext$Response) {
        attributeContext$Response.clearSize();
    }

    public static /* synthetic */ Map access$8900(AttributeContext$Response attributeContext$Response) {
        return attributeContext$Response.getMutableHeadersMap();
    }

    public static /* synthetic */ void access$9000(AttributeContext$Response attributeContext$Response, Timestamp timestamp) {
        attributeContext$Response.setTime(timestamp);
    }

    public static /* synthetic */ void access$9100(AttributeContext$Response attributeContext$Response, Timestamp timestamp) {
        attributeContext$Response.mergeTime(timestamp);
    }

    public static /* synthetic */ void access$9200(AttributeContext$Response attributeContext$Response) {
        attributeContext$Response.clearTime();
    }

    private void clearCode() {
        this.code_ = 0L;
    }

    private void clearSize() {
        this.size_ = 0L;
    }

    private void clearTime() {
        this.time_ = null;
    }

    public static AttributeContext$Response getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map getMutableHeadersMap() {
        return this.internalGetMutableHeaders();
    }

    private MapFieldLite internalGetHeaders() {
        return this.headers_;
    }

    private MapFieldLite internalGetMutableHeaders() {
        MapFieldLite mapFieldLite = this.headers_;
        boolean bl2 = mapFieldLite.isMutable();
        if (!bl2) {
            this.headers_ = mapFieldLite = this.headers_.mutableCopy();
        }
        return this.headers_;
    }

    private void mergeTime(Timestamp timestamp) {
        Timestamp timestamp2;
        timestamp.getClass();
        TimestampOrBuilder timestampOrBuilder = this.time_;
        if (timestampOrBuilder != null && timestampOrBuilder != (timestamp2 = Timestamp.getDefaultInstance())) {
            timestampOrBuilder = Timestamp.newBuilder(this.time_);
            this.time_ = timestamp = (Timestamp)((Timestamp$Builder)((GeneratedMessageLite$Builder)((Object)timestampOrBuilder)).mergeFrom(timestamp)).buildPartial();
        } else {
            this.time_ = timestamp;
        }
    }

    public static AttributeContext$Response$Builder newBuilder() {
        return (AttributeContext$Response$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AttributeContext$Response$Builder newBuilder(AttributeContext$Response attributeContext$Response) {
        return (AttributeContext$Response$Builder)DEFAULT_INSTANCE.createBuilder(attributeContext$Response);
    }

    public static AttributeContext$Response parseDelimitedFrom(InputStream inputStream) {
        return (AttributeContext$Response)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Response parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Response)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Response parseFrom(ByteString byteString) {
        return (AttributeContext$Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AttributeContext$Response parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AttributeContext$Response parseFrom(CodedInputStream codedInputStream) {
        return (AttributeContext$Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AttributeContext$Response parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AttributeContext$Response parseFrom(InputStream inputStream) {
        return (AttributeContext$Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Response parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Response parseFrom(ByteBuffer byteBuffer) {
        return (AttributeContext$Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AttributeContext$Response parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AttributeContext$Response parseFrom(byte[] byArray) {
        return (AttributeContext$Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AttributeContext$Response parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Response)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCode(long l2) {
        this.code_ = l2;
    }

    private void setSize(long l2) {
        this.size_ = l2;
    }

    private void setTime(Timestamp timestamp) {
        timestamp.getClass();
        this.time_ = timestamp;
    }

    public boolean containsHeaders(String string2) {
        string2.getClass();
        return ((AbstractMap)this.internalGetHeaders()).containsKey(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object object, Object object2) {
        byte by2 = 1;
        object2 = AttributeContext$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                object = AttributeContext$Response.class;
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
                objectArray = new Object[5];
                objectArray[0] = "code_";
                objectArray[by2] = "size_";
                objectArray[2] = "headers_";
                objectArray[3] = object = AttributeContext$Response$HeadersDefaultEntryHolder.defaultEntry;
                objectArray[4] = "time_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0002\u0002\u0002\u00032\u0004\t", objectArray);
            }
            case 2: {
                return new AttributeContext$Response$Builder(null);
            }
            case 1: 
        }
        return new AttributeContext$Response();
    }

    public long getCode() {
        return this.code_;
    }

    public Map getHeaders() {
        return this.getHeadersMap();
    }

    public int getHeadersCount() {
        return ((AbstractMap)this.internalGetHeaders()).size();
    }

    public Map getHeadersMap() {
        return Collections.unmodifiableMap(this.internalGetHeaders());
    }

    public String getHeadersOrDefault(String string2, String string3) {
        string2.getClass();
        MapFieldLite mapFieldLite = this.internalGetHeaders();
        boolean bl2 = mapFieldLite.containsKey(string2);
        if (bl2) {
            string3 = string2 = mapFieldLite.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getHeadersOrThrow(String object) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetHeaders();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            return (String)mapFieldLite.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public long getSize() {
        return this.size_;
    }

    public Timestamp getTime() {
        Timestamp timestamp = this.time_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public boolean hasTime() {
        boolean bl2;
        Timestamp timestamp = this.time_;
        if (timestamp != null) {
            bl2 = true;
        } else {
            bl2 = false;
            timestamp = null;
        }
        return bl2;
    }
}

