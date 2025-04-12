/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.clevertap.android.sdk.inbox;

import android.view.View;
import com.clevertap.android.sdk.inbox.CTInboxActivity;

public final class CTInboxActivity$a
implements View.OnClickListener {
    public final /* synthetic */ CTInboxActivity a;

    public CTInboxActivity$a(CTInboxActivity cTInboxActivity) {
        this.a = cTInboxActivity;
    }

    public final void onClick(View view) {
        this.a.finish();
    }
}

