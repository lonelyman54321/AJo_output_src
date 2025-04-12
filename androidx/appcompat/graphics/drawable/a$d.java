/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.graphics.drawable.AnimationDrawable
 */
package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;
import androidx.appcompat.graphics.drawable.a$e;
import androidx.appcompat.graphics.drawable.a$f;

public final class a$d
extends a$f {
    public final ObjectAnimator a;
    public final boolean b;

    public a$d(AnimationDrawable animationDrawable, boolean bl2, boolean bl3) {
        int n3;
        int n4;
        a$e a$e;
        int[] nArray;
        int n7 = animationDrawable.getNumberOfFrames();
        int n8 = 0;
        int n10 = bl2 ? n7 + -1 : 0;
        int n14 = 1;
        if (bl2) {
            n7 = 0;
            nArray = null;
        } else {
            n7 -= n14;
        }
        a$e.b = n4 = animationDrawable.getNumberOfFrames();
        int[] nArray2 = a$e.a;
        if (nArray2 == null || (n3 = nArray2.length) < n4) {
            a$e.a = nArray2 = new int[n4];
        }
        nArray2 = a$e.a;
        int n15 = 0;
        while (n8 < n4) {
            int n16 = bl2 ? n4 - n8 - n14 : n8;
            nArray2[n8] = n16 = animationDrawable.getDuration(n16);
            n15 += n16;
            ++n8;
        }
        a$e.c = n15;
        nArray = new int[]{n10, n7};
        animationDrawable = ObjectAnimator.ofInt((Object)animationDrawable, (String)"currentIndex", (int[])nArray);
        animationDrawable.setAutoCancel(n14 != 0);
        long l2 = a$e.c;
        animationDrawable.setDuration(l2);
        animationDrawable.setInterpolator((TimeInterpolator)a$e);
        this.b = bl3;
        this.a = animationDrawable;
    }

    public final boolean a() {
        return this.b;
    }

    public final void b() {
        this.a.reverse();
    }

    public final void c() {
        this.a.start();
    }

    public final void d() {
        this.a.cancel();
    }
}

