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

public final class n12
implements TextWatcher {
    public final /* synthetic */ o12_0 a;

    public n12(o12_0 o12_02) {
        this.a = o12_02;
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
        TextView textView = ((o12_0)object).c;
        if (textView != null) {
            String string2 = "";
            textView.setText((CharSequence)string2);
        }
        if ((object = ((o12_0)object).c) != null) {
            n3 = 4;
            object.setVisibility(n3);
        }
    }
}

