/*
 * Decompiled with CFR 0.152.
 */
package com.clevertap.android.sdk.inbox;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder$1;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment$a;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.lang.ref.Reference;
import java.util.ArrayList;

class CTInboxBaseMessageViewHolder$1$1
implements Runnable {
    public final /* synthetic */ CTInboxListViewFragment a;
    public final /* synthetic */ CTInboxBaseMessageViewHolder$1 b;

    public CTInboxBaseMessageViewHolder$1$1(CTInboxBaseMessageViewHolder$1 var1_1, CTInboxListViewFragment cTInboxListViewFragment) {
        this.b = var1_1;
        this.a = cTInboxListViewFragment;
    }

    public final void run() {
        CTInboxBaseMessageViewHolder$1 cTInboxBaseMessageViewHolder$1 = this.b;
        Object object = cTInboxBaseMessageViewHolder$1.c.o;
        int n3 = object.getVisibility();
        if (n3 == 0) {
            object = this.a;
            object.getClass();
            Object object2 = ((CTInboxListViewFragment)object).j;
            object2 = ((Reference)object2).get();
            try {
                object2 = (CTInboxListViewFragment$a)object2;
            }
            catch (Throwable throwable) {
                object2 = null;
            }
            if (object2 == null) {
                com.clevertap.android.sdk.b.j();
            }
            if (object2 != null) {
                com.clevertap.android.sdk.b.j();
                FragmentActivity fragmentActivity = ((Fragment)object).getActivity();
                fragmentActivity.getBaseContext();
                object = ((CTInboxListViewFragment)object).c;
                int n4 = cTInboxBaseMessageViewHolder$1.a;
                object = (CTInboxMessage)((ArrayList)object).get(n4);
                object2.d((CTInboxMessage)object);
            }
        }
        cTInboxBaseMessageViewHolder$1.c.o.setVisibility(8);
        cTInboxBaseMessageViewHolder$1.b.k = true;
    }
}

