/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
package com.ril.ajio.home.landingpage.view;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.core.view.f;
import androidx.core.view.f$k;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

public final class NewAjioStoryViewPager$c
implements T72 {
    public final Rect a;
    public final /* synthetic */ NewAjioStoryViewPager b;

    public NewAjioStoryViewPager$c(NewAjioStoryViewPager newAjioStoryViewPager) {
        this.b = newAjioStoryViewPager;
        this.a = newAjioStoryViewPager;
    }

    public final f onApplyWindowInsets(View object, f object2) {
        int n3;
        int n4;
        int n7;
        int n8;
        object = ViewCompat.n((View)object, (f)object2);
        object2 = ((f)object).a;
        boolean n42 = ((f$k)object2).m();
        if (n42) {
            return object;
        }
        int n10 = ((f)object).b();
        Rect rect = this.a;
        rect.left = n10;
        rect.top = n8 = ((f)object).d();
        rect.right = n7 = ((f)object).c();
        rect.bottom = n4 = ((f)object).a();
        object2 = this.b;
        int n14 = object2.getChildCount();
        for (n3 = 0; n3 < n14; ++n3) {
            f f5 = ViewCompat.b(object2.getChildAt(n3), (f)object);
            int n15 = f5.b();
            int n16 = rect.left;
            rect.left = n15 = Math.min(n15, n16);
            n15 = f5.d();
            n16 = rect.top;
            rect.top = n15 = Math.min(n15, n16);
            n15 = f5.c();
            n16 = rect.right;
            rect.right = n15 = Math.min(n15, n16);
            int n17 = f5.a();
            n15 = rect.bottom;
            rect.bottom = n17 = Math.min(n17, n15);
        }
        int n18 = rect.left;
        n14 = rect.top;
        n3 = rect.right;
        int n19 = rect.bottom;
        return ((f)object).f(n18, n14, n3, n19);
    }
}

