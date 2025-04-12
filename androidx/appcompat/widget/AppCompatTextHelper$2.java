/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

class AppCompatTextHelper$2
implements Runnable {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ Typeface b;
    public final /* synthetic */ int c;

    public AppCompatTextHelper$2(TextView textView, Typeface typeface, int n3) {
        this.a = textView;
        this.b = typeface;
        this.c = n3;
    }

    public final void run() {
        Typeface typeface = this.b;
        int n3 = this.c;
        this.a.setTypeface(typeface, n3);
    }
}

