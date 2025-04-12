/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.text.TextWatcher
 */
package com.ril.ajio.myaccount.order;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.myaccount.order.MarkDeliveredActivity;

public final class MarkDeliveredActivity$a
implements TextWatcher {
    public final AjioEditText a;
    public final /* synthetic */ MarkDeliveredActivity b;

    public MarkDeliveredActivity$a(MarkDeliveredActivity markDeliveredActivity, AjioEditText ajioEditText) {
        this.b = markDeliveredActivity;
        this.a = ajioEditText;
    }

    public final void afterTextChanged(Editable object) {
        boolean bl2;
        AjioEditText ajioEditText = this.a;
        int n3 = ajioEditText.getId();
        int n4 = R$id.et_invoice_number1;
        MarkDeliveredActivity markDeliveredActivity = this.b;
        if (n3 == n4) {
            object = object.toString().trim();
            markDeliveredActivity.s0 = object;
            object = markDeliveredActivity.s0;
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (!bl2) {
                object = markDeliveredActivity.p0;
                object.requestFocus();
            }
        } else {
            n4 = R$id.et_invoice_number2;
            if (n3 == n4) {
                markDeliveredActivity.t0 = object = object.toString().trim();
                bl2 = TextUtils.isEmpty((CharSequence)(object = markDeliveredActivity.t0));
                if (!bl2) {
                    object = markDeliveredActivity.q0;
                    object.requestFocus();
                }
            } else {
                n4 = R$id.et_invoice_number3;
                if (n3 == n4) {
                    markDeliveredActivity.u0 = object = object.toString().trim();
                    bl2 = TextUtils.isEmpty((CharSequence)(object = markDeliveredActivity.u0));
                    if (!bl2) {
                        object = markDeliveredActivity.r0;
                        object.requestFocus();
                    }
                } else {
                    n4 = R$id.et_invoice_number4;
                    if (n3 == n4) {
                        markDeliveredActivity.v0 = object = object.toString().trim();
                    }
                }
            }
        }
        if (!((bl2 = TextUtils.isEmpty((CharSequence)(object = markDeliveredActivity.s0))) || (bl2 = TextUtils.isEmpty((CharSequence)(object = markDeliveredActivity.t0))) || (bl2 = TextUtils.isEmpty((CharSequence)(object = markDeliveredActivity.u0))) || (bl2 = TextUtils.isEmpty((CharSequence)(object = markDeliveredActivity.v0))))) {
            object = markDeliveredActivity.w0;
            n3 = 1;
            object.setEnabled(n3 != 0);
        } else {
            object = markDeliveredActivity.w0;
            n3 = 0;
            ajioEditText = null;
            object.setEnabled(false);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }
}

