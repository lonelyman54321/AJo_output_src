/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.view.View
 */
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

public final class dN2$c
implements TextWatcher {
    public final /* synthetic */ dn2_2 a;

    public dN2$c(dn2_2 dn2_22) {
        this.a = dn2_22;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(object, "s");
        object = dn2_2.Companion;
        object = this.a.Pa().returnLayoutBarcode.lblErrorEan;
        Intrinsics.checkNotNullExpressionValue(object, "lblErrorEan");
        ai0_2.i((View)object);
    }
}

