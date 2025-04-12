/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from sE1
 */
public final class se1_2
implements gx0_2 {
    public final /* synthetic */ CMSNavigation a;
    public final /* synthetic */ bf1_2 b;
    public final /* synthetic */ Function1 c;

    public se1_2(CMSNavigation cMSNavigation, bf1_2 bf1_22, te1_1 te1_12) {
        this.a = cMSNavigation;
        this.b = bf1_22;
        this.c = te1_12;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        block11: {
            block10: {
                float f5;
                int n3;
                float f6;
                Object object4;
                block9: {
                    object = (PA)object;
                    object2 = (b30_0)object2;
                    object3 = (Number)object3;
                    int n4 = ((Number)object3).intValue();
                    object4 = "$this$BoxWithConstraints";
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    int n7 = n4 & 0x51;
                    n4 = 16;
                    if (n7 != n4 || (n7 = (int)(object2.h() ? 1 : 0)) == 0) break block9;
                    object2.D();
                    break block10;
                }
                object = LP1$a.b;
                object3 = zp.c;
                object4 = Nc$a.m;
                Object object5 = null;
                object3 = oZ.a((zp$l)object3, (Gx$a)object4, (b30_0)object2, 0);
                int n8 = object2.F();
                Object object6 = object2.m();
                Object object7 = a30_0.c((b30_0)object2, (LP1)object);
                N20.W.getClass();
                Object object8 = N20$a.b;
                Object object9 = object2.i();
                boolean bl2 = object9 instanceof mp;
                Object object10 = null;
                if (!bl2) break block11;
                object2.A();
                bl2 = object2.e();
                if (bl2) {
                    object2.C((Function0)object8);
                } else {
                    object2.n();
                }
                object8 = N20$a.e;
                Ow3.a((b30_0)object2, object3, (Function2)object8);
                object3 = N20$a.d;
                Ow3.a((b30_0)object2, object6, (Function2)object3);
                object3 = N20$a.f;
                int n10 = object2.e();
                if (n10 != 0 || (n10 = Intrinsics.areEqual(object6 = object2.v(), object8 = Integer.valueOf(n8))) == 0) {
                    re0_0.a(n8, (b30_0)object2, n8, (N20$a$a)object3);
                }
                object3 = N20$a.c;
                Ow3.a((b30_0)object2, object7, (Function2)object3);
                object3 = this.a;
                object4 = ((CMSNavigation)object3).getAspectRatio();
                if (object4 != null && (n10 = ((String)object4).length()) > 0) {
                    object6 = new String[]{":"};
                    object4 = StringsKt.a0((CharSequence)object4, object6, false, 0, 6);
                    object6 = (String)object4.get(0);
                    f6 = Float.parseFloat((String)object6);
                    n3 = 1;
                    f5 = Float.MIN_VALUE;
                    object4 = (String)object4.get(n3);
                    float f7 = Float.parseFloat((String)object4);
                    object10 = Float.valueOf(f6 /= f7);
                }
                if (object10 == null) {
                    object10 = p50_0.b;
                }
                object4 = ((CMSNavigation)object3).getActiveImageUrl();
                object2.u(1998134191);
                n10 = 8;
                f6 = 1.1E-44f;
                object4 = u63.a(object4, (b30_0)object2, n10);
                object2.I();
                object6 = ((CMSNavigation)object3).getInactiveAltText();
                if (object6 == null) {
                    object6 = ((CMSNavigation)object3).getName();
                }
                object8 = i70$a.g;
                object = j.c((LP1)object, 1.0f);
                Intrinsics.checkNotNull(object10);
                f5 = ((Float)object10).floatValue();
                object = androidx.compose.foundation.layout.c.a((LP1)object, f5);
                object7 = ((CMSNavigation)object3).getName();
                object9 = hv3_0.K(R$string.category);
                object7 = Ft2.a((String)object7, (String)object9);
                object10 = (te1_1)this.c;
                Object object11 = this.b;
                object9 = new nc_1(object11, 1, object3, object10);
                object = d.b((LP1)object, false, (String)object7, (Function0)object9, 5);
                object7 = new k9_0(object3, 2);
                object = CY2.b((LP1)object, false, (Function1)object7);
                int n14 = 24576;
                int n15 = 104;
                n3 = 0;
                f5 = 0.0f;
                object7 = null;
                bl2 = false;
                object9 = null;
                object10 = null;
                object5 = object6;
                object6 = object;
                object11 = object2;
                Pd1.a((im2)object4, (String)object5, (LP1)object, null, (i70_0)object8, 0.0f, null, (b30_0)object2, n14, n15);
                object2.p();
            }
            return Unit.a;
        }
        s20.a();
        throw null;
    }
}

