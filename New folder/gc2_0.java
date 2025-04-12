/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Gc2
 */
public final class gc2_0
implements gx0_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ i90_0 d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ List h;

    public gc2_0(int n3, boolean bl2, String string2, c80 c802, Activity activity, String string3, String string4, List list) {
        this.a = n3;
        this.b = bl2;
        this.c = string2;
        this.d = c802;
        this.e = activity;
        this.f = string3;
        this.g = string4;
        this.h = list;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block17: {
            block18: {
                int n3;
                Object object4;
                block16: {
                    long l2;
                    long l3;
                    float f5;
                    long l4;
                    long l7;
                    long l8;
                    int n4;
                    int n7;
                    Object object5;
                    Object object6;
                    int n8;
                    Object object7;
                    int n10;
                    Object object8;
                    Object object9;
                    Object object10;
                    gc2_0 gc2_02;
                    block15: {
                        gc2_02 = this;
                        object10 = object;
                        object10 = (PA)object;
                        object9 = object2;
                        object9 = (b30_0)object2;
                        object8 = object3;
                        object8 = (Number)object3;
                        n10 = ((Number)object8).intValue();
                        object7 = "$this$BoxWithConstraints";
                        Intrinsics.checkNotNullParameter(object10, (String)object7);
                        n8 = n10 & 0x51;
                        n10 = 16;
                        if (n8 != n10 || (n8 = (int)(object9.h() ? 1 : 0)) == 0) break block15;
                        object9.D();
                        break block16;
                    }
                    object10 = gc2_02.c;
                    LP1$a lP1$a = LP1$a.b;
                    object8 = zp.c;
                    object7 = Nc$a.m;
                    int n14 = 0;
                    object8 = oZ.a((zp$l)object8, (Gx$a)object7, (b30_0)object9, 0);
                    int n15 = object9.F();
                    object4 = object9.m();
                    Object object11 = a30_0.c((b30_0)object9, lP1$a);
                    N20.W.getClass();
                    Object object12 = N20$a.b;
                    Object object13 = object9.i();
                    n3 = object13 instanceof mp;
                    if (n3 == 0) break block17;
                    object9.A();
                    n3 = object9.e();
                    if (n3 != 0) {
                        object9.C((Function0)object12);
                    } else {
                        object9.n();
                    }
                    object13 = N20$a.e;
                    Ow3.a((b30_0)object9, object8, (Function2)object13);
                    object8 = N20$a.d;
                    Ow3.a((b30_0)object9, object4, (Function2)object8);
                    object4 = N20$a.f;
                    boolean bl2 = object9.e();
                    if (bl2 || !(bl2 = Intrinsics.areEqual(object6 = object9.v(), object5 = Integer.valueOf(n15)))) {
                        re0_0.a(n15, (b30_0)object9, n15, (N20$a$a)object4);
                    }
                    object7 = N20$a.c;
                    Ow3.a((b30_0)object9, object11, (Function2)object7);
                    int n16 = 1065353216;
                    float f6 = 1.0f;
                    object11 = j.c(lP1$a, f6);
                    object6 = zp.f;
                    object5 = Nc$a.k;
                    int n17 = 54;
                    object6 = iQ2.a((zp$e)object6, (Gx$b)object5, (b30_0)object9, n17);
                    int n18 = object9.F();
                    Object object14 = object9.m();
                    object11 = a30_0.c((b30_0)object9, (LP1)object11);
                    Object object15 = object9.i();
                    int n19 = object15 instanceof mp;
                    if (n19 == 0) break block18;
                    object9.A();
                    n19 = object9.e();
                    if (n19 != 0) {
                        object9.C((Function0)object12);
                    } else {
                        object9.n();
                    }
                    Ow3.a((b30_0)object9, object6, (Function2)object13);
                    Ow3.a((b30_0)object9, object14, (Function2)object8);
                    n10 = (int)(object9.e() ? 1 : 0);
                    if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object8 = object9.v(), object12 = Integer.valueOf(n18)) ? 1 : 0)) == 0) {
                        re0_0.a(n18, (b30_0)object9, n18, (N20$a$a)object4);
                    }
                    Ow3.a((b30_0)object9, object11, (Function2)object7);
                    n10 = R$string.shipment;
                    object8 = nk_0.f((b30_0)object9, n10);
                    object7 = " ";
                    object8 = nn_2.a((String)object8, (String)object7);
                    int n20 = gc2_02.a;
                    object11 = "   ";
                    object8 = g30.a(n20, (String)object11, (StringBuilder)object8);
                    n19 = gc2_02.b;
                    if (n19 == 0) {
                        object8 = "Other products in the order";
                    }
                    object4 = new Sl$a();
                    long l12 = xx_1.e;
                    tv0_0 tv0_02 = tv0_0.o;
                    int n21 = 12;
                    long l14 = Em3.f(n21);
                    char c2 = (char)-8;
                    Object object16 = null;
                    int n22 = 0;
                    long l15 = 0L;
                    long l16 = 0L;
                    tv0_0 tv0_03 = tv0_02;
                    object13 = new S93(l12, l14, tv0_02, null, null, null, null, l15, null, null, null, l16, null, null, c2);
                    n3 = ((Sl$a)object4).g((S93)object13);
                    ((Sl$a)object4).c((String)object8);
                    object8 = Unit.a;
                    ((Sl$a)object4).c((String)object7);
                    tv0_03 = tv0_0.m;
                    l14 = Em3.f(n21);
                    c2 = (char)-8;
                    object16 = null;
                    n22 = 0;
                    l15 = 0L;
                    l16 = 0L;
                    object8 = new S93(l12, l14, tv0_03, null, null, null, null, l15, null, null, null, l16, null, null, c2);
                    n10 = ((Sl$a)object4).g((S93)object8);
                    try {
                        ((Sl$a)object4).c((String)object10);
                        ((Sl$a)object4).e(n10);
                        object8 = ((Sl$a)object4).h();
                        n7 = 0;
                        n4 = 262142;
                        n15 = 0;
                        object7 = null;
                        l8 = 0L;
                        l7 = 0L;
                        bl2 = false;
                        object6 = null;
                        n18 = 0;
                        object5 = null;
                        n17 = 0;
                        object14 = null;
                        n8 = n19;
                        l4 = 0L;
                        n14 = 0;
                        object2 = lP1$a;
                        lP1$a = null;
                        f5 = 0.0f;
                        l3 = 0L;
                        object3 = object9;
                        l2 = l3;
                        tv0_03 = null;
                    }
                    catch (Throwable throwable) {
                        object7 = throwable;
                        ((Sl$a)object4).e(n10);
                        throw throwable;
                    }
                    Ll3.c((Sl)object8, null, l8, l7, null, null, null, l4, null, null, l3, 0, false, 0, 0, null, null, null, (b30_0)object9, 0, 0, n4);
                    n10 = R$string.download_invoice;
                    object16 = nk_0.f((b30_0)object9, n10);
                    long l17 = Em3.f(n21);
                    long l18 = n19 == 0 && (n10 = (int)(km_1.b((cp$a)(object8 = cp_1.Companion)) ? 1 : 0)) == 0 ? xx_1.i : xx_1.h;
                    f5 = 8;
                    object8 = object2;
                    float f7 = f5;
                    object8 = androidx.compose.foundation.layout.h.i((LP1)object2, 0.0f, 0.0f, f5, 0.0f, 11);
                    object13 = gc2_02.e;
                    object12 = object4 = gc2_02.d;
                    object12 = (c80)object4;
                    object6 = gc2_02.f;
                    object5 = gc2_02.g;
                    object4 = object7;
                    object7 = new yc2_1(n8 != 0, (c80)object12, (Activity)object13, (String)object6, (String)object5);
                    object7 = androidx.compose.foundation.d.b((LP1)object8, false, null, (Function0)object7, 7);
                    n7 = 131024;
                    n17 = 0;
                    l4 = 0L;
                    n10 = 0;
                    lP1$a = null;
                    f5 = 0.0f;
                    l2 = 0L;
                    tv0_03 = null;
                    n22 = 199680;
                    object8 = object16;
                    l8 = l18;
                    l7 = l17;
                    object5 = tv0_02;
                    object16 = object9;
                    Ll3.b((String)object8, (LP1)object7, l18, l17, null, tv0_02, null, l4, null, null, l2, 0, false, 0, 0, null, null, (b30_0)object9, n22, 0, n7);
                    object9.p();
                    object8 = object2;
                    object8 = androidx.compose.foundation.layout.h.g(j.c((LP1)object2, 1.0f), 0.0f, f7, 1);
                    object7 = gc2_02.h;
                    object14 = new zc2_1((List)object7, n8 != 0);
                    n16 = 6;
                    f6 = 8.4E-45f;
                    n14 = 254;
                    n15 = 0;
                    object7 = null;
                    n20 = 0;
                    object4 = null;
                    f7 = 0.0f;
                    object11 = null;
                    object12 = null;
                    n3 = 0;
                    object13 = null;
                    bl2 = false;
                    object6 = null;
                    n18 = 0;
                    object5 = null;
                    object15 = object9;
                    xq1_0.b((LP1)object8, null, null, false, null, null, null, false, (Function1)object14, (b30_0)object9, n16, n14);
                    object9.p();
                }
                return Unit.a;
                finally {
                    ((Sl$a)object4).e(n3);
                }
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

