/*
 * Decompiled with CFR 0.152.
 */
package com.google.rpc.context;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.rpc.context.AttributeContext$Auth;
import com.google.rpc.context.AttributeContext$Auth$Builder;
import com.google.rpc.context.AttributeContext$AuthOrBuilder;
import com.google.rpc.context.AttributeContext$Request$Builder;
import com.google.rpc.context.AttributeContext$Request$HeadersDefaultEntryHolder;
import com.google.rpc.context.AttributeContext$RequestOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;

public final class AttributeContext$Request
extends GeneratedMessageLite
implements AttributeContext$RequestOrBuilder {
    public static final int AUTH_FIELD_NUMBER = 13;
    private static final AttributeContext$Request DEFAULT_INSTANCE;
    public static final int HEADERS_FIELD_NUMBER = 3;
    public static final int HOST_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int METHOD_FIELD_NUMBER = 2;
    private static volatile Parser PARSER;
    public static final int PATH_FIELD_NUMBER = 4;
    public static final int PROTOCOL_FIELD_NUMBER = 11;
    public static final int QUERY_FIELD_NUMBER = 7;
    public static final int REASON_FIELD_NUMBER = 12;
    public static final int SCHEME_FIELD_NUMBER = 6;
    public static final int SIZE_FIELD_NUMBER = 10;
    public static final int TIME_FIELD_NUMBER = 9;
    private AttributeContext$Auth auth_;
    private MapFieldLite headers_;
    private String host_;
    private String id_;
    private String method_;
    private String path_;
    private String protocol_;
    private String query_;
    private String reason_;
    private String scheme_;
    private long size_;
    private Timestamp time_;

    static {
        AttributeContext$Request attributeContext$Request;
        DEFAULT_INSTANCE = attributeContext$Request = new AttributeContext$Request();
        GeneratedMessageLite.registerDefaultInstance(AttributeContext$Request.class, attributeContext$Request);
    }

    private AttributeContext$Request() {
        Object object = MapFieldLite.emptyMapField();
        this.headers_ = object;
        this.id_ = object = "";
        this.method_ = object;
        this.path_ = object;
        this.host_ = object;
        this.scheme_ = object;
        this.query_ = object;
        this.protocol_ = object;
        this.reason_ = object;
    }

    public static /* synthetic */ AttributeContext$Request access$4900() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$5000(AttributeContext$Request attributeContext$Request, String string2) {
        attributeContext$Request.setId(string2);
    }

    public static /* synthetic */ void access$5100(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.clearId();
    }

    public static /* synthetic */ void access$5200(AttributeContext$Request attributeContext$Request, ByteString byteString) {
        attributeContext$Request.setIdBytes(byteString);
    }

    public static /* synthetic */ void access$5300(AttributeContext$Request attributeContext$Request, String string2) {
        attributeContext$Request.setMethod(string2);
    }

    public static /* synthetic */ void access$5400(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.clearMethod();
    }

    public static /* synthetic */ void access$5500(AttributeContext$Request attributeContext$Request, ByteString byteString) {
        attributeContext$Request.setMethodBytes(byteString);
    }

    public static /* synthetic */ Map access$5600(AttributeContext$Request attributeContext$Request) {
        return attributeContext$Request.getMutableHeadersMap();
    }

    public static /* synthetic */ void access$5700(AttributeContext$Request attributeContext$Request, String string2) {
        attributeContext$Request.setPath(string2);
    }

    public static /* synthetic */ void access$5800(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.clearPath();
    }

    public static /* synthetic */ void access$5900(AttributeContext$Request attributeContext$Request, ByteString byteString) {
        attributeContext$Request.setPathBytes(byteString);
    }

    public static /* synthetic */ void access$6000(AttributeContext$Request attributeContext$Request, String string2) {
        attributeContext$Request.setHost(string2);
    }

    public static /* synthetic */ void access$6100(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.clearHost();
    }

    public static /* synthetic */ void access$6200(AttributeContext$Request attributeContext$Request, ByteString byteString) {
        attributeContext$Request.setHostBytes(byteString);
    }

    public static /* synthetic */ void access$6300(AttributeContext$Request attributeContext$Request, String string2) {
        attributeContext$Request.setScheme(string2);
    }

    public static /* synthetic */ void access$6400(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.clearScheme();
    }

    public static /* synthetic */ void access$6500(AttributeContext$Request attributeContext$Request, ByteString byteString) {
        attributeContext$Request.setSchemeBytes(byteString);
    }

    public static /* synthetic */ void access$6600(AttributeContext$Request attributeContext$Request, String string2) {
        attributeContext$Request.setQuery(string2);
    }

    public static /* synthetic */ void access$6700(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.clearQuery();
    }

    public static /* synthetic */ void access$6800(AttributeContext$Request attributeContext$Request, ByteString byteString) {
        attributeContext$Request.setQueryBytes(byteString);
    }

    public static /* synthetic */ void access$6900(AttributeContext$Request attributeContext$Request, Timestamp timestamp) {
        attributeContext$Request.setTime(timestamp);
    }

    public static /* synthetic */ void access$7000(AttributeContext$Request attributeContext$Request, Timestamp timestamp) {
        attributeContext$Request.mergeTime(timestamp);
    }

    public static /* synthetic */ void access$7100(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.clearTime();
    }

    public static /* synthetic */ void access$7200(AttributeContext$Request attributeContext$Request, long l2) {
        attributeContext$Request.setSize(l2);
    }

    public static /* synthetic */ void access$7300(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.clearSize();
    }

    public static /* synthetic */ void access$7400(AttributeContext$Request attributeContext$Request, String string2) {
        attributeContext$Request.setProtocol(string2);
    }

    public static /* synthetic */ void access$7500(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.clearProtocol();
    }

    public static /* synthetic */ void access$7600(AttributeContext$Request attributeContext$Request, ByteString byteString) {
        attributeContext$Request.setProtocolBytes(byteString);
    }

    public static /* synthetic */ void access$7700(AttributeContext$Request attributeContext$Request, String string2) {
        attributeContext$Request.setReason(string2);
    }

    public static /* synthetic */ void access$7800(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.clearReason();
    }

    public static /* synthetic */ void access$7900(AttributeContext$Request attributeContext$Request, ByteString byteString) {
        attributeContext$Request.setReasonBytes(byteString);
    }

    public static /* synthetic */ void access$8000(AttributeContext$Request attributeContext$Request, AttributeContext$Auth attributeContext$Auth) {
        attributeContext$Request.setAuth(attributeContext$Auth);
    }

    public static /* synthetic */ void access$8100(AttributeContext$Request attributeContext$Request, AttributeContext$Auth attributeContext$Auth) {
        attributeContext$Request.mergeAuth(attributeContext$Auth);
    }

    public static /* synthetic */ void access$8200(AttributeContext$Request attributeContext$Request) {
        attributeContext$Request.clearAuth();
    }

    private void clearAuth() {
        this.auth_ = null;
    }

    private void clearHost() {
        String string2;
        this.host_ = string2 = AttributeContext$Request.getDefaultInstance().getHost();
    }

    private void clearId() {
        String string2;
        this.id_ = string2 = AttributeContext$Request.getDefaultInstance().getId();
    }

    private void clearMethod() {
        String string2;
        this.method_ = string2 = AttributeContext$Request.getDefaultInstance().getMethod();
    }

    private void clearPath() {
        String string2;
        this.path_ = string2 = AttributeContext$Request.getDefaultInstance().getPath();
    }

    private void clearProtocol() {
        String string2;
        this.protocol_ = string2 = AttributeContext$Request.getDefaultInstance().getProtocol();
    }

    private void clearQuery() {
        String string2;
        this.query_ = string2 = AttributeContext$Request.getDefaultInstance().getQuery();
    }

    private void clearReason() {
        String string2;
        this.reason_ = string2 = AttributeContext$Request.getDefaultInstance().getReason();
    }

    private void clearScheme() {
        String string2;
        this.scheme_ = string2 = AttributeContext$Request.getDefaultInstance().getScheme();
    }

    private void clearSize() {
        this.size_ = 0L;
    }

    private void clearTime() {
        this.time_ = null;
    }

    public static AttributeContext$Request getDefaultInstance() {
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

    private void mergeAuth(AttributeContext$Auth attributeContext$Auth) {
        AttributeContext$Auth attributeContext$Auth2;
        attributeContext$Auth.getClass();
        AttributeContext$AuthOrBuilder attributeContext$AuthOrBuilder = this.auth_;
        if (attributeContext$AuthOrBuilder != null && attributeContext$AuthOrBuilder != (attributeContext$Auth2 = AttributeContext$Auth.getDefaultInstance())) {
            attributeContext$AuthOrBuilder = AttributeContext$Auth.newBuilder(this.auth_);
            this.auth_ = attributeContext$Auth = (AttributeContext$Auth)((AttributeContext$Auth$Builder)((GeneratedMessageLite$Builder)((Object)attributeContext$AuthOrBuilder)).mergeFrom(attributeContext$Auth)).buildPartial();
        } else {
            this.auth_ = attributeContext$Auth;
        }
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

    public static AttributeContext$Request$Builder newBuilder() {
        return (AttributeContext$Request$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AttributeContext$Request$Builder newBuilder(AttributeContext$Request attributeContext$Request) {
        return (AttributeContext$Request$Builder)DEFAULT_INSTANCE.createBuilder(attributeContext$Request);
    }

    public static AttributeContext$Request parseDelimitedFrom(InputStream inputStream) {
        return (AttributeContext$Request)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Request parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Request)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Request parseFrom(ByteString byteString) {
        return (AttributeContext$Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AttributeContext$Request parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AttributeContext$Request parseFrom(CodedInputStream codedInputStream) {
        return (AttributeContext$Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AttributeContext$Request parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AttributeContext$Request parseFrom(InputStream inputStream) {
        return (AttributeContext$Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AttributeContext$Request parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AttributeContext$Request parseFrom(ByteBuffer byteBuffer) {
        return (AttributeContext$Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AttributeContext$Request parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AttributeContext$Request parseFrom(byte[] byArray) {
        return (AttributeContext$Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AttributeContext$Request parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AttributeContext$Request)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAuth(AttributeContext$Auth attributeContext$Auth) {
        attributeContext$Auth.getClass();
        this.auth_ = attributeContext$Auth;
    }

    private void setHost(String string2) {
        string2.getClass();
        this.host_ = string2;
    }

    private void setHostBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.host_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setId(String string2) {
        string2.getClass();
        this.id_ = string2;
    }

    private void setIdBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.id_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setMethod(String string2) {
        string2.getClass();
        this.method_ = string2;
    }

    private void setMethodBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.method_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setPath(String string2) {
        string2.getClass();
        this.path_ = string2;
    }

    private void setPathBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.path_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setProtocol(String string2) {
        string2.getClass();
        this.protocol_ = string2;
    }

    private void setProtocolBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.protocol_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setQuery(String string2) {
        string2.getClass();
        this.query_ = string2;
    }

    private void setQueryBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.query_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setReason(String string2) {
        string2.getClass();
        this.reason_ = string2;
    }

    private void setReasonBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.reason_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setScheme(String string2) {
        string2.getClass();
        this.scheme_ = string2;
    }

    private void setSchemeBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.scheme_ = object = ((ByteString)object).toStringUtf8();
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
                object = AttributeContext$Request.class;
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
                objectArray = new Object[13];
                objectArray[0] = "id_";
                objectArray[by2] = "method_";
                objectArray[2] = "headers_";
                objectArray[3] = object = AttributeContext$Request$HeadersDefaultEntryHolder.defaultEntry;
                objectArray[4] = "path_";
                objectArray[5] = "host_";
                objectArray[6] = "scheme_";
                objectArray[7] = "query_";
                objectArray[8] = "time_";
                objectArray[9] = "size_";
                objectArray[10] = "protocol_";
                objectArray[11] = "reason_";
                objectArray[12] = "auth_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\r\f\u0001\u0000\u0000\u0001\u0208\u0002\u0208\u00032\u0004\u0208\u0005\u0208\u0006\u0208\u0007\u0208\t\t\n\u0002\u000b\u0208\f\u0208\r\t", objectArray);
            }
            case 2: {
                return new AttributeContext$Request$Builder(null);
            }
            case 1: 
        }
        return new AttributeContext$Request();
    }

    public AttributeContext$Auth getAuth() {
        AttributeContext$Auth attributeContext$Auth = this.auth_;
        if (attributeContext$Auth == null) {
            attributeContext$Auth = AttributeContext$Auth.getDefaultInstance();
        }
        return attributeContext$Auth;
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

    public String getHost() {
        return this.host_;
    }

    public ByteString getHostBytes() {
        return ByteString.copyFromUtf8(this.host_);
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public String getMethod() {
        return this.method_;
    }

    public ByteString getMethodBytes() {
        return ByteString.copyFromUtf8(this.method_);
    }

    public String getPath() {
        return this.path_;
    }

    public ByteString getPathBytes() {
        return ByteString.copyFromUtf8(this.path_);
    }

    public String getProtocol() {
        return this.protocol_;
    }

    public ByteString getProtocolBytes() {
        return ByteString.copyFromUtf8(this.protocol_);
    }

    public String getQuery() {
        return this.query_;
    }

    public ByteString getQueryBytes() {
        return ByteString.copyFromUtf8(this.query_);
    }

    public String getReason() {
        return this.reason_;
    }

    public ByteString getReasonBytes() {
        return ByteString.copyFromUtf8(this.reason_);
    }

    public String getScheme() {
        return this.scheme_;
    }

    public ByteString getSchemeBytes() {
        return ByteString.copyFromUtf8(this.scheme_);
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

    public boolean hasAuth() {
        boolean bl2;
        AttributeContext$Auth attributeContext$Auth = this.auth_;
        if (attributeContext$Auth != null) {
            bl2 = true;
        } else {
            bl2 = false;
            attributeContext$Auth = null;
        }
        return bl2;
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

