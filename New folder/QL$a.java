/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.Metadata;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class QL$a
implements gx0_2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ BaseValue b;

    public QL$a(Subcomponent subcomponent, BaseValue baseValue) {
        this.a = subcomponent;
        this.b = baseValue;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        float f5;
        float f6;
        QL$a qL$a = this;
        Object object4 = object;
        object4 = (PA)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(object5.J(object4) ? 1 : 0);
            if (n4 != 0) {
                n4 = 4;
                f6 = 5.6E-45f;
            } else {
                n4 = 2;
                f6 = 2.8E-45f;
            }
            n3 |= n4;
        }
        n4 = 18;
        f6 = 2.5E-44f;
        if ((n3 &= 0x5B) == n4 && (n3 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            return Unit.a;
        }
        LP1$a lP1$a = LP1$a.b;
        float f7 = 1.0f;
        object6 = j.c(lP1$a, f7);
        float f8 = uq0_0.e;
        object7 = SP2.a(f8);
        object6 = QV.a((LP1)object6, (i13)object7);
        object7 = Nc$a.n;
        Object object8 = zp.c;
        int n7 = 48;
        object7 = oZ.a((zp$l)object8, (Gx$a)object7, (b30_0)object5, n7);
        int n8 = object5.F();
        Object object9 = object5.m();
        object6 = a30_0.c((b30_0)object5, (LP1)object6);
        N20.W.getClass();
        Object object10 = N20$a.b;
        Object object11 = object5.i();
        boolean bl2 = object11 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object5.A();
        bl2 = object5.e();
        if (bl2) {
            object5.C((Function0)object10);
        } else {
            object5.n();
        }
        N20$a$b n20$a$b = N20$a.e;
        Ow3.a((b30_0)object5, object7, n20$a$b);
        Object object12 = N20$a.d;
        Ow3.a((b30_0)object5, object9, (Function2)object12);
        N20$a$a n20$a$a = N20$a.f;
        n4 = (int)(object5.e() ? 1 : 0);
        if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object7 = object5.v(), object9 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
            re0_0.a(n8, (b30_0)object5, n8, n20$a$a);
        }
        object11 = N20$a.c;
        Ow3.a((b30_0)object5, object6, (Function2)object11);
        float f11 = object4.c();
        f6 = x20_0.b(f11, (b30_0)object5);
        n4 = (int)f6;
        object8 = hv3_0.a;
        object8.getClass();
        n8 = hv3_0.E();
        object6 = new ScreenInfo(n4, n8);
        object7 = az3_0.a;
        object9 = qL$a.a;
        object7 = ((Subcomponent)object9).getMedia();
        if (object7 != null && (object7 = ((Media)object7).getMetadata()) != null) {
            object7 = ((Metadata)object7).getWidth();
        } else {
            n4 = 0;
            f6 = 0.0f;
            object7 = null;
        }
        object8 = ((Subcomponent)object9).getMedia();
        if (object8 != null && (object8 = ((Media)object8).getMetadata()) != null) {
            object8 = ((Metadata)object8).getHeight();
        } else {
            n8 = 0;
            object8 = null;
        }
        String string2 = "PIXEL";
        BaseValue baseValue = qL$a.b;
        object6 = az3_0.c(string2, (Double)object7, (Double)object8, baseValue, (ScreenInfo)object6);
        f6 = ((ScreenInfo)object6).getHeight();
        f7 = 0.0f;
        baseValue = null;
        float f12 = f6 - 0.0f;
        n4 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
        if (n4 > 0) {
            n4 = ((ScreenInfo)object6).getWidth();
            f6 = n4;
            n3 = ((ScreenInfo)object6).getHeight();
            f5 = n3;
            f6 /= f5;
        } else {
            n4 = 1061997773;
            f6 = 0.8f;
        }
        f5 = f11 / f6;
        object6 = j.d(j.k(lP1$a, f11), f5);
        object4 = ((Subcomponent)object9).getMedia();
        string2 = "";
        object7 = object4 != null && (object4 = ((Media)object4).getUrl()) != null ? object4 : string2;
        int n10 = 384;
        f11 = 5.38E-43f;
        int n14 = 8;
        Object object13 = object9;
        Object object14 = object11;
        object11 = object5;
        N20$a$a n20$a$a2 = n20$a$a;
        object4 = object12;
        ov3.i((LP1)object6, (String)object7, "Card Background", 0.0f, (b30_0)object5, n10, n14);
        n3 = 1065353216;
        f5 = 1.0f;
        object6 = j.m(j.c(lP1$a, f5));
        long l2 = OX.f;
        n7 = 3;
        object9 = SP2.b(0.0f, 0.0f, f8, f8, n7);
        object6 = androidx.compose.foundation.a.b((LP1)object6, l2, (i13)object9);
        object7 = Nc$a.a;
        object8 = null;
        object7 = HA.e((Nc)object7, false);
        n8 = object5.F();
        object9 = object5.m();
        object6 = a30_0.c((b30_0)object5, (LP1)object6);
        object11 = object5.i();
        bl2 = object11 instanceof mp;
        if (!bl2) {
            s20.a();
            throw null;
        }
        object5.A();
        bl2 = object5.e();
        if (bl2) {
            object5.C((Function0)object10);
        } else {
            object5.n();
        }
        Ow3.a((b30_0)object5, object7, n20$a$b);
        Ow3.a((b30_0)object5, object9, (Function2)object4);
        n10 = (int)(object5.e() ? 1 : 0);
        if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object4 = object5.v(), object7 = Integer.valueOf(n8)) ? 1 : 0)) == 0) {
            object4 = n20$a$a2;
            re0_0.a(n8, (b30_0)object5, n8, n20$a$a2);
        }
        object4 = object14;
        Ow3.a((b30_0)object5, object6, (Function2)object14);
        object4 = d.a;
        f5 = uq0_0.g;
        object6 = h.f(lP1$a, f5, f5);
        object7 = Nc$a.e;
        object6 = ((d)object4).a((LP1)object6, (Nc)object7);
        object4 = ((Subcomponent)object13).getHeading();
        object7 = object4 == null ? string2 : object4;
        long l3 = oj3_2.d;
        long l4 = nz_1.a;
        object12 = tv0_0.h;
        int n15 = 28032;
        int n16 = 224;
        lP1$a = null;
        f7 = 0.0f;
        baseValue = null;
        f8 = 0.0f;
        object10 = object5;
        ov3.j((LP1)object6, (String)object7, l3, l4, (tv0_0)object12, null, 0, null, (b30_0)object5, n15, n16);
        object5.p();
        object5.p();
        return Unit.a;
    }
}

