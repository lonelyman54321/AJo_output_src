/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.fragments;

import androidx.compose.foundation.layout.j;
import com.ril.ajio.pdprefresh.fragments.d;
import com.ril.ajio.services.data.reviewRatings.ImageMap;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import com.ril.ajio.services.data.reviewRatings.Thumbnail;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

public final class d$e
implements Function2 {
    public final /* synthetic */ lt1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ d c;

    public d$e(lt1 lt12, int n3, d d2) {
        this.a = lt12;
        this.b = n3;
        this.c = d2;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = this.a;
            n3 = this.b;
            Object object4 = (ProductReview)((lt1)object).b(n3);
            String string2 = null;
            if (object4 == null || (object4 = ((ProductReview)object4).getImageMap()) == null || (object4 = ((ImageMap)object4).getThumbnail()) == null || (object4 = (Thumbnail)CollectionsKt.N(0, (List)object4)) == null || (object4 = ((Thumbnail)object4).getImageUrl()) == null) {
                object4 = "";
            }
            object3.u(1998134191);
            int n7 = 8;
            object4 = u63.a(object4, (b30_0)object3, n7);
            object3.I();
            LP1 lP1 = j.c;
            Object object5 = this.c;
            ih0_1 ih0_12 = new ih0_1((lt1)object, n3, (d)object5);
            n4 = 0;
            object = null;
            n3 = 7;
            lP1 = androidx.compose.foundation.d.b(lP1, false, null, ih0_12, n3);
            object5 = i70$a.a;
            int n8 = 24624;
            int n10 = 104;
            string2 = "";
            ih0_12 = null;
            Pd1.a((im2)object4, string2, lP1, null, (i70_0)object5, 0.0f, null, (b30_0)object3, n8, n10);
        }
        return Unit.a;
    }
}

