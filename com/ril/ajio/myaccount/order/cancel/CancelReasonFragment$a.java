/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemSelectedListener
 */
package com.ril.ajio.myaccount.order.cancel;

import android.view.View;
import android.widget.AdapterView;
import com.ril.ajio.myaccount.order.cancel.CancelReasonFragment;

public final class CancelReasonFragment$a
implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ CancelReasonFragment a;

    public CancelReasonFragment$a(CancelReasonFragment cancelReasonFragment) {
        this.a = cancelReasonFragment;
    }

    public final void onItemSelected(AdapterView object, View object2, int n3, long l2) {
        object = this.a;
        object2 = object.n;
        int n4 = object2.getSelectedItemPosition();
        n3 = 1;
        if (n4 == 0) {
            object2 = cp_1.Companion;
            n4 = (int)(km_1.b((cp$a)object2) ? 1 : 0);
            if (n4 != 0) {
                object = object.A;
                object.setEnabled(n3 != 0);
            } else {
                object = object.A;
                n4 = 0;
                object2 = null;
                object.setEnabled(false);
            }
        } else {
            object = object.A;
            object.setEnabled(n3 != 0);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}

