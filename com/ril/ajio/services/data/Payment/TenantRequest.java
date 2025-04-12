/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.BaseRequest;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class TenantRequest
implements Serializable {
    private BaseRequest baseRequest;

    public TenantRequest(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        this.baseRequest = baseRequest;
    }

    public static /* synthetic */ TenantRequest copy$default(TenantRequest tenantRequest, BaseRequest baseRequest, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            baseRequest = tenantRequest.baseRequest;
        }
        return tenantRequest.copy(baseRequest);
    }

    public final BaseRequest component1() {
        return this.baseRequest;
    }

    public final TenantRequest copy(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        TenantRequest tenantRequest = new TenantRequest(baseRequest);
        return tenantRequest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof TenantRequest;
        if (!bl3) {
            return false;
        }
        object = (TenantRequest)object;
        BaseRequest baseRequest = this.baseRequest;
        object = ((TenantRequest)object).baseRequest;
        boolean bl4 = Intrinsics.areEqual(baseRequest, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final BaseRequest getBaseRequest() {
        return this.baseRequest;
    }

    public int hashCode() {
        return this.baseRequest.hashCode();
    }

    public final void setBaseRequest(BaseRequest baseRequest) {
        Intrinsics.checkNotNullParameter(baseRequest, "<set-?>");
        this.baseRequest = baseRequest;
    }

    public String toString() {
        BaseRequest baseRequest = this.baseRequest;
        StringBuilder stringBuilder = new StringBuilder("TenantRequest(baseRequest=");
        stringBuilder.append(baseRequest);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

