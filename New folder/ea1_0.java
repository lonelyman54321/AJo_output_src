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
 * Renamed from eA1
 */
public final class ea1_0
implements TextWatcher {
    public final /* synthetic */ da1_1 a;

    public ea1_0(da1_1 da1_12) {
        this.a = da1_12;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
        editable = this.a.k;
        Intrinsics.checkNotNull(editable);
        editable.setVisibility(4);
        editable.setText((CharSequence)"");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }
}

