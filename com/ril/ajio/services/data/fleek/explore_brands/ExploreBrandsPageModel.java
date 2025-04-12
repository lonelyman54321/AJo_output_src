/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.explore_brands;

import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.explore_brands.Layout;
import com.ril.ajio.services.data.fleek.explore_brands.Seo;
import com.ril.ajio.services.data.fleek.explore_brands.Status;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ExploreBrandsPageModel {
    private BaseValue baseValue;
    private Layout layout;
    private Seo seo;
    private Status status;

    public ExploreBrandsPageModel() {
        this(null, null, null, null, 15, null);
    }

    public ExploreBrandsPageModel(BaseValue baseValue, Layout layout2, Seo seo, Status status) {
        this.baseValue = baseValue;
        this.layout = layout2;
        this.seo = seo;
        this.status = status;
    }

    public /* synthetic */ ExploreBrandsPageModel(BaseValue baseValue, Layout layout2, Seo seo, Status status, int n3, DefaultConstructorMarker defaultConstructorMarker) {
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
            status = null;
        }
        this(baseValue, layout2, seo, status);
    }

    public static /* synthetic */ ExploreBrandsPageModel copy$default(ExploreBrandsPageModel exploreBrandsPageModel, BaseValue baseValue, Layout layout2, Seo seo, Status status, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            baseValue = exploreBrandsPageModel.baseValue;
        }
        if ((n4 = n3 & 2) != 0) {
            layout2 = exploreBrandsPageModel.layout;
        }
        if ((n4 = n3 & 4) != 0) {
            seo = exploreBrandsPageModel.seo;
        }
        if ((n3 &= 8) != 0) {
            status = exploreBrandsPageModel.status;
        }
        return exploreBrandsPageModel.copy(baseValue, layout2, seo, status);
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

    public final Status component4() {
        return this.status;
    }

    public final ExploreBrandsPageModel copy(BaseValue baseValue, Layout layout2, Seo seo, Status status) {
        ExploreBrandsPageModel exploreBrandsPageModel = new ExploreBrandsPageModel(baseValue, layout2, seo, status);
        return exploreBrandsPageModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ExploreBrandsPageModel;
        if (!bl3) {
            return false;
        }
        object = (ExploreBrandsPageModel)object;
        Object object2 = this.baseValue;
        Object object3 = ((ExploreBrandsPageModel)object).baseValue;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.layout;
        object3 = ((ExploreBrandsPageModel)object).layout;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.seo;
        object3 = ((ExploreBrandsPageModel)object).seo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.status;
        object = ((ExploreBrandsPageModel)object).status;
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

    public final Seo getSeo() {
        return this.seo;
    }

    public final Status getStatus() {
        return this.status;
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
        object = this.status;
        if (object != null) {
            n7 = ((Status)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setBaseValue(BaseValue baseValue) {
        this.baseValue = baseValue;
    }

    public final void setLayout(Layout layout2) {
        this.layout = layout2;
    }

    public final void setSeo(Seo seo) {
        this.seo = seo;
    }

    public final void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        BaseValue baseValue = this.baseValue;
        Layout layout2 = this.layout;
        Seo seo = this.seo;
        Status status = this.status;
        StringBuilder stringBuilder = new StringBuilder("ExploreBrandsPageModel(baseValue=");
        stringBuilder.append(baseValue);
        stringBuilder.append(", layout=");
        stringBuilder.append(layout2);
        stringBuilder.append(", seo=");
        stringBuilder.append(seo);
        stringBuilder.append(", status=");
        stringBuilder.append(status);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

