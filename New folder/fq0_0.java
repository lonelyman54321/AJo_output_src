/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import androidx.navigation.i;
import androidx.navigation.n;
import androidx.navigation.p;
import androidx.navigation.p$a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/*
 * Renamed from fq0
 */
public final class fq0_0
extends p {
    public final i a() {
        u10 u102 = N10.a;
        fq0$a_0 fq0$a_0 = new fq0$a_0(this, u102);
        return fq0$a_0;
    }

    public final void d(List object, n object2, p$a object3) {
        boolean bl2;
        object = ((Iterable)object).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (d)object.next();
            object3 = this.b();
            ((kU1)object3).f((d)object2);
        }
    }

    public final void e(d d2, boolean bl2) {
        boolean bl3;
        this.b().d(d2, bl2);
        int n3 = CollectionsKt.O((Iterable)this.b().f.a.getValue(), d2);
        Iterator iterator = ((Iterable)this.b().f.a.getValue()).iterator();
        int n4 = 0;
        kU1 kU12 = null;
        while (bl3 = iterator.hasNext()) {
            Object object = iterator.next();
            int n7 = n4 + 1;
            if (n4 >= 0) {
                object = (d)object;
                if (n4 > n3) {
                    kU12 = this.b();
                    kU12.b((d)object);
                }
                n4 = n7;
                continue;
            }
            xx_2.n();
            throw null;
        }
    }
}

