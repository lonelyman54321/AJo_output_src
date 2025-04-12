/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.clevertap.android.sdk.inapp;

import android.view.View;
import com.clevertap.android.sdk.inapp.e;

public final class e$a
implements View.OnClickListener {
    public final /* synthetic */ e a;

    public e$a(e e2) {
        this.a = e2;
    }

    public final void onClick(View view) {
        e e2 = this.a;
        e2.Pa(null);
        e2.getActivity().finish();
    }
}

