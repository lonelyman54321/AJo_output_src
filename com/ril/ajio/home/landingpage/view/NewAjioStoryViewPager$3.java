/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.home.landingpage.view;

import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;

class NewAjioStoryViewPager$3
implements Runnable {
    public final /* synthetic */ NewAjioStoryViewPager a;

    public NewAjioStoryViewPager$3(NewAjioStoryViewPager newAjioStoryViewPager) {
        this.a = newAjioStoryViewPager;
    }

    public final void run() {
        NewAjioStoryViewPager newAjioStoryViewPager = this.a;
        newAjioStoryViewPager.setScrollState(0);
        newAjioStoryViewPager.r();
    }
}

