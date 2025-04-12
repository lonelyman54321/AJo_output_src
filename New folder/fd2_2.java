/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$string;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fd2
 */
public final class fd2_2
implements gx0_2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;

    public fd2_2(o8_0 o8_02, n8_0 n8_02, String string2) {
        this.a = o8_02;
        this.b = n8_02;
        this.c = string2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block17: {
            int n3;
            Object object4;
            int n4;
            block16: {
                Object object5;
                block18: {
                    int n7;
                    int n8;
                    Object object6;
                    Object object7;
                    Object object8;
                    float f5;
                    int n10;
                    Object object9;
                    int n14;
                    Object object10;
                    Object object11;
                    Object object12;
                    block20: {
                        block19: {
                            fd2_2 fd2_22;
                            block15: {
                                fd2_22 = this;
                                object12 = object;
                                object12 = (PA)object;
                                object11 = object2;
                                object11 = (b30_0)object2;
                                object10 = object3;
                                object10 = (Number)object3;
                                n4 = ((Number)object10).intValue();
                                object4 = "$this$BoxWithConstraints";
                                Intrinsics.checkNotNullParameter(object12, (String)object4);
                                n14 = n4 & 0x51;
                                n4 = 16;
                                if (n14 != n4 || (n14 = (int)(object11.h() ? 1 : 0)) == 0) break block15;
                                object11.D();
                                break block16;
                            }
                            object12 = LP1$a.b;
                            object4 = zp.c;
                            object9 = Nc$a.m;
                            n10 = 0;
                            f5 = 0.0f;
                            object4 = oZ.a((zp$l)object4, (Gx$a)object9, (b30_0)object11, 0);
                            n3 = object11.F();
                            object8 = object11.m();
                            object7 = a30_0.c((b30_0)object11, (LP1)object12);
                            N20.W.getClass();
                            Serializable serializable = N20$a.b;
                            mp mp2 = object11.i();
                            int n15 = mp2 instanceof mp;
                            Object object13 = null;
                            if (n15 == 0) break block17;
                            object11.A();
                            n15 = object11.e();
                            if (n15 != 0) {
                                object11.C((Function0)((Object)serializable));
                            } else {
                                object11.n();
                            }
                            serializable = N20$a.e;
                            Ow3.a((b30_0)object11, object4, (Function2)((Object)serializable));
                            object4 = N20$a.d;
                            Ow3.a((b30_0)object11, object8, (Function2)object4);
                            object4 = N20$a.f;
                            n10 = object11.e();
                            if (n10 != 0 || (n10 = Intrinsics.areEqual(object8 = object11.v(), serializable = Integer.valueOf(n3))) == 0) {
                                re0_0.a(n3, (b30_0)object11, n3, (N20$a$a)object4);
                            }
                            object4 = N20$a.c;
                            Ow3.a((b30_0)object11, object7, (Function2)object4);
                            int n16 = R$string.received_your_order_already;
                            object7 = nk_0.f((b30_0)object11, n16);
                            long l2 = Em3.f(n4);
                            tv0_0 tv0_02 = tv0_0.o;
                            av0_0 av0_02 = y20_0.a;
                            int n17 = 130966;
                            object4 = null;
                            long l3 = 0L;
                            n15 = 0;
                            mp2 = null;
                            long l4 = 0L;
                            float f6 = 0.0f;
                            long l7 = 0L;
                            int n18 = 1772544;
                            object10 = object7;
                            object6 = tv0_02;
                            object = object11;
                            object11 = av0_02;
                            Ll3.b((String)object7, null, l3, l2, null, tv0_02, av0_02, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object, n18, 0, n17);
                            object10 = AndroidCompositionLocals_androidKt.b;
                            object5 = object;
                            object10 = object.j((H30)object10);
                            n16 = object10 instanceof Activity;
                            if (n16 != 0) {
                                object13 = object10;
                                object13 = (Activity)object10;
                            }
                            n4 = -482724814;
                            object5.K(n4);
                            if (object13 == null) break block18;
                            n4 = R$string.refresh_popup_msg_for_already_rcv_product;
                            object10 = nk_0.f((b30_0)object5, n4);
                            object4 = new Sl$a();
                            long l8 = xx_1.e;
                            n10 = 12;
                            f5 = 1.7E-44f;
                            long l12 = Em3.f(n10);
                            tv0_0 tv0_03 = tv0_0.m;
                            char c2 = (char)-40;
                            long l14 = 0L;
                            char c3 = '\u0000';
                            long l15 = 0L;
                            object9 = new S93(l8, l12, tv0_03, null, null, av0_02, null, l14, null, null, null, l15, null, null, c2);
                            n3 = ((Sl$a)object4).g((S93)object9);
                            ((Sl$a)object4).c((String)object10);
                            object10 = Unit.a;
                            object10 = fd2_22.c;
                            if (object10 != null) {
                                object9 = "URL";
                                ((Sl$a)object4).f((String)object9, (String)object10);
                            }
                            long l16 = xx_1.h;
                            long l17 = Em3.f(n10);
                            c3 = (char)-40;
                            long l18 = 0L;
                            long l19 = 0L;
                            object10 = new S93(l16, l17, tv0_02, null, null, av0_02, null, l18, null, null, null, l19, null, null, c3);
                            n4 = ((Sl$a)object4).g((S93)object10);
                            object9 = " Return Policy";
                            ((Sl$a)object4).c((String)object9);
                            object10 = ((Sl$a)object4).h();
                            n16 = 8;
                            f6 = n16;
                            object9 = null;
                            n15 = 13;
                            serializable = null;
                            object4 = object12;
                            f5 = f6;
                            object4 = h.i((LP1)object12, 0.0f, f6, 0.0f, 0.0f, n15);
                            float f7 = 1.0f;
                            object4 = j.c((LP1)object4, f7);
                            object5.K(320518592);
                            n3 = (int)(object5.J(object10) ? 1 : 0);
                            object8 = fd2_22.a;
                            int n19 = object5.J(object8);
                            object7 = object5.v();
                            b30$a$a b30$a$a = b30$a.a;
                            if ((n3 |= n19) != 0 || object7 == b30$a$a) {
                                object8 = (o8_0)object8;
                                object7 = new ed2_2((Sl)object10, (o8_0)object8);
                                object5.o(object7);
                            }
                            object6 = object7;
                            object6 = (Function1)object7;
                            object5.E();
                            n8 = 48;
                            int n20 = 124;
                            n10 = 0;
                            object8 = null;
                            serializable = null;
                            mp2 = null;
                            object11 = object5;
                            n7 = n20;
                            IV.a((Sl)object10, (LP1)object4, null, false, 0, 0, null, (Function1)object6, (b30_0)object5, n8, n20);
                            n4 = R$string.od_okay;
                            object6 = nk_0.f((b30_0)object5, n4);
                            f5 = 24;
                            boolean bl2 = false;
                            object7 = null;
                            n15 = 5;
                            n3 = 0;
                            object4 = object12;
                            object9 = j.c(h.i((LP1)object12, 0.0f, f5, 0.0f, f6, n15), f7);
                            n14 = 320542635;
                            object5.K(n14);
                            object12 = fd2_22.b;
                            n4 = (int)(object5.J(object12) ? 1 : 0);
                            object4 = object5.v();
                            if (n4 != 0) break block19;
                            object10 = b30$a$a;
                            if (object4 != b30$a$a) break block20;
                        }
                        object12 = (n8_0)object12;
                        n4 = 3;
                        object4 = new k8_0(object12, n4);
                        object5.o(object4);
                    }
                    object7 = object4;
                    object7 = (Function0)object4;
                    object5.E();
                    n8 = 384;
                    n7 = 105;
                    n4 = 0;
                    object10 = null;
                    n10 = 0;
                    f5 = 0.0f;
                    object8 = null;
                    long l2 = 0L;
                    n14 = 0;
                    object12 = null;
                    object4 = object6;
                    object6 = null;
                    object11 = object5;
                    vb2.a(false, (String)object4, (LP1)object9, null, (Function0)object7, l2, null, (b30_0)object5, n8, n7);
                }
                object5.E();
                object5.p();
            }
            return Unit.a;
            finally {
                ((Sl$a)object4).e(n4);
            }
            finally {
                ((Sl$a)object4).e(n3);
            }
        }
        s20.a();
        throw null;
    }
}

