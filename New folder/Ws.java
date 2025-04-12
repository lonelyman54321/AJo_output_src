/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewStructure
 *  android.view.autofill.AutofillId
 *  android.view.autofill.AutofillValue
 */
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

public final class Ws {
    public static final Ws a;

    static {
        Ws ws;
        a = ws = new Object();
    }

    public final AutofillId a(ViewStructure viewStructure) {
        return Ts.b(viewStructure);
    }

    public final boolean b(AutofillValue autofillValue) {
        return Us.b(autofillValue);
    }

    public final boolean c(AutofillValue autofillValue) {
        return Ps.b(autofillValue);
    }

    public final boolean d(AutofillValue autofillValue) {
        return qs_0.b(autofillValue);
    }

    public final boolean e(AutofillValue autofillValue) {
        return V1.c(autofillValue);
    }

    public final void f(ViewStructure viewStructure, String[] stringArray) {
        vs_0.b(viewStructure, stringArray);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int n3) {
        Os.b(viewStructure, autofillId, n3);
    }

    public final void h(ViewStructure viewStructure, int n3) {
        rs_0.b(viewStructure, n3);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        return ss_0.b(autofillValue);
    }
}

