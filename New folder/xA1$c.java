/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;

public final class xA1$c
implements TextWatcher {
    public final /* synthetic */ xA1 a;

    public xA1$c(xA1 xA12) {
        this.a = xA12;
    }

    public final void afterTextChanged(Editable object) {
        object = this.a.w;
        if (object != null) {
            object.setError(null);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }
}

