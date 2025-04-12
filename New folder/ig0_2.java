/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ig0
 */
public final class ig0_2
implements hx0_2 {
    public final /* synthetic */ lt1 a;
    public final /* synthetic */ yi2_1 b;
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ yh0_0 d;
    public final /* synthetic */ hd2_0 e;

    public ig0_2(lt1 lt12, yi2_1 yi2_12, pg0_1 pg0_12, yh0_0 yh0_02, hd2_0 hd2_02) {
        this.a = lt12;
        this.b = yi2_12;
        this.c = pg0_12;
        this.d = yh0_02;
        this.e = hd2_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        block10: {
            block9: {
                int n3;
                Object object5;
                int n4;
                int n7;
                block8: {
                    object = (wr1_2)object;
                    object2 = (Number)object2;
                    n7 = ((Number)object2).intValue();
                    object3 = (b30_0)object3;
                    object4 = (Number)object4;
                    n4 = ((Number)object4).intValue();
                    object5 = "$this$items";
                    Intrinsics.checkNotNullParameter(object, (String)object5);
                    n3 = n4 & 0x70;
                    if (n3 == 0) {
                        n3 = (int)(object3.c(n7) ? 1 : 0);
                        n3 = n3 != 0 ? 32 : 16;
                        n4 |= n3;
                    }
                    if ((n3 = n4 & 0x2D1) != (n4 = 144) || (n3 = (int)(object3.h() ? 1 : 0)) == 0) break block8;
                    object3.D();
                    break block9;
                }
                object5 = object = this.a.b(n7);
                object5 = (ProductReview)object;
                Object object6 = LP1$a.b;
                float f5 = 10;
                n3 = 24;
                float f6 = n3;
                yh0_0 yh0_02 = null;
                int n8 = 4;
                object = h.i((LP1)object6, f6, f5, 0.0f, f5, n8);
                object2 = Nc$a.a;
                object4 = null;
                object2 = HA.e((Nc)object2, false);
                n4 = object3.F();
                object6 = object3.m();
                object = a30_0.c((b30_0)object3, (LP1)object);
                N20.W.getClass();
                Object object7 = N20$a.b;
                Object object8 = object3.i();
                boolean bl2 = object8 instanceof mp;
                if (!bl2) break block10;
                object3.A();
                bl2 = object3.e();
                if (bl2) {
                    object3.C((Function0)object7);
                } else {
                    object3.n();
                }
                object7 = N20$a.e;
                Ow3.a((b30_0)object3, object2, (Function2)object7);
                object2 = N20$a.d;
                Ow3.a((b30_0)object3, object6, (Function2)object2);
                object2 = N20$a.f;
                boolean bl3 = object3.e();
                if (bl3 || !(bl3 = Intrinsics.areEqual(object6 = object3.v(), object7 = Integer.valueOf(n4)))) {
                    re0_0.a(n4, (b30_0)object3, n4, (N20$a$a)object2);
                }
                object2 = N20$a.c;
                Ow3.a((b30_0)object3, object, (Function2)object2);
                object = this.e;
                object2 = null;
                object7 = new gg0_1(object, 0);
                n3 = 647880209;
                object3.K(n3);
                object = this.c;
                n7 = (int)(object3.J(object) ? 1 : 0);
                object4 = object3.v();
                if (n7 != 0 || object4 == (object2 = b30$a.a)) {
                    object = (pg0_1)object;
                    object4 = new hg0_1((pg0_1)object);
                    object3.o(object4);
                }
                object8 = object4;
                object8 = (gx0_2)object4;
                object3.E();
                n8 = 32776;
                object6 = this.b;
                yh0_02 = this.d;
                bp2_0.b((ProductReview)object5, (yi2_1)object6, (Function1)object7, (gx0_2)object8, yh0_02, (b30_0)object3, n8, 0);
                object3.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

