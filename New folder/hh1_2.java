/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.InputFilter
 *  android.text.Spanned
 */
import android.text.InputFilter;
import android.text.Spanned;
import in.juspay.hypersdk.core.InflateView;

/*
 * Renamed from hh1
 */
public final class hh1_2
implements InputFilter {
    public final /* synthetic */ String a;

    public /* synthetic */ hh1_2(String string2) {
        this.a = string2;
    }

    public final CharSequence filter(CharSequence charSequence, int n3, int n4, Spanned spanned, int n7, int n8) {
        return InflateView.i(this.a, charSequence, n3, n4, spanned, n7, n8);
    }
}

