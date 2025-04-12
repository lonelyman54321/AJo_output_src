/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class GY2 {
    public final LP1$c a;
    public final boolean b;
    public final xp1_0 c;
    public final zy2_0 d;
    public boolean e;
    public GY2 f;
    public final int g;

    public GY2(LP1$c lP1$c, boolean bl2, xp1_0 xp1_02, zy2_0 zy2_02) {
        int n3;
        this.a = lP1$c;
        this.b = bl2;
        this.c = xp1_02;
        this.d = zy2_02;
        this.g = n3 = xp1_02.b;
    }

    public static /* synthetic */ List h(GY2 gY2, boolean bl2, int n3) {
        int n4 = n3 & 1;
        n4 = n4 != 0 ? gY2.b ^ true : 0;
        if ((n3 &= 2) != 0) {
            bl2 = false;
        }
        return gY2.g(n4 != 0, bl2, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final GY2 a(CP2 cP2, Function1 object) {
        zy2_0 zy2_02 = new zy2_0();
        zy2_02.b = false;
        zy2_02.c = false;
        object.invoke(zy2_02);
        GY2$a gY2$a = new GY2$a((Function1)object);
        int n3 = this.g;
        int n4 = cP2 != null ? 1000000000 : 2000000000;
        n3 += n4;
        n4 = 1;
        object = new xp1_0(n4 != 0, n3);
        GY2 gY2 = new GY2(gY2$a, false, (xp1_0)object, zy2_02);
        gY2.e = n4;
        gY2.f = this;
        return gY2;
    }

    public final void b(xp1_0 objectArray, ArrayList arrayList, boolean bl2) {
        objectArray = objectArray.C();
        int n3 = objectArray.c;
        if (n3 > 0) {
            objectArray = objectArray.a;
            int n4 = 0;
            do {
                Object object;
                boolean bl3;
                if (!(bl3 = ((xp1_0)(object = (xp1_0)objectArray[n4])).e()) || !bl2 && (bl3 = ((xp1_0)object).I)) continue;
                T32 t32 = ((xp1_0)object).y;
                int n7 = 8;
                bl3 = t32.d(n7);
                if (bl3) {
                    bl3 = this.b;
                    object = JY2.a((xp1_0)object, bl3);
                    arrayList.add(object);
                    continue;
                }
                this.b((xp1_0)object, arrayList, bl2);
            } while (++n4 < n3);
        }
    }

    public final w32_0 c() {
        boolean bl2 = this.e;
        if (bl2) {
            Object object = this.j();
            if (object != null) {
                object = ((GY2)object).c();
            } else {
                bl2 = false;
                object = null;
            }
            return object;
        }
        fo0 fo02 = JY2.c(this.c);
        if (fo02 == null) {
            fo02 = this.a;
        }
        return go0.d(fo02, 8);
    }

    public final void d(List list) {
        List list2 = this.n(false, false);
        int n3 = list2.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            GY2 gY2 = (GY2)list2.get(i3);
            boolean bl2 = gY2.l();
            if (bl2) {
                list.add(gY2);
                continue;
            }
            zy2_0 zy2_02 = gY2.d;
            bl2 = zy2_02.c;
            if (bl2) continue;
            gY2.d(list);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final aG2 e() {
        Object object = this.c();
        if (object == null) return aG2.e;
        Object object2 = ((w32_0)object).j1();
        boolean bl2 = ((LP1$c)object2).m;
        if (!bl2) {
            object = null;
        }
        if (object == null) return aG2.e;
        object2 = ap1_0.d((zp1)object);
        boolean bl3 = true;
        return object2.G((zp1)object, bl3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final aG2 f() {
        Object object = this.c();
        if (object == null) return aG2.e;
        LP1$c lP1$c = ((w32_0)object).j1();
        boolean bl2 = lP1$c.m;
        if (!bl2) {
            object = null;
        }
        if (object == null) return aG2.e;
        return ap1_0.c((zp1)object);
    }

    public final List g(boolean bl2, boolean bl3, boolean bl4) {
        Iterable iterable;
        if (!bl2) {
            iterable = this.d;
            bl2 = iterable.c;
            if (bl2) {
                return mz0_2.a;
            }
        }
        if (bl2 = this.l()) {
            iterable = new ArrayList();
            this.d((List)iterable);
            return iterable;
        }
        return this.n(bl3, bl4);
    }

    public final zy2_0 i() {
        boolean bl2 = this.l();
        Object object = this.d;
        if (bl2) {
            boolean bl3;
            object.getClass();
            zy2_0 zy2_02 = new zy2_0();
            zy2_02.b = bl3 = ((zy2_0)object).b;
            zy2_02.c = bl3 = ((zy2_0)object).c;
            LinkedHashMap linkedHashMap = zy2_02.a;
            object = ((zy2_0)object).a;
            linkedHashMap.putAll(object);
            this.m(zy2_02);
            return zy2_02;
        }
        return object;
    }

    public final GY2 j() {
        Object object;
        Object object2 = this.f;
        if (object2 != null) {
            return object2;
        }
        object2 = this.c;
        boolean bl2 = this.b;
        if (bl2) {
            object = GY2$b.c;
            object = JY2.b((xp1_0)object2, (Function1)object);
        } else {
            object = null;
        }
        if (object == null) {
            object = GY2$c.c;
            object = JY2.b((xp1_0)object2, (Function1)object);
        }
        if (object == null) {
            return null;
        }
        return JY2.a((xp1_0)object, bl2);
    }

    public final List k() {
        return GY2.h(this, true, 4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean l() {
        boolean bl2 = this.b;
        if (!bl2) return false;
        zy2_0 zy2_02 = this.d;
        bl2 = zy2_02.b;
        if (!bl2) return false;
        return true;
    }

    public final void m(zy2_0 zy2_02) {
        zy2_0 zy2_03 = this.d;
        int n3 = zy2_03.c;
        if (n3 == 0) {
            zy2_03 = null;
            List list = this.n(false, false);
            int n4 = list.size();
            for (n3 = 0; n3 < n4; ++n3) {
                boolean bl2;
                GY2 gY2 = (GY2)list.get(n3);
                boolean bl3 = gY2.l();
                if (bl3) continue;
                Iterator iterator = gY2.d.a.entrySet().iterator();
                while (bl2 = iterator.hasNext()) {
                    Object object = iterator.next();
                    TY2 tY2 = (TY2)object.getKey();
                    object = object.getValue();
                    LinkedHashMap linkedHashMap = zy2_02.a;
                    Object v4 = linkedHashMap.get(tY2);
                    Intrinsics.checkNotNull(tY2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Function2 function2 = tY2.b;
                    if ((object = function2.invoke(v4, object)) == null) continue;
                    linkedHashMap.put(tY2, object);
                }
                gY2.m(zy2_02);
            }
        }
    }

    public final List n(boolean bl2, boolean bl3) {
        boolean bl4 = this.e;
        if (bl4) {
            return mz0_2.a;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object = this.c;
        this.b((xp1_0)object, arrayList, bl3);
        if (bl2) {
            boolean bl5;
            Object object2 = MY2.t;
            zy2_0 zy2_02 = this.d;
            if ((object2 = (CP2)AY2.a(zy2_02, (TY2)object2)) != null && (bl5 = zy2_02.b) && (bl5 = arrayList.isEmpty() ^ true)) {
                object = new ey2_1((CP2)object2);
                object2 = this.a((CP2)object2, (Function1)object);
                arrayList.add(object2);
            }
            if ((bl5 = (object = zy2_02.a).containsKey(object2 = MY2.b)) && (bl5 = arrayList.isEmpty() ^ true) && (bl5 = zy2_02.b)) {
                object2 = (List)AY2.a(zy2_02, (TY2)object2);
                bl3 = false;
                zy2_02 = null;
                if (object2 != null) {
                    object2 = (String)CollectionsKt.firstOrNull((List)object2);
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 != null) {
                    object = new fy2_1((String)object2);
                    object2 = this.a(null, (Function1)object);
                    bl3 = false;
                    zy2_02 = null;
                    arrayList.add(0, object2);
                }
            }
        }
        return arrayList;
    }
}

