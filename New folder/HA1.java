/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.Intrinsics;

public final class HA1
implements TextWatcher {
    public final /* synthetic */ ga1_0 a;

    public HA1(ga1_0 ga1_02) {
        this.a = ga1_02;
    }

    public final void afterTextChanged(Editable object) {
        String string2 = "editable";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a.l;
        if (object != null) {
            string2 = null;
            ((TextInputLayout)((Object)object)).setError(null);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }
}

