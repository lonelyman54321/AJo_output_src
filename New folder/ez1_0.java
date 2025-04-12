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
 * Renamed from Ez1
 */
public final class ez1_0
implements TextWatcher {
    public final /* synthetic */ az1_2 a;

    public ez1_0(az1_2 az1_22) {
        this.a = az1_22;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(object, "charSequence");
        object = this.a;
        TextInputLayout textInputLayout = ((az1_2)object).I;
        TextInputLayout textInputLayout2 = null;
        String string2 = "userNameTextInputLayout";
        if (textInputLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            textInputLayout = null;
        }
        if ((n3 = (int)(textInputLayout.isErrorEnabled() ? 1 : 0)) != 0) {
            textInputLayout = ((az1_2)object).I;
            if (textInputLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                textInputLayout2 = textInputLayout;
            }
            n3 = 0;
            textInputLayout = null;
            textInputLayout2.setErrorEnabled(false);
        }
        ((az1_2)object).Ua();
    }
}

