/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from p30
 */
public final class p30_0 {
    public static final F92 a;
    public static final F92 b;
    public static final F92 c;
    public static final F92 d;
    public static final F92 e;
    public static final o30_0 f;

    static {
        String string2 = "provider";
        Object object = new F92(string2);
        a = object;
        object = new F92(string2);
        b = object;
        object = new F92("compositionLocalMap");
        c = object;
        object = new F92("providers");
        d = object;
        object = new F92("reference");
        e = object;
        f = object = new Object();
    }

    public static final void a(int n3, int n4, List list) {
        int n7;
        if ((n3 = p30_0.f(n3, list)) < 0) {
            n3 = -(n3 + 1);
        }
        while (n3 < (n7 = list.size())) {
            hk1 hk12 = (hk1)list.get(n3);
            n7 = hk12.b;
            if (n7 >= n4) break;
            list.remove(n3);
        }
    }

    public static final void b(k73 object, ArrayList arrayList, int n3) {
        int[] nArray = ((k73)object).b;
        int n4 = n73.h(nArray, n3);
        if (n4 != 0) {
            object = ((k73)object).i(n3);
            arrayList.add(object);
        } else {
            int n7 = n73.e(nArray, n3) + n3;
            for (n4 = n3 + 1; n4 < n7; n4 += n3) {
                p30_0.b((k73)object, arrayList, n4);
                n3 = n4 * 5 + 3;
                n3 = nArray[n3];
            }
        }
    }

    public static final void c(String string2) {
        string2 = cP.a("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", string2, "). Please report to Google or use https://goo.gle/compose-feedback");
        ComposeRuntimeError composeRuntimeError = new ComposeRuntimeError(string2);
        throw composeRuntimeError;
    }

    public static final void d(String string2) {
        string2 = cP.a("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", string2, "). Please report to Google or use https://goo.gle/compose-feedback");
        ComposeRuntimeError composeRuntimeError = new ComposeRuntimeError(string2);
        throw composeRuntimeError;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final void e(q73 q732, F30$a f30$a) {
        q73 q733 = q732;
        F30$a f30$a2 = f30$a;
        int n3 = q732.t;
        int n4 = q732.u;
        while (n3 < n4) {
            int n7;
            int n8;
            Object object = q733.z(n3);
            int n10 = object instanceof C20;
            int n14 = -1;
            if (n10 != 0) {
                n10 = q732.o();
                int[] nArray = q733.b;
                n8 = q733.p(n3);
                n7 = q733.I(nArray, n8);
                object = (C20)object;
                f30$a2.e(n10 -= n7, object, n14, n14);
            }
            int n15 = q733.p(n3);
            int[] nArray = q733.b;
            n15 = q733.I(nArray, n15);
            nArray = q733.b;
            n7 = n3 + 1;
            n8 = q733.p(n7);
            n10 = q733.f(nArray, n8);
            for (n8 = n15; n8 < n10; ++n8) {
                Object object2;
                int n16;
                int n17 = n8 - n15;
                Object[] objectArray = q733.c;
                int n18 = q733.g(n8);
                Object object3 = objectArray[n18];
                n18 = object3 instanceof ui2_0;
                String string2 = "Slot table is out of sync";
                b30$a$a b30$a$a = b30$a.a;
                if (n18 != 0) {
                    Object object4 = object3;
                    ui2_0 ui2_02 = (ui2_0)object3;
                    ti2_0 ti2_02 = ui2_02.a;
                    n14 = ti2_02 instanceof vO2;
                    if (n14 == 0) {
                        n14 = q733.J(n3, n17);
                        n14 = q733.g(n14);
                        Object[] objectArray2 = q733.c;
                        n16 = n4;
                        Object object5 = objectArray2[n14];
                        objectArray2[n14] = b30$a$a;
                        if (object3 != object5) {
                            p30_0.c(string2);
                            throw null;
                        }
                        n4 = q732.o() - n17;
                        object2 = ui2_02.b;
                        if (object2 != null && (n17 = (int)(((Ae)object2).a() ? 1 : 0)) != 0) {
                            n14 = q733.c((Ae)object2);
                            n17 = q732.o();
                            int[] nArray2 = q733.b;
                            n18 = q733.q(n14) + n14;
                            n18 = q733.p(n18);
                            int n19 = q733.f(nArray2, n18);
                            n17 -= n19;
                        } else {
                            n14 = -1;
                            n17 = -1;
                        }
                        f30$a2.e(n4, ti2_02, n14, n17);
                    } else {
                        n16 = n4;
                    }
                } else {
                    n16 = n4;
                    n4 = object3 instanceof CF2;
                    if (n4 != 0) {
                        n4 = q733.J(n3, n17);
                        n4 = q733.g(n4);
                        object2 = q733.c;
                        Object object6 = object2[n4];
                        object2[n4] = b30$a$a;
                        if (object3 != object6) {
                            p30_0.c(string2);
                            throw null;
                        }
                        CF2 cF2 = (CF2)object3;
                        cF2.d();
                    }
                }
                n4 = n16;
                n14 = -1;
            }
            n3 = n7;
        }
        return;
    }

    public static final int f(int n3, List list) {
        int n4 = list.size() + -1;
        int n7 = 0;
        while (n7 <= n4) {
            int n8 = n7 + n4 >>> 1;
            hk1 hk12 = (hk1)list.get(n8);
            int n10 = Intrinsics.compare(hk12.b, n3);
            if (n10 < 0) {
                n7 = n8 + 1;
                continue;
            }
            if (n10 > 0) {
                n4 = n8 + -1;
                continue;
            }
            return n8;
        }
        return -(n7 + 1);
    }

    public static final void g(q73 q732, F30$a f30$a) {
        int n3 = q732.t;
        n3 = q732.p(n3);
        int[] nArray = q732.b;
        n3 = q732.f(nArray, n3);
        nArray = q732.b;
        int n4 = q732.t;
        int n7 = q732.q(n4) + n4;
        n4 = q732.p(n7);
        int n8 = q732.f(nArray, n4);
        while (n3 < n8) {
            Object object;
            Object object2 = q732.c;
            n7 = q732.g(n3);
            if ((n7 = (object2 = object2[n7]) instanceof C20) != 0) {
                n7 = q732.o() - n3;
                object = object2;
                object = (C20)object2;
                f30$a.f((C20)object, n7);
            }
            if ((n7 = object2 instanceof ui2_0) != 0) {
                int n10;
                int n14;
                n7 = q732.o() - n3;
                object = object2;
                object = (ui2_0)object2;
                Ae ae2 = object.b;
                if (ae2 != null && (n14 = ae2.a()) != 0) {
                    n10 = q732.c(ae2);
                    n14 = q732.o();
                    int[] nArray2 = q732.b;
                    int n15 = q732.q(n10) + n10;
                    n15 = q732.p(n15);
                    int n16 = q732.f(nArray2, n15);
                    n14 -= n16;
                } else {
                    n10 = -1;
                    n14 = -1;
                }
                object = object.a;
                f30$a.e(n7, object, n10, n14);
            }
            if ((n7 = object2 instanceof CF2) != 0) {
                object2 = (CF2)object2;
                ((CF2)object2).d();
            }
            ++n3;
        }
        q732.D();
    }

    public static final void h(boolean bl2) {
        if (bl2) {
            return;
        }
        p30_0.c("Check failed");
        throw null;
    }
}

