/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bd3
 */
public final class bd3_1
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ int f;
    public final /* synthetic */ dr0_0 g;
    public final /* synthetic */ String h;

    public bd3_1(int n3, dr0_0 dr0_02, ft1_2 ft1_22, p83_0 p83_02, Activity activity, String string2, Function2 function2, boolean bl2) {
        this.a = p83_02;
        this.b = bl2;
        this.c = ft1_22;
        this.d = function2;
        this.e = activity;
        this.f = n3;
        this.g = dr0_02;
        this.h = string2;
    }

    /*
     * WARNING - void declaration
     */
    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        bd3_1 bd3_12 = this;
        Object object5 = object;
        object5 = (wr1_2)object;
        Object object6 = object2;
        object6 = (Number)object2;
        int n3 = ((Number)object6).intValue();
        Object object7 = object3;
        object7 = (b30_0)object3;
        Object object8 = object4;
        object8 = (Number)object4;
        int n4 = ((Number)object8).intValue();
        Object object9 = "$this$items";
        Intrinsics.checkNotNullParameter(object5, (String)object9);
        int n7 = n4 & 0x70;
        int n8 = 32;
        if (n7 == 0) {
            n7 = (int)(object7.c(n3) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        n7 = n4;
        int n10 = 144;
        float f5 = 2.02E-43f;
        if ((n4 &= 0x2D1) == n10 && (n4 = (int)(object7.h() ? 1 : 0)) != 0) {
            object7.D();
        } else {
            void var24_29;
            Function2 function2;
            ad3_1 ad3_12;
            object8 = LP1$a.b;
            f5 = uq0_0.F;
            LP1 lP1 = j.k((LP1)object8, f5);
            int n14 = bd3_12.f;
            object9 = bd3_12.e;
            boolean bl2 = bd3_12.b;
            Object object10 = bd3_12.a;
            Object object11 = bd3_12.g;
            String string2 = bd3_12.h;
            object8 = ad3_12;
            boolean n15 = bl2;
            Object object12 = object10;
            p83_0 p83_02 = object10;
            object10 = string2;
            ad3_12 = new ad3_1((Activity)object9, bl2, (p83_0)object12, n3, n14, (dr0_0)object11, string2);
            int n16 = n7 << 3 & 0x380 | 6;
            int n17 = 8;
            int n18 = 0;
            object12 = null;
            object8 = lP1;
            object9 = p83_02;
            int n19 = n3;
            object11 = object7;
            sd3_2.a(lP1, p83_02, n3, false, bl2, ad3_12, (b30_0)object7, n16, n17);
            n4 = 378914565;
            object7.K(n4);
            object8 = bd3_12.a;
            n10 = (int)(object7.J(object8) ? 1 : 0);
            int n20 = n7 & 0x70;
            if (n20 == n8) {
                boolean bl3 = true;
            } else {
                boolean bl4 = false;
                function2 = null;
            }
            n10 |= var24_29;
            function2 = bd3_12.d;
            n18 = object7.J(function2);
            object12 = object7.v();
            if ((n10 |= n18) != 0 || object12 == (object9 = b30$a.a)) {
                object12 = new ow2_1((p83_0)object8, n3, function2);
                object7.o(object12);
            }
            object12 = (Function0)object12;
            object7.E();
            n7 = n7 >> 3 & 0xE;
            object8 = bd3_12.c;
            ov3.m(n3, (ft1_2)object8, (Function0)object12, (b30_0)object7, n7);
        }
        return Unit.a;
    }
}

