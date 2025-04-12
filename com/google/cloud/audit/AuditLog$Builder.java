/*
 * Decompiled with CFR 0.152.
 */
package com.google.cloud.audit;

import com.google.cloud.audit.AuditLog;
import com.google.cloud.audit.AuditLog$1;
import com.google.cloud.audit.AuditLogOrBuilder;
import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.AuthenticationInfo$Builder;
import com.google.cloud.audit.AuthorizationInfo;
import com.google.cloud.audit.AuthorizationInfo$Builder;
import com.google.cloud.audit.RequestMetadata;
import com.google.cloud.audit.RequestMetadata$Builder;
import com.google.protobuf.Any;
import com.google.protobuf.Any$Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.Struct;
import com.google.protobuf.Struct$Builder;
import com.google.rpc.Status;
import com.google.rpc.Status$Builder;
import java.util.Collections;
import java.util.List;

public final class AuditLog$Builder
extends GeneratedMessageLite$Builder
implements AuditLogOrBuilder {
    private AuditLog$Builder() {
        AuditLog auditLog = AuditLog.access$000();
        super(auditLog);
    }

    public /* synthetic */ AuditLog$Builder(AuditLog$1 auditLog$1) {
        this();
    }

    public AuditLog$Builder addAllAuthorizationInfo(Iterable iterable) {
        this.copyOnWrite();
        AuditLog.access$2100((AuditLog)this.instance, iterable);
        return this;
    }

    public AuditLog$Builder addAuthorizationInfo(int n3, AuthorizationInfo$Builder authorizationInfoOrBuilder) {
        this.copyOnWrite();
        AuditLog auditLog = (AuditLog)this.instance;
        authorizationInfoOrBuilder = (AuthorizationInfo)authorizationInfoOrBuilder.build();
        AuditLog.access$2000(auditLog, n3, (AuthorizationInfo)authorizationInfoOrBuilder);
        return this;
    }

    public AuditLog$Builder addAuthorizationInfo(int n3, AuthorizationInfo authorizationInfo) {
        this.copyOnWrite();
        AuditLog.access$2000((AuditLog)this.instance, n3, authorizationInfo);
        return this;
    }

    public AuditLog$Builder addAuthorizationInfo(AuthorizationInfo$Builder authorizationInfoOrBuilder) {
        this.copyOnWrite();
        AuditLog auditLog = (AuditLog)this.instance;
        authorizationInfoOrBuilder = (AuthorizationInfo)authorizationInfoOrBuilder.build();
        AuditLog.access$1900(auditLog, (AuthorizationInfo)authorizationInfoOrBuilder);
        return this;
    }

    public AuditLog$Builder addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
        this.copyOnWrite();
        AuditLog.access$1900((AuditLog)this.instance, authorizationInfo);
        return this;
    }

    public AuditLog$Builder clearAuthenticationInfo() {
        this.copyOnWrite();
        AuditLog.access$1700((AuditLog)this.instance);
        return this;
    }

    public AuditLog$Builder clearAuthorizationInfo() {
        this.copyOnWrite();
        AuditLog.access$2200((AuditLog)this.instance);
        return this;
    }

    public AuditLog$Builder clearMethodName() {
        this.copyOnWrite();
        AuditLog.access$500((AuditLog)this.instance);
        return this;
    }

    public AuditLog$Builder clearNumResponseItems() {
        this.copyOnWrite();
        AuditLog.access$1100((AuditLog)this.instance);
        return this;
    }

    public AuditLog$Builder clearRequest() {
        this.copyOnWrite();
        AuditLog.access$2900((AuditLog)this.instance);
        return this;
    }

    public AuditLog$Builder clearRequestMetadata() {
        this.copyOnWrite();
        AuditLog.access$2600((AuditLog)this.instance);
        return this;
    }

    public AuditLog$Builder clearResourceName() {
        this.copyOnWrite();
        AuditLog.access$800((AuditLog)this.instance);
        return this;
    }

    public AuditLog$Builder clearResponse() {
        this.copyOnWrite();
        AuditLog.access$3200((AuditLog)this.instance);
        return this;
    }

    public AuditLog$Builder clearServiceData() {
        this.copyOnWrite();
        AuditLog.access$3500((AuditLog)this.instance);
        return this;
    }

    public AuditLog$Builder clearServiceName() {
        this.copyOnWrite();
        AuditLog.access$200((AuditLog)this.instance);
        return this;
    }

    public AuditLog$Builder clearStatus() {
        this.copyOnWrite();
        AuditLog.access$1400((AuditLog)this.instance);
        return this;
    }

    public AuthenticationInfo getAuthenticationInfo() {
        return ((AuditLog)this.instance).getAuthenticationInfo();
    }

    public AuthorizationInfo getAuthorizationInfo(int n3) {
        return ((AuditLog)this.instance).getAuthorizationInfo(n3);
    }

    public int getAuthorizationInfoCount() {
        return ((AuditLog)this.instance).getAuthorizationInfoCount();
    }

    public List getAuthorizationInfoList() {
        return Collections.unmodifiableList(((AuditLog)this.instance).getAuthorizationInfoList());
    }

    public String getMethodName() {
        return ((AuditLog)this.instance).getMethodName();
    }

    public ByteString getMethodNameBytes() {
        return ((AuditLog)this.instance).getMethodNameBytes();
    }

    public long getNumResponseItems() {
        return ((AuditLog)this.instance).getNumResponseItems();
    }

    public Struct getRequest() {
        return ((AuditLog)this.instance).getRequest();
    }

    public RequestMetadata getRequestMetadata() {
        return ((AuditLog)this.instance).getRequestMetadata();
    }

    public String getResourceName() {
        return ((AuditLog)this.instance).getResourceName();
    }

    public ByteString getResourceNameBytes() {
        return ((AuditLog)this.instance).getResourceNameBytes();
    }

    public Struct getResponse() {
        return ((AuditLog)this.instance).getResponse();
    }

    public Any getServiceData() {
        return ((AuditLog)this.instance).getServiceData();
    }

    public String getServiceName() {
        return ((AuditLog)this.instance).getServiceName();
    }

    public ByteString getServiceNameBytes() {
        return ((AuditLog)this.instance).getServiceNameBytes();
    }

    public Status getStatus() {
        return ((AuditLog)this.instance).getStatus();
    }

    public boolean hasAuthenticationInfo() {
        return ((AuditLog)this.instance).hasAuthenticationInfo();
    }

    public boolean hasRequest() {
        return ((AuditLog)this.instance).hasRequest();
    }

    public boolean hasRequestMetadata() {
        return ((AuditLog)this.instance).hasRequestMetadata();
    }

    public boolean hasResponse() {
        return ((AuditLog)this.instance).hasResponse();
    }

    public boolean hasServiceData() {
        return ((AuditLog)this.instance).hasServiceData();
    }

    public boolean hasStatus() {
        return ((AuditLog)this.instance).hasStatus();
    }

    public AuditLog$Builder mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        this.copyOnWrite();
        AuditLog.access$1600((AuditLog)this.instance, authenticationInfo);
        return this;
    }

    public AuditLog$Builder mergeRequest(Struct struct) {
        this.copyOnWrite();
        AuditLog.access$2800((AuditLog)this.instance, struct);
        return this;
    }

    public AuditLog$Builder mergeRequestMetadata(RequestMetadata requestMetadata) {
        this.copyOnWrite();
        AuditLog.access$2500((AuditLog)this.instance, requestMetadata);
        return this;
    }

    public AuditLog$Builder mergeResponse(Struct struct) {
        this.copyOnWrite();
        AuditLog.access$3100((AuditLog)this.instance, struct);
        return this;
    }

    public AuditLog$Builder mergeServiceData(Any any) {
        this.copyOnWrite();
        AuditLog.access$3400((AuditLog)this.instance, any);
        return this;
    }

    public AuditLog$Builder mergeStatus(Status status) {
        this.copyOnWrite();
        AuditLog.access$1300((AuditLog)this.instance, status);
        return this;
    }

    public AuditLog$Builder removeAuthorizationInfo(int n3) {
        this.copyOnWrite();
        AuditLog.access$2300((AuditLog)this.instance, n3);
        return this;
    }

    public AuditLog$Builder setAuthenticationInfo(AuthenticationInfo$Builder authenticationInfoOrBuilder) {
        this.copyOnWrite();
        AuditLog auditLog = (AuditLog)this.instance;
        authenticationInfoOrBuilder = (AuthenticationInfo)authenticationInfoOrBuilder.build();
        AuditLog.access$1500(auditLog, (AuthenticationInfo)authenticationInfoOrBuilder);
        return this;
    }

    public AuditLog$Builder setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        this.copyOnWrite();
        AuditLog.access$1500((AuditLog)this.instance, authenticationInfo);
        return this;
    }

    public AuditLog$Builder setAuthorizationInfo(int n3, AuthorizationInfo$Builder authorizationInfoOrBuilder) {
        this.copyOnWrite();
        AuditLog auditLog = (AuditLog)this.instance;
        authorizationInfoOrBuilder = (AuthorizationInfo)authorizationInfoOrBuilder.build();
        AuditLog.access$1800(auditLog, n3, (AuthorizationInfo)authorizationInfoOrBuilder);
        return this;
    }

    public AuditLog$Builder setAuthorizationInfo(int n3, AuthorizationInfo authorizationInfo) {
        this.copyOnWrite();
        AuditLog.access$1800((AuditLog)this.instance, n3, authorizationInfo);
        return this;
    }

    public AuditLog$Builder setMethodName(String string2) {
        this.copyOnWrite();
        AuditLog.access$400((AuditLog)this.instance, string2);
        return this;
    }

    public AuditLog$Builder setMethodNameBytes(ByteString byteString) {
        this.copyOnWrite();
        AuditLog.access$600((AuditLog)this.instance, byteString);
        return this;
    }

    public AuditLog$Builder setNumResponseItems(long l2) {
        this.copyOnWrite();
        AuditLog.access$1000((AuditLog)this.instance, l2);
        return this;
    }

    public AuditLog$Builder setRequest(Struct$Builder structOrBuilder) {
        this.copyOnWrite();
        AuditLog auditLog = (AuditLog)this.instance;
        structOrBuilder = (Struct)structOrBuilder.build();
        AuditLog.access$2700(auditLog, (Struct)structOrBuilder);
        return this;
    }

    public AuditLog$Builder setRequest(Struct struct) {
        this.copyOnWrite();
        AuditLog.access$2700((AuditLog)this.instance, struct);
        return this;
    }

    public AuditLog$Builder setRequestMetadata(RequestMetadata$Builder requestMetadataOrBuilder) {
        this.copyOnWrite();
        AuditLog auditLog = (AuditLog)this.instance;
        requestMetadataOrBuilder = (RequestMetadata)requestMetadataOrBuilder.build();
        AuditLog.access$2400(auditLog, (RequestMetadata)requestMetadataOrBuilder);
        return this;
    }

    public AuditLog$Builder setRequestMetadata(RequestMetadata requestMetadata) {
        this.copyOnWrite();
        AuditLog.access$2400((AuditLog)this.instance, requestMetadata);
        return this;
    }

    public AuditLog$Builder setResourceName(String string2) {
        this.copyOnWrite();
        AuditLog.access$700((AuditLog)this.instance, string2);
        return this;
    }

    public AuditLog$Builder setResourceNameBytes(ByteString byteString) {
        this.copyOnWrite();
        AuditLog.access$900((AuditLog)this.instance, byteString);
        return this;
    }

    public AuditLog$Builder setResponse(Struct$Builder structOrBuilder) {
        this.copyOnWrite();
        AuditLog auditLog = (AuditLog)this.instance;
        structOrBuilder = (Struct)structOrBuilder.build();
        AuditLog.access$3000(auditLog, (Struct)structOrBuilder);
        return this;
    }

    public AuditLog$Builder setResponse(Struct struct) {
        this.copyOnWrite();
        AuditLog.access$3000((AuditLog)this.instance, struct);
        return this;
    }

    public AuditLog$Builder setServiceData(Any$Builder anyOrBuilder) {
        this.copyOnWrite();
        AuditLog auditLog = (AuditLog)this.instance;
        anyOrBuilder = (Any)anyOrBuilder.build();
        AuditLog.access$3300(auditLog, (Any)anyOrBuilder);
        return this;
    }

    public AuditLog$Builder setServiceData(Any any) {
        this.copyOnWrite();
        AuditLog.access$3300((AuditLog)this.instance, any);
        return this;
    }

    public AuditLog$Builder setServiceName(String string2) {
        this.copyOnWrite();
        AuditLog.access$100((AuditLog)this.instance, string2);
        return this;
    }

    public AuditLog$Builder setServiceNameBytes(ByteString byteString) {
        this.copyOnWrite();
        AuditLog.access$300((AuditLog)this.instance, byteString);
        return this;
    }

    public AuditLog$Builder setStatus(Status$Builder statusOrBuilder) {
        this.copyOnWrite();
        AuditLog auditLog = (AuditLog)this.instance;
        statusOrBuilder = (Status)statusOrBuilder.build();
        AuditLog.access$1200(auditLog, (Status)statusOrBuilder);
        return this;
    }

    public AuditLog$Builder setStatus(Status status) {
        this.copyOnWrite();
        AuditLog.access$1200((AuditLog)this.instance, status);
        return this;
    }
}

