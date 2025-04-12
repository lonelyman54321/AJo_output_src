/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.view.View
 */
package com.ril.ajio.payment.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.ril.ajio.payment.fragment.h;
import kotlin.jvm.internal.Intrinsics;

public final class h$d
implements TextWatcher {
    public final /* synthetic */ h a;

    public h$d(h h3) {
        this.a = h3;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        String string2 = "s";
        Intrinsics.checkNotNullParameter(charSequence, string2);
        charSequence = this.a.z;
        if (charSequence == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtCvvError");
            charSequence = null;
        }
        ai0_2.i((View)charSequence);
    }
}

