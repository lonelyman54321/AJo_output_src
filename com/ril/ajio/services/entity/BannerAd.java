/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.entity;

import com.ril.ajio.services.entity.Result;
import java.lang.constant.Constable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BannerAd {
    private Result result;
    private Integer statusCode;
    private Boolean success;

    public BannerAd() {
        this(null, null, null, 7, null);
    }

    public BannerAd(Result result2, Integer n3, Boolean bl2) {
        this.result = result2;
        this.statusCode = n3;
        this.success = bl2;
    }

    public /* synthetic */ BannerAd(Result result2, Integer n3, Boolean bl2, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n7 = 3;
            result2 = new Result(null, null, n7, null);
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = null;
        }
        if ((n4 &= 4) != 0) {
            bl2 = null;
        }
        this(result2, n3, bl2);
    }

    public static /* synthetic */ BannerAd copy$default(BannerAd bannerAd, Result result2, Integer n3, Boolean bl2, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            result2 = bannerAd.result;
        }
        if ((n7 = n4 & 2) != 0) {
            n3 = bannerAd.statusCode;
        }
        if ((n4 &= 4) != 0) {
            bl2 = bannerAd.success;
        }
        return bannerAd.copy(result2, n3, bl2);
    }

    public final Result component1() {
        return this.result;
    }

    public final Integer component2() {
        return this.statusCode;
    }

    public final Boolean component3() {
        return this.success;
    }

    public final BannerAd copy(Result result2, Integer n3, Boolean bl2) {
        BannerAd bannerAd = new BannerAd(result2, n3, bl2);
        return bannerAd;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BannerAd;
        if (!bl3) {
            return false;
        }
        object = (BannerAd)object;
        Object object2 = this.result;
        Object object3 = ((BannerAd)object).result;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.statusCode;
        object3 = ((BannerAd)object).statusCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.success;
        object = ((BannerAd)object).success;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Result getResult() {
        return this.result;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int n3;
        int n4;
        Result result2 = this.result;
        int n7 = 0;
        if (result2 == null) {
            n4 = 0;
            result2 = null;
        } else {
            n4 = result2.hashCode();
        }
        n4 *= 31;
        Constable constable = this.statusCode;
        if (constable == null) {
            n3 = 0;
            constable = null;
        } else {
            n3 = constable.hashCode();
        }
        n4 = (n4 + n3) * 31;
        constable = this.success;
        if (constable != null) {
            n7 = constable.hashCode();
        }
        return n4 + n7;
    }

    public final void setResult(Result result2) {
        this.result = result2;
    }

    public final void setStatusCode(Integer n3) {
        this.statusCode = n3;
    }

    public final void setSuccess(Boolean bl2) {
        this.success = bl2;
    }

    public String toString() {
        Result result2 = this.result;
        Integer n3 = this.statusCode;
        Boolean bl2 = this.success;
        StringBuilder stringBuilder = new StringBuilder("BannerAd(result=");
        stringBuilder.append(result2);
        stringBuilder.append(", statusCode=");
        stringBuilder.append(n3);
        stringBuilder.append(", success=");
        return nx3_0.a(stringBuilder, bl2, ")");
    }
}

