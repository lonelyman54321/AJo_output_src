/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import com.ril.ajio.payment.fragment.d;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sP1
 */
public final class sp1_2
implements TextWatcher {
    public final /* synthetic */ d a;

    public sp1_2(d d2) {
        this.a = d2;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        String string2 = "charSequence";
        Intrinsics.checkNotNullParameter(charSequence, string2);
        int n8 = charSequence.length();
        n3 = 10;
        d d2 = this.a;
        if (n8 == n3) {
            n8 = 1;
            d2.Qa(n8 != 0);
        } else {
            n8 = 0;
            charSequence = null;
            d2.Qa(false);
        }
    }
}

