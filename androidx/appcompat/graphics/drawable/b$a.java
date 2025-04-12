/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.util.StateSet
 */
package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat$b;
import androidx.appcompat.graphics.drawable.b;

public class b$a
extends DrawableContainerCompat$b {
    public int[][] H;

    public b$a(b$a object, b b2, Resources resources) {
        super((DrawableContainerCompat$b)((Object)object), b2, resources);
        if (object != null) {
            object = object.H;
            this.H = (int[][])object;
        } else {
            int n3 = this.g.length;
            object = new int[n3][];
            this.H = (int[][])object;
        }
    }

    public void e() {
        int[][] nArray = this.H;
        int n3 = nArray.length;
        int[][] nArrayArray = new int[n3][];
        for (int i3 = nArray.length + -1; i3 >= 0; i3 += -1) {
            Object object = this.H[i3];
            object = object != null ? (int[])object.clone() : null;
            nArrayArray[i3] = object;
        }
        this.H = nArrayArray;
    }

    public final int f(int[] nArray) {
        int[][] nArray2 = this.H;
        int n3 = this.h;
        for (int i3 = 0; i3 < n3; ++i3) {
            int[] nArray3 = nArray2[i3];
            boolean bl2 = StateSet.stateSetMatches((int[])nArray3, (int[])nArray);
            if (!bl2) continue;
            return i3;
        }
        return -1;
    }

    public Drawable newDrawable() {
        b b2 = new b(this, null);
        return b2;
    }

    public Drawable newDrawable(Resources resources) {
        b b2 = new b(this, resources);
        return b2;
    }
}

