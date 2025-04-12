/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.b;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class T61 {
    public static final void a(e e2, dr0_0 dr0_02, FragmentManager fragmentManager, b30_0 b30_02, int n3) {
        Object object;
        e e5 = e2;
        dr0_0 dr0_03 = dr0_02;
        Intrinsics.checkNotNullParameter(e2, "bottomNavigationController");
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        int n4 = 1582264544;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n4);
        Object object4 = object = dr0_02.P.getValue();
        object4 = (p83_0)object;
        object = AndroidCompositionLocals_androidKt.b;
        object = zv0_2.b((Context)((j30_0)object3).j((H30)object));
        boolean bl2 = object instanceof Activity;
        int n7 = 0;
        Object object5 = null;
        Object object6 = bl2 ? (object = (Activity)object) : null;
        object = LP1$a.b;
        object2 = zp.c;
        Object object7 = Nc$a.m;
        object2 = oZ.a((zp$l)object2, (Gx$a)object7, (b30_0)object3, 0);
        int n8 = ((j30_0)object3).P;
        Object object8 = ((j30_0)object3).P();
        object = a30_0.c((b30_0)object3, (LP1)object);
        N20.W.getClass();
        Xp1$a xp1$a = N20$a.b;
        mp mp2 = ((j30_0)object3).a;
        boolean bl3 = mp2 instanceof mp;
        if (bl3) {
            ((j30_0)object3).A();
            n7 = ((j30_0)object3).O;
            if (n7 != 0) {
                ((j30_0)object3).C(xp1$a);
            } else {
                ((j30_0)object3).n();
            }
            object5 = N20$a.e;
            Ow3.a((b30_0)object3, object2, (Function2)object5);
            object2 = N20$a.d;
            Ow3.a((b30_0)object3, object8, (Function2)object2);
            object2 = N20$a.f;
            n7 = ((j30_0)object3).O;
            if (n7 != 0 || (n7 = Intrinsics.areEqual(object5 = ((j30_0)object3).v(), object8 = Integer.valueOf(n8))) == 0) {
                rk_0.a(n8, (j30_0)object3, n8, (N20$a$a)object2);
            }
            object2 = N20$a.c;
            Ow3.a((b30_0)object3, object, (Function2)object2);
            long l2 = nz_1.x;
            bl3 = false;
            mp2 = null;
            int n10 = 48;
            int n14 = 13;
            j30_0 j30_02 = object3;
            Rr0.a(null, l2, 0.0f, 0.0f, (b30_0)object3, n10, n14);
            l2 = nz_1.a;
            long l3 = nz_1.b;
            object = object7;
            object2 = e2;
            object5 = dr0_02;
            j30_0 j30_03 = object3;
            object3 = fragmentManager;
            object7 = new T61$a(e2, (p83_0)object4, dr0_02, (Activity)object6, fragmentManager);
            n4 = -655805358;
            u10 u102 = v10.c(n4, (fx0_2)object7, j30_02);
            n8 = 0;
            object7 = null;
            j30_02 = null;
            int n15 = 24624;
            object = j30_03;
            Mz.a(null, l2, l3, 0.0f, u102, j30_03, n15);
            bl2 = true;
            j30_03.T(bl2);
            object = j30_03.X();
            if (object != null) {
                object4 = fragmentManager;
                n7 = n3;
                ((CF2)object).d = object2 = new O61(e5, dr0_03, fragmentManager, n3);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void b(boolean bl2, yz_0 yz_02, dr0_0 dr0_02, b30_0 object, int n3) {
        Object object2;
        Intrinsics.checkNotNullParameter(yz_02, "item");
        Object object3 = "fleekViewModel";
        Intrinsics.checkNotNullParameter(dr0_02, (String)object3);
        int n4 = 2085706579;
        object = object.g(n4);
        object3 = bl2 ? yz_02.c : yz_02.b;
        Object object4 = h40_0.a;
        int n7 = h40_0.c();
        if (n7 != 0 && (n7 = dr0_02.o()) == 0 && (n7 = Intrinsics.areEqual(object4 = yz_02.d, object2 = "switch-store-route")) != 0 && (object4 = yz_02.i) != null && (object4 = ((he_1)object4).a) != null) {
            object3 = "null cannot be cast to non-null type kotlin.Any";
            Intrinsics.checkNotNull(object4, (String)object3);
            object2 = object4;
        } else {
            object2 = object3;
        }
        LP1$a lP1$a = LP1$a.b;
        n4 = 4;
        float f5 = n4;
        int n8 = 7;
        object3 = h.i(lP1$a, 0.0f, 0.0f, 0.0f, f5, n8);
        n7 = 20;
        float f6 = n7;
        object4 = j.h((LP1)object3, f6);
        n4 = bl2 ? yz_02.h : yz_02.g;
        int n10 = 70;
        f5 = 9.8E-44f;
        n8 = 24;
        ov3.l((LP1)object4, object2, n4, null, null, (b30_0)object, n10, n8);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object3 = new I61(bl2, yz_02, dr0_02, n3);
        }
    }

    public static final void c(dr0_0 dr0_02, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        int bl2 = 1033045982;
        object = object.g(bl2);
        Object object2 = LP1$a.b;
        Object object3 = j.c;
        Object object4 = Nc$a.g;
        us_1 us_12 = null;
        object4 = HA.e((Nc)object4, false);
        int n4 = ((j30_0)object).P;
        Object object5 = ((j30_0)object).P();
        object3 = a30_0.c((b30_0)object, (LP1)object3);
        N20.W.getClass();
        Serializable serializable = N20$a.b;
        mp mp2 = ((j30_0)object).a;
        boolean bl3 = mp2 instanceof mp;
        if (bl3) {
            ((j30_0)object).A();
            bl3 = ((j30_0)object).O;
            if (bl3) {
                ((j30_0)object).C((Function0)((Object)serializable));
            } else {
                ((j30_0)object).n();
            }
            serializable = N20$a.e;
            Ow3.a((b30_0)object, object4, (Function2)((Object)serializable));
            object4 = N20$a.d;
            Ow3.a((b30_0)object, object5, (Function2)object4);
            object4 = N20$a.f;
            boolean bl4 = ((j30_0)object).O;
            if (bl4 || !(bl4 = Intrinsics.areEqual(object5 = ((j30_0)object).v(), serializable = Integer.valueOf(n4)))) {
                rk_0.a(n4, (j30_0)object, n4, (N20$a$a)object4);
            }
            object4 = N20$a.c;
            Ow3.a((b30_0)object, object3, (Function2)object4);
            int n7 = 1065353216;
            float f5 = 1.0f;
            object4 = j.c((LP1)object2, f5);
            object2 = null;
            object3 = new P61(0);
            us_12 = new us_1(dr0_02, 1);
            int n8 = 54;
            bl3 = false;
            mp2 = null;
            object5 = object;
            b.a((Function1)object3, (LP1)object4, us_12, (b30_0)object, n8, 0);
            boolean bl5 = true;
            ((j30_0)object).T(bl5);
            object = ((j30_0)object).X();
            if (object != null) {
                n7 = 1;
                f5 = Float.MIN_VALUE;
                ((CF2)object).d = object2 = new po0_2(dr0_02, n3, n7);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void d(dr0_0 dr0_02, f23_0 f23_02, FragmentManager fragmentManager, yT1 yT12, yT1 yT13, Function2 function2, b30_0 b30_02, int n3) {
        Object object;
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        Intrinsics.checkNotNullParameter(f23_02, "sharedFleekVM");
        Intrinsics.checkNotNullParameter(yT12, "bottomNavigationController");
        Intrinsics.checkNotNullParameter(yT13, "fleekAppNavigationController");
        Intrinsics.checkNotNullParameter(function2, "getCommitFunction");
        Object object2 = b30_02.g(2000386158);
        Object object3 = new T61$b(dr0_02, yT12);
        u10 u102 = v10.c(945033481, (fx0_2)object3, (b30_0)object2);
        Object object4 = fragmentManager;
        object3 = new T61$c(yT12, dr0_02, fragmentManager);
        u10 u103 = v10.c(-1639282968, (fx0_2)object3, (b30_0)object2);
        long l2 = nz_1.a;
        object3 = object;
        object = new T61$d(dr0_02, f23_02, fragmentManager, yT13, yT12, function2);
        u10 u104 = v10.c(-1572191248, (fx0_2)object, (b30_0)object2);
        long l3 = 0L;
        int n4 = 3456;
        object4 = null;
        long l4 = 0L;
        long l7 = 0L;
        long l8 = 0L;
        int n7 = 0xC30000;
        int n8 = 98291;
        object3 = object2;
        object2 = u103;
        HS2.a(null, null, u102, u103, null, null, 0, false, null, false, null, 0.0f, l4, l7, l8, l2, l3, u104, (b30_0)object3, n4, n7, n8);
        int n10 = 584;
        uj0_0.a(dr0_02, yT12, yT13, (b30_0)object3, n10);
        object = ((j30_0)object3).X();
        if (object != null) {
            object3 = object4;
            ((CF2)object).d = object4 = new n61_0(dr0_02, f23_02, fragmentManager, yT12, yT13, function2, n3);
        }
    }

    public static final void e(dr0_0 dr0_02, Activity activity, e e2, String object, String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(e2, "<this>");
        Object object2 = "route";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        boolean bl3 = Intrinsics.areEqual(object, string2);
        if (!bl3) {
            object2 = new H61(dr0_02, activity, e2, string2, (String)object);
            e2.o(string2, (Function1)object2);
        } else if (dr0_02 != null && (bl2 = ((Boolean)(object = (Boolean)dr0_02.s.getValue())).booleanValue()) == (bl3 = true)) {
            object = h40_0.a;
            bl2 = h40_0.c();
            if (bl2) {
                object = new K61(e2, activity, dr0_02);
                e2.o(string2, (Function1)object);
            }
        }
    }

    public static /* synthetic */ void f(e e2, String string2) {
        T61.e(null, null, e2, string2, "switch-store-route");
    }
}

