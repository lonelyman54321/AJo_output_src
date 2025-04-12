/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.callmeback;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.ril.ajio.ondemand.customercare.callmeback.CcCallMeFragment;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class CcCallMeFragment$onViewCreated$1
implements TextWatcher {
    final /* synthetic */ CcCallMeFragment this$0;

    public CcCallMeFragment$onViewCreated$1(CcCallMeFragment ccCallMeFragment) {
        this.this$0 = ccCallMeFragment;
    }

    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        n3 = 1;
        Intrinsics.checkNotNullParameter(object, "s");
        TextView textView = CcCallMeFragment.access$getTvCharacter$p(this.this$0);
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvCharacter");
            textView = null;
        }
        Object[] objectArray = StringCompanionObject.INSTANCE;
        object = object.length();
        objectArray = new Object[n3];
        objectArray[0] = object;
        object = Arrays.copyOf(objectArray, n3);
        object = String.format("%s/255 characters limit", object);
        Intrinsics.checkNotNullExpressionValue(object, "format(...)");
        textView.setText((CharSequence)object);
    }
}

