/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
package com.ril.ajio.pdprefresh.fragments;

import android.os.Handler;
import android.os.Message;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.internal.Intrinsics;

public final class NewProductDetailsFragment$c
extends Handler {
    public final /* synthetic */ NewProductDetailsFragment a;

    public NewProductDetailsFragment$c(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final void handleMessage(Message object) {
        String string2 = "msg";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((Message)object).arg1;
        int n4 = 1;
        if (n3 == n4) {
            object = this.a;
            ((NewProductDetailsFragment)object).Qa();
        }
    }
}

