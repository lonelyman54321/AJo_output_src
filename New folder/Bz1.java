/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;

public final class Bz1
implements TextWatcher {
    public final /* synthetic */ az1_2 a;

    public Bz1(az1_2 az1_22) {
        this.a = az1_22;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        charSequence = null;
        bv1_0.b = null;
        az1_2 az1_22 = this.a;
        Object object = az1_22.B;
        if (object == null) {
            object = "invalidReferralTV";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            charSequence = object;
        }
        charSequence.setVisibility(8);
        bv1_0.e = "used referal - custom";
        az1_22.Ua();
    }
}

