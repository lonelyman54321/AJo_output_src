/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
import android.graphics.Typeface;

public final class XK2
implements Runnable {
    public final /* synthetic */ WK2$d a;
    public final /* synthetic */ Typeface b;

    public /* synthetic */ XK2(WK2$d wK2$d, Typeface typeface) {
        this.a = wK2$d;
        this.b = typeface;
    }

    public final void run() {
        WK2$d wK2$d = this.a;
        Typeface typeface = this.b;
        WK2$d.a(wK2$d, typeface);
    }
}

