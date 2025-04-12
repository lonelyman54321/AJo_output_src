/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.home.landingpage.viewholder.cms;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCuratedWidgetVH;
import kotlin.jvm.internal.Intrinsics;

public final class HomeCuratedWidgetVH$a
extends RecyclerView$s {
    public final /* synthetic */ HomeCuratedWidgetVH a;

    public HomeCuratedWidgetVH$a(HomeCuratedWidgetVH homeCuratedWidgetVH) {
        this.a = homeCuratedWidgetVH;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        String string2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onScrollStateChanged((RecyclerView)object, n3);
        if (n3 == 0) {
            object = this.a;
            ((HomeCuratedWidgetVH)object).w();
        }
    }
}

