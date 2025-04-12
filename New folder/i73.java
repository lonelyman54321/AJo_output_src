/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public final class i73 {
    public static final g73 h;
    public static final h73 i;
    public final int a;
    public final ArrayList b;
    public final i73$a[] c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        Comparator comparator;
        h = comparator = new Object();
        comparator = new Object();
        i = comparator;
    }

    public i73(int n3) {
        this.a = n3;
        Object object = new i73$a[5];
        this.c = object;
        this.b = object;
        this.d = -1;
    }

    public final void a(float f5, int n3) {
        int n4;
        int n7;
        Object object;
        int n8 = this.d;
        ArrayList arrayList = this.b;
        int n10 = 1;
        if (n8 != n10) {
            object = h;
            Collections.sort(arrayList, object);
            this.d = n10;
        }
        n8 = this.g;
        i73$a[] i73$aArray = this.c;
        if (n8 > 0) {
            this.g = n8 -= n10;
            object = i73$aArray[n8];
        } else {
            object = new i73$a();
        }
        n10 = this.e;
        this.e = n7 = n10 + 1;
        ((i73$a)object).a = n10;
        ((i73$a)object).b = n3;
        ((i73$a)object).c = f5;
        arrayList.add(object);
        this.f = n4 = this.f + n3;
        while ((n4 = this.f) > (n3 = this.a)) {
            n4 -= n3;
            n3 = 0;
            object = (i73$a)arrayList.get(0);
            n10 = ((i73$a)object).b;
            if (n10 <= n4) {
                this.f = n4 = this.f - n10;
                arrayList.remove(0);
                n4 = this.g;
                n3 = 5;
                if (n4 >= n3) continue;
                this.g = n3 = n4 + 1;
                i73$aArray[n4] = object;
                continue;
            }
            ((i73$a)object).b = n10 -= n4;
            this.f = n3 = this.f - n4;
        }
    }

    public final float b() {
        int n3;
        Object object;
        int n4 = this.d;
        ArrayList arrayList = this.b;
        int n7 = 0;
        if (n4 != 0) {
            object = i;
            Collections.sort(arrayList, object);
            this.d = 0;
        }
        float f5 = this.f;
        float f6 = 0.5f * f5;
        n4 = 0;
        f5 = 0.0f;
        object = null;
        while (n7 < (n3 = arrayList.size())) {
            i73$a i73$a = (i73$a)arrayList.get(n7);
            int n8 = i73$a.b;
            float f7 = n4 += n8;
            float f8 = f7 - f6;
            if ((n8 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1))) >= 0) {
                return i73$a.c;
            }
            ++n7;
        }
        n4 = (int)(arrayList.isEmpty() ? 1 : 0);
        if (n4 != 0) {
            n4 = 2143289344;
            f5 = 0.0f / 0.0f;
        } else {
            n4 = 1;
            object = (i73$a)pp_0.a(n4, arrayList);
            f5 = ((i73$a)object).c;
        }
        return f5;
    }
}

