/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model;

import com.ril.ajio.kmm.shared.model.BaseResponse$Companion;
import com.ril.ajio.kmm.shared.model.ResponseStatusType;
import com.ril.ajio.kmm.shared.model.StatusInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BaseResponse {
    public static final BaseResponse$Companion Companion;
    private Object data;
    private Boolean isNewData;
    private ResponseStatusType responseStatusType;
    private Integer statusCode;
    private StatusInfo statusInfo;
    private Throwable throwable;

    static {
        BaseResponse$Companion baseResponse$Companion;
        Companion = baseResponse$Companion = new BaseResponse$Companion(null);
    }

    public BaseResponse(ResponseStatusType responseStatusType, StatusInfo statusInfo, Object object, Throwable throwable, Integer n3, Boolean bl2) {
        Intrinsics.checkNotNullParameter((Object)responseStatusType, "responseStatusType");
        this.responseStatusType = responseStatusType;
        this.statusInfo = statusInfo;
        this.data = object;
        this.throwable = throwable;
        this.statusCode = n3;
        this.isNewData = bl2;
    }

    public /* synthetic */ BaseResponse(ResponseStatusType responseStatusType, StatusInfo object, Object object2, Throwable object3, Integer object4, Boolean serializable, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Throwable throwable;
        Object object5;
        StatusInfo statusInfo;
        int n4 = n3 & 2;
        Integer n7 = null;
        if (n4 != 0) {
            n4 = 0;
            statusInfo = null;
        } else {
            statusInfo = object;
        }
        int n8 = n3 & 4;
        if (n8 != 0) {
            n8 = 0;
            object5 = null;
        } else {
            object5 = object2;
        }
        int n10 = n3 & 8;
        if (n10 != 0) {
            n10 = 0;
            throwable = null;
        } else {
            throwable = object3;
        }
        int n14 = n3 & 0x10;
        if (n14 == 0) {
            n7 = object4;
        }
        n14 = n3 & 0x20;
        Boolean bl2 = n14 != 0 ? Boolean.TRUE : serializable;
        object = this;
        object2 = responseStatusType;
        object3 = statusInfo;
        object4 = object5;
        serializable = throwable;
        this(responseStatusType, statusInfo, object5, throwable, n7, bl2);
    }

    public static /* synthetic */ BaseResponse copy$default(BaseResponse baseResponse, ResponseStatusType responseStatusType, StatusInfo object, Object object2, Throwable object3, Integer object4, Boolean serializable, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            responseStatusType = baseResponse.responseStatusType;
        }
        if ((n4 = n3 & 2) != 0) {
            object = baseResponse.statusInfo;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = baseResponse.data;
        }
        Object object6 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = baseResponse.throwable;
        }
        Throwable throwable = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            object4 = baseResponse.statusCode;
        }
        Integer n8 = object4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            serializable = baseResponse.isNewData;
        }
        Boolean bl2 = serializable;
        object = baseResponse;
        object2 = responseStatusType;
        object3 = object5;
        object4 = object6;
        serializable = throwable;
        object5 = bl2;
        return baseResponse.copy(responseStatusType, (StatusInfo)object3, object6, throwable, n8, bl2);
    }

    public final ResponseStatusType component1() {
        return this.responseStatusType;
    }

    public final StatusInfo component2() {
        return this.statusInfo;
    }

    public final Object component3() {
        return this.data;
    }

    public final Throwable component4() {
        return this.throwable;
    }

    public final Integer component5() {
        return this.statusCode;
    }

    public final Boolean component6() {
        return this.isNewData;
    }

    public final BaseResponse copy(ResponseStatusType responseStatusType, StatusInfo statusInfo, Object object, Throwable throwable, Integer n3, Boolean bl2) {
        Intrinsics.checkNotNullParameter((Object)responseStatusType, "responseStatusType");
        BaseResponse baseResponse = new BaseResponse(responseStatusType, statusInfo, object, throwable, n3, bl2);
        return baseResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BaseResponse;
        if (!bl3) {
            return false;
        }
        object = (BaseResponse)object;
        Object object2 = this.responseStatusType;
        Object object3 = ((BaseResponse)object).responseStatusType;
        if (object2 != object3) {
            return false;
        }
        object2 = this.statusInfo;
        object3 = ((BaseResponse)object).statusInfo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.data;
        object3 = ((BaseResponse)object).data;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.throwable;
        object3 = ((BaseResponse)object).throwable;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.statusCode;
        object3 = ((BaseResponse)object).statusCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isNewData;
        object = ((BaseResponse)object).isNewData;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Object getData() {
        return this.data;
    }

    public final ResponseStatusType getResponseStatusType() {
        return this.responseStatusType;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final StatusInfo getStatusInfo() {
        return this.statusInfo;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        int n3;
        ResponseStatusType responseStatusType = this.responseStatusType;
        int n4 = ((Object)((Object)responseStatusType)).hashCode() * 31;
        Object object = this.statusInfo;
        int n7 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.data;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.throwable;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.statusCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isNewData;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isNewData() {
        return this.isNewData;
    }

    public final void setData(Object object) {
        this.data = object;
    }

    public final void setNewData(Boolean bl2) {
        this.isNewData = bl2;
    }

    public final void setResponseStatusType(ResponseStatusType responseStatusType) {
        Intrinsics.checkNotNullParameter((Object)responseStatusType, "<set-?>");
        this.responseStatusType = responseStatusType;
    }

    public final void setStatusCode(Integer n3) {
        this.statusCode = n3;
    }

    public final void setStatusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
    }

    public final void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    public String toString() {
        ResponseStatusType responseStatusType = this.responseStatusType;
        StatusInfo statusInfo = this.statusInfo;
        Object object = this.data;
        Throwable throwable = this.throwable;
        Integer n3 = this.statusCode;
        Boolean bl2 = this.isNewData;
        StringBuilder stringBuilder = new StringBuilder("BaseResponse(responseStatusType=");
        stringBuilder.append((Object)responseStatusType);
        stringBuilder.append(", statusInfo=");
        stringBuilder.append(statusInfo);
        stringBuilder.append(", data=");
        stringBuilder.append(object);
        stringBuilder.append(", throwable=");
        stringBuilder.append(throwable);
        stringBuilder.append(", statusCode=");
        stringBuilder.append(n3);
        stringBuilder.append(", isNewData=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

