/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import androidx.fragment.app.n;
import java.util.ArrayList;

class Fragment$4
implements Runnable {
    public final /* synthetic */ n a;

    public Fragment$4(n n3) {
        this.a = n3;
    }

    public final void run() {
        n n3 = this.a;
        ArrayList arrayList = n3.b;
        boolean bl2 = arrayList.isEmpty() ^ true;
        if (bl2) {
            n3.e();
        }
    }
}

