/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.fragment.app;

import android.view.View;
import androidx.fragment.app.DialogFragment;

public final class DialogFragment$d
extends cw0_0 {
    public final /* synthetic */ cw0_0 a;
    public final /* synthetic */ DialogFragment b;

    public DialogFragment$d(DialogFragment dialogFragment, cw0_0 cw0_02) {
        this.b = dialogFragment;
        this.a = cw0_02;
    }

    public final View b(int n3) {
        cw0_0 cw0_02 = this.a;
        boolean bl2 = cw0_02.c();
        if (bl2) {
            return cw0_02.b(n3);
        }
        return this.b.onFindViewById(n3);
    }

    public final boolean c() {
        Object object = this.a;
        boolean bl2 = ((cw0_0)object).c();
        if (!bl2 && !(bl2 = ((DialogFragment)(object = this.b)).onHasView())) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

