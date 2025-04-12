/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
package com.ril.ajio.ondemand.customercare.callmeback;

import android.text.Editable;
import android.text.TextWatcher;
import com.ril.ajio.ondemand.customercare.callmeback.CcCallMeFragment;
import kotlin.jvm.internal.Intrinsics;

public final class CcCallMeFragment$onViewCreated$2
implements TextWatcher {
    final /* synthetic */ CcCallMeFragment this$0;

    public CcCallMeFragment$onViewCreated$2(CcCallMeFragment ccCallMeFragment) {
        this.this$0 = ccCallMeFragment;
    }

    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        String string2 = "s";
        Intrinsics.checkNotNullParameter(charSequence, string2);
        charSequence = CcCallMeFragment.access$getLblMobileError$p(this.this$0);
        if (charSequence == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lblMobileError");
            charSequence = null;
        }
        charSequence.setVisibility(8);
    }
}

