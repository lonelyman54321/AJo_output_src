/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 */
import android.graphics.Rect;
import java.util.Comparator;

public final class vU0$c
implements Comparator {
    public final Rect a;
    public final Rect b;
    public final boolean c;
    public final vU0$a d;

    public vU0$c(boolean bl2, vU0$a vU0$a) {
        Rect rect;
        this.a = rect = new Rect();
        this.b = rect = new Rect();
        this.c = bl2;
        this.d = vU0$a;
    }

    public final int compare(Object object, Object object2) {
        HH0$a hH0$a = (HH0$a)this.d;
        hH0$a.getClass();
        object = (C2)object;
        Rect rect = this.a;
        ((C2)object).f(rect);
        hH0$a.getClass();
        object2 = (C2)object2;
        object = this.b;
        ((C2)object2).f((Rect)object);
        int n3 = rect.top;
        int n4 = ((Rect)object).top;
        int n7 = -1;
        if (n3 < n4) {
            return n7;
        }
        int n8 = 1;
        if (n3 > n4) {
            return n8;
        }
        n3 = rect.left;
        n4 = ((Rect)object).left;
        boolean bl2 = this.c;
        if (n3 < n4) {
            if (bl2) {
                n7 = 1;
            }
            return n7;
        }
        if (n3 > n4) {
            if (!bl2) {
                n7 = 1;
            }
            return n7;
        }
        n3 = rect.bottom;
        n4 = ((Rect)object).bottom;
        if (n3 < n4) {
            return n7;
        }
        if (n3 > n4) {
            return n8;
        }
        n3 = rect.right;
        int n10 = ((Rect)object).right;
        if (n3 < n10) {
            if (bl2) {
                n7 = 1;
            }
            return n7;
        }
        if (n3 > n10) {
            if (!bl2) {
                n7 = 1;
            }
            return n7;
        }
        return 0;
    }
}

