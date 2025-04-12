/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from bd2
 */
public final class bd2_2
implements gx0_2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ Function1 f;

    public bd2_2(yp0_2 yp0_22, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, Ref$ObjectRef ref$ObjectRef4, je1_0 je1_02) {
        this.a = yp0_22;
        this.b = ref$ObjectRef;
        this.c = ref$ObjectRef2;
        this.d = ref$ObjectRef3;
        this.e = ref$ObjectRef4;
        this.f = je1_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block9: {
            block8: {
                boolean bl2;
                int n3;
                Object object4;
                int n4;
                Object object5;
                Object object6;
                Object object7;
                float f5;
                int n7;
                bd2_2 bd2_22;
                block7: {
                    bd2_22 = this;
                    n7 = 1;
                    f5 = Float.MIN_VALUE;
                    object7 = object;
                    object7 = (PA)object;
                    object6 = object2;
                    object6 = (b30_0)object2;
                    object5 = object3;
                    object5 = (Number)object3;
                    n4 = ((Number)object5).intValue();
                    object4 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(object7, (String)object4);
                    n3 = n4 & 0x51;
                    n4 = 16;
                    if (n3 != n4 || (n3 = (int)(object6.h() ? 1 : 0)) == 0) break block7;
                    object6.D();
                    break block8;
                }
                object7 = zp.g;
                object5 = Nc$a.k;
                LP1$a lP1$a = LP1$a.b;
                int bl22 = 54;
                float f6 = 7.6E-44f;
                object7 = iQ2.a((zp$e)object7, (Gx$b)object5, (b30_0)object6, bl22);
                n4 = object6.F();
                object4 = object6.m();
                Object object8 = a30_0.c((b30_0)object6, lP1$a);
                N20.W.getClass();
                Object object9 = N20$a.b;
                Object object10 = object6.i();
                boolean bl3 = object10 instanceof mp;
                if (!bl3) break block9;
                object6.A();
                bl3 = object6.e();
                if (bl3) {
                    object6.C((Function0)object9);
                } else {
                    object6.n();
                }
                object9 = N20$a.e;
                Ow3.a((b30_0)object6, object7, (Function2)object9);
                object7 = N20$a.d;
                Ow3.a((b30_0)object6, object4, (Function2)object7);
                object7 = N20$a.f;
                boolean bl4 = object6.e();
                if (bl4 || !(bl2 = Intrinsics.areEqual(object4 = object6.v(), object9 = Integer.valueOf(n4)))) {
                    re0_0.a(n4, (b30_0)object6, n4, (N20$a$a)object7);
                }
                object7 = N20$a.c;
                Ow3.a((b30_0)object6, object8, (Function2)object7);
                object7 = mq2_0.a;
                n4 = R$string.od_cancel;
                String string2 = nk_0.f((b30_0)object6, n4);
                float f7 = 4;
                object4 = lP1$a;
                object5 = h.i(lP1$a, 0.0f, 0.0f, f7, 0.0f, 11);
                int n8 = 1065353216;
                float f8 = 1.0f;
                object5 = j.c((LP1)object5, f8);
                double d2 = 0.2;
                f6 = (float)d2;
                long l2 = OX.b;
                int n10 = 8;
                float f11 = n10;
                object8 = SP2.a(f11);
                object5 = gz.a((LP1)object5, f6, l2, (i13)object8);
                float f12 = 0.5f;
                LP1 lP1 = ((mq2_0)object7).a((LP1)object5, f12, n7 != 0);
                object5 = GE.a;
                long l3 = OX.f;
                int n14 = 14;
                float f14 = 2.0E-44f;
                long l4 = 0L;
                int n15 = 6;
                object10 = object6;
                long l7 = l2;
                int n16 = n14;
                object9 = GE.a(l3, l4, (b30_0)object6, n15, n14);
                n4 = 1769804282;
                object6.K(n4);
                object5 = bd2_22.a;
                boolean bl5 = object6.J(object5);
                object8 = object6.v();
                if (bl5 || object8 == (object4 = b30$a.a)) {
                    object5 = (yp0_2)object5;
                    object8 = new d41_0(object5, n7);
                    object6.o(object8);
                }
                object10 = object8;
                object10 = (Function0)object8;
                object6.E();
                n14 = 196608;
                int n17 = 65;
                float f15 = 9.1E-44f;
                object4 = string2;
                object8 = lP1;
                l2 = l7;
                n7 = 1065353216;
                f5 = 1.0f;
                n8 = n14;
                f8 = 2.75506E-40f;
                f14 = f7;
                int n18 = n17;
                f7 = f15;
                vb2.a(false, string2, lP1, (ol0)object9, (Function0)object10, l7, null, (b30_0)object6, n14, n17);
                n4 = R$string.return_exchange_lbl;
                string2 = nk_0.f((b30_0)object6, n4);
                bl3 = false;
                object4 = lP1$a;
                f11 = f14;
                LP1 lP12 = j.c(h.i(lP1$a, f14, 0.0f, 0.0f, 0.0f, 14), f5);
                boolean bl6 = true;
                f6 = Float.MIN_VALUE;
                lP12 = ((mq2_0)object7).a(lP12, 0.5f, bl6);
                l4 = 0L;
                n16 = 14;
                object10 = object6;
                object9 = GE.a(l7, l4, (b30_0)object6, n15, n16);
                object7 = bd2_22.d;
                Object object11 = object5 = bd2_22.f;
                object11 = (je1_0)object5;
                object5 = bd2_22.b;
                object4 = bd2_22.c;
                object8 = bd2_22.e;
                object10 = new ad2_2((Ref$ObjectRef)object5, (Ref$ObjectRef)object4, (Ref$ObjectRef)object7, (Ref$ObjectRef)object8, (je1_0)object11);
                n8 = 196608;
                f8 = 2.75506E-40f;
                n18 = 65;
                f7 = 9.1E-44f;
                n4 = 0;
                object5 = null;
                n3 = 0;
                object7 = null;
                object4 = string2;
                object8 = lP12;
                l2 = l3;
                string2 = null;
                vb2.a(false, (String)object4, lP12, (ol0)object9, (Function0)object10, l3, null, (b30_0)object6, n8, n18);
                object6.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

