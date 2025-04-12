/*
 * Decompiled with CFR 0.152.
 */
package com.google.cloud.audit;

import com.google.cloud.audit.AuditLog$1;
import com.google.cloud.audit.AuditLog$Builder;
import com.google.cloud.audit.AuditLogOrBuilder;
import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.AuthenticationInfo$Builder;
import com.google.cloud.audit.AuthenticationInfoOrBuilder;
import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.AuthorizationInfoOrBuilder;
import com.google.cloud.audit.RequestMetadata;
import com.google.cloud.audit.RequestMetadata$Builder;
import com.google.cloud.audit.RequestMetadataOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.Internal$ProtobufList;
import com.google.protobuf.Parser;
import com.google.protobuf.Struct;
import com.google.protobuf.Struct$Builder;
import com.google.protobuf.StructOrBuilder;
import com.google.rpc.Status;
import com.google.rpc.Status$Builder;
import com.google.rpc.StatusOrBuilder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public final class AuditLog
extends GeneratedMessageLite
implements AuditLogOrBuilder {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    private static final AuditLog DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile Parser PARSER;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private AuthenticationInfo authenticationInfo_;
    private Internal$ProtobufList authorizationInfo_;
    private String methodName_;
    private long numResponseItems_;
    private RequestMetadata requestMetadata_;
    private Struct request_;
    private String resourceName_;
    private Struct response_;
    private Any serviceData_;
    private String serviceName_;
    private Status status_;

    static {
        AuditLog auditLog;
        DEFAULT_INSTANCE = auditLog = new AuditLog();
        GeneratedMessageLite.registerDefaultInstance(AuditLog.class, auditLog);
    }

    private AuditLog() {
        Object object = "";
        this.serviceName_ = object;
        this.methodName_ = object;
        this.resourceName_ = object;
        this.authorizationInfo_ = object = GeneratedMessageLite.emptyProtobufList();
    }

    public static /* synthetic */ AuditLog access$000() {
        return DEFAULT_INSTANCE;
    }

    public static /* synthetic */ void access$100(AuditLog auditLog, String string2) {
        auditLog.setServiceName(string2);
    }

    public static /* synthetic */ void access$1000(AuditLog auditLog, long l2) {
        auditLog.setNumResponseItems(l2);
    }

    public static /* synthetic */ void access$1100(AuditLog auditLog) {
        auditLog.clearNumResponseItems();
    }

    public static /* synthetic */ void access$1200(AuditLog auditLog, Status status) {
        auditLog.setStatus(status);
    }

    public static /* synthetic */ void access$1300(AuditLog auditLog, Status status) {
        auditLog.mergeStatus(status);
    }

    public static /* synthetic */ void access$1400(AuditLog auditLog) {
        auditLog.clearStatus();
    }

    public static /* synthetic */ void access$1500(AuditLog auditLog, AuthenticationInfo authenticationInfo) {
        auditLog.setAuthenticationInfo(authenticationInfo);
    }

    public static /* synthetic */ void access$1600(AuditLog auditLog, AuthenticationInfo authenticationInfo) {
        auditLog.mergeAuthenticationInfo(authenticationInfo);
    }

    public static /* synthetic */ void access$1700(AuditLog auditLog) {
        auditLog.clearAuthenticationInfo();
    }

    public static /* synthetic */ void access$1800(AuditLog auditLog, int n3, AuthorizationInfo authorizationInfo) {
        auditLog.setAuthorizationInfo(n3, authorizationInfo);
    }

    public static /* synthetic */ void access$1900(AuditLog auditLog, AuthorizationInfo authorizationInfo) {
        auditLog.addAuthorizationInfo(authorizationInfo);
    }

    public static /* synthetic */ void access$200(AuditLog auditLog) {
        auditLog.clearServiceName();
    }

    public static /* synthetic */ void access$2000(AuditLog auditLog, int n3, AuthorizationInfo authorizationInfo) {
        auditLog.addAuthorizationInfo(n3, authorizationInfo);
    }

    public static /* synthetic */ void access$2100(AuditLog auditLog, Iterable iterable) {
        auditLog.addAllAuthorizationInfo(iterable);
    }

    public static /* synthetic */ void access$2200(AuditLog auditLog) {
        auditLog.clearAuthorizationInfo();
    }

    public static /* synthetic */ void access$2300(AuditLog auditLog, int n3) {
        auditLog.removeAuthorizationInfo(n3);
    }

    public static /* synthetic */ void access$2400(AuditLog auditLog, RequestMetadata requestMetadata) {
        auditLog.setRequestMetadata(requestMetadata);
    }

    public static /* synthetic */ void access$2500(AuditLog auditLog, RequestMetadata requestMetadata) {
        auditLog.mergeRequestMetadata(requestMetadata);
    }

    public static /* synthetic */ void access$2600(AuditLog auditLog) {
        auditLog.clearRequestMetadata();
    }

    public static /* synthetic */ void access$2700(AuditLog auditLog, Struct struct) {
        auditLog.setRequest(struct);
    }

    public static /* synthetic */ void access$2800(AuditLog auditLog, Struct struct) {
        auditLog.mergeRequest(struct);
    }

    public static /* synthetic */ void access$2900(AuditLog auditLog) {
        auditLog.clearRequest();
    }

    public static /* synthetic */ void access$300(AuditLog auditLog, ByteString byteString) {
        auditLog.setServiceNameBytes(byteString);
    }

    public static /* synthetic */ void access$3000(AuditLog auditLog, Struct struct) {
        auditLog.setResponse(struct);
    }

    public static /* synthetic */ void access$3100(AuditLog auditLog, Struct struct) {
        auditLog.mergeResponse(struct);
    }

    public static /* synthetic */ void access$3200(AuditLog auditLog) {
        auditLog.clearResponse();
    }

    public static /* synthetic */ void access$3300(AuditLog auditLog, Any any) {
        auditLog.setServiceData(any);
    }

    public static /* synthetic */ void access$3400(AuditLog auditLog, Any any) {
        auditLog.mergeServiceData(any);
    }

    public static /* synthetic */ void access$3500(AuditLog auditLog) {
        auditLog.clearServiceData();
    }

    public static /* synthetic */ void access$400(AuditLog auditLog, String string2) {
        auditLog.setMethodName(string2);
    }

    public static /* synthetic */ void access$500(AuditLog auditLog) {
        auditLog.clearMethodName();
    }

    public static /* synthetic */ void access$600(AuditLog auditLog, ByteString byteString) {
        auditLog.setMethodNameBytes(byteString);
    }

    public static /* synthetic */ void access$700(AuditLog auditLog, String string2) {
        auditLog.setResourceName(string2);
    }

    public static /* synthetic */ void access$800(AuditLog auditLog) {
        auditLog.clearResourceName();
    }

    public static /* synthetic */ void access$900(AuditLog auditLog, ByteString byteString) {
        auditLog.setResourceNameBytes(byteString);
    }

    private void addAllAuthorizationInfo(Iterable iterable) {
        this.ensureAuthorizationInfoIsMutable();
        Internal$ProtobufList internal$ProtobufList = this.authorizationInfo_;
        AbstractMessageLite.addAll(iterable, internal$ProtobufList);
    }

    private void addAuthorizationInfo(int n3, AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        this.ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(n3, authorizationInfo);
    }

    private void addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        this.ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(authorizationInfo);
    }

    private void clearAuthenticationInfo() {
        this.authenticationInfo_ = null;
    }

    private void clearAuthorizationInfo() {
        Internal$ProtobufList internal$ProtobufList;
        this.authorizationInfo_ = internal$ProtobufList = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMethodName() {
        String string2;
        this.methodName_ = string2 = AuditLog.getDefaultInstance().getMethodName();
    }

    private void clearNumResponseItems() {
        this.numResponseItems_ = 0L;
    }

    private void clearRequest() {
        this.request_ = null;
    }

    private void clearRequestMetadata() {
        this.requestMetadata_ = null;
    }

    private void clearResourceName() {
        String string2;
        this.resourceName_ = string2 = AuditLog.getDefaultInstance().getResourceName();
    }

    private void clearResponse() {
        this.response_ = null;
    }

    private void clearServiceData() {
        this.serviceData_ = null;
    }

    private void clearServiceName() {
        String string2;
        this.serviceName_ = string2 = AuditLog.getDefaultInstance().getServiceName();
    }

    private void clearStatus() {
        this.status_ = null;
    }

    private void ensureAuthorizationInfoIsMutable() {
        Internal$ProtobufList internal$ProtobufList = this.authorizationInfo_;
        boolean bl2 = internal$ProtobufList.isModifiable();
        if (!bl2) {
            this.authorizationInfo_ = internal$ProtobufList = GeneratedMessageLite.mutableCopy(internal$ProtobufList);
        }
    }

    public static AuditLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        AuthenticationInfo authenticationInfo2;
        authenticationInfo.getClass();
        AuthenticationInfoOrBuilder authenticationInfoOrBuilder = this.authenticationInfo_;
        if (authenticationInfoOrBuilder != null && authenticationInfoOrBuilder != (authenticationInfo2 = AuthenticationInfo.getDefaultInstance())) {
            authenticationInfoOrBuilder = AuthenticationInfo.newBuilder(this.authenticationInfo_);
            this.authenticationInfo_ = authenticationInfo = (AuthenticationInfo)((AuthenticationInfo$Builder)((GeneratedMessageLite$Builder)((Object)authenticationInfoOrBuilder)).mergeFrom(authenticationInfo)).buildPartial();
        } else {
            this.authenticationInfo_ = authenticationInfo;
        }
    }

    private void mergeRequest(Struct struct) {
        Struct struct2;
        struct.getClass();
        StructOrBuilder structOrBuilder = this.request_;
        if (structOrBuilder != null && structOrBuilder != (struct2 = Struct.getDefaultInstance())) {
            structOrBuilder = Struct.newBuilder(this.request_);
            this.request_ = struct = (Struct)((Struct$Builder)((GeneratedMessageLite$Builder)((Object)structOrBuilder)).mergeFrom(struct)).buildPartial();
        } else {
            this.request_ = struct;
        }
    }

    private void mergeRequestMetadata(RequestMetadata requestMetadata) {
        RequestMetadata requestMetadata2;
        requestMetadata.getClass();
        RequestMetadataOrBuilder requestMetadataOrBuilder = this.requestMetadata_;
        if (requestMetadataOrBuilder != null && requestMetadataOrBuilder != (requestMetadata2 = RequestMetadata.getDefaultInstance())) {
            requestMetadataOrBuilder = RequestMetadata.newBuilder(this.requestMetadata_);
            this.requestMetadata_ = requestMetadata = (RequestMetadata)((RequestMetadata$Builder)((GeneratedMessageLite$Builder)((Object)requestMetadataOrBuilder)).mergeFrom(requestMetadata)).buildPartial();
        } else {
            this.requestMetadata_ = requestMetadata;
        }
    }

    private void mergeResponse(Struct struct) {
        Struct struct2;
        struct.getClass();
        StructOrBuilder structOrBuilder = this.response_;
        if (structOrBuilder != null && structOrBuilder != (struct2 = Struct.getDefaultInstance())) {
            structOrBuilder = Struct.newBuilder(this.response_);
            this.response_ = struct = (Struct)((Struct$Builder)((GeneratedMessageLite$Builder)((Object)structOrBuilder)).mergeFrom(struct)).buildPartial();
        } else {
            this.response_ = struct;
        }
    }

    private void mergeServiceData(Any any) {
        Any any2;
        any.getClass();
        AnyOrBuilder anyOrBuilder = this.serviceData_;
        if (anyOrBuilder != null && anyOrBuilder != (any2 = Any.getDefaultInstance())) {
            anyOrBuilder = Any.newBuilder(this.serviceData_);
            this.serviceData_ = any = (Any)((Any$Builder)((GeneratedMessageLite$Builder)((Object)anyOrBuilder)).mergeFrom(any)).buildPartial();
        } else {
            this.serviceData_ = any;
        }
    }

    private void mergeStatus(Status status) {
        Status status2;
        status.getClass();
        StatusOrBuilder statusOrBuilder = this.status_;
        if (statusOrBuilder != null && statusOrBuilder != (status2 = Status.getDefaultInstance())) {
            statusOrBuilder = Status.newBuilder(this.status_);
            this.status_ = status = (Status)((Status$Builder)((GeneratedMessageLite$Builder)((Object)statusOrBuilder)).mergeFrom(status)).buildPartial();
        } else {
            this.status_ = status;
        }
    }

    public static AuditLog$Builder newBuilder() {
        return (AuditLog$Builder)DEFAULT_INSTANCE.createBuilder();
    }

    public static AuditLog$Builder newBuilder(AuditLog auditLog) {
        return (AuditLog$Builder)DEFAULT_INSTANCE.createBuilder(auditLog);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream) {
        return (AuditLog)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuditLog)GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuditLog parseFrom(ByteString byteString) {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString);
    }

    public static AuditLog parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuditLog parseFrom(CodedInputStream codedInputStream) {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuditLog parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static AuditLog parseFrom(InputStream inputStream) {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer) {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuditLog parseFrom(byte[] byArray) {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray);
    }

    public static AuditLog parseFrom(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (AuditLog)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, byArray, extensionRegistryLite);
    }

    public static Parser parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAuthorizationInfo(int n3) {
        this.ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.remove(n3);
    }

    private void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        authenticationInfo.getClass();
        this.authenticationInfo_ = authenticationInfo;
    }

    private void setAuthorizationInfo(int n3, AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        this.ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.set(n3, authorizationInfo);
    }

    private void setMethodName(String string2) {
        string2.getClass();
        this.methodName_ = string2;
    }

    private void setMethodNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.methodName_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setNumResponseItems(long l2) {
        this.numResponseItems_ = l2;
    }

    private void setRequest(Struct struct) {
        struct.getClass();
        this.request_ = struct;
    }

    private void setRequestMetadata(RequestMetadata requestMetadata) {
        requestMetadata.getClass();
        this.requestMetadata_ = requestMetadata;
    }

    private void setResourceName(String string2) {
        string2.getClass();
        this.resourceName_ = string2;
    }

    private void setResourceNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.resourceName_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setResponse(Struct struct) {
        struct.getClass();
        this.response_ = struct;
    }

    private void setServiceData(Any any) {
        any.getClass();
        this.serviceData_ = any;
    }

    private void setServiceName(String string2) {
        string2.getClass();
        this.serviceName_ = string2;
    }

    private void setServiceNameBytes(ByteString object) {
        AbstractMessageLite.checkByteStringIsUtf8((ByteString)object);
        this.serviceName_ = object = ((ByteString)object).toStringUtf8();
    }

    private void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object dynamicMethod(GeneratedMessageLite$MethodToInvoke objectArray, Object clazz, Object object) {
        byte by2 = 1;
        object = AuditLog$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;
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
                clazz = AuditLog.class;
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
                objectArray = new Object[12];
                objectArray[0] = "status_";
                objectArray[by2] = "authenticationInfo_";
                objectArray[2] = "requestMetadata_";
                objectArray[3] = "serviceName_";
                objectArray[4] = "methodName_";
                objectArray[5] = "authorizationInfo_";
                objectArray[6] = AuthorizationInfo.class;
                objectArray[7] = "resourceName_";
                objectArray[8] = "numResponseItems_";
                objectArray[9] = "serviceData_";
                objectArray[10] = "request_";
                objectArray[11] = "response_";
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0002\u0011\u000b\u0000\u0001\u0000\u0002\t\u0003\t\u0004\t\u0007\u0208\b\u0208\t\u001b\u000b\u0208\f\u0002\u000f\t\u0010\t\u0011\t", objectArray);
            }
            case 2: {
                return new AuditLog$Builder(null);
            }
            case 1: 
        }
        return new AuditLog();
    }

    public AuthenticationInfo getAuthenticationInfo() {
        AuthenticationInfo authenticationInfo = this.authenticationInfo_;
        if (authenticationInfo == null) {
            authenticationInfo = AuthenticationInfo.getDefaultInstance();
        }
        return authenticationInfo;
    }

    public AuthorizationInfo getAuthorizationInfo(int n3) {
        return (AuthorizationInfo)this.authorizationInfo_.get(n3);
    }

    public int getAuthorizationInfoCount() {
        return this.authorizationInfo_.size();
    }

    public List getAuthorizationInfoList() {
        return this.authorizationInfo_;
    }

    public AuthorizationInfoOrBuilder getAuthorizationInfoOrBuilder(int n3) {
        return (AuthorizationInfoOrBuilder)this.authorizationInfo_.get(n3);
    }

    public List getAuthorizationInfoOrBuilderList() {
        return this.authorizationInfo_;
    }

    public String getMethodName() {
        return this.methodName_;
    }

    public ByteString getMethodNameBytes() {
        return ByteString.copyFromUtf8(this.methodName_);
    }

    public long getNumResponseItems() {
        return this.numResponseItems_;
    }

    public Struct getRequest() {
        Struct struct = this.request_;
        if (struct == null) {
            struct = Struct.getDefaultInstance();
        }
        return struct;
    }

    public RequestMetadata getRequestMetadata() {
        RequestMetadata requestMetadata = this.requestMetadata_;
        if (requestMetadata == null) {
            requestMetadata = RequestMetadata.getDefaultInstance();
        }
        return requestMetadata;
    }

    public String getResourceName() {
        return this.resourceName_;
    }

    public ByteString getResourceNameBytes() {
        return ByteString.copyFromUtf8(this.resourceName_);
    }

    public Struct getResponse() {
        Struct struct = this.response_;
        if (struct == null) {
            struct = Struct.getDefaultInstance();
        }
        return struct;
    }

    public Any getServiceData() {
        Any any = this.serviceData_;
        if (any == null) {
            any = Any.getDefaultInstance();
        }
        return any;
    }

    public String getServiceName() {
        return this.serviceName_;
    }

    public ByteString getServiceNameBytes() {
        return ByteString.copyFromUtf8(this.serviceName_);
    }

    public Status getStatus() {
        Status status = this.status_;
        if (status == null) {
            status = Status.getDefaultInstance();
        }
        return status;
    }

    public boolean hasAuthenticationInfo() {
        boolean bl2;
        AuthenticationInfo authenticationInfo = this.authenticationInfo_;
        if (authenticationInfo != null) {
            bl2 = true;
        } else {
            bl2 = false;
            authenticationInfo = null;
        }
        return bl2;
    }

    public boolean hasRequest() {
        boolean bl2;
        Struct struct = this.request_;
        if (struct != null) {
            bl2 = true;
        } else {
            bl2 = false;
            struct = null;
        }
        return bl2;
    }

    public boolean hasRequestMetadata() {
        boolean bl2;
        RequestMetadata requestMetadata = this.requestMetadata_;
        if (requestMetadata != null) {
            bl2 = true;
        } else {
            bl2 = false;
            requestMetadata = null;
        }
        return bl2;
    }

    public boolean hasResponse() {
        boolean bl2;
        Struct struct = this.response_;
        if (struct != null) {
            bl2 = true;
        } else {
            bl2 = false;
            struct = null;
        }
        return bl2;
    }

    public boolean hasServiceData() {
        boolean bl2;
        Any any = this.serviceData_;
        if (any != null) {
            bl2 = true;
        } else {
            bl2 = false;
            any = null;
        }
        return bl2;
    }

    public boolean hasStatus() {
        boolean bl2;
        Status status = this.status_;
        if (status != null) {
            bl2 = true;
        } else {
            bl2 = false;
            status = null;
        }
        return bl2;
    }
}

