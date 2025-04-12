/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.ril.ajio.home.landingpage.view;

import android.view.View;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$LayoutParams;
import java.util.Comparator;

public final class NewAjioStoryViewPager$j
implements Comparator {
    public final int compare(Object object, Object object2) {
        int n3;
        object = (View)object;
        object2 = (View)object2;
        object = (NewAjioStoryViewPager$LayoutParams)object.getLayoutParams();
        object2 = (NewAjioStoryViewPager$LayoutParams)object2.getLayoutParams();
        boolean bl2 = ((NewAjioStoryViewPager$LayoutParams)((Object)object)).a;
        boolean bl3 = ((NewAjioStoryViewPager$LayoutParams)((Object)object2)).a;
        if (bl2 != bl3) {
            n3 = bl2 ? 1 : -1;
        } else {
            n3 = ((NewAjioStoryViewPager$LayoutParams)((Object)object)).e;
            int n4 = ((NewAjioStoryViewPager$LayoutParams)((Object)object2)).e;
            n3 -= n4;
        }
        return n3;
    }
}

