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
 * Renamed from Qz
 */
public final class qz_1
implements TextWatcher {
    public boolean a;
    public final /* synthetic */ sz_2 b;

    public qz_1(sz_2 sz_22) {
        this.b = sz_22;
    }

    public final void afterTextChanged(Editable editable) {
        int n3;
        String string2 = "s";
        Intrinsics.checkNotNullParameter(editable, string2);
        int n4 = this.a;
        if (n4 != 0) {
            return;
        }
        n4 = editable.length();
        if (n4 > (n3 = 4)) {
            string2 = editable.toString();
            String string3 = "";
            string2 = oo1_1.a("\\s", string2, string3);
            CharSequence charSequence = new StringBuilder(string2);
            this.a = n4;
            int n7 = editable.length();
            this.b.getClass();
            String string4 = "stringBuilder";
            Intrinsics.checkNotNullParameter(charSequence, string4);
            int n8 = ((StringBuilder)charSequence).length();
            int n10 = 0;
            for (n4 = 1; n4 < n8; ++n4) {
                int n14 = n4 % 4;
                if (n14 != 0) continue;
                n14 = n4 + n10;
                String string5 = " ";
                ((StringBuilder)charSequence).insert(n14, string5);
                ++n10;
            }
            string2 = ((StringBuilder)charSequence).toString();
            charSequence = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)charSequence);
            editable.replace(0, n7, (CharSequence)string2);
            this.a = false;
        }
    }

    public final void beforeTextChanged(CharSequence object, int n3, int n4, int n7) {
        object = this.b;
        TextView textView = ((sz_2)object).Pa();
        ai0_2.k((View)textView);
        object = ((sz_2)object).m;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cardNumberErrorTextView");
            object = null;
        }
        ai0_2.i((View)object);
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }
}

