/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 */
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class F30$a {
    public final Set a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public pr1_1 e;
    public final ArrayList f;
    public final sr1_0 g;
    public final sr1_0 h;

    public F30$a(Set object) {
        this.a = object;
        this.b = object;
        super();
        this.c = object;
        super();
        this.d = object;
        super();
        this.f = object;
        this.g = object = new sr1_0();
        this.h = object = new sr1_0();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Throwable throwable2;
        block3: {
            Object object;
            Object object2 = object = this.a;
            object2 = (Collection)object;
            boolean bl2 = object2.isEmpty() ^ true;
            if (!bl2) return;
            object2 = "Compose:abandons";
            Trace.beginSection((String)object2);
            try {
                object = object.iterator();
                while (bl2 = object.hasNext()) {
                    object2 = object.next();
                    object2 = (ti2_0)object2;
                    object.remove();
                    object2.onAbandoned();
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            object = Unit.a;
            Trace.endSection();
            return;
        }
        Trace.endSection();
        throw throwable2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        block11: {
            block12: {
                block10: {
                    var1_1 = -1;
                    var2_2 = -1 << -1;
                    this.d(var2_2);
                    var3_3 = this.c;
                    var4_4 = var3_3.isEmpty() ^ 1;
                    var5_5 = this.a;
                    if (var4_4 == 0) break block12;
                    var6_6 = "Compose:onForgotten";
                    Trace.beginSection((String)var6_6);
                    var6_6 = this.e;
                    ** for (var7_7 = var3_3.size() + -1;
                    ; var1_1 < var7_7; var7_7 += var1_1)
                    {
                        block13: {
                            catch (Throwable var11_11) {}
lbl14:
                            // 1 sources

                            var8_8 /* !! */  = var3_3.get(var7_7);
                            var9_9 = var8_8 /* !! */  instanceof ti2_0;
                            if (var9_9) {
                                var5_5.remove(var8_8 /* !! */ );
                                var10_10 = var8_8 /* !! */ ;
                                var10_10 = (ti2_0)var8_8 /* !! */ ;
                                var10_10.onForgotten();
                            }
                            if (!(var9_9 = var8_8 /* !! */  instanceof C20)) continue;
                            if (var6_6 == null) break block13;
                            var9_9 = var6_6.a(var8_8 /* !! */ );
                            if (var9_9) {
                                var8_8 /* !! */  = (C20)var8_8 /* !! */ ;
                                var8_8 /* !! */ .a();
                                continue;
                            }
                            break block10;
                        }
                        var8_8 /* !! */  = (C20)var8_8 /* !! */ ;
                        var8_8 /* !! */ .c();
                        continue;
                    }
lbl37:
                    // 1 sources

                    var11_12 = Unit.a;
                    Trace.endSection();
                    break block12;
                }
                Trace.endSection();
                throw var11_11;
            }
            if ((var2_2 = (var11_12 = this.b).isEmpty() ^ 1) == 0) return;
            var3_3 = "Compose:onRemembered";
            Trace.beginSection((String)var3_3);
            try {
                var2_2 = var11_12.size();
                var6_6 = null;
                for (var4_4 = 0; var4_4 < var2_2; ++var4_4) {
                    var12_14 = var11_12.get(var4_4);
                    var12_14 = (ti2_0)var12_14;
                    var5_5.remove(var12_14);
                    var12_14.onRemembered();
                }
            }
            catch (Throwable var11_13) {
                break block11;
            }
            var11_12 = Unit.a;
            Trace.endSection();
            return;
        }
        Trace.endSection();
        throw var11_13;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Throwable throwable2;
        block3: {
            Object object = this.d;
            int n3 = ((ArrayList)object).isEmpty() ^ 1;
            if (n3 == 0) return;
            String string2 = "Compose:sideeffects";
            Trace.beginSection((String)string2);
            try {
                n3 = ((ArrayList)object).size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object2 = ((ArrayList)object).get(i3);
                    object2 = (Function0)object2;
                    object2.invoke();
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            ((ArrayList)object).clear();
            object = Unit.a;
            Trace.endSection();
            return;
        }
        Trace.endSection();
        throw throwable2;
    }

    public final void d(int n3) {
        int n4 = 0;
        int n7 = 1;
        ArrayList arrayList = this.f;
        boolean bl2 = arrayList.isEmpty() ^ n7;
        if (bl2) {
            int n8;
            Object e2;
            String string2;
            int n10;
            bl2 = false;
            Object object = null;
            sr1_0 sr1_02 = null;
            Ni1 ni1 = null;
            int n14 = 0;
            while (true) {
                sr1_0 sr1_03 = this.h;
                n10 = sr1_03.b;
                string2 = "null cannot be cast to non-null type androidx.collection.MutableIntList";
                if (n14 >= n10) break;
                n10 = sr1_03.a(n14);
                if (n3 <= n10) {
                    e2 = arrayList.remove(n14);
                    n8 = sr1_03.e(n14);
                    sr1_0 sr1_04 = this.g;
                    int n15 = sr1_04.e(n14);
                    if (object == null) {
                        object = new Object[n7];
                        object[0] = e2;
                        object = xx_2.j((Object[])object);
                        ni1 = new sr1_0();
                        ((sr1_0)ni1).b(n8);
                        sr1_02 = new sr1_0();
                        sr1_02.b(n15);
                        continue;
                    }
                    Intrinsics.checkNotNull(sr1_02, string2);
                    Intrinsics.checkNotNull(ni1, string2);
                    object.add(e2);
                    ((sr1_0)ni1).b(n8);
                    sr1_02.b(n15);
                    continue;
                }
                n14 += n7;
            }
            if (object != null) {
                Intrinsics.checkNotNull(sr1_02, string2);
                Intrinsics.checkNotNull(ni1, string2);
                n3 = object.size() - n7;
                while (n4 < n3) {
                    int n16 = n4 + 1;
                    n14 = object.size();
                    for (n8 = n16; n8 < n14; n8 += n7) {
                        int n17;
                        n10 = ni1.a(n4);
                        if (n10 >= (n17 = ni1.a(n8)) && (n17 != n10 || (n10 = sr1_02.a(n4)) >= (n17 = sr1_02.a(n8)))) continue;
                        e2 = object.get(n4);
                        string2 = object.get(n8);
                        object.set(n4, string2);
                        object.set(n8, e2);
                        n10 = sr1_02.a(n4);
                        n17 = sr1_02.a(n8);
                        sr1_02.f(n4, n17);
                        sr1_02.f(n8, n10);
                        n10 = ni1.a(n4);
                        n17 = ni1.a(n8);
                        ((sr1_0)ni1).f(n4, n17);
                        ((sr1_0)ni1).f(n8, n10);
                    }
                    n4 = n16;
                }
                ArrayList arrayList2 = this.c;
                arrayList2.addAll(object);
            }
        }
    }

    public final void e(int n3, Object object, int n4, int n7) {
        this.d(n3);
        if (n7 >= 0 && n7 < n3) {
            this.f.add(object);
            this.g.b(n4);
            sr1_0 sr1_02 = this.h;
            sr1_02.b(n7);
        } else {
            ArrayList arrayList = this.c;
            arrayList.add(object);
        }
    }

    public final void f(C20 c20, int n3) {
        pr1_1 pr1_12 = this.e;
        if (pr1_12 == null) {
            this.e = pr1_12 = gt2_1.a();
        }
        int n4 = pr1_12.f(c20);
        pr1_12.b[n4] = c20;
        int n7 = -1;
        this.e(n3, c20, n7, n7);
    }

    public final void g(ti2_0 ti2_02) {
        this.b.add(ti2_02);
    }

    public final void h(Function0 function0) {
        this.d.add(function0);
    }
}

