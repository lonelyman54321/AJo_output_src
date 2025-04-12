/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;

public final class Gd1$a
implements dj0$a {
    public final boolean a;

    public Gd1$a() {
        this.a = true;
    }

    public final dj0 a(N93 object, ba2 ba22) {
        Object object2;
        long l2;
        Object object3 = ((N93)object).a.d();
        int n3 = object3.l(l2 = 0L, (ff_2)(object2 = tZ0.b));
        if (n3 == 0 && (n3 = object3.l(l2, (ff_2)(object2 = tZ0.a))) == 0) {
            boolean bl2;
            int n4;
            long l3;
            object2 = tZ0.c;
            n3 = object3.l(l2, (ff_2)object2);
            l2 = 8;
            if (!(n3 != 0 && (n3 = (int)(object3.l(l2, (ff_2)(object2 = tZ0.d)) ? 1 : 0)) != 0 && (n3 = (int)(object3.l(l3 = (long)12, (ff_2)(object2 = tZ0.e)) ? 1 : 0)) != 0 && (n3 = (int)(object3.request(l3 = (long)17) ? 1 : 0)) != 0 && (n3 = (int)((byte)(((ce_2)(object2 = object3.e())).n(l3 = (long)16) & 2))) > 0 || (n3 = Build.VERSION.SDK_INT) >= (n4 = 30) && (n3 = (int)(object3.l(l3 = (long)4, (ff_2)(object2 = tZ0.f)) ? 1 : 0)) != 0 && ((n3 = (int)(object3.l(l2, (ff_2)(object2 = tZ0.g)) ? 1 : 0)) != 0 || (n3 = (int)(object3.l(l2, (ff_2)(object2 = tZ0.h)) ? 1 : 0)) != 0 || (bl2 = object3.l(l2, (ff_2)(object2 = tZ0.i)))))) {
                return null;
            }
        }
        n3 = this.a;
        object = ((N93)object).a;
        object3 = new gd1_0((Fe1)object, ba22, n3 != 0);
        return object3;
    }

    public final boolean equals(Object object) {
        return object instanceof Gd1$a;
    }

    public final int hashCode() {
        return Gd1$a.class.hashCode();
    }
}

