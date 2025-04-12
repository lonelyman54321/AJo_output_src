/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.i$b;
import androidx.lifecycle.o;
import androidx.navigation.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Wp0 {
    public static final void a(fq0_0 fq0_02, b30_0 b30_02, int n3) {
        Object object;
        int n4;
        fq0_0 fq0_03 = fq0_02;
        int n7 = n3;
        Object object2 = b30_02;
        j30_0 j30_02 = b30_02.g(294589392);
        int n8 = n3 & 6;
        int n10 = 2;
        int n14 = 4;
        if (n8 == 0) {
            n8 = (int)(j30_02.J(fq0_02) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n4 = n8 |= n7;
        } else {
            n4 = n3;
        }
        n8 = n4 & 3;
        if (n8 == n10 && (n8 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
        } else {
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            Object object7 = hs2_0.a(j30_02);
            object = fq0_02.b().e;
            int n15 = 0;
            Object object8 = null;
            object = J83.b((jb3_2)object, j30_02, 0);
            object2 = (List)object.getValue();
            Object object9 = ki1.a;
            object9 = (Boolean)j30_02.j((H30)object9);
            boolean n16 = (Boolean)object9;
            int n17 = j30_02.J(object2);
            Object object10 = j30_02.v();
            b30$a$a b30$a$a = b30$a.a;
            if (n17 != 0 || object10 == b30$a$a) {
                boolean bl2;
                object10 = new p83_0();
                object2 = (Iterable)object2;
                object6 = new ArrayList();
                object2 = object2.iterator();
                while (bl2 = object2.hasNext()) {
                    boolean bl3;
                    object5 = object2.next();
                    object4 = object5;
                    object4 = (d)object5;
                    if (n16) {
                        bl3 = true;
                    } else {
                        object4 = ((d)object4).h.d;
                        object3 = i$b.STARTED;
                        bl3 = ((i$b)((Object)object4)).isAtLeast((i$b)((Object)object3));
                    }
                    if (!bl3) continue;
                    ((ArrayList)object6).add(object5);
                }
                ((p83_0)object10).addAll((Collection)object6);
                j30_02.o(object10);
            }
            object10 = (p83_0)object10;
            object = (List)object.getValue();
            Wp0.b((p83_0)object10, (Collection)object, j30_02, 0);
            object3 = J83.b(fq0_02.b().f, j30_02, 0);
            object = j30_02.v();
            if (object == b30$a$a) {
                object = new p83_0();
                j30_02.o(object);
            }
            object4 = object;
            object4 = (p83_0)object;
            n8 = 1361037007;
            j30_02.K(n8);
            ListIterator listIterator = ((p83_0)object10).listIterator();
            while (true) {
                object = listIterator;
                object = (ob3_2)listIterator;
                n10 = (int)(((ob3_2)object).hasNext() ? 1 : 0);
                if (n10 == 0) break;
                object2 = object = ((ob3_2)object).next();
                object2 = (d)object;
                object = ((d)object2).b;
                object9 = "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination";
                Intrinsics.checkNotNull(object, (String)object9);
                object5 = object;
                object5 = (fq0$a_0)object;
                n8 = n4 & 0xE;
                if (n8 == n14) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    object = null;
                }
                int n18 = j30_02.x(object2);
                object9 = j30_02.v();
                if ((n8 |= n18) != 0 || object9 == b30$a$a) {
                    object9 = new Wp0$a(fq0_03, (d)object2);
                    j30_02.o(object9);
                }
                object10 = object9;
                object10 = (Function0)object9;
                object6 = ((fq0$a_0)object5).k;
                object9 = fq0_02;
                object8 = object6;
                object6 = object7;
                object7 = object10;
                object10 = object4;
                object = new Wp0$b((d)object2, fq0_02, (cs2_1)object6, (p83_0)object4, (fq0$a_0)object5);
                n8 = 1129586364;
                object = v10.c(n8, (fx0_2)object, j30_02);
                n10 = 384;
                th.a((Function0)object7, (jq0)object8, (u10)object, j30_02, n10);
                object7 = object6;
                n14 = 4;
                n15 = 0;
                object8 = null;
            }
            n8 = 0;
            object = null;
            j30_02.T(false);
            object2 = (Set)object3.getValue();
            int n19 = j30_02.J(object3);
            n17 = n4 & 0xE;
            int n20 = 4;
            if (n17 == n20) {
                n15 = 1;
            } else {
                n15 = 0;
                object8 = null;
            }
            n8 = n19 | n15;
            object9 = j30_02.v();
            if (n8 != 0 || object9 == b30$a$a) {
                n8 = 0;
                object = null;
                object9 = new Wp0$c((tr1_0)object3, fq0_03, (p83_0)object4, null);
                j30_02.o(object9);
            }
            object9 = (Function2)object9;
            ly0_0.e(object2, object4, (Function2)object9, j30_02);
        }
        object = j30_02.X();
        if (object != null) {
            ((CF2)object).d = object2 = new Wp0$d(fq0_03, n7);
        }
    }

    public static final void b(p83_0 p83_02, Collection collection, b30_0 object, int n3) {
        Object object2;
        object = object.g(1537894851);
        int n4 = n3 & 6;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).x(p83_02) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x30;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).x(collection) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n4 &= 0x13) == (n7 = 18) && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            boolean bl2;
            object2 = ki1.a;
            object2 = (Boolean)((j30_0)object).j((H30)object2);
            n4 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
            Object object3 = collection;
            object3 = ((Iterable)collection).iterator();
            while (bl2 = object3.hasNext()) {
                b30$a$a b30$a$a;
                d d2 = (d)object3.next();
                o o3 = d2.h;
                boolean bl3 = ((j30_0)object).a(n4 != 0);
                boolean bl4 = ((j30_0)object).x(p83_02);
                bl3 |= bl4;
                bl4 = ((j30_0)object).x(d2);
                Object object4 = ((j30_0)object).v();
                if ((bl3 |= bl4) || object4 == (b30$a$a = b30$a.a)) {
                    object4 = new cq0_0(p83_02, d2, n4 != 0);
                    ((j30_0)object).o(object4);
                }
                object4 = (Function1)object4;
                ly0_0.b(o3, (Function1)object4, (b30_0)object);
            }
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new dq0(p83_02, collection, n3);
        }
    }
}

