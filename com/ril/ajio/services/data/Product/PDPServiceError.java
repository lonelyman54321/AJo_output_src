/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class PDPServiceError
implements Serializable {
    private Integer code;
    private String message;
    private String severity;

    public PDPServiceError(Integer n3, String string2, String string3) {
        this.code = n3;
        this.message = string2;
        this.severity = string3;
    }

    public static /* synthetic */ PDPServiceError copy$default(PDPServiceError pDPServiceError, Integer n3, String string2, String string3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = pDPServiceError.code;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = pDPServiceError.message;
        }
        if ((n4 &= 4) != 0) {
            string3 = pDPServiceError.severity;
        }
        return pDPServiceError.copy(n3, string2, string3);
    }

    public final Integer component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.severity;
    }

    public final PDPServiceError copy(Integer n3, String string2, String string3) {
        PDPServiceError pDPServiceError = new PDPServiceError(n3, string2, string3);
        return pDPServiceError;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PDPServiceError;
        if (!bl3) {
            return false;
        }
        object = (PDPServiceError)object;
        Object object2 = this.code;
        Object object3 = ((PDPServiceError)object).code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        object3 = ((PDPServiceError)object).message;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.severity;
        object = ((PDPServiceError)object).severity;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getSeverity() {
        return this.severity;
    }

    public int hashCode() {
        int n3;
        int n4;
        Integer n7 = this.code;
        int n8 = 0;
        if (n7 == null) {
            n4 = 0;
            n7 = null;
        } else {
            n4 = ((Object)n7).hashCode();
        }
        n4 *= 31;
        String string2 = this.message;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.severity;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return n4 + n8;
    }

    public final void setCode(Integer n3) {
        this.code = n3;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setSeverity(String string2) {
        this.severity = string2;
    }

    public String toString() {
        Integer n3 = this.code;
        String string2 = this.message;
        String string3 = this.severity;
        StringBuilder stringBuilder = new StringBuilder("PDPServiceError(code=");
        stringBuilder.append(n3);
        stringBuilder.append(", message=");
        stringBuilder.append(string2);
        stringBuilder.append(", severity=");
        return h30_0.a(stringBuilder, string3, ")");
    }
}

