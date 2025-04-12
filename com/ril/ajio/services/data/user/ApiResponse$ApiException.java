/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import com.ril.ajio.services.data.flashsale.CustomError;
import com.ril.ajio.services.data.user.ApiResponse;
import kotlin.jvm.internal.Intrinsics;

public final class ApiResponse$ApiException
extends ApiResponse {
    private final CustomError customError;

    public ApiResponse$ApiException(CustomError customError) {
        Intrinsics.checkNotNullParameter(customError, "customError");
        super(null);
        this.customError = customError;
    }

    public static /* synthetic */ ApiResponse$ApiException copy$default(ApiResponse$ApiException apiResponse$ApiException, CustomError customError, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            customError = apiResponse$ApiException.customError;
        }
        return apiResponse$ApiException.copy(customError);
    }

    public final CustomError component1() {
        return this.customError;
    }

    public final ApiResponse$ApiException copy(CustomError customError) {
        Intrinsics.checkNotNullParameter(customError, "customError");
        ApiResponse$ApiException apiResponse$ApiException = new ApiResponse$ApiException(customError);
        return apiResponse$ApiException;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ApiResponse$ApiException;
        if (!bl3) {
            return false;
        }
        object = (ApiResponse$ApiException)object;
        CustomError customError = this.customError;
        object = ((ApiResponse$ApiException)object).customError;
        boolean bl4 = Intrinsics.areEqual(customError, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final CustomError getCustomError() {
        return this.customError;
    }

    public int hashCode() {
        return this.customError.hashCode();
    }

    public String toString() {
        CustomError customError = this.customError;
        StringBuilder stringBuilder = new StringBuilder("ApiException(customError=");
        stringBuilder.append(customError);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

