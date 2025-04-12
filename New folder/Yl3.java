/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.foundation.e;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.graphics.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SpreadBuilder;

public final class Yl3 {
    public final Sl a;
    public final ParcelableSnapshotMutableState b;
    public Sl c;
    public final p83_0 d;

    public Yl3(Sl object) {
        this.a = object;
        Object object2 = J83.g(null);
        this.b = object2;
        object2 = new Sl$a((Sl)object);
        String string2 = ((Sl)object).a;
        int n3 = string2.length();
        object = ((Sl)object).a(n3);
        n3 = object.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Sl$b sl$b = (Sl$b)object.get(i3);
            Object object3 = ((Gu1)sl$b.a).a();
            if (object3 == null || (object3 = ((gm3_0)object3).a) == null) continue;
            int n4 = sl$b.b;
            int n7 = sl$b.c;
            ((Sl$a)object2).a((S93)object3, n4, n7);
        }
        this.c = object = ((Sl$a)object2).h();
        this.d = object = new p83_0();
    }

    public static Sl$b c(Sl$b object, Tl3 tl3) {
        RQ1 rQ1 = tl3.b;
        int n3 = rQ1.f + -1;
        int n4 = 0;
        Sl$b sl$b = null;
        n3 = ((Sl$b)object).b;
        int n7 = tl3.e(n3, false);
        if (n3 < n7) {
            n4 = ((Sl$b)object).c;
            n7 = Math.min(n4, n7);
            Object object2 = ((Sl$b)object).a;
            object = ((Sl$b)object).d;
            sl$b = new Sl$b(object2, (String)object, n3, n7);
        } else {
            n4 = 0;
            sl$b = null;
        }
        return sl$b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(b30_0 b30_02, int n3) {
        Object object;
        Yl3 yl3 = this;
        int n4 = n3;
        int n7 = 0;
        Object object2 = null;
        int n8 = 3;
        int n10 = 1154651354;
        Object object3 = b30_02;
        j30_0 j30_02 = b30_02.g(n10);
        int n14 = 6;
        int n15 = n3 & 6;
        int n16 = 2;
        if (n15 == 0) {
            n15 = (int)(j30_02.x(this) ? 1 : 0);
            n15 = n15 != 0 ? 4 : 2;
            n15 |= n4;
        } else {
            n15 = n3;
        }
        int n17 = n15 & 3;
        if (n17 == n16 && (n17 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
        } else {
            Object object4 = O30.p;
            object4 = (Xw3)j30_02.j((H30)object4);
            Object object5 = yl3.c;
            Object[] objectArray = ((Sl)object5).a;
            int n18 = objectArray.length();
            object5 = ((Sl)object5).a(n18);
            n18 = object5.size();
            for (int i3 = 0; i3 < n18; i3 += n16) {
                int n19;
                int n20;
                Object object6;
                Object object7;
                int n21;
                Object object8;
                Sl$b sl$b = (Sl$b)object5.get(i3);
                int n22 = sl$b.b;
                n14 = sl$b.c;
                if (n22 != n14) {
                    n14 = 1385536272;
                    j30_02.K(n14);
                    object3 = j30_02.v();
                    b30$a$a b30$a$a = b30$a.a;
                    if (object3 == b30$a$a) {
                        object3 = new xr1_1();
                        j30_02.o(object3);
                    }
                    object3 = (wr1_1)object3;
                    object8 = LP1$a.b;
                    object = new am3_0(yl3, sl$b);
                    object = androidx.compose.ui.graphics.a.a((LP1)object8, (Function1)object);
                    Object object9 = new Xl3(yl3, sl$b);
                    object8 = new pm3((Xl3)object9);
                    object = e.a(object.then((LP1)object8), (wr1_1)object3);
                    Uv2.a.getClass();
                    object8 = Xv2.b;
                    object = zn0_2.d((LP1)object, (wi)object8);
                    object8 = Yl3$a.c;
                    object = CY2.b((LP1)object, false, (Function1)object8);
                    n21 = j30_02.x(yl3);
                    n16 = (int)(j30_02.J(sl$b) ? 1 : 0);
                    n21 |= n16;
                    n16 = (int)(j30_02.x(object4) ? 1 : 0);
                    object9 = j30_02.v();
                    if ((n21 |= n16) != 0 || object9 == b30$a$a) {
                        object9 = new Yl3$b(yl3, sl$b, (Xw3)object4);
                        j30_02.o(object9);
                    }
                    object9 = (Function0)object9;
                    HA.a(androidx.compose.foundation.d.c((LP1)object, (wr1_1)object3, (Function0)object9), j30_02, 0);
                    object = (Gu1)sl$b.a;
                    object8 = ((Gu1)object).a();
                    if (object8 == null || (object9 = ((gm3_0)object8).a) == null && (object9 = ((gm3_0)object8).b) == null && (object9 = ((gm3_0)object8).c) == null && (object8 = ((gm3_0)object8).d) == null) {
                        object7 = object4;
                        object6 = object5;
                        n20 = n18;
                        n7 = 3;
                        n8 = 6;
                        n21 = 0;
                        object8 = null;
                        n19 = 2;
                        n14 = 4;
                        n16 = 1388165134;
                        j30_02.K(n16);
                        j30_02.T(false);
                    } else {
                        n21 = 1386296950;
                        j30_02.K(n21);
                        object8 = j30_02.v();
                        if (object8 == b30$a$a) {
                            object8 = new Ju1();
                            j30_02.o(object8);
                        }
                        object8 = (Ju1)object8;
                        object9 = j30_02.v();
                        n19 = 0;
                        Boolean bl2 = null;
                        if (object9 == b30$a$a) {
                            object9 = new Yl3$c((Ju1)object8, (wr1_1)object3, null);
                            j30_02.o(object9);
                        }
                        object9 = (Function2)object9;
                        ly0_0.d(j30_02, object3, (Function2)object9);
                        object3 = ((Ju1)object8).d;
                        n14 = ((e83_0)object3).o();
                        n16 = ((Ju1)object8).b;
                        if ((n14 &= n16) != 0) {
                            n14 = 1;
                        } else {
                            n14 = 0;
                            object3 = null;
                        }
                        object3 = n14 != 0;
                        object9 = ((Ju1)object8).d;
                        int n24 = ((e83_0)object9).o();
                        n19 = ((Ju1)object8).a;
                        n19 = n24 & n19;
                        if (n19 != 0) {
                            n19 = 1;
                        } else {
                            n19 = 0;
                            bl2 = null;
                        }
                        bl2 = n19 != 0;
                        n16 = ((e83_0)object9).o();
                        n7 = ((Ju1)object8).c & n16;
                        if (n7 != 0) {
                            n7 = 1;
                        } else {
                            n7 = 0;
                            object2 = null;
                        }
                        object2 = n7 != 0;
                        object9 = ((Gu1)object).a();
                        if (object9 != null) {
                            object9 = ((gm3_0)object9).a;
                            object7 = object4;
                        } else {
                            object7 = object4;
                            n16 = 0;
                            object9 = null;
                        }
                        object4 = ((Gu1)object).a();
                        if (object4 != null) {
                            object4 = ((gm3_0)object4).b;
                            object6 = object5;
                        } else {
                            object6 = object5;
                            n17 = 0;
                            object4 = null;
                        }
                        object5 = ((Gu1)object).a();
                        object5 = object5 != null ? ((gm3_0)object5).c : null;
                        object = ((Gu1)object).a();
                        if (object != null) {
                            object = ((gm3_0)object).d;
                            n20 = n18;
                        } else {
                            n20 = n18;
                            n8 = 0;
                            object = null;
                        }
                        n18 = 7;
                        objectArray = new Object[n18];
                        n24 = 0;
                        objectArray[0] = object3;
                        objectArray[1] = bl2;
                        n19 = 2;
                        objectArray[n19] = object2;
                        n7 = 3;
                        objectArray[n7] = object9;
                        n14 = 4;
                        objectArray[n14] = object4;
                        objectArray[5] = object5;
                        objectArray[6] = object;
                        n8 = (int)(j30_02.x(yl3) ? 1 : 0);
                        n16 = (int)(j30_02.J(sl$b) ? 1 : 0);
                        object9 = j30_02.v();
                        if ((n8 |= n16) != 0 || object9 == b30$a$a) {
                            object9 = new Yl3$d(yl3, sl$b, (Ju1)object8);
                            j30_02.o(object9);
                        }
                        object9 = (Function1)object9;
                        n8 = 6;
                        n21 = n15 << 6 & 0x380;
                        yl3.b(objectArray, (Function1)object9, j30_02, n21);
                        n21 = 0;
                        object8 = null;
                        j30_02.T(false);
                    }
                    j30_02.T(false);
                } else {
                    object7 = object4;
                    object6 = object5;
                    n20 = n18;
                    n7 = 3;
                    n8 = 6;
                    n21 = 0;
                    object8 = null;
                    n19 = 2;
                    n14 = 4;
                    n16 = 1388179022;
                    j30_02.K(n16);
                    j30_02.T(false);
                }
                n16 = 1;
                n18 = n20;
                object4 = object7;
                object5 = object6;
                n7 = 0;
                object2 = null;
                n8 = 3;
                n14 = 6;
                n16 = 2;
            }
        }
        object2 = j30_02.X();
        if (object2 != null) {
            object = new Yl3$e(yl3, n4);
            ((CF2)object2).d = object;
        }
    }

    public final void b(Object[] objectArray, Function1 function1, b30_0 object, int n3) {
        Object object2;
        int n4;
        object = object.g(-2083052099);
        int n7 = n3 & 0x30;
        int n8 = 32;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).x(function1) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n10 = n3 & 0x180;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).x(this) ? 1 : 0);
            n10 = n10 != 0 ? 256 : 128;
            n7 |= n10;
        }
        Object[] objectArray2 = objectArray.length;
        ((j30_0)object).z(-416630839, objectArray2);
        n10 = objectArray.length;
        int n14 = 0;
        Object[] objectArray3 = null;
        for (n4 = 0; n4 < n10; ++n4) {
            Object object3 = objectArray[n4];
            int n15 = ((j30_0)object).x(object3);
            if (n15 != 0) {
                n15 = 4;
            } else {
                n15 = 0;
                object3 = null;
            }
            n7 |= n15;
        }
        ((j30_0)object).T(false);
        n10 = n7 & 0xE;
        if (n10 == 0) {
            n7 |= 2;
        }
        if ((n10 = n7 & 0x93) == (n4 = 146) && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            objectArray2 = new SpreadBuilder(2);
            objectArray2.add(function1);
            objectArray2.addSpread(objectArray);
            objectArray3 = new Object[objectArray2.size()];
            objectArray2 = objectArray2.toArray(objectArray3);
            n4 = (int)(((j30_0)object).x(this) ? 1 : 0);
            if ((n7 &= 0x70) == n8) {
                n14 = 1;
            }
            n7 = n4 | n14;
            Object object4 = ((j30_0)object).v();
            if (n7 != 0 || object4 == (object2 = b30$a.a)) {
                object4 = new Yl3$f(this, function1);
                ((j30_0)object).o(object4);
            }
            object4 = (Function1)object4;
            ly0_0.c(objectArray2, (Function1)object4, (b30_0)object);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            object2 = new Yl3$g(this, objectArray, function1, n3);
            ((CF2)object).d = object2;
        }
    }
}

