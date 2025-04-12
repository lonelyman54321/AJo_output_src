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

/*
 * Renamed from qA1
 */
public final class qa1_0
implements TextWatcher {
    public final /* synthetic */ pA1 a;

    public qa1_0(pA1 pA12) {
        this.a = pA12;
    }

    public final void afterTextChanged(Editable object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "editable");
        object = this.a;
        TextInputLayout textInputLayout = object.h;
        if (textInputLayout != null) {
            n3 = 0;
            textInputLayout.setError(null);
        }
        if ((textInputLayout = object.v) != null) {
            n3 = 4;
            textInputLayout.setVisibility(n3);
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

