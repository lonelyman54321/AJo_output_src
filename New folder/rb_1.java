/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.draw.b;
import com.ril.ajio.R$drawable;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.Metadata;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from rB
 */
public final class rb_1
implements gx0_2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ ft1_2 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;

    public rb_1(Component component, ft1_2 ft1_22, ac_1 ac_12, rc_2 rc_22, sc_1 sc_12) {
        this.a = component;
        this.b = ft1_22;
        this.c = ac_12;
        this.d = rc_22;
        this.e = sc_12;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4;
        float f5;
        Object object5 = this;
        Object object6 = object;
        object6 = (PA)object;
        Object object7 = object2;
        object7 = (b30_0)object2;
        Object object8 = object3;
        object8 = (Number)object3;
        int n3 = ((Number)object8).intValue();
        Object object9 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object6, (String)object9);
        int n4 = n3 & 0x51;
        n3 = 16;
        float f6 = 2.2E-44f;
        if (n4 == n3 && (n4 = (int)(object7.h() ? 1 : 0)) != 0) {
            object7.D();
            return Unit.a;
        }
        object6 = h40_0.a;
        object6 = h40_0.w();
        object8 = ((rb_1)object5).a;
        object9 = ((Component)object8).getSubcomponents();
        String string2 = null;
        Object object10 = object9 != null && (object9 = (Subcomponent)CollectionsKt.firstOrNull((List)object9)) != null ? (object9 = ((Subcomponent)object9).getResourceOwner()) : null;
        int n7 = hv3_0.F();
        Object object11 = hv3_0.a;
        object11.getClass();
        int n8 = hv3_0.E();
        object9 = new ScreenInfo(n7, n8);
        object8 = ((Component)object8).getSubcomponents();
        if (object8 != null && (object8 = (Subcomponent)CollectionsKt.firstOrNull((List)object8)) != null) {
            object11 = object8 = ((Subcomponent)object8).getMedia();
        } else {
            n8 = 0;
            object11 = null;
        }
        if (object11 != null) {
            object8 = ((Media)object11).getMetadata();
        } else {
            n3 = 0;
            object8 = null;
            f6 = 0.0f;
        }
        Object object12 = az3_0.a;
        if (object8 != null) {
            object12 = ((Metadata)object8).getWidth();
        } else {
            n7 = 0;
            object12 = null;
        }
        if (object8 != null) {
            object8 = ((Metadata)object8).getHeight();
        } else {
            n3 = 0;
            object8 = null;
            f6 = 0.0f;
        }
        Object object13 = "PIXEL";
        object6 = az3_0.c((String)object13, (Double)object12, (Double)object8, (BaseValue)object6, (ScreenInfo)object9);
        f6 = ((ScreenInfo)object6).getHeight();
        int n10 = 0;
        float f7 = 0.0f;
        Object object14 = null;
        float f8 = f6 - 0.0f;
        n3 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
        if (n3 > 0) {
            n3 = ((ScreenInfo)object6).getWidth();
            f6 = n3;
            n4 = ((ScreenInfo)object6).getHeight();
            f5 = n4;
            f6 /= f5;
        } else {
            n3 = 1071877689;
            f6 = 1.7777778f;
        }
        n4 = hv3_0.F();
        f5 = (float)n4 / f6;
        int n14 = (int)f5;
        object6 = LP1$a.b;
        int n15 = 1065353216;
        float f11 = 1.0f;
        Object object15 = j.b(j.c((LP1)object6, f11), f11);
        n3 = R$drawable.brand_header_bg;
        boolean bl2 = false;
        object9 = null;
        Object object16 = km2.a(n3, (b30_0)object7, 0);
        Object var29_29 = null;
        int n16 = 62;
        int n17 = 0;
        float f12 = 0.0f;
        Object var33_34 = null;
        Object object17 = null;
        LP1 lP1 = null;
        object8 = androidx.compose.ui.draw.b.a((LP1)object15, (im2)object16, null, null, 0.0f, null, n16);
        Object object18 = zp.c;
        Object object19 = Nc$a.m;
        object12 = oZ.a((zp$l)object18, (Gx$a)object19, (b30_0)object7, 0);
        int n18 = object7.F();
        Object object20 = object7.m();
        object8 = a30_0.c((b30_0)object7, (LP1)object8);
        N20.W.getClass();
        Object object21 = N20$a.b;
        Object object22 = object7.i();
        boolean bl3 = object22 instanceof mp;
        if (!bl3) {
            s20.a();
            throw null;
        }
        object7.A();
        bl3 = object7.e();
        if (bl3) {
            object7.C((Function0)object21);
        } else {
            object7.n();
        }
        object22 = N20$a.e;
        Ow3.a((b30_0)object7, object12, (Function2)object22);
        object12 = N20$a.d;
        Ow3.a((b30_0)object7, object20, (Function2)object12);
        object20 = N20$a.f;
        boolean bl4 = object7.e();
        if (bl4 || !(bl2 = Intrinsics.areEqual(object9 = object7.v(), object14 = Integer.valueOf(n18)))) {
            re0_0.a(n18, (b30_0)object7, n18, (N20$a$a)object20);
        }
        object14 = N20$a.c;
        Ow3.a((b30_0)object7, object8, (Function2)object14);
        object8 = j.m(j.c((LP1)object6, f11));
        object15 = object4 = ((rb_1)object5).c;
        object15 = (ac_1)object4;
        object16 = object4 = ((rb_1)object5).d;
        object16 = (rc_2)object4;
        object4 = ((rb_1)object5).e;
        fx0_2 fx0_22 = object4;
        sc_1 sc_12 = (sc_1)object4;
        object4 = ((rb_1)object5).b;
        Object object23 = ((rb_1)object5).a;
        object5 = object12;
        object12 = object9;
        Serializable serializable = object14;
        object14 = object20;
        object20 = object10;
        object17 = object14;
        object14 = object22;
        object22 = object15;
        object15 = object5;
        object5 = object21;
        object21 = object23;
        object23 = object19;
        object19 = object16;
        object16 = object14;
        object14 = object18;
        object18 = sc_12;
        object9 = new qb_1((Media)object11, n14, (ft1_2)object4, (ResourceOwner)object10, (ac_1)object22, (Component)object21, (rc_2)object19, sc_12);
        object11 = v10.c(-1728073424, (fx0_2)object9, (b30_0)object7);
        n18 = 3078;
        int n19 = 6;
        bl2 = false;
        object12 = null;
        bl3 = false;
        object22 = null;
        object13 = object7;
        OA.a((LP1)object8, null, false, (u10)object11, (b30_0)object7, n18, n19);
        f6 = 1.0f;
        lP1 = j.c((LP1)object6, f6);
        n3 = R$drawable.brand_header_bg_height;
        im2 im22 = km2.a(n3, (b30_0)object7, 0);
        i70$a$d i70$a$d = i70$a.d;
        int n20 = 54;
        object8 = j.m(androidx.compose.ui.draw.b.a(lP1, im22, null, i70$a$d, 0.0f, null, n20));
        object9 = oZ.a((zp$l)object14, (Gx$a)object23, (b30_0)object7, 0);
        n7 = object7.F();
        object11 = object7.m();
        object8 = a30_0.c((b30_0)object7, (LP1)object8);
        object13 = object7.i();
        n14 = object13 instanceof mp;
        if (n14 == 0) {
            s20.a();
            throw null;
        }
        object7.A();
        n14 = (int)(object7.e() ? 1 : 0);
        if (n14 != 0) {
            object7.C((Function0)object5);
        } else {
            object7.n();
        }
        object5 = object16;
        Ow3.a((b30_0)object7, object9, (Function2)object16);
        object5 = object15;
        Ow3.a((b30_0)object7, object11, (Function2)object15);
        int n21 = object7.e();
        if (n21 != 0 || (n21 = Intrinsics.areEqual(object5 = object7.v(), object9 = Integer.valueOf(n7))) == 0) {
            object5 = object17;
            re0_0.a(n7, (b30_0)object7, n7, (N20$a$a)object17);
        }
        object5 = serializable;
        Ow3.a((b30_0)object7, object8, (Function2)((Object)serializable));
        float f14 = uq0_0.k;
        f7 = uq0_0.o;
        object19 = null;
        int n22 = 12;
        object21 = null;
        object4 = object6;
        object8 = h.i((LP1)object6, f7, f14, 0.0f, 0.0f, n22);
        object15 = "";
        if (object10 == null || (object9 = ((ResourceOwner)object10).getName()) == null || (object9 = ((Object)StringsKt.m0((CharSequence)object9)).toString()) == null) {
            object9 = object15;
        }
        long l2 = OX.f;
        long l3 = oj3_2.h;
        n14 = 700;
        object20 = new tv0_0(n14);
        int n24 = 28032;
        float f15 = 3.9281E-41f;
        n17 = 224;
        f12 = 3.14E-43f;
        bl3 = false;
        object22 = null;
        object21 = null;
        object19 = null;
        long l4 = l2;
        long l7 = l2;
        object18 = object7;
        n15 = n24;
        f11 = f15;
        object = object7;
        float f16 = f7;
        n10 = n17;
        f7 = f12;
        ov3.j((LP1)object8, (String)object9, l3, l2, (tv0_0)object20, null, 0, null, (b30_0)object7, n24, n17);
        object8 = h.h((LP1)object6, f16, f16, f16, f14);
        object9 = object10 != null && (object5 = ((ResourceOwner)object10).getDescription()) != null && (object5 = ((Object)StringsKt.m0((CharSequence)object5)).toString()) != null ? object5 : object15;
        l3 = oj3_2.d;
        object20 = new tv0_0(400);
        n15 = 28032;
        f11 = 3.9281E-41f;
        n10 = 224;
        f7 = 3.14E-43f;
        bl3 = false;
        object22 = null;
        object21 = null;
        object19 = null;
        l4 = l7;
        object18 = object;
        ov3.j((LP1)object8, (String)object9, l3, l7, (tv0_0)object20, null, 0, null, (b30_0)object, n15, n10);
        n21 = -1330772470;
        f14 = -1.2661883E-9f;
        object14 = object;
        object.K(n21);
        if (object10 != null) {
            string2 = ((ResourceOwner)object10).getTagsFromList();
        }
        if (string2 == null || (n21 = string2.length()) == 0) {
            object6 = object14;
        } else {
            n21 = 2;
            f14 = 2.8E-45f;
            n3 = 0;
            f6 = 0.0f;
            object8 = h.g((LP1)object6, f16, 0.0f, n21);
            object9 = object10 != null && (object5 = ((ResourceOwner)object10).getTagsFromList()) != null ? object5 : object15;
            l3 = l7;
            l4 = OX.b(l7, 0.8f);
            l3 = oj3_2.c;
            object20 = new tv0_0(300);
            n15 = 28038;
            f11 = 3.929E-41f;
            n21 = 224;
            f14 = 3.14E-43f;
            bl3 = false;
            object22 = null;
            object21 = null;
            object19 = null;
            object18 = object14;
            object6 = object14;
            n10 = n21;
            f7 = f14;
            ov3.j((LP1)object8, (String)object9, l3, l4, (tv0_0)object20, null, 0, null, (b30_0)object14, n15, n21);
        }
        object6.E();
        object6.p();
        object6.p();
        return Unit.a;
    }
}

