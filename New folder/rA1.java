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

public final class rA1
implements TextWatcher {
    public final /* synthetic */ pA1 a;

    public rA1(pA1 pA12) {
        this.a = pA12;
    }

    public final void afterTextChanged(Editable object) {
        Intrinsics.checkNotNullParameter(object, "editable");
        object = this.a;
        TextInputLayout textInputLayout = object.u;
        if (textInputLayout != null) {
            textInputLayout.setError(null);
        }
        pA1.Pa((pA1)object);
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }
}

