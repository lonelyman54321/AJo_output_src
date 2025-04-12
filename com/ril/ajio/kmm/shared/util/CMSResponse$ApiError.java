/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.util;

import com.ril.ajio.kmm.shared.util.CMSResponse;
import kotlin.jvm.internal.Intrinsics;

public final class CMSResponse$ApiError
extends CMSResponse {
    private final Object errorData;

    public CMSResponse$ApiError(Object object) {
        super(false, 1, null);
        this.errorData = object;
    }

    public static /* synthetic */ CMSResponse$ApiError copy$default(CMSResponse$ApiError cMSResponse$ApiError, Object object, int n3, Object object2) {
        if ((n3 &= 1) != 0) {
            object = cMSResponse$ApiError.errorData;
        }
        return cMSResponse$ApiError.copy(object);
    }

    public final Object component1() {
        return this.errorData;
    }

    public final CMSResponse$ApiError copy(Object object) {
        CMSResponse$ApiError cMSResponse$ApiError = new CMSResponse$ApiError(object);
        return cMSResponse$ApiError;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CMSResponse$ApiError;
        if (!bl3) {
            return false;
        }
        object = (CMSResponse$ApiError)object;
        Object object2 = this.errorData;
        object = ((CMSResponse$ApiError)object).errorData;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Object getErrorData() {
        return this.errorData;
    }

    public int hashCode() {
        int n3;
        Object object = this.errorData;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        return n3;
    }

    public String toString() {
        Object object = this.errorData;
        StringBuilder stringBuilder = new StringBuilder("ApiError(errorData=");
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

