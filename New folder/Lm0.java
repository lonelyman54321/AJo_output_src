/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.metrics.PlaybackMetrics$Builder
 */
import android.media.metrics.PlaybackMetrics;
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import androidx.media3.exoplayer.source.j$b;
import java.util.HashMap;
import java.util.Random;

public final class Lm0 {
    public static final Km0 h;
    public static final Random i;
    public final g$c a;
    public final g$b b;
    public final HashMap c;
    public Pt2 d;
    public g e;
    public String f;
    public long g;

    static {
        Object object = new Object();
        h = object;
        i = object = new Random();
    }

    public Lm0() {
        Object object = new g$c();
        this.a = object;
        this.b = object = new g$b();
        object = new HashMap();
        this.c = object;
        this.e = object = androidx.media3.common.g.a;
        this.g = -1;
    }

    public final void a(Lm0$a lm0$a) {
        long l2 = lm0$a.c;
        long l3 = -1;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 != false) {
            this.g = l2;
        }
        this.f = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(oe$a oe$a) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                Object object2;
                block5: {
                    try {
                        object2 = this.f;
                        if (object2 == null) break block5;
                        object = this.c;
                        object2 = ((HashMap)object).get(object2);
                        object2 = (Lm0$a)object2;
                        object2.getClass();
                        this.a((Lm0$a)object2);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                object2 = this.c;
                object2 = ((HashMap)object2).values();
                object2 = object2.iterator();
                while (true) {
                    Pt2 pt2;
                    boolean bl2;
                    if (!(bl2 = object2.hasNext())) {
                        return;
                    }
                    object = object2.next();
                    object = (Lm0$a)object;
                    object2.remove();
                    boolean bl3 = ((Lm0$a)object).e;
                    if (!bl3 || (pt2 = this.d) == null) continue;
                    object = ((Lm0$a)object).a;
                    pt2 = (xm1_1)pt2;
                    ((xm1_1)pt2).f(oe$a, (String)object);
                }
            }
            throw throwable2;
        }
    }

    public final Lm0$a c(int n3, j$b j$b) {
        boolean bl2;
        Lm0 lm0 = this;
        int n4 = n3;
        j$b j$b2 = j$b;
        HashMap hashMap = this.c;
        Object object = hashMap.values().iterator();
        Lm0$a lm0$a = null;
        long l2 = Long.MAX_VALUE;
        while (bl2 = object.hasNext()) {
            long l3;
            long l4;
            long l7;
            int n7;
            Object object2;
            Object object3;
            int n8;
            Lm0$a lm0$a2 = (Lm0$a)object.next();
            long l8 = lm0$a2.c;
            long l12 = -1;
            long l14 = l8 - l12;
            long l15 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            if (l15 == false && n4 == (n8 = lm0$a2.b) && j$b2 != null) {
                long l16;
                object3 = lm0$a2.g;
                object2 = ((Lm0)object3).c;
                String string2 = ((Lm0)object3).f;
                if ((object2 = (Lm0$a)((HashMap)object2).get(string2)) == null || (n7 = (int)((l16 = (l7 = ((Lm0$a)object2).c) - l12) == 0L ? 0 : (l16 < 0L ? -1 : 1))) == 0) {
                    l8 = ((Lm0)object3).g;
                    l7 = 1L + l8;
                }
                l8 = j$b2.d;
                long l17 = l8 == l7 ? 0 : (l8 < l7 ? -1 : 1);
                if (l17 >= 0) {
                    lm0$a2.c = l8;
                }
            }
            object3 = lm0$a2.d;
            if (j$b2 == null) {
                n7 = lm0$a2.b;
                if (n4 != n7) continue;
            } else {
                int n10;
                long l18;
                long l19;
                l7 = j$b2.d;
                if (!(object3 == null ? (n7 = (int)(j$b.b() ? 1 : 0)) == 0 && (n7 = (int)((l19 = l7 - (l12 = lm0$a2.c)) == 0L ? 0 : (l19 < 0L ? -1 : 1))) == 0 : (l4 = (l18 = l7 - (l3 = ((j$b)object3).d)) == 0L ? 0 : (l18 < 0L ? -1 : 1)) == false && (n7 = j$b2.b) == (n10 = ((j$b)object3).b) && (n7 = j$b2.c) == (n10 = ((j$b)object3).c))) continue;
            }
            l3 = lm0$a2.c;
            long l20 = -1;
            long l21 = l3 == l20 ? 0 : (l3 < l20 ? -1 : 1);
            if (l21 != false && (l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) >= 0) {
                if (l4 != false) continue;
                n7 = gz3.a;
                object2 = lm0$a.d;
                if (object2 == null || object3 == null) continue;
                lm0$a = lm0$a2;
                continue;
            }
            lm0$a = lm0$a2;
            l2 = l3;
        }
        if (lm0$a == null) {
            object = (String)h.get();
            lm0$a = new Lm0$a(lm0, (String)object, n4, j$b2);
            hashMap.put(object, lm0$a);
        }
        return lm0$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String d(g object, j$b j$b) {
        synchronized (this) {
            Object object2 = j$b.a;
            g$b g$b = this.b;
            object = ((g)object).h(object2, g$b);
            int n3 = ((g$b)object).c;
            object = this.c(n3, j$b);
            return ((Lm0$a)object).a;
        }
    }

    public final void e(oe$a object) {
        int n3;
        String string2;
        Object object2 = ((oe$a)object).b;
        boolean n4 = ((g)object2).q();
        HashMap hashMap = this.c;
        if (n4) {
            object = this.f;
            if (object != null) {
                object = (Lm0$a)hashMap.get(object);
                object.getClass();
                this.a((Lm0$a)object);
            }
            return;
        }
        object2 = this.f;
        object2 = (Lm0$a)hashMap.get(object2);
        int n7 = ((oe$a)object).c;
        j$b j$b = ((oe$a)object).d;
        this.f = string2 = this.c((int)n7, (j$b)j$b).a;
        this.f((oe$a)object);
        if (j$b != null && (n3 = j$b.b()) != 0) {
            int n8;
            int n10;
            int n14;
            long l2;
            long l3;
            long l4 = j$b.d;
            if (object2 == null || (n3 = (l3 = (l2 = ((Lm0$a)object2).c) - l4) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != 0 || (object = ((Lm0$a)object2).d) == null || (n14 = ((j$b)object).b) != (n10 = j$b.b) || (n3 = ((j$b)object).c) != (n8 = j$b.c)) {
                object2 = j$b.a;
                object = new j$b(object2, l4);
                this.c(n7, (j$b)object);
                object = this.d;
                object.getClass();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(oe$a object) {
        synchronized (this) {
            Throwable throwable2;
            block16: {
                block14: {
                    Object object2;
                    Object object3;
                    block15: {
                        int n3;
                        long l2;
                        int n4;
                        long l3;
                        Object object4;
                        Object object5;
                        int n7;
                        block12: {
                            long l4;
                            long l7;
                            long l8;
                            block13: {
                                long l12;
                                block11: {
                                    try {
                                        object3 = this.d;
                                        object3.getClass();
                                        object3 = ((oe$a)object).b;
                                        n7 = ((g)object3).q();
                                        if (n7 == 0) break block11;
                                    }
                                    catch (Throwable throwable2) {}
                                    return;
                                }
                                object3 = ((oe$a)object).d;
                                if (object3 == null) break block12;
                                long l14 = ((j$b)object3).d;
                                object5 = this.c;
                                object4 = this.f;
                                object5 = ((HashMap)object5).get(object4);
                                object5 = (Lm0$a)object5;
                                l3 = -1;
                                if (object5 == null || (n4 = (l12 = (l2 = ((Lm0$a)object5).c) - l3) == 0L ? 0 : (l12 < 0L ? -1 : 1)) == 0) {
                                    l2 = this.g;
                                    long l15 = 1L;
                                    l2 += l15;
                                }
                                n4 = l14 == l2 ? 0 : (l14 < l2 ? -1 : 1);
                                if (n4 >= 0) break block13;
                                return;
                            }
                            object3 = this.c;
                            object2 = this.f;
                            object3 = ((HashMap)object3).get(object2);
                            object3 = (Lm0$a)object3;
                            if (object3 == null || (l8 = (l7 = (l4 = ((Lm0$a)object3).c) - l3) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false || (n7 = ((Lm0$a)object3).b) == (n3 = ((oe$a)object).c)) break block12;
                            return;
                        }
                        n7 = ((oe$a)object).c;
                        object2 = ((oe$a)object).d;
                        object3 = this.c(n7, (j$b)object2);
                        object2 = this.f;
                        if (object2 == null) {
                            this.f = object2 = ((Lm0$a)object3).a;
                        }
                        object2 = ((oe$a)object).d;
                        n4 = 1;
                        if (object2 != null && (n3 = ((j$b)object2).b()) != 0) {
                            object4 = ((oe$a)object).d;
                            Object object6 = ((j$b)object4).a;
                            l2 = ((j$b)object4).d;
                            int n8 = ((j$b)object4).b;
                            object2 = new j$b(object6, l2, n8);
                            n8 = ((oe$a)object).c;
                            object2 = this.c(n8, (j$b)object2);
                            n8 = ((Lm0$a)object2).e ? 1 : 0;
                            if (n8 == 0) {
                                ((Lm0$a)object2).e = n4;
                                object2 = ((oe$a)object).b;
                                object4 = ((oe$a)object).d;
                                object4 = ((j$b)object4).a;
                                object6 = this.b;
                                ((g)object2).h(object4, (g$b)object6);
                                object2 = this.b;
                                object4 = ((oe$a)object).d;
                                n8 = ((j$b)object4).b;
                                l3 = ((g$b)object2).d(n8);
                                l3 = gz3.T(l3);
                                object2 = this.b;
                                l2 = ((g$b)object2).e;
                                l2 = gz3.T(l2);
                                l3 += l2;
                                l2 = 0L;
                                Math.max(l2, l3);
                                object2 = this.d;
                                object2.getClass();
                            }
                        }
                        if ((n3 = ((Lm0$a)object3).e) == 0) {
                            ((Lm0$a)object3).e = n4;
                            object2 = this.d;
                            object2.getClass();
                        }
                        if ((n3 = ((String)(object2 = ((Lm0$a)object3).a)).equals(object4 = this.f)) == 0 || (n3 = ((Lm0$a)object3).f) != 0) break block14;
                        ((Lm0$a)object3).f = n4;
                        object2 = this.d;
                        object3 = ((Lm0$a)object3).a;
                        object2 = (xm1_1)object2;
                        object2.getClass();
                        object5 = ((oe$a)object).d;
                        if (object5 == null || (n4 = (int)(((j$b)object5).b() ? 1 : 0)) == 0) break block15;
                        break block14;
                        break block16;
                    }
                    ((xm1_1)object2).d();
                    ((xm1_1)object2).i = object3;
                    object3 = RM1.a();
                    object3 = Fk0.b((PlaybackMetrics.Builder)object3);
                    object3 = zM1.a((PlaybackMetrics.Builder)object3);
                    ((xm1_1)object2).j = object3;
                    object3 = ((oe$a)object).b;
                    object = ((oe$a)object).d;
                    ((xm1_1)object2).e((g)object3, (j$b)object);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(oe$a var1_1, int var2_3) {
        synchronized (this) {
            block8: {
                block7: {
                    block6: {
                        try {
                            var3_4 = this.d;
                            var3_4.getClass();
                            var2_3 = var2_3 == 0 ? 1 : 0;
                            var3_4 = this.c;
                            var3_4 = var3_4.values();
                            var3_4 = var3_4.iterator();
lbl10:
                            // 4 sources

                            while (var4_5 = var3_4.hasNext()) {
                                var5_6 = var3_4.next();
                                var6_7 = (var5_6 = (Lm0$a)var5_6).a(var1_1);
                                if (!var6_7) continue;
                                var3_4.remove();
                                var6_7 = var5_6.e;
                                if (!var6_7) continue;
                                var7_8 = var5_6.a;
                                var8_9 = this.f;
                                var6_7 = var7_8.equals(var8_9);
                                if (var2_3 == 0 || !var6_7) break block6;
                                var5_6.f;
                                break block6;
                            }
                            break block7;
                        }
                        catch (Throwable var1_2) {
                            break block8;
                        }
                    }
                    if (var6_7) {
                        this.a((Lm0$a)var5_6);
                    }
                    var7_8 = this.d;
                    var5_6 = var5_6.a;
                    var7_8 = (xm1_1)var7_8;
                    var7_8.f(var1_1, (String)var5_6);
                    ** GOTO lbl10
                }
                this.e(var1_1);
                return;
            }
            throw var1_2;
        }
    }
}

