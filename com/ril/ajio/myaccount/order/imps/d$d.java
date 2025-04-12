/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
package com.ril.ajio.myaccount.order.imps;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.fragment.app.Fragment;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.myaccount.order.imps.d;
import kotlin.jvm.internal.Intrinsics;

public final class d$d
implements TextWatcher {
    public final /* synthetic */ d a;

    public d$d(d d2) {
        this.a = d2;
    }

    public final void afterTextChanged(Editable object) {
        int n3;
        int n4;
        int n7;
        Intrinsics.checkNotNullParameter(object, "s");
        object = this.a;
        AjioEditText ajioEditText = ((d)object).m;
        int bl3 = fd0_0.c(ajioEditText);
        String string2 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ReturnImpsActivity";
        if (bl3 == 0 || (n7 = fd0_0.c(ajioEditText = ((d)object).o)) == 0 || (n4 = fd0_0.c(ajioEditText = ((d)object).q)) < (n3 = 11)) {
            object = ((Fragment)object).requireActivity();
            Intrinsics.checkNotNull(object, string2);
            object = (ReturnImpsActivity)object;
            boolean bl2 = false;
            ajioEditText = null;
            ((ReturnImpsActivity)object).y2(false);
        } else {
            object = ((Fragment)object).requireActivity();
            Intrinsics.checkNotNull(object, string2);
            object = (ReturnImpsActivity)object;
            boolean bl4 = true;
            ((ReturnImpsActivity)object).y2(bl4);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }
}

