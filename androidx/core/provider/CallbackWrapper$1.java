/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
package androidx.core.provider;

import android.graphics.Typeface;
import androidx.core.provider.h$c;

class CallbackWrapper$1
implements Runnable {
    public final /* synthetic */ h$c a;
    public final /* synthetic */ Typeface b;

    public CallbackWrapper$1(h$c c2, Typeface typeface) {
        this.a = c2;
        this.b = typeface;
    }

    public final void run() {
        WK2$d wK2$d = ((ft3$a)this.a).a;
        if (wK2$d != null) {
            Typeface typeface = this.b;
            wK2$d.onFontRetrieved(typeface);
        }
    }
}

