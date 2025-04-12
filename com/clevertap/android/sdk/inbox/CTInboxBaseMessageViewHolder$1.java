/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.inbox;

import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder$1$1;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;

class CTInboxBaseMessageViewHolder$1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CTInboxMessage b;
    public final /* synthetic */ CTInboxBaseMessageViewHolder c;

    public CTInboxBaseMessageViewHolder$1(CTInboxBaseMessageViewHolder cTInboxBaseMessageViewHolder, int n3, CTInboxMessage cTInboxMessage) {
        this.c = cTInboxBaseMessageViewHolder;
        this.a = n3;
        this.b = cTInboxMessage;
    }

    public final void run() {
        CTInboxListViewFragment cTInboxListViewFragment = (CTInboxListViewFragment)this.c.m.get();
        if (cTInboxListViewFragment != null) {
            FragmentActivity fragmentActivity = cTInboxListViewFragment.getActivity();
            if (fragmentActivity == null) {
                return;
            }
            CTInboxBaseMessageViewHolder$1$1 cTInboxBaseMessageViewHolder$1$1 = new CTInboxBaseMessageViewHolder$1$1(this, cTInboxListViewFragment);
            fragmentActivity.runOnUiThread(cTInboxBaseMessageViewHolder$1$1);
        }
    }
}

