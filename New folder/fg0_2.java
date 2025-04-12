/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.SortedMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fG0
 */
public final class fg0_2
implements Function2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Configuration f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ ib3_0 h;
    public final /* synthetic */ BaseValue i;

    public fg0_2(Subcomponent subcomponent, boolean bl2, of0_2 of0_22, nf0_1 nf0_12, int n3, Configuration configuration, nh0_0 nh0_02, ib3_0 ib3_02, BaseValue baseValue) {
        this.a = subcomponent;
        this.b = bl2;
        this.c = of0_22;
        this.d = nf0_12;
        this.e = n3;
        this.f = configuration;
        this.g = nh0_02;
        this.h = ib3_02;
        this.i = baseValue;
    }

    public final Object invoke(Object object, Object object2) {
        block13: {
            block14: {
                block12: {
                    Object object3;
                    Object object4;
                    int n3;
                    int n4;
                    Object object5;
                    Object object6;
                    fg0_2 fg0_22;
                    block11: {
                        fg0_22 = this;
                        object6 = object;
                        object6 = (b30_0)object;
                        object5 = object2;
                        object5 = (Number)object2;
                        n4 = ((Number)object5).intValue() & 0xB;
                        if (n4 != (n3 = 2) || (n4 = (int)(object6.h() ? 1 : 0)) == 0) break block11;
                        object6.D();
                        break block12;
                    }
                    LP1$a lP1$a = LP1$a.b;
                    float f5 = 1.0f;
                    object5 = j.c(lP1$a, f5);
                    Object object7 = zp.c;
                    Object object8 = Nc$a.m;
                    object7 = oZ.a((zp$l)object7, (Gx$a)object8, (b30_0)object6, 0);
                    int bl2 = object6.F();
                    Object object9 = object6.m();
                    object5 = a30_0.c((b30_0)object6, (LP1)object5);
                    N20.W.getClass();
                    Object object10 = N20$a.b;
                    Object object11 = object6.i();
                    int n7 = object11 instanceof mp;
                    SortedMap sortedMap = null;
                    if (n7 == 0) break block13;
                    object6.A();
                    n7 = object6.e();
                    if (n7 != 0) {
                        object6.C((Function0)object10);
                    } else {
                        object6.n();
                    }
                    object11 = N20$a.e;
                    Ow3.a((b30_0)object6, object7, (Function2)object11);
                    object7 = N20$a.d;
                    Ow3.a((b30_0)object6, object9, (Function2)object7);
                    object9 = N20$a.f;
                    int n8 = object6.e();
                    if (n8 != 0 || (n8 = Intrinsics.areEqual(object4 = object6.v(), object3 = Integer.valueOf(bl2))) == 0) {
                        re0_0.a(bl2, (b30_0)object6, bl2, (N20$a$a)object9);
                    }
                    object8 = N20$a.c;
                    Ow3.a((b30_0)object6, object5, (Function2)object8);
                    object5 = Nc$a.j;
                    long l2 = nz_1.k;
                    object4 = fg2_1.a;
                    object4 = androidx.compose.foundation.a.b(lP1$a, l2, (i13)object4);
                    object3 = zp.a;
                    int n10 = 48;
                    object5 = iQ2.a((zp$e)object3, (Gx$b)object5, (b30_0)object6, n10);
                    int n14 = object6.F();
                    rq2_1 rq2_12 = object6.m();
                    object4 = a30_0.c((b30_0)object6, (LP1)object4);
                    Object object12 = object6.i();
                    int n15 = object12 instanceof mp;
                    if (n15 == 0) break block14;
                    object6.A();
                    n15 = object6.e();
                    if (n15 != 0) {
                        object6.C((Function0)object10);
                    } else {
                        object6.n();
                    }
                    Ow3.a((b30_0)object6, object5, (Function2)object11);
                    Ow3.a((b30_0)object6, rq2_12, (Function2)object7);
                    n4 = (int)(object6.e() ? 1 : 0);
                    if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object5 = object6.v(), object7 = Integer.valueOf(n14)) ? 1 : 0)) == 0) {
                        re0_0.a(n14, (b30_0)object6, n14, (N20$a$a)object9);
                    }
                    Ow3.a((b30_0)object6, object4, (Function2)object8);
                    object3 = mq2_0.a;
                    boolean bl3 = true;
                    object5 = ((mq2_0)object3).a(lP1$a, f5, bl3);
                    Object object13 = object8 = fg0_22.d;
                    object13 = (nf0_1)object8;
                    Object object14 = object8 = fg0_22.g;
                    object14 = (nh0_0)object8;
                    object4 = fg0_22.a;
                    int n16 = fg0_22.e;
                    object9 = fg0_22.f;
                    object10 = fg0_22.h;
                    object12 = object7;
                    object7 = new xf0_1((Subcomponent)object4, (nf0_1)object13, n16, (Configuration)object9, (nh0_0)object14, (ib3_0)object10);
                    object9 = v10.c(1156384171, (fx0_2)object7, (b30_0)object6);
                    n15 = 6;
                    object10 = object6;
                    n8 = n15;
                    OA.a((LP1)object5, null, false, (u10)object9, (b30_0)object6, 3072, n15);
                    object5 = ((mq2_0)object3).a(lP1$a, f5, bl3);
                    object8 = fg0_22.i;
                    object7 = new eg0_2((Subcomponent)object4, (BaseValue)object8);
                    object9 = v10.c(1130212834, (fx0_2)object7, (b30_0)object6);
                    n7 = 3072;
                    n8 = 6;
                    n3 = 0;
                    object7 = null;
                    boolean bl4 = false;
                    object8 = null;
                    OA.a((LP1)object5, null, false, (u10)object9, (b30_0)object6, n7, n8);
                    object6.p();
                    if (object4 != null) {
                        n4 = 3;
                        sortedMap = ((Subcomponent)object4).getTabsBrandsLayoutMapping(n4);
                    }
                    n4 = 708343038;
                    object6.K(n4);
                    if (sortedMap != null) {
                        n4 = 8;
                        object7 = (of0_2)fg0_22.c;
                        boolean bl5 = fg0_22.b;
                        iG0.c(sortedMap, bl5, (of0_2)object7, (b30_0)object6, n4);
                    }
                    object6.E();
                    object6.p();
                }
                return Unit.a;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

