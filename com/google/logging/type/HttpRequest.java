/*
 * Decompiled with CFR 0.152.
 */
package com.google.logging.type;

import com.google.logging.type.HttpRequest$1;
import com.google.logging.type.HttpRequest$Builder;
import com.google.logging.type.HttpRequestOrBuilder;
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

public final class HttpRequest
extends GeneratedMessageLite
implements HttpRequestOrBuilder {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    private static final HttpRequest DEFAULT_INSTANCE;
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile Parser PARSER;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private Duration latency_;
    private String protocol_;
    private String referer_;
    private String remoteIp_;
    private String requestMethod_;
    private long requestSize_;
    private String requestUrl_;
    private long responseSize_;
    private String serverIp_;
    private int status_;
    private String userAgent_;

    static {
        HttpRequest httpRequest;
        DEFAULT_INSTANCE = httpRequest = new HttpRequest();
        GeneratedMessageLite.registerDefaultInstance(HttpRequest.class, httpRequest);
    }

    private HttpRequest() {
        String string2;
        this.requestMethod_ = string2 = "";
        this.requestUrl_ = string2;
        this.userAgent_ = string2;
        this.remoteIp_ = string2;
        this.serverIp_ = string2;
        this.referer_ = string2;
        this.protocol_ = string2;
    }

    public static /* synthetic */ HttpRequest access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(HttpRequest httpRequest, String string2) {
        httpRequest.setRequestMethod(string2);
    }

    public static /* synthetic */ void access$1000(HttpRequest httpRequest) {
        httpRequest.clearStatus();
    }

    public static /* synthetic */ void access$1100(HttpRequest httpRequest, long l2) {
        httpRequest.setResponseSize(l2);
    }

    public static /* synthetic */ void access$1200(HttpRequest httpRequest) {
        httpRequest.clearResponseSize();
    }

    public static /* synthetic */ void access$1300(HttpRequest httpRequest, String string2) {
        httpRequest.setUserAgent(string2);
    }

    public static /* synthetic */ void access$1400(HttpRequest httpRequest) {
        httpRequest.clearUserAgent();
    }

    public static /* synthetic */ void access$1500(HttpRequest httpRequest, ByteString byteString) {
        httpRequest.setUserAgentBytes(byteString);
    }

    public static /* synthetic */ void access$1600(HttpRequest httpRequest, String string2) {
        httpRequest.setRemoteIp(string2);
    }

    public static /* synthetic */ void access$1700(HttpRequest httpRequest) {
        httpRequest.clearRemoteIp();
    }

    public static /* synthetic */ void access$1800(HttpRequest httpRequest, ByteString byteString) {
        httpRequest.setRemoteIpBytes(byteString);
    }

    public static /* synthetic */ void access$1900(HttpRequest httpRequest, String string2) {
        httpRequest.setServerIp(string2);
    }

    public static /* synthetic */ void access$200(HttpRequest httpRequest) {
        httpRequest.clearRequestMethod();
    }

    public static /* synthetic */ void access$2000(HttpRequest httpRequest) {
        httpRequest.clearServerIp();
    }

    public static /* synthetic */ void access$2100(HttpRequest httpRequest, ByteString byteString) {
        httpRequest.setServerIpBytes(byteString);
    }

    public static /* synthetic */ void access$2200(HttpRequest httpRequest, String string2) {
        httpRequest.setReferer(string2);
    }

    public static /* synthetic */ void access$2300(HttpRequest httpRequest) {
        httpRequest.clearReferer();
    }

    public static /* synthetic */ void access$2400(HttpRequest httpRequest, ByteString byteString) {
        httpRequest.setRefererBytes(byteString);
    }

    public static /* synthetic */ void access$2500(HttpRequest httpRequest, Duration duration) {
        httpRequest.setLatency(duration);
    }

    public static /* synthetic */ void access$2600(HttpRequest httpRequest, Duration duration) {
        httpRequest.mergeLatency(duration);
    }

    public static /* synthetic */ void access$2700(HttpRequest httpRequest) {
        httpRequest.clearLatency();
    }

    public static /* synthetic */ void access$2800(HttpRequest httpRequest, boolean bl2) {
        httpRequest.setCacheLookup(bl2);
    }

    public static /* synthetic */ void access$2900(HttpRequest httpRequest) {
        httpRequest.clearCacheLookup();
    }

    public static /* synthetic */ void access$300(HttpRequest httpRequest, ByteString byteString) {
        httpRequest.setRequestMethodBytes(byteString);
    }

    public static /* synthetic */ void access$3000(HttpRequest httpRequest, boolean bl2) {
        httpRequest.setCacheHit(bl2);
    }

    public static /* synthetic */ void access$3100(HttpRequest httpRequest) {
        httpRequest.clearCacheHit();
    }

    public static /* synthetic */ void access$3200(HttpRequest httpRequest, boolean bl2) {
        httpRequest.setCacheValidatedWithOriginServer(bl2);
    }

    public static /* synthetic */ void access$3300(HttpRequest httpRequest) {
        httpRequest.clearCacheValidatedWithOriginServer();
    }

    public static /* synthetic */ void access$3400(HttpRequest httpRequest, long l2) {
        httpRequest.setCacheFillBytes(l2);
    }

    public static /* synthetic */ void access$3500(HttpRequest httpRequest) {
        httpRequest.clearCacheFillBytes();
    }

    public static /* synthetic */ void access$3600(HttpRequest httpRequest, String string2) {
        httpRequest.setProtocol(string2);
    }

    public static /* synthetic */ void access$3700(HttpRequest httpRequest) {
        httpRequest.clearProtocol();
    }

    public static /* synthetic */ void access$3800(HttpRequest httpRequest, ByteString byteString) {
        httpRequest.setProtocolBytes(byteString);
    }

    public static /* synthetic */ void access$400(HttpRequest httpRequest, String string2) {
        httpRequest.setRequestUrl(string2);
    }

    public static /* synthetic */ void access$500(HttpRequest httpRequest) {
        httpRequest.clearRequestUrl();
    }

    public static /* synthetic */ void access$600(HttpRequest httpRequest, ByteString byteString) {
        httpRequest.setRequestUrlBytes(byteString);
    }

    public static /* synthetic */ void access$700(HttpRequest httpRequest, long l2) {
        httpRequest.setRequestSize(l2);
    }

    public static /* synthetic */ void access$800(HttpRequest httpRequest) {
        httpRequest.clearRequestSize();
    }

    public static /* synthetic */ void access$900(HttpRequest httpRequest, int n3) {
        httpRequest.setStatus(n3);
    }

    private void clearCacheFillBytes() {
        this.cacheFillBytes_ = 0L;
    }

    private void clearCacheHit() {
        this.cacheHit_ = false;
    }

    private void clearCacheLookup() {
        this.cacheLookup_ = false;
    }

    private void clearCacheValidatedWithOriginServer() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    private void clearLatency() {
        this.latency_ = null;
    }

    private void clearProtocol() {
        String string2;
        this.protocol_ = string2 = HttpRequest.getDefaultInstance().getProtocol();
    }

    private void clearReferer() {
        String string2;
        this.referer_ = string2 = HttpRequest.getDefaultInstance().getReferer();
    }

    private void clearRemoteIp() {
        String string2;
        this.remoteIp_ = string2 = HttpRequest.getDefaultInstance().getRemoteIp();
    }

    private void clearRequestMethod() {
        String string2;
        this.requestMethod_ = string2 = HttpRequest.getDefaultInstance().getRequestMethod();
    }

    private void clearRequestSize() {
        this.requestSize_ = 0L;
    }

    private void clearRequestUrl() {
        String string2;
        this.requestUrl_ = string2 = HttpRequest.getDefaultInstance().getRequestUrl();
    }

    private void clearResponseSize() {
        this.responseSize_ = 0L;
    }

    private void clearServerIp() {
        String string2;
        this.serverIp_ = string2 = HttpRequest.getDefaultInstance().getServerIp();
    }

    private void clearStatus() {
        this.status_ = 0;
    }

    private void clearUserAgent() {
        String string2;
        this.userAgent_ = string2 = HttpRequest.getDefaultInstance().getUserAgent();
    }

    public static HttpRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLatency(Duration duration) {
        Duration duration2;
        duration.getClass();
        DurationOrBuilder durationOrBuilder = this.latency_;
        if (durationOrBuilder != null && durationOrBuilder != (duration2 = Duration.getDefaultInstance())) {
            durationOrBuilder = Duration.newBuilder(this.latency_);
            this.latency_ = duration = (Duration)((Duration$Builder)((GeneratedMessageLite$Builder)((Object)durationOrBuilder)).mergeFrom(duration)).buildPartial();
        } else {
            this.latency_ = duration;
        }
    }

    public static HttpRequest$Builder newBuilder() {
        return (HttpRequest$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpRequest$Builder newBuilder(HttpRequest httpRequest) {
        return (HttpRequest$Builder)DEFAULT_INSTANCE.createBuilder(httpRequest);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream) {
        return (HttpRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRequest)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(ByteString byteString) {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static HttpRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream) {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(InputStream inputStream) {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer) {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static HttpRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static HttpRequest parseFrom(byte[] byArray) {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static HttpRequest parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCacheFillBytes(long l2) {
        this.cacheFillBytes_ = l2;
    }

    private void setCacheHit(boolean bl2) {
        this.cacheHit_ = bl2;
    }

    private void setCacheLookup(boolean bl2) {
        this.cacheLookup_ = bl2;
    }

    private void setCacheValidatedWithOriginServer(boolean bl2) {
        this.cacheValidatedWithOriginServer_ = bl2;
    }

    private void setLatency(Duration duration) {
        duration.getClass();
        this.latency_ = duration;
    }

    private void setProtocol(String string2) {
        string2.getClass();
        this.protocol_ = string2;
    }

    private void setProtocolBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.protocol_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setReferer(String string2) {
        string2.getClass();
        this.referer_ = string2;
    }

    private void setRefererBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.referer_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setRemoteIp(String string2) {
        string2.getClass();
        this.remoteIp_ = string2;
    }

    private void setRemoteIpBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.remoteIp_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setRequestMethod(String string2) {
        string2.getClass();
        this.requestMethod_ = string2;
    }

    private void setRequestMethodBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.requestMethod_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setRequestSize(long l2) {
        this.requestSize_ = l2;
    }

    private void setRequestUrl(String string2) {
        string2.getClass();
        this.requestUrl_ = string2;
    }

    private void setRequestUrlBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.requestUrl_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setResponseSize(long l2) {
        this.responseSize_ = l2;
    }

    private void setServerIp(String string2) {
        string2.getClass();
        this.serverIp_ = string2;
    }

    private void setServerIpBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.serverIp_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setStatus(int n3) {
        this.status_ = n3;
    }

    private void setUserAgent(String string2) {
        string2.getClass();
        this.userAgent_ = string2;
    }

    private void setUserAgentBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.userAgent_ = object = ((ByteString)object).toStringUtf8();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = HttpRequest$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = HttpRequest.class;
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
                objectArray = new Object[15];
                objectArray[0] = "requestMethod_";
                objectArray[by2] = "requestUrl_";
                objectArray[2] = "requestSize_";
                objectArray[3] = "status_";
                objectArray[4] = "responseSize_";
                objectArray[5] = "userAgent_";
                objectArray[6] = "remoteIp_";
                objectArray[7] = "referer_";
                objectArray[8] = "cacheHit_";
                objectArray[9] = "cacheValidatedWithOriginServer_";
                objectArray[10] = "cacheLookup_";
                objectArray[11] = "cacheFillBytes_";
                objectArray[12] = "serverIp_";
                objectArray[13] = "latency_";
                objectArray[14] = "protocol_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0004\u0005\u0002\u0006\u0208\u0007\u0208\b\u0208\t\u0007\n\u0007\u000b\u0007\f\u0002\r\u0208\u000e\t\u000f\u0208", objectArray);
            }
            case 2: {
                return new HttpRequest$Builder(null);
            }
            case 1: 
        }
        return new HttpRequest();
    }

    public long getCacheFillBytes() {
        return this.cacheFillBytes_;
    }

    public boolean getCacheHit() {
        return this.cacheHit_;
    }

    public boolean getCacheLookup() {
        return this.cacheLookup_;
    }

    public boolean getCacheValidatedWithOriginServer() {
        return this.cacheValidatedWithOriginServer_;
    }

    public Duration getLatency() {
        Duration duration = this.latency_;
        if (duration == null) {
            duration = Duration.getDefaultInstance();
        }
        return duration;
    }

    public String getProtocol() {
        return this.protocol_;
    }

    public ByteString getProtocolBytes() {
        return ByteString.copyFromUtf8(this.protocol_);
    }

    public String getReferer() {
        return this.referer_;
    }

    public ByteString getRefererBytes() {
        return ByteString.copyFromUtf8(this.referer_);
    }

    public String getRemoteIp() {
        return this.remoteIp_;
    }

    public ByteString getRemoteIpBytes() {
        return ByteString.copyFromUtf8(this.remoteIp_);
    }

    public String getRequestMethod() {
        return this.requestMethod_;
    }

    public ByteString getRequestMethodBytes() {
        return ByteString.copyFromUtf8(this.requestMethod_);
    }

    public long getRequestSize() {
        return this.requestSize_;
    }

    public String getRequestUrl() {
        return this.requestUrl_;
    }

    public ByteString getRequestUrlBytes() {
        return ByteString.copyFromUtf8(this.requestUrl_);
    }

    public long getResponseSize() {
        return this.responseSize_;
    }

    public String getServerIp() {
        return this.serverIp_;
    }

    public ByteString getServerIpBytes() {
        return ByteString.copyFromUtf8(this.serverIp_);
    }

    public int getStatus() {
        return this.status_;
    }

    public String getUserAgent() {
        return this.userAgent_;
    }

    public ByteString getUserAgentBytes() {
        return ByteString.copyFromUtf8(this.userAgent_);
    }

    public boolean hasLatency() {
        boolean bl2;
        Duration duration = this.latency_;
        if (duration != null) {
            bl2 = true;
        } else {
            bl2 = false;
            duration = null;
        }
        return bl2;
    }
}

