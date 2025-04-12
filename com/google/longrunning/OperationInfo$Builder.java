/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.OperationInfo;
import com.google.longrunning.OperationInfo$1;
import com.google.longrunning.OperationInfoOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class OperationInfo$Builder
extends GeneratedMessageLite$Builder
implements OperationInfoOrBuilder {
    private OperationInfo$Builder() {
        OperationInfo operationInfo = OperationInfo.access$000();
        super(operationInfo);
    }

    public /* synthetic */ OperationInfo$Builder(OperationInfo$1 operationInfo$1) {
        this();
    }

    public OperationInfo$Builder clearMetadataType() {
        this.copyOnWrite();
        OperationInfo.access$500((OperationInfo)this.instance);
        return this;
    }

    public OperationInfo$Builder clearResponseType() {
        this.copyOnWrite();
        OperationInfo.access$200((OperationInfo)this.instance);
        return this;
    }

    public String getMetadataType() {
        return ((OperationInfo)this.instance).getMetadataType();
    }

    public ByteString getMetadataTypeBytes() {
        return ((OperationInfo)this.instance).getMetadataTypeBytes();
    }

    public String getResponseType() {
        return ((OperationInfo)this.instance).getResponseType();
    }

    public ByteString getResponseTypeBytes() {
        return ((OperationInfo)this.instance).getResponseTypeBytes();
    }

    public OperationInfo$Builder setMetadataType(String string2) {
        this.copyOnWrite();
        OperationInfo.access$400((OperationInfo)this.instance, string2);
        return this;
    }

    public OperationInfo$Builder setMetadataTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        OperationInfo.access$600((OperationInfo)this.instance, byteString);
        return this;
    }

    public OperationInfo$Builder setResponseType(String string2) {
        this.copyOnWrite();
        OperationInfo.access$100((OperationInfo)this.instance, string2);
        return this;
    }

    public OperationInfo$Builder setResponseTypeBytes(ByteString byteString) {
        this.copyOnWrite();
        OperationInfo.access$300((OperationInfo)this.instance, byteString);
        return this;
    }
}

