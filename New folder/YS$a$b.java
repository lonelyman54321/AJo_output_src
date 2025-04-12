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

public final class YS$a$b
implements TextWatcher {
    public final /* synthetic */ YS$a a;
    public final /* synthetic */ ys_1 b;

    public YS$a$b(YS$a yS$a, ys_1 ys_12) {
        this.a = yS$a;
        this.b = ys_12;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Object object = this.a;
        TextInputLayout textInputLayout = ((YS$a)object).d;
        if (textInputLayout != null) {
            textInputLayout.setError(null);
        }
        if ((object = ((YS$a)object).f) != null) {
            n4 = 8;
            object.setVisibility(n4);
        }
        object = this.b.l;
        charSequence = ((Object)charSequence).toString();
        object.t0((String)charSequence);
    }
}

