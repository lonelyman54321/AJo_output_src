/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.ril.ajio.home.landingpage.activity;

import android.view.View;
import com.ril.ajio.R$id;
import com.ril.ajio.home.landingpage.activity.CustomVideoPlayerActivity;

public final class CustomVideoPlayerActivity$a
implements View.OnClickListener {
    public final /* synthetic */ CustomVideoPlayerActivity a;

    public CustomVideoPlayerActivity$a(CustomVideoPlayerActivity customVideoPlayerActivity) {
        this.a = customVideoPlayerActivity;
    }

    public final void onClick(View object) {
        int n3;
        int n4 = object.getId();
        if (n4 == (n3 = R$id.fvcIvClose)) {
            object = this.a;
            ((CustomVideoPlayerActivity)object).onBackPressed();
        }
    }
}

