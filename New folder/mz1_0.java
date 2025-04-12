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

/*
 * Renamed from Mz1
 */
public final class mz1_0
implements TextWatcher {
    public final /* synthetic */ lz1_2 a;

    public mz1_0(lz1_2 lz1_22) {
        this.a = lz1_22;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        charSequence = null;
        bv1_0.b = null;
        Object object = this.a.G;
        if (object == null) {
            object = "invalidReferralTV";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            charSequence = object;
        }
        charSequence.setVisibility(8);
        bv1_0.e = "used referal - custom";
    }
}

