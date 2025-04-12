/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import com.ril.ajio.services.data.user.ApiResponse;
import kotlin.jvm.internal.Intrinsics;

public final class ApiResponse$ApiSuccess
extends ApiResponse {
    private final Object data;

    public ApiResponse$ApiSuccess(Object object) {
        Intrinsics.checkNotNullParameter(object, "data");
        super(null);
        this.data = object;
    }

    public static /* synthetic */ ApiResponse$ApiSuccess copy$default(ApiResponse$ApiSuccess apiResponse$ApiSuccess, Object object, int n3, Object object2) {
        if ((n3 &= 1) != 0) {
            object = apiResponse$ApiSuccess.data;
        }
        return apiResponse$ApiSuccess.copy(object);
    }

    public final Object component1() {
        return this.data;
    }

    public final ApiResponse$ApiSuccess copy(Object object) {
        Intrinsics.checkNotNullParameter(object, "data");
        ApiResponse$ApiSuccess apiResponse$ApiSuccess = new ApiResponse$ApiSuccess(object);
        return apiResponse$ApiSuccess;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ApiResponse$ApiSuccess;
        if (!bl3) {
            return false;
        }
        object = (ApiResponse$ApiSuccess)object;
        Object object2 = this.data;
        object = ((ApiResponse$ApiSuccess)object).data;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Object getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        Object object = this.data;
        StringBuilder stringBuilder = new StringBuilder("ApiSuccess(data=");
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

