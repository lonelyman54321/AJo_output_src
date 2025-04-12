/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.GetOperationRequest;
import com.google.longrunning.GetOperationRequest$1;
import com.google.longrunning.GetOperationRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class GetOperationRequest$Builder
extends GeneratedMessageLite$Builder
implements GetOperationRequestOrBuilder {
    private GetOperationRequest$Builder() {
        GetOperationRequest getOperationRequest = GetOperationRequest.access$000();
        super(getOperationRequest);
    }

    public /* synthetic */ GetOperationRequest$Builder(GetOperationRequest$1 getOperationRequest$1) {
        this();
    }

    public GetOperationRequest$Builder clearName() {
        this.copyOnWrite();
        GetOperationRequest.access$200((GetOperationRequest)this.instance);
        return this;
    }

    public String getName() {
        return ((GetOperationRequest)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((GetOperationRequest)this.instance).getNameBytes();
    }

    public GetOperationRequest$Builder setName(String string2) {
        this.copyOnWrite();
        GetOperationRequest.access$100((GetOperationRequest)this.instance, string2);
        return this;
    }

    public GetOperationRequest$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        GetOperationRequest.access$300((GetOperationRequest)this.instance, byteString);
        return this;
    }
}

