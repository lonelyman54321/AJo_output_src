/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.provider;

import androidx.core.provider.h$c;

class CallbackWrapper$2
implements Runnable {
    public final /* synthetic */ h$c a;
    public final /* synthetic */ int b;

    public CallbackWrapper$2(h$c h$c, int n3) {
        this.a = h$c;
        this.b = n3;
    }

    public final void run() {
        WK2$d wK2$d = ((ft3$a)this.a).a;
        if (wK2$d != null) {
            int n3 = this.b;
            wK2$d.onFontRetrievalFailed(n3);
        }
    }
}

