/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.brand_page;

import com.ril.ajio.services.data.fleek.brand_page.Layout;
import com.ril.ajio.services.data.fleek.brand_page.Seo;
import com.ril.ajio.services.data.fleek.brand_page.Status;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BrandPageModel {
    private Layout layout;
    private Seo seo;
    private Status status;

    public BrandPageModel() {
        this(null, null, null, 7, null);
    }

    public BrandPageModel(Layout layout2, Seo seo, Status status) {
        this.layout = layout2;
        this.seo = seo;
        this.status = status;
    }

    public /* synthetic */ BrandPageModel(Layout layout2, Seo seo, Status status, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            layout2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            seo = null;
        }
        if ((n3 &= 4) != 0) {
            status = null;
        }
        this(layout2, seo, status);
    }

    public static /* synthetic */ BrandPageModel copy$default(BrandPageModel brandPageModel, Layout layout2, Seo seo, Status status, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            layout2 = brandPageModel.layout;
        }
        if ((n4 = n3 & 2) != 0) {
            seo = brandPageModel.seo;
        }
        if ((n3 &= 4) != 0) {
            status = brandPageModel.status;
        }
        return brandPageModel.copy(layout2, seo, status);
    }

    public final Layout component1() {
        return this.layout;
    }

    public final Seo component2() {
        return this.seo;
    }

    public final Status component3() {
        return this.status;
    }

    public final BrandPageModel copy(Layout layout2, Seo seo, Status status) {
        BrandPageModel brandPageModel = new BrandPageModel(layout2, seo, status);
        return brandPageModel;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BrandPageModel;
        if (!bl3) {
            return false;
        }
        object = (BrandPageModel)object;
        Object object2 = this.layout;
        Object object3 = ((BrandPageModel)object).layout;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.seo;
        object3 = ((BrandPageModel)object).seo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.status;
        object = ((BrandPageModel)object).status;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
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
        Layout layout2 = this.layout;
        int n7 = 0;
        if (layout2 == null) {
            n4 = 0;
            layout2 = null;
        } else {
            n4 = layout2.hashCode();
        }
        n4 *= 31;
        Object object = this.seo;
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
        Layout layout2 = this.layout;
        Seo seo = this.seo;
        Status status = this.status;
        StringBuilder stringBuilder = new StringBuilder("BrandPageModel(layout=");
        stringBuilder.append(layout2);
        stringBuilder.append(", seo=");
        stringBuilder.append(seo);
        stringBuilder.append(", status=");
        stringBuilder.append(status);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

