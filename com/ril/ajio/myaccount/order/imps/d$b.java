/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.view.View
 */
package com.ril.ajio.myaccount.order.imps;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.myaccount.order.imps.d;
import kotlin.jvm.internal.Intrinsics;

public final class d$b
implements TextWatcher {
    public final /* synthetic */ d a;

    public d$b(d d2) {
        this.a = d2;
    }

    public final void afterTextChanged(Editable object) {
        Intrinsics.checkNotNullParameter(object, "s");
        Object object2 = this.a;
        Object object3 = ((d)object2).M;
        if (object3 != null) {
            ai0_2.i((View)object3);
        }
        object3 = ((d)object2).m;
        int n3 = fd0_0.c((AjioEditText)object3);
        boolean bl2 = true;
        int n4 = 11;
        String string2 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.imps.ReturnImpsActivity";
        if (n3 == 0 || (n3 = fd0_0.c((AjioEditText)(object3 = ((d)object2).o))) == 0 || (n3 = fd0_0.c((AjioEditText)(object3 = ((d)object2).q))) < n4) {
            object3 = ((Fragment)object2).requireActivity();
            Intrinsics.checkNotNull(object3, string2);
            object3 = (ReturnImpsActivity)object3;
            ((ReturnImpsActivity)object3).y2(false);
        } else {
            object3 = ((Fragment)object2).requireActivity();
            Intrinsics.checkNotNull(object3, string2);
            object3 = (ReturnImpsActivity)object3;
            ((ReturnImpsActivity)object3).y2(bl2);
        }
        object3 = object.toString();
        n3 = ((String)object3).length();
        if (n3 == n4) {
            n3 = (int)(((d)object2).Pa(false) ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(((d)object2).H ? 1 : 0)) != 0) {
                object3 = ((d)object2).x;
                if (object3 != null) {
                    String string3 = object.toString();
                    String string4 = "<set-?>";
                    Intrinsics.checkNotNullParameter(string3, string4);
                    ((wf1_2)object3).i = string3;
                }
                if ((object2 = ((d)object2).x) != null) {
                    object = object.toString();
                    ((wf1_2)object2).b((String)object);
                }
            }
        } else {
            int n7;
            object = ((d)object2).v;
            n3 = 8;
            if (object != null) {
                object.setVisibility(n3);
            }
            if ((object = ((d)object2).E) != null) {
                object.setVisibility(n3);
            }
            if ((object = ((d)object2).D) != null) {
                object.setVisibility(0);
            }
            if ((n7 = fd0_0.c((AjioEditText)(object = ((d)object2).m))) == 0 || (n7 = fd0_0.c((AjioEditText)(object = ((d)object2).o))) == 0 || (n7 = fd0_0.c((AjioEditText)(object = ((d)object2).q))) < n4) {
                object = ((Fragment)object2).requireActivity();
                Intrinsics.checkNotNull(object, string2);
                object = (ReturnImpsActivity)object;
                ((ReturnImpsActivity)object).y2(false);
            } else {
                object = ((Fragment)object2).requireActivity();
                Intrinsics.checkNotNull(object, string2);
                object = (ReturnImpsActivity)object;
                ((ReturnImpsActivity)object).y2(bl2);
            }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }
}

