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

public final class Mr2$b
implements TextWatcher {
    public final /* synthetic */ Mr2$a a;

    public Mr2$b(Mr2$a mr2$a) {
        this.a = mr2$a;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        String string2 = "s";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a.k;
        if (object != null) {
            string2 = "";
            ((TextInputLayout)((Object)object)).setError(string2);
        }
    }
}

