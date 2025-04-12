/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.view.View
 */
package com.ril.ajio.myaccount.address.fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class AddAddressFragment$b
implements TextWatcher {
    public final /* synthetic */ AddAddressFragment a;

    public AddAddressFragment$b(AddAddressFragment addAddressFragment) {
        this.a = addAddressFragment;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void afterTextChanged(Editable object) {
        String string2;
        boolean bl2;
        View view;
        Object object2 = this.a;
        boolean bl3 = ((AddAddressFragment)object2).m;
        View view2 = null;
        String string3 = "resetView";
        boolean bl4 = true;
        if (bl3) {
            void var3_8;
            if (object != null) {
                int n3 = object.length();
            } else {
                boolean bl5 = false;
                view = null;
            }
            if (var3_8 >= bl4) {
                View view3 = ((AddAddressFragment)object2).I;
                if (view3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                } else {
                    view2 = view3;
                }
                view2.setEnabled(bl4);
                return;
            }
        }
        if ((view = ((AddAddressFragment)object2).I) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
        } else {
            view2 = view;
        }
        if (object == null || (bl2 = b.i((String)(object2 = ((AddAddressFragment)object2).Y), string2 = object.toString(), false))) {
            bl4 = false;
        }
        view2.setEnabled(bl4);
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }
}

