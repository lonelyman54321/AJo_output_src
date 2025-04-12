/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 */
package com.ril.ajio.home.landingpage.view;

import android.database.DataSetObserver;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

public final class NewAjioStoryViewPager$i
extends DataSetObserver {
    public final /* synthetic */ NewAjioStoryViewPager a;

    public NewAjioStoryViewPager$i(NewAjioStoryViewPager newAjioStoryViewPager) {
        this.a = newAjioStoryViewPager;
    }

    public final void onChanged() {
        this.a.f();
    }

    public final void onInvalidated() {
        this.a.f();
    }
}

