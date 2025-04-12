/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.autofill.AutofillManager
 *  android.view.autofill.AutofillManager$AutofillCallback
 */
import android.view.autofill.AutofillManager;

public final class Ys
extends AutofillManager.AutofillCallback {
    public static final Ys a;

    static {
        Ys ys;
        a = ys = new AutofillManager.AutofillCallback();
    }

    public final void a(ef_1 ef_12) {
        ef_12 = ef_12.c;
        AutofillManager.AutofillCallback autofillCallback = d2_0.a((Object)this);
        Xs.b((AutofillManager)ef_12, autofillCallback);
    }

    public final void b(ef_1 ef_12) {
        ef_12 = ef_12.c;
        AutofillManager.AutofillCallback autofillCallback = d2_0.a((Object)this);
        e2_0.c((AutofillManager)ef_12, autofillCallback);
    }
}

