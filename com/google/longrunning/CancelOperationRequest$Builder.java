/*
 * Decompiled with CFR 0.152.
 */
package com.google.longrunning;

import com.google.longrunning.CancelOperationRequest;
import com.google.longrunning.CancelOperationRequest$1;
import com.google.longrunning.CancelOperationRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class CancelOperationRequest$Builder
extends GeneratedMessageLite$Builder
implements CancelOperationRequestOrBuilder {
    private CancelOperationRequest$Builder() {
        CancelOperationRequest cancelOperationRequest = CancelOperationRequest.access$000();
        super(cancelOperationRequest);
    }

    public /* synthetic */ CancelOperationRequest$Builder(CancelOperationRequest$1 cancelOperationRequest$1) {
        this();
    }

    public CancelOperationRequest$Builder clearName() {
        this.copyOnWrite();
        CancelOperationRequest.access$200((CancelOperationRequest)this.instance);
        return this;
    }

    public String getName() {
        return ((CancelOperationRequest)this.instance).getName();
    }

    public ByteString getNameBytes() {
        return ((CancelOperationRequest)this.instance).getNameBytes();
    }

    public CancelOperationRequest$Builder setName(String string2) {
        this.copyOnWrite();
        CancelOperationRequest.access$100((CancelOperationRequest)this.instance, string2);
        return this;
    }

    public CancelOperationRequest$Builder setNameBytes(ByteString byteString) {
        this.copyOnWrite();
        CancelOperationRequest.access$300((CancelOperationRequest)this.instance, byteString);
        return this;
    }
}

