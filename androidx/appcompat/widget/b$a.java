/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Build$VERSION
 *  android.widget.TextView
 */
package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextHelper$2;
import androidx.appcompat.widget.b;
import androidx.appcompat.widget.b$e;
import java.lang.ref.WeakReference;

public final class b$a
extends WK2$d {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ b d;

    public b$a(b b2, int n3, int n4, WeakReference weakReference) {
        this.d = b2;
        this.a = n3;
        this.b = n4;
        this.c = weakReference;
    }

    public final void onFontRetrievalFailed(int n3) {
    }

    public final void onFontRetrieved(Typeface typeface) {
        b b2;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4 && (n4 = this.a) != (n3 = -1)) {
            n3 = this.b & 2;
            if (n3 != 0) {
                n3 = 1;
            } else {
                n3 = 0;
                b2 = null;
            }
            typeface = b$e.a(typeface, n4, n3 != 0);
        }
        b2 = this.d;
        n4 = (int)(b2.m ? 1 : 0);
        if (n4 != 0) {
            b2.l = typeface;
            TextView textView = (TextView)this.c.get();
            if (textView != null) {
                boolean bl2 = textView.isAttachedToWindow();
                if (bl2) {
                    n3 = b2.j;
                    AppCompatTextHelper$2 appCompatTextHelper$2 = new AppCompatTextHelper$2(textView, typeface, n3);
                    textView.post((Runnable)appCompatTextHelper$2);
                } else {
                    n3 = b2.j;
                    textView.setTypeface(typeface, n3);
                }
            }
        }
    }
}

