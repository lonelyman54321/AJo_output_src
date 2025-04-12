/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b;

public final class b$d {
    public boolean a;
    public int b;
    public int c;
    public float d;
    public float e;

    public final void a(Context context, AttributeSet attributeSet) {
        int[] nArray = R$styleable.PropertySet;
        context = context.obtainStyledAttributes(attributeSet, nArray);
        this.a = true;
        int n3 = context.getIndexCount();
        nArray = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            float f5;
            float f6;
            int n4;
            int n7 = context.getIndex(i3);
            if (n7 == (n4 = R$styleable.PropertySet_android_alpha)) {
                f6 = this.d;
                this.d = f5 = context.getFloat(n7, f6);
                continue;
            }
            n4 = R$styleable.PropertySet_android_visibility;
            if (n7 == n4) {
                n4 = this.b;
                this.b = n7 = context.getInt(n7, n4);
                int[] nArray2 = androidx.constraintlayout.widget.b.h;
                this.b = n7 = nArray2[n7];
                continue;
            }
            n4 = R$styleable.PropertySet_visibilityMode;
            if (n7 == n4) {
                n4 = this.c;
                this.c = n7 = context.getInt(n7, n4);
                continue;
            }
            n4 = R$styleable.PropertySet_motionProgress;
            if (n7 != n4) continue;
            f6 = this.e;
            this.e = f5 = context.getFloat(n7, f6);
        }
        context.recycle();
    }
}

