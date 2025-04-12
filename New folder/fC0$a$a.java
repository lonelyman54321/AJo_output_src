/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.widget.TextView
 */
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

public final class fC0$a$a
implements TextWatcher {
    public final /* synthetic */ fc0$a_0 a;

    public fC0$a$a(fc0$a_0 a_02) {
        this.a = a_02;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        fc0$a_0 fc0$a_0 = this.a;
        TextView textView = fc0$a_0.a;
        int n8 = charSequence.length();
        n7 = 6;
        if (n8 == n7) {
            n8 = 1;
        } else {
            n8 = 0;
            charSequence = null;
        }
        textView.setEnabled(n8 != 0);
        fc0$a_0.b.setError(null);
    }
}

