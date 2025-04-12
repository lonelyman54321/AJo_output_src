/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ratings;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubRatingResponse {
    private String message;
    private String resultCode;
    private String status;

    public SubRatingResponse() {
        this(null, null, null, 7, null);
    }

    public SubRatingResponse(String string2, String string3, String string4) {
        this.message = string2;
        this.resultCode = string3;
        this.status = string4;
    }

    public /* synthetic */ SubRatingResponse(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ SubRatingResponse copy$default(SubRatingResponse subRatingResponse, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = subRatingResponse.message;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = subRatingResponse.resultCode;
        }
        if ((n3 &= 4) != 0) {
            string4 = subRatingResponse.status;
        }
        return subRatingResponse.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.message;
    }

    public final String component2() {
        return this.resultCode;
    }

    public final String component3() {
        return this.status;
    }

    public final SubRatingResponse copy(String string2, String string3, String string4) {
        SubRatingResponse subRatingResponse = new SubRatingResponse(string2, string3, string4);
        return subRatingResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SubRatingResponse;
        if (!bl3) {
            return false;
        }
        object = (SubRatingResponse)object;
        String string2 = this.message;
        String string3 = ((SubRatingResponse)object).message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.resultCode;
        string3 = ((SubRatingResponse)object).resultCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.status;
        object = ((SubRatingResponse)object).status;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getResultCode() {
        return this.resultCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.message;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.resultCode;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.status;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public final void setResultCode(String string2) {
        this.resultCode = string2;
    }

    public final void setStatus(String string2) {
        this.status = string2;
    }

    public String toString() {
        String string2 = this.message;
        String string3 = this.resultCode;
        String string4 = this.status;
        return h30_0.a(og_1.a("SubRatingResponse(message=", string2, ", resultCode=", string3, ", status="), string4, ")");
    }
}

