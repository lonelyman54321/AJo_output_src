/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.NetworkRequestMetric$1;
import com.google.firebase.perf.v1.NetworkRequestMetric$Builder;
import com.google.firebase.perf.v1.NetworkRequestMetric$CustomAttributesDefaultEntryHolder;
import com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod;
import com.google.firebase.perf.v1.NetworkRequestMetric$NetworkClientErrorReason;
import com.google.firebase.perf.v1.NetworkRequestMetricOrBuilder;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.PerfSessionOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NetworkRequestMetric
extends GeneratedMessageLite
implements NetworkRequestMetricOrBuilder {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile Parser PARSER;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite customAttributes_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private Internal$ProtobufList perfSessions_;
    private long requestPayloadBytes_;
    private String responseContentType_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_;

    static {
        NetworkRequestMetric networkRequestMetric;
        DEFAULT_INSTANCE = networkRequestMetric = new NetworkRequestMetric();
        GeneratedMessageLite.registerDefaultInstance(NetworkRequestMetric.class, networkRequestMetric);
    }

    private NetworkRequestMetric() {
        Object object = MapFieldLite.emptyMapField();
        this.customAttributes_ = object;
        this.url_ = object = "";
        this.responseContentType_ = object;
        this.perfSessions_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ NetworkRequestMetric access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(NetworkRequestMetric networkRequestMetric, String string2) {
        networkRequestMetric.setUrl(string2);
    }

    public static /* synthetic */ void access$1000(NetworkRequestMetric networkRequestMetric, NetworkRequestMetric$NetworkClientErrorReason networkRequestMetric$NetworkClientErrorReason) {
        networkRequestMetric.setNetworkClientErrorReason(networkRequestMetric$NetworkClientErrorReason);
    }

    public static /* synthetic */ void access$1100(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearNetworkClientErrorReason();
    }

    public static /* synthetic */ void access$1200(NetworkRequestMetric networkRequestMetric, int n3) {
        networkRequestMetric.setHttpResponseCode(n3);
    }

    public static /* synthetic */ void access$1300(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearHttpResponseCode();
    }

    public static /* synthetic */ void access$1400(NetworkRequestMetric networkRequestMetric, String string2) {
        networkRequestMetric.setResponseContentType(string2);
    }

    public static /* synthetic */ void access$1500(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearResponseContentType();
    }

    public static /* synthetic */ void access$1600(NetworkRequestMetric networkRequestMetric, ByteString byteString) {
        networkRequestMetric.setResponseContentTypeBytes(byteString);
    }

    public static /* synthetic */ void access$1700(NetworkRequestMetric networkRequestMetric, long l2) {
        networkRequestMetric.setClientStartTimeUs(l2);
    }

    public static /* synthetic */ void access$1800(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearClientStartTimeUs();
    }

    public static /* synthetic */ void access$1900(NetworkRequestMetric networkRequestMetric, long l2) {
        networkRequestMetric.setTimeToRequestCompletedUs(l2);
    }

    public static /* synthetic */ void access$200(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearUrl();
    }

    public static /* synthetic */ void access$2000(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearTimeToRequestCompletedUs();
    }

    public static /* synthetic */ void access$2100(NetworkRequestMetric networkRequestMetric, long l2) {
        networkRequestMetric.setTimeToResponseInitiatedUs(l2);
    }

    public static /* synthetic */ void access$2200(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearTimeToResponseInitiatedUs();
    }

    public static /* synthetic */ void access$2300(NetworkRequestMetric networkRequestMetric, long l2) {
        networkRequestMetric.setTimeToResponseCompletedUs(l2);
    }

    public static /* synthetic */ void access$2400(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearTimeToResponseCompletedUs();
    }

    public static /* synthetic */ Map access$2500(NetworkRequestMetric networkRequestMetric) {
        return networkRequestMetric.getMutableCustomAttributesMap();
    }

    public static /* synthetic */ void access$2600(NetworkRequestMetric networkRequestMetric, int n3, PerfSession perfSession) {
        networkRequestMetric.setPerfSessions(n3, perfSession);
    }

    public static /* synthetic */ void access$2700(NetworkRequestMetric networkRequestMetric, PerfSession perfSession) {
        networkRequestMetric.addPerfSessions(perfSession);
    }

    public static /* synthetic */ void access$2800(NetworkRequestMetric networkRequestMetric, int n3, PerfSession perfSession) {
        networkRequestMetric.addPerfSessions(n3, perfSession);
    }

    public static /* synthetic */ void access$2900(NetworkRequestMetric networkRequestMetric, Iterable iterable) {
        networkRequestMetric.addAllPerfSessions(iterable);
    }

    public static /* synthetic */ void access$300(NetworkRequestMetric networkRequestMetric, ByteString byteString) {
        networkRequestMetric.setUrlBytes(byteString);
    }

    public static /* synthetic */ void access$3000(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearPerfSessions();
    }

    public static /* synthetic */ void access$3100(NetworkRequestMetric networkRequestMetric, int n3) {
        networkRequestMetric.removePerfSessions(n3);
    }

    public static /* synthetic */ void access$400(NetworkRequestMetric networkRequestMetric, NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethod) {
        networkRequestMetric.setHttpMethod(networkRequestMetric$HttpMethod);
    }

    public static /* synthetic */ void access$500(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearHttpMethod();
    }

    public static /* synthetic */ void access$600(NetworkRequestMetric networkRequestMetric, long l2) {
        networkRequestMetric.setRequestPayloadBytes(l2);
    }

    public static /* synthetic */ void access$700(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearRequestPayloadBytes();
    }

    public static /* synthetic */ void access$800(NetworkRequestMetric networkRequestMetric, long l2) {
        networkRequestMetric.setResponsePayloadBytes(l2);
    }

    public static /* synthetic */ void access$900(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.clearResponsePayloadBytes();
    }

    private void addAllPerfSessions(Iterable iterable) {
        this.ensurePerfSessionsIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.perfSessions_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addPerfSessions(int n3, PerfSession perfSession) {
        perfSession.getClass();
        this.ensurePerfSessionsIsMutable();
        this.perfSessions_.add(n3, perfSession);
    }

    private void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        this.ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    private void clearClientStartTimeUs() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFF7F;
        this.clientStartTimeUs_ = 0L;
    }

    private void clearHttpMethod() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFD;
        this.httpMethod_ = 0;
    }

    private void clearHttpResponseCode() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFDF;
        this.httpResponseCode_ = 0;
    }

    private void clearNetworkClientErrorReason() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFEF;
        this.networkClientErrorReason_ = 0;
    }

    private void clearPerfSessions() {
        Internal$ProtobufList internal$ProtobufList;
        this.perfSessions_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequestPayloadBytes() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFB;
        this.requestPayloadBytes_ = 0L;
    }

    private void clearResponseContentType() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFBF;
        this.responseContentType_ = string2 = NetworkRequestMetric.getDefaultInstance().getResponseContentType();
    }

    private void clearResponsePayloadBytes() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFF7;
        this.responsePayloadBytes_ = 0L;
    }

    private void clearTimeToRequestCompletedUs() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFEFF;
        this.timeToRequestCompletedUs_ = 0L;
    }

    private void clearTimeToResponseCompletedUs() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFBFF;
        this.timeToResponseCompletedUs_ = 0L;
    }

    private void clearTimeToResponseInitiatedUs() {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFDFF;
        this.timeToResponseInitiatedUs_ = 0L;
    }

    private void clearUrl() {
        String string2;
        int n3;
        this.bitField0_ = n3 = this.bitField0_ & 0xFFFFFFFE;
        this.url_ = string2 = NetworkRequestMetric.getDefaultInstance().getUrl();
    }

    private void ensurePerfSessionsIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.perfSessions_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.perfSessions_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static NetworkRequestMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map getMutableCustomAttributesMap() {
        return this.internalGetMutableCustomAttributes();
    }

    private MapFieldLite internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private MapFieldLite internalGetMutableCustomAttributes() {
        MapFieldLite mapFieldLite = this.customAttributes_;
        boolean bl2 = mapFieldLite.isMutable();
        if (!bl2) {
            this.customAttributes_ = mapFieldLite = this.customAttributes_.mutableCopy();
        }
        return this.customAttributes_;
    }

    public static NetworkRequestMetric$Builder newBuilder() {
        return (NetworkRequestMetric$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static NetworkRequestMetric$Builder newBuilder(NetworkRequestMetric networkRequestMetric) {
        return (NetworkRequestMetric$Builder)DEFAULT_INSTANCE.createBuilder(networkRequestMetric);
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NetworkRequestMetric parseFrom(ByteString byteString) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static NetworkRequestMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static NetworkRequestMetric parseFrom(CodedInputStream codedInputStream) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static NetworkRequestMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static NetworkRequestMetric parseFrom(byte[] byArray) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static NetworkRequestMetric parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (NetworkRequestMetric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePerfSessions(int n3) {
        this.ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(n3);
    }

    private void setClientStartTimeUs(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x80;
        this.clientStartTimeUs_ = l2;
    }

    private void setHttpMethod(NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethod) {
        int n3;
        this.httpMethod_ = n3 = networkRequestMetric$HttpMethod.getNumber();
        this.bitField0_ = n3 = this.bitField0_ | 2;
    }

    private void setHttpResponseCode(int n3) {
        int n4;
        this.bitField0_ = n4 = this.bitField0_ | 0x20;
        this.httpResponseCode_ = n3;
    }

    private void setNetworkClientErrorReason(NetworkRequestMetric$NetworkClientErrorReason networkRequestMetric$NetworkClientErrorReason) {
        int n3;
        this.networkClientErrorReason_ = n3 = networkRequestMetric$NetworkClientErrorReason.getNumber();
        this.bitField0_ = n3 = this.bitField0_ | 0x10;
    }

    private void setPerfSessions(int n3, PerfSession perfSession) {
        perfSession.getClass();
        this.ensurePerfSessionsIsMutable();
        this.perfSessions_.set(n3, perfSession);
    }

    private void setRequestPayloadBytes(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 4;
        this.requestPayloadBytes_ = l2;
    }

    private void setResponseContentType(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 0x40;
        this.responseContentType_ = string2;
    }

    private void setResponseContentTypeBytes(ByteString object) {
        int n3;
        this.responseContentType_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 0x40;
    }

    private void setResponsePayloadBytes(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 8;
        this.responsePayloadBytes_ = l2;
    }

    private void setTimeToRequestCompletedUs(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x100;
        this.timeToRequestCompletedUs_ = l2;
    }

    private void setTimeToResponseCompletedUs(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x400;
        this.timeToResponseCompletedUs_ = l2;
    }

    private void setTimeToResponseInitiatedUs(long l2) {
        int n3;
        this.bitField0_ = n3 = this.bitField0_ | 0x200;
        this.timeToResponseInitiatedUs_ = l2;
    }

    private void setUrl(String string2) {
        int n3;
        string2.getClass();
        this.bitField0_ = n3 = this.bitField0_ | 1;
        this.url_ = string2;
    }

    private void setUrlBytes(ByteString object) {
        int n3;
        this.url_ = object = ((ByteString)object).toStringUtf8();
        this.bitField0_ = n3 = this.bitField0_ | 1;
    }

    public boolean containsCustomAttributes(String string2) {
        string2.getClass();
        return ((AbstractMap)this.internalGetCustomAttributes()).containsKey(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke object, Object clazz, Object object2) {
        byte by2 = 1;
        object2 = NetworkRequestMetric$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = NetworkRequestMetric.class;
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
                object = NetworkRequestMetric$HttpMethod.internalGetVerifier();
                object2 = NetworkRequestMetric$NetworkClientErrorReason.internalGetVerifier();
                Object[] objectArray = new Object[18];
                objectArray[0] = "bitField0_";
                objectArray[by2] = "url_";
                objectArray[2] = "httpMethod_";
                objectArray[3] = object;
                objectArray[4] = "requestPayloadBytes_";
                objectArray[5] = "responsePayloadBytes_";
                objectArray[6] = "httpResponseCode_";
                objectArray[7] = "responseContentType_";
                objectArray[8] = "clientStartTimeUs_";
                objectArray[9] = "timeToRequestCompletedUs_";
                objectArray[10] = "timeToResponseInitiatedUs_";
                objectArray[11] = "timeToResponseCompletedUs_";
                objectArray[12] = "networkClientErrorReason_";
                objectArray[13] = object2;
                objectArray[14] = "customAttributes_";
                object = NetworkRequestMetric$CustomAttributesDefaultEntryHolder.defaultEntry;
                objectArray[15] = object;
                objectArray[16] = "perfSessions_";
                objectArray[17] = PerfSession.class;
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001\u1008\u0000\u0002\u180c\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1004\u0005\u0006\u1008\u0006\u0007\u1002\u0007\b\u1002\b\t\u1002\t\n\u1002\n\u000b\u180c\u0004\f2\r\u001b", objectArray);
            }
            case 2: {
                return new NetworkRequestMetric$Builder(null);
            }
            case 1: 
        }
        return new NetworkRequestMetric();
    }

    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    public Map getCustomAttributes() {
        return this.getCustomAttributesMap();
    }

    public int getCustomAttributesCount() {
        return ((AbstractMap)this.internalGetCustomAttributes()).size();
    }

    public Map getCustomAttributesMap() {
        return Collections.unmodifiableMap(this.internalGetCustomAttributes());
    }

    public String getCustomAttributesOrDefault(String string2, String string3) {
        string2.getClass();
        MapFieldLite mapFieldLite = this.internalGetCustomAttributes();
        boolean bl2 = mapFieldLite.containsKey(string2);
        if (bl2) {
            string3 = string2 = mapFieldLite.get(string2);
            string3 = string2;
        }
        return string3;
    }

    public String getCustomAttributesOrThrow(String object) {
        object.getClass();
        MapFieldLite mapFieldLite = this.internalGetCustomAttributes();
        boolean bl2 = mapFieldLite.containsKey(object);
        if (bl2) {
            return (String)mapFieldLite.get(object);
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public NetworkRequestMetric$HttpMethod getHttpMethod() {
        int n3 = this.httpMethod_;
        NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.forNumber(n3);
        if (networkRequestMetric$HttpMethod == null) {
            networkRequestMetric$HttpMethod = NetworkRequestMetric$HttpMethod.HTTP_METHOD_UNKNOWN;
        }
        return networkRequestMetric$HttpMethod;
    }

    public int getHttpResponseCode() {
        return this.httpResponseCode_;
    }

    public NetworkRequestMetric$NetworkClientErrorReason getNetworkClientErrorReason() {
        int n3 = this.networkClientErrorReason_;
        NetworkRequestMetric$NetworkClientErrorReason networkRequestMetric$NetworkClientErrorReason = NetworkRequestMetric$NetworkClientErrorReason.forNumber(n3);
        if (networkRequestMetric$NetworkClientErrorReason == null) {
            networkRequestMetric$NetworkClientErrorReason = NetworkRequestMetric$NetworkClientErrorReason.NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }
        return networkRequestMetric$NetworkClientErrorReason;
    }

    public PerfSession getPerfSessions(int n3) {
        return (PerfSession)this.perfSessions_.get(n3);
    }

    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    public List getPerfSessionsList() {
        return this.perfSessions_;
    }

    public PerfSessionOrBuilder getPerfSessionsOrBuilder(int n3) {
        return (PerfSessionOrBuilder)this.perfSessions_.get(n3);
    }

    public List getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public long getRequestPayloadBytes() {
        return this.requestPayloadBytes_;
    }

    public String getResponseContentType() {
        return this.responseContentType_;
    }

    public ByteString getResponseContentTypeBytes() {
        return ByteString.copyFromUtf8(this.responseContentType_);
    }

    public long getResponsePayloadBytes() {
        return this.responsePayloadBytes_;
    }

    public long getTimeToRequestCompletedUs() {
        return this.timeToRequestCompletedUs_;
    }

    public long getTimeToResponseCompletedUs() {
        return this.timeToResponseCompletedUs_;
    }

    public long getTimeToResponseInitiatedUs() {
        return this.timeToResponseInitiatedUs_;
    }

    public String getUrl() {
        return this.url_;
    }

    public ByteString getUrlBytes() {
        return ByteString.copyFromUtf8(this.url_);
    }

    public boolean hasClientStartTimeUs() {
        int n3 = this.bitField0_ & 0x80;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasHttpMethod() {
        int n3 = this.bitField0_ & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasHttpResponseCode() {
        int n3 = this.bitField0_ & 0x20;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasNetworkClientErrorReason() {
        int n3 = this.bitField0_ & 0x10;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasRequestPayloadBytes() {
        int n3 = this.bitField0_ & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasResponseContentType() {
        int n3 = this.bitField0_ & 0x40;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasResponsePayloadBytes() {
        int n3 = this.bitField0_ & 8;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasTimeToRequestCompletedUs() {
        int n3 = this.bitField0_ & 0x100;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasTimeToResponseCompletedUs() {
        int n3 = this.bitField0_ & 0x400;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasTimeToResponseInitiatedUs() {
        int n3 = this.bitField0_ & 0x200;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean hasUrl() {
        int n3 = this.bitField0_;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }
}

