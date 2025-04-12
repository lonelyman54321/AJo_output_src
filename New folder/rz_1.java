/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.view.View
 *  android.widget.TextView
 */
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rz
 */
public final class rz_1
implements TextWatcher {
    public final /* synthetic */ sz_2 a;

    public rz_1(sz_2 sz_22) {
        this.a = sz_22;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence object, int n3, int n4, int n7) {
        object = this.a;
        TextView textView = ((sz_2)object).Pa();
        ai0_2.k((View)textView);
        object = ((sz_2)object).n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pinNumberErrorTextView");
            object = null;
        }
        ai0_2.i((View)object);
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }
}

