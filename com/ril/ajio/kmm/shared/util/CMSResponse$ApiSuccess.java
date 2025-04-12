/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.util;

import com.ril.ajio.kmm.shared.util.CMSResponse;
import kotlin.jvm.internal.Intrinsics;

public final class CMSResponse$ApiSuccess
extends CMSResponse {
    private final Object data;

    public CMSResponse$ApiSuccess(Object object) {
        Intrinsics.checkNotNullParameter(object, "data");
        super(false, 1, null);
        this.data = object;
    }

    public static /* synthetic */ CMSResponse$ApiSuccess copy$default(CMSResponse$ApiSuccess cMSResponse$ApiSuccess, Object object, int n3, Object object2) {
        if ((n3 &= 1) != 0) {
            object = cMSResponse$ApiSuccess.data;
        }
        return cMSResponse$ApiSuccess.copy(object);
    }

    public final Object component1() {
        return this.data;
    }

    public final CMSResponse$ApiSuccess copy(Object object) {
        Intrinsics.checkNotNullParameter(object, "data");
        CMSResponse$ApiSuccess cMSResponse$ApiSuccess = new CMSResponse$ApiSuccess(object);
        return cMSResponse$ApiSuccess;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CMSResponse$ApiSuccess;
        if (!bl3) {
            return false;
        }
        object = (CMSResponse$ApiSuccess)object;
        Object object2 = this.data;
        object = ((CMSResponse$ApiSuccess)object).data;
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

