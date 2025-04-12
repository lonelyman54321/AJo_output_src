/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model;

import com.ril.ajio.kmm.shared.model.BaseResponse;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import com.ril.ajio.kmm.shared.model.StatusInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BaseResponse$Companion {
    private BaseResponse$Companion() {
    }

    public /* synthetic */ BaseResponse$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ BaseResponse onFailed$default(BaseResponse$Companion baseResponse$Companion, Integer n3, Throwable throwable, int n4, Object object) {
        if ((n4 &= 2) != 0) {
            throwable = null;
        }
        return baseResponse$Companion.onFailed(n3, throwable);
    }

    public final BaseResponse onFailed(StatusInfo statusInfo) {
        ResponseStatusType responseStatusType = ResponseStatusType.API_FAILURE;
        BaseResponse baseResponse = new BaseResponse(responseStatusType, statusInfo, null, null, null, null, 56, null);
        return baseResponse;
    }

    public final BaseResponse onFailed(Integer n3, Throwable throwable) {
        ResponseStatusType responseStatusType = ResponseStatusType.API_FAILURE;
        BaseResponse baseResponse = new BaseResponse(responseStatusType, null, null, throwable, n3, null, 38, null);
        return baseResponse;
    }

    public final BaseResponse onSuccess(StatusInfo statusInfo, Object object) {
        ResponseStatusType responseStatusType = ResponseStatusType.API_SUCCESS;
        BaseResponse baseResponse = new BaseResponse(responseStatusType, statusInfo, object, null, null, null, 48, null);
        return baseResponse;
    }

    public final BaseResponse onSuccess(Object object) {
        ResponseStatusType responseStatusType = ResponseStatusType.API_SUCCESS;
        BaseResponse baseResponse = new BaseResponse(responseStatusType, null, object, null, null, null, 58, null);
        return baseResponse;
    }
}

