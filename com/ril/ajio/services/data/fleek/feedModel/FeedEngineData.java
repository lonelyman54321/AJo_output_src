/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.feedModel;

import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.feedModel.Layout;
import com.ril.ajio.services.data.fleek.feedModel.PaginationInfo;
import com.ril.ajio.services.data.fleek.feedModel.Seo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FeedEngineData {
    private BaseValue baseValue;
    private Layout layout;
    private PaginationInfo paginationInfo;
    private Seo seo;

    public FeedEngineData() {
        this(null, null, null, null, 15, null);
    }

    public FeedEngineData(BaseValue baseValue, Layout layout2, Seo seo, PaginationInfo paginationInfo) {
        this.baseValue = baseValue;
        this.layout = layout2;
        this.seo = seo;
        this.paginationInfo = paginationInfo;
    }

    public /* synthetic */ FeedEngineData(BaseValue baseValue, Layout layout2, Seo seo, PaginationInfo paginationInfo, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            baseValue = null;
        }
        if ((n4 = n3 & 2) != 0) {
            layout2 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            seo = null;
        }
        if ((n3 &= 8) != 0) {
            paginationInfo = null;
        }
        this(baseValue, layout2, seo, paginationInfo);
    }

    public static /* synthetic */ FeedEngineData copy$default(FeedEngineData feedEngineData, BaseValue baseValue, Layout layout2, Seo seo, PaginationInfo paginationInfo, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            baseValue = feedEngineData.baseValue;
        }
        if ((n4 = n3 & 2) != 0) {
            layout2 = feedEngineData.layout;
        }
        if ((n4 = n3 & 4) != 0) {
            seo = feedEngineData.seo;
        }
        if ((n3 &= 8) != 0) {
            paginationInfo = feedEngineData.paginationInfo;
        }
        return feedEngineData.copy(baseValue, layout2, seo, paginationInfo);
    }

    public final BaseValue component1() {
        return this.baseValue;
    }

    public final Layout component2() {
        return this.layout;
    }

    public final Seo component3() {
        return this.seo;
    }

    public final PaginationInfo component4() {
        return this.paginationInfo;
    }

    public final FeedEngineData copy(BaseValue baseValue, Layout layout2, Seo seo, PaginationInfo paginationInfo) {
        FeedEngineData feedEngineData = new FeedEngineData(baseValue, layout2, seo, paginationInfo);
        return feedEngineData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FeedEngineData;
        if (!bl3) {
            return false;
        }
        object = (FeedEngineData)object;
        Object object2 = this.baseValue;
        Object object3 = ((FeedEngineData)object).baseValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.layout;
        object3 = ((FeedEngineData)object).layout;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.seo;
        object3 = ((FeedEngineData)object).seo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.paginationInfo;
        object = ((FeedEngineData)object).paginationInfo;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final BaseValue getBaseValue() {
        return this.baseValue;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final PaginationInfo getPaginationInfo() {
        return this.paginationInfo;
    }

    public final Seo getSeo() {
        return this.seo;
    }

    public int hashCode() {
        int n3;
        int n4;
        BaseValue baseValue = this.baseValue;
        int n7 = 0;
        if (baseValue == null) {
            n4 = 0;
            baseValue = null;
        } else {
            n4 = baseValue.hashCode();
        }
        n4 *= 31;
        Object object = this.layout;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Layout)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.seo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((Seo)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.paginationInfo;
        if (object != null) {
            n7 = ((PaginationInfo)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setBaseValue(BaseValue baseValue) {
        this.baseValue = baseValue;
    }

    public final void setLayout(Layout layout2) {
        this.layout = layout2;
    }

    public final void setPaginationInfo(PaginationInfo paginationInfo) {
        this.paginationInfo = paginationInfo;
    }

    public final void setSeo(Seo seo) {
        this.seo = seo;
    }

    public String toString() {
        BaseValue baseValue = this.baseValue;
        Layout layout2 = this.layout;
        Seo seo = this.seo;
        PaginationInfo paginationInfo = this.paginationInfo;
        StringBuilder stringBuilder = new StringBuilder("FeedEngineData(baseValue=");
        stringBuilder.append(baseValue);
        stringBuilder.append(", layout=");
        stringBuilder.append(layout2);
        stringBuilder.append(", seo=");
        stringBuilder.append(seo);
        stringBuilder.append(", paginationInfo=");
        stringBuilder.append(paginationInfo);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

