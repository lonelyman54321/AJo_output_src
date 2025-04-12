/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.b;
import java.util.TreeSet;

/*
 * Renamed from Ht1
 */
public final class ht1_0
implements b {
    public final TreeSet a;
    public long b;

    public ht1_0() {
        TreeSet treeSet;
        Gt1 gt1;
        this.a = treeSet = new TreeSet(gt1);
    }

    public final void a(Cache cache, kJ kJ3, c53_0 c53_02) {
        this.d(kJ3);
        this.b(cache, c53_02);
    }

    public final void b(Cache cache, kJ kJ3) {
        long l2;
        long l3;
        TreeSet treeSet = this.a;
        treeSet.add(kJ3);
        long l4 = this.b;
        long l7 = kJ3.c;
        this.b = l4 += l7;
        while ((l3 = (l2 = (l4 = this.b) - (l7 = 0x5A00000L)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0 && (l3 = (long)treeSet.isEmpty()) == false) {
            kJ3 = (kJ)treeSet.first();
            cache.d(kJ3);
        }
    }

    public final void c(Cache cache, long l2) {
        long l3 = -1;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            Object object2;
            boolean bl2;
            long l7;
            long l8;
            long l12;
            while ((l12 = (l8 = (l3 = this.b + l2) - (l7 = 0x5A00000L)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) > 0 && !(bl2 = ((TreeSet)(object2 = this.a)).isEmpty())) {
                object2 = (kJ)((TreeSet)object2).first();
                cache.d((kJ)object2);
            }
        }
    }

    public final void d(kJ kJ3) {
        this.a.remove(kJ3);
        long l2 = this.b;
        long l3 = kJ3.c;
        this.b = l2 -= l3;
    }
}

