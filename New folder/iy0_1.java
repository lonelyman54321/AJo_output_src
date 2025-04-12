/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Iy0
 */
public final class iy0_1
implements TextWatcher {
    public final /* synthetic */ hy0_2 a;

    public iy0_1(hy0_2 hy0_22) {
        this.a = hy0_22;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "arg0");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "arg0");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "query");
        fw_2 fw_22 = this.a;
        zc_1 zc_12 = ((hy0_2)fw_22).g;
        if (zc_12 != null) {
            String string2 = ((Object)charSequence).toString();
            zc_12.Sa(string2);
        }
        if ((fw_22 = ((hy0_2)fw_22).h) != null) {
            charSequence = ((Object)charSequence).toString();
            ((zc_1)fw_22).Sa((String)charSequence);
        }
    }
}

