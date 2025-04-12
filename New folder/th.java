/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class th {
    public static final void a(Function0 function0, jq0 jq02, u10 u102, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        j30_0 j30_02;
        Object object3;
        int n4;
        jq0 jq03;
        Function0 function02;
        block14: {
            int n7;
            Object object4;
            Object object5;
            int n8;
            Object object6;
            int n10;
            int n14;
            block16: {
                block17: {
                    Object object7;
                    block15: {
                        int n15;
                        Object object8;
                        block13: {
                            function02 = function0;
                            jq03 = jq02;
                            object8 = u102;
                            n4 = n3;
                            object3 = b30_02;
                            j30_02 = b30_02.g(-2032877254);
                            n15 = n3 & 6;
                            if (n15 == 0) {
                                n15 = (int)(j30_02.x(function0) ? 1 : 0);
                                n15 = n15 != 0 ? 4 : 2;
                                n15 |= n4;
                            } else {
                                n15 = n3;
                            }
                            n14 = n4 & 0x30;
                            if (n14 == 0) {
                                n14 = (int)(j30_02.J(jq03) ? 1 : 0);
                                n14 = n14 != 0 ? 32 : 16;
                                n15 |= n14;
                            }
                            if ((n14 = n4 & 0x180) == 0) {
                                n14 = (int)(j30_02.x(object8) ? 1 : 0);
                                n14 = n14 != 0 ? 256 : 128;
                                n15 |= n14;
                            }
                            n10 = n15;
                            n14 = 146;
                            if ((n15 &= 0x93) != n14 || (n15 = (int)(j30_02.h() ? 1 : 0)) == 0) break block13;
                            j30_02.D();
                            break block14;
                        }
                        object2 = AndroidCompositionLocals_androidKt.f;
                        Object object9 = object2 = j30_02.j((H30)object2);
                        object9 = (View)object2;
                        object2 = O30.f;
                        object2 = (Vo0)j30_02.j((H30)object2);
                        object3 = O30.l;
                        Object object10 = object3 = j30_02.j((H30)object3);
                        object10 = (bp1_0)((Object)object3);
                        Object object11 = j30_02.G();
                        object6 = J83.j(object8, j30_02);
                        n8 = 0;
                        object3 = new Object[]{};
                        qh_0 qh_02 = qh_0.c;
                        int n16 = 3072;
                        int n17 = 6;
                        object5 = qh_02;
                        tr1_0 tr1_02 = object6;
                        object6 = j30_02;
                        j30$b j30$b = object11;
                        object4 = object10;
                        object10 = object3 = wi2_0.b(object3, null, qh_02, j30_02, n16, n17);
                        object10 = (UUID)object3;
                        n14 = (int)(j30_02.J(object9) ? 1 : 0);
                        int n18 = j30_02.J(object2);
                        object = j30_02.v();
                        object11 = b30$a.a;
                        n7 = 1;
                        if ((n14 |= n18) == 0 && object != object11) {
                            object7 = object11;
                            boolean bl3 = true;
                        } else {
                            Object object12 = object2;
                            object2 = object5;
                            object3 = function0;
                            object = jq02;
                            object8 = object5;
                            object5 = object9;
                            boolean bl2 = true;
                            object6 = object4;
                            object7 = object11;
                            object11 = object12;
                            ((oq0_0)object2)(function0, jq02, (View)object9, (bp1_0)((Object)object4), (Vo0)object12, (UUID)object10);
                            object2 = new ph_0(tr1_02);
                            int n19 = 488261145;
                            object3 = new u10(n19, object2, bl2);
                            object2 = ((oq0_0)object8).d;
                            ((AbstractComposeView)((Object)object2)).setParentCompositionContext(j30$b);
                            object = ((eq0_0)object2).j;
                            ((h83_0)object).setValue(object3);
                            ((eq0_0)object2).l = bl2;
                            object3 = ((AbstractComposeView)((Object)object2)).d;
                            if (object3 == null && (n14 = (int)(object2.isAttachedToWindow() ? 1 : 0)) == 0) {
                                object3 = "createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString();
                                object2 = new IllegalStateException((String)object3);
                                throw object2;
                            }
                            ((AbstractComposeView)((Object)object2)).d();
                            j30_02.o(object8);
                            object = object8;
                        }
                        object = (oq0_0)object;
                        n15 = (int)(j30_02.x(object) ? 1 : 0);
                        object3 = j30_02.v();
                        if (n15 != 0) break block15;
                        object2 = object7;
                        if (object3 != object7) break block16;
                        break block17;
                    }
                    object2 = object7;
                }
                object3 = new kh_0((oq0_0)object);
                j30_02.o(object3);
            }
            object3 = (Function1)object3;
            ly0_0.b(object, (Function1)object3, j30_02);
            n14 = (int)(j30_02.x(object) ? 1 : 0);
            n8 = n10 & 0xE;
            n7 = 4;
            if (n8 == n7) {
                n8 = 1;
            } else {
                n8 = 0;
                object5 = null;
            }
            n14 |= n8;
            n8 = n10 & 0x70;
            n7 = 32;
            if (n8 == n7) {
                n8 = 1;
            } else {
                n8 = 0;
                object5 = null;
            }
            n14 |= n8;
            object5 = object4;
            n7 = (int)(j30_02.J(object4) ? 1 : 0);
            object6 = j30_02.v();
            if ((n14 |= n7) != 0 || object6 == object2) {
                object6 = new lh_0((oq0_0)object, function02, jq03, (bp1_0)((Object)object5));
                j30_02.o(object6);
            }
            object6 = (Function0)object6;
            j30_02.q((Function0)object6);
        }
        object2 = j30_02.X();
        if (object2 != null) {
            object = u102;
            object3 = new mh_0(function02, jq03, u102, n4);
            ((CF2)object2).d = object3;
        }
    }

    public static final void b(LP1 lP1, u10 u102, b30_0 object, int n3) {
        block12: {
            Serializable serializable;
            Object object2;
            int n4;
            block11: {
                int n7;
                int n8;
                block10: {
                    object = object.g(-1177876616);
                    n8 = n3 & 6;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
                        n8 = n8 != 0 ? 4 : 2;
                        n8 |= n3;
                    } else {
                        n8 = n3;
                    }
                    n4 = n3 & 0x30;
                    if (n4 == 0) {
                        n4 = (int)(((j30_0)object).x(u102) ? 1 : 0);
                        n4 = n4 != 0 ? 32 : 16;
                        n8 |= n4;
                    }
                    if ((n4 = n8 & 0x13) != (n7 = 18) || (n4 = (int)(((j30_0)object).h() ? 1 : 0)) == 0) break block10;
                    ((j30_0)object).D();
                    break block11;
                }
                object2 = rh_0.a;
                n7 = n8 >> 3 & 0xE | 0x180;
                n8 = n8 << 3 & 0x70 | n7;
                n7 = ((j30_0)object).P;
                Object object3 = ((j30_0)object).P();
                LP1 lP12 = a30_0.c((b30_0)object, lP1);
                N20.W.getClass();
                Serializable serializable2 = N20$a.b;
                n8 = n8 << 6 & 0x380 | 6;
                mp mp2 = ((j30_0)object).a;
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block12;
                ((j30_0)object).A();
                bl2 = ((j30_0)object).O;
                if (bl2) {
                    ((j30_0)object).C((Function0)((Object)serializable2));
                } else {
                    ((j30_0)object).n();
                }
                serializable2 = N20$a.e;
                Ow3.a((b30_0)object, object2, (Function2)((Object)serializable2));
                object2 = N20$a.d;
                Ow3.a((b30_0)object, object3, (Function2)object2);
                object2 = N20$a.f;
                boolean bl3 = ((j30_0)object).O;
                if (bl3 || !(bl3 = Intrinsics.areEqual(object3 = ((j30_0)object).v(), serializable2 = Integer.valueOf(n7)))) {
                    rk_0.a(n7, (j30_0)object, n7, (N20$a$a)object2);
                }
                object2 = N20$a.c;
                Ow3.a((b30_0)object, lP12, (Function2)object2);
                serializable = Integer.valueOf(n8 >> 6 & 0xE);
                u102.invoke(object, serializable);
                n8 = 1;
                ((j30_0)object).T(n8 != 0);
            }
            object = ((j30_0)object).X();
            if (object != null) {
                n4 = 0;
                object2 = null;
                serializable = new sh_0(lP1, u102, n3, 0);
                ((CF2)object).d = serializable;
            }
            return;
        }
        s20.a();
        throw null;
    }
}

