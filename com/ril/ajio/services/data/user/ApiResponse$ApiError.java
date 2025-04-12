/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.user;

import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.services.data.flashsale.CustomError;
import com.ril.ajio.services.data.user.ApiResponse;
import kotlin.jvm.internal.Intrinsics;

public final class ApiResponse$ApiError
extends ApiResponse {
    private final CustomError customError;
    private final DataError$ErrorMessage errorData;

    public ApiResponse$ApiError(DataError$ErrorMessage dataError$ErrorMessage, CustomError customError) {
        Intrinsics.checkNotNullParameter(dataError$ErrorMessage, "errorData");
        Intrinsics.checkNotNullParameter(customError, "customError");
        super(null);
        this.errorData = dataError$ErrorMessage;
        this.customError = customError;
    }

    public static /* synthetic */ ApiResponse$ApiError copy$default(ApiResponse$ApiError apiResponse$ApiError, DataError$ErrorMessage dataError$ErrorMessage, CustomError customError, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            dataError$ErrorMessage = apiResponse$ApiError.errorData;
        }
        if ((n3 &= 2) != 0) {
            customError = apiResponse$ApiError.customError;
        }
        return apiResponse$ApiError.copy(dataError$ErrorMessage, customError);
    }

    public final DataError$ErrorMessage component1() {
        return this.errorData;
    }

    public final CustomError component2() {
        return this.customError;
    }

    public final ApiResponse$ApiError copy(DataError$ErrorMessage dataError$ErrorMessage, CustomError customError) {
        Intrinsics.checkNotNullParameter(dataError$ErrorMessage, "errorData");
        Intrinsics.checkNotNullParameter(customError, "customError");
        ApiResponse$ApiError apiResponse$ApiError = new ApiResponse$ApiError(dataError$ErrorMessage, customError);
        return apiResponse$ApiError;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ApiResponse$ApiError;
        if (!bl3) {
            return false;
        }
        object = (ApiResponse$ApiError)object;
        Object object2 = this.errorData;
        DataError$ErrorMessage dataError$ErrorMessage = ((ApiResponse$ApiError)object).errorData;
        bl3 = Intrinsics.areEqual(object2, dataError$ErrorMessage);
        if (!bl3) {
            return false;
        }
        object2 = this.customError;
        object = ((ApiResponse$ApiError)object).customError;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final CustomError getCustomError() {
        return this.customError;
    }

    public final DataError$ErrorMessage getErrorData() {
        return this.errorData;
    }

    public int hashCode() {
        int n3 = this.errorData.hashCode() * 31;
        return this.customError.hashCode() + n3;
    }

    public String toString() {
        DataError$ErrorMessage dataError$ErrorMessage = this.errorData;
        CustomError customError = this.customError;
        StringBuilder stringBuilder = new StringBuilder("ApiError(errorData=");
        stringBuilder.append(dataError$ErrorMessage);
        stringBuilder.append(", customError=");
        stringBuilder.append(customError);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

