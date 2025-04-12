/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.services.data.fleek.explore_brands.Cta;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class ZA2 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(boolean bl2, LP1 object, Subcomponent subcomponent, SubcomponentsOwner subcomponentsOwner, boolean n3, boolean bl3, Function0 function0, Function0 function02, Function0 function03, Function2 function2, Function2 function22, dr0_0 dr0_02, Function0 function04, Function1 function1, b30_0 b30_02, int n4, int n7, int n8) {
        boolean bl4;
        N20$a$b n20$a$b;
        int n10;
        Object object2;
        int n14;
        Object object3;
        int n15;
        float f5;
        int n16;
        int n17;
        boolean bl5;
        Object object4;
        int n18;
        int n19;
        float f6;
        int n20;
        Object object5;
        Object object6;
        boolean bl6;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        Object object11;
        Object object12;
        int n21;
        Function0 function05;
        Object object13;
        Function2 function23;
        SubcomponentsOwner subcomponentsOwner2;
        block22: {
            block23: {
                block21: {
                    subcomponentsOwner2 = subcomponentsOwner;
                    function23 = function2;
                    object13 = dr0_02;
                    function05 = function04;
                    n21 = n7;
                    object12 = function0;
                    Intrinsics.checkNotNullParameter(function0, "onFollowButtonClicked");
                    Function0 function06 = function02;
                    Intrinsics.checkNotNullParameter(function02, "onShareClicked");
                    object11 = function03;
                    Intrinsics.checkNotNullParameter(function03, "onLikeClicked");
                    Intrinsics.checkNotNullParameter(function2, "onBrandClicked");
                    object10 = function22;
                    Intrinsics.checkNotNullParameter(function22, "onItemWishlist");
                    Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
                    Intrinsics.checkNotNullParameter(function04, "onViewAllClicked");
                    object9 = function1;
                    Intrinsics.checkNotNullParameter(function1, "sendProductImpressionDataMiniPLP");
                    int n22 = -2100373427;
                    object8 = b30_02;
                    object7 = b30_02.g(n22);
                    bl6 = n8 & 2;
                    object6 = LP1$a.b;
                    object5 = bl6 ? object6 : object;
                    bl6 = n8 & 0x10;
                    n20 = 1;
                    f6 = Float.MIN_VALUE;
                    n19 = bl6 ? 1 : n3;
                    bl6 = n8 & 0x20;
                    n18 = 0;
                    object4 = null;
                    bl5 = bl6 ? false : bl3;
                    object8 = AndroidCompositionLocals_androidKt.b;
                    object8 = zv0_2.b((Context)((j30_0)object7).j((H30)object8));
                    n17 = object8 instanceof Activity;
                    n16 = 0;
                    if (n17 != 0) {
                        object8 = (Activity)object8;
                    } else {
                        bl6 = false;
                        object8 = null;
                        f5 = 0.0f;
                    }
                    float f7 = uq0_0.k;
                    n15 = 0;
                    int n24 = 13;
                    object3 = object5;
                    n14 = 0;
                    n18 = 0;
                    f6 = f7;
                    f7 = 0.0f;
                    object3 = h.i((LP1)object5, 0.0f, f6, 0.0f, 0.0f, n24);
                    object4 = HA.e(Nc$a.a, false);
                    n20 = ((j30_0)object7).P;
                    object9 = ((j30_0)object7).P();
                    object3 = a30_0.c((b30_0)object7, (LP1)object3);
                    object2 = N20.W;
                    object2.getClass();
                    object10 = N20$a.b;
                    object11 = ((j30_0)object7).a;
                    n10 = object11 instanceof mp;
                    if (n10 == 0) {
                        s20.a();
                        throw null;
                    }
                    ((j30_0)object7).A();
                    n10 = ((j30_0)object7).O;
                    if (n10 != 0) {
                        ((j30_0)object7).C((Function0)object10);
                    } else {
                        ((j30_0)object7).n();
                    }
                    n20$a$b = N20$a.e;
                    Ow3.a((b30_0)object7, object4, n20$a$b);
                    object4 = N20$a.d;
                    Ow3.a((b30_0)object7, object9, (Function2)object4);
                    object9 = N20$a.f;
                    bl4 = ((j30_0)object7).O;
                    if (bl4) break block21;
                    object12 = ((j30_0)object7).v();
                    object = object8;
                    object8 = n20;
                    bl4 = Intrinsics.areEqual(object12, object8);
                    if (bl4) break block22;
                    break block23;
                }
                object = object8;
            }
            rk_0.a(n20, (j30_0)object7, n20, (N20$a$a)object9);
        }
        object12 = N20$a.c;
        Ow3.a((b30_0)object7, object3, (Function2)object12);
        bl6 = 1065353216 != 0;
        f5 = 1.0f;
        object8 = j.c((LP1)object6, f5);
        long l2 = nz_1.a;
        Object object14 = fg2_1.a;
        object8 = a.b((LP1)object8, l2, (i13)object14);
        float f8 = uq0_0.o;
        object8 = h.f((LP1)object8, f8, f8);
        object6 = zp.c;
        object3 = Nc$a.m;
        n20 = 0;
        f6 = 0.0f;
        object6 = oZ.a((zp$l)object6, (Gx$a)object3, (b30_0)object7, 0);
        n17 = ((j30_0)object7).P;
        object14 = ((j30_0)object7).P();
        object8 = a30_0.c((b30_0)object7, (LP1)object8);
        int n25 = object11 instanceof mp;
        if (n25 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object7).A();
        n25 = ((j30_0)object7).O;
        if (n25 != 0) {
            ((j30_0)object7).C((Function0)object10);
        } else {
            ((j30_0)object7).n();
        }
        Ow3.a((b30_0)object7, object6, n20$a$b);
        Ow3.a((b30_0)object7, object14, (Function2)object4);
        int n26 = ((j30_0)object7).O;
        if (n26 != 0 || (n26 = Intrinsics.areEqual(object10 = ((j30_0)object7).v(), object11 = Integer.valueOf(n17))) == 0) {
            rk_0.a(n17, (j30_0)object7, n17, (N20$a$a)object9);
        }
        Ow3.a((b30_0)object7, object8, (Function2)object12);
        n14 = -936425929;
        ((j30_0)object7).K(n14);
        if (subcomponent != null) {
            ((j30_0)object7).K(-936425790);
            n14 = 458752;
            if (subcomponentsOwner2 == null) {
                object11 = object;
            } else {
                object6 = subcomponentsOwner.getName();
                object3 = subcomponentsOwner.getLogo();
                object4 = subcomponent.getDescription();
                object10 = new va2_1(function23, subcomponentsOwner2);
                n25 = n4 & 0xE00E;
                n10 = n4 >> 3 & n14;
                n15 = n25 | n10;
                object11 = object;
                bl6 = bl2;
                n20 = n19;
                object2 = function0;
                ov3.k(bl2, (String)object6, (String)object3, (String)object4, n19 != 0, function0, (Function0)object10, (b30_0)object7, n15);
            }
            n26 = 0;
            object10 = null;
            ((j30_0)object7).T(false);
            n26 = -936412658;
            ((j30_0)object7).K(n26);
            object10 = subcomponent.getResources();
            if (object10 != null && (n26 = (int)(object10.isEmpty() ? 1 : 0)) == 0) {
                object10 = subcomponent.getCta();
                if (object10 != null) {
                    object8 = object10 = ((Cta)object10).getText();
                } else {
                    bl6 = false;
                    object8 = null;
                    f5 = 0.0f;
                }
                object6 = subcomponent.getResources();
                object4 = new wa2_0((dr0_0)object13, (Activity)object11);
                ((j30_0)object7).K(-88632204);
                n26 = n21 & 0x380 ^ 0x180;
                n25 = 256;
                if (n26 > n25 && (n26 = (int)(((j30_0)object7).J(function05) ? 1 : 0)) != 0 || (n26 = n21 & 0x180) == n25) {
                    n20 = 1;
                    f6 = Float.MIN_VALUE;
                } else {
                    n20 = 0;
                    f6 = 0.0f;
                    object14 = null;
                }
                object10 = ((j30_0)object7).v();
                if (n20 != 0 || object10 == (object11 = b30$a.a)) {
                    object10 = new xa2_2(function05);
                    ((j30_0)object7).o(object10);
                }
                object14 = object10;
                object14 = (Function2)object10;
                object10 = null;
                ((j30_0)object7).T(false);
                n26 = n4 >> 9 & 0x380 | 0x1000040;
                n25 = n21 << 15;
                n14 = n14 & n25 | n26;
                n25 = n21 << 9;
                n26 = 0x380000 & n25;
                n16 = n14 | n26;
                n17 = (int)(bl5 ? 1 : 0);
                object2 = function22;
                xA2.b((String)object8, (List)object6, bl5, (Function1)object4, (Function2)object14, function22, function1, dr0_02, (b30_0)object7, n16);
            }
            n14 = 0;
            ((j30_0)object7).T(false);
            bl6 = subcomponent.isLiked();
            object9 = subcomponent.getLikesCount();
            if (object9 != null) {
                n18 = (Integer)object9;
            } else {
                n18 = 0;
                object4 = null;
            }
            object6 = String.valueOf(n18);
            n14 = n4 >> 15 & 0x1F80;
            object3 = function02;
            object4 = function03;
            object14 = object7;
            ov3.n(bl6, (String)object6, function02, function03, (b30_0)object7, n14);
            object9 = Unit.a;
        }
        n14 = 0;
        object9 = null;
        ((j30_0)object7).T(false);
        n14 = 1;
        ((j30_0)object7).T(n14 != 0);
        ((j30_0)object7).T(n14 != 0);
        object14 = ((j30_0)object7).X();
        if (object14 != null) {
            object7 = object4;
            n14 = bl2;
            object10 = object5;
            object11 = subcomponent;
            subcomponentsOwner2 = subcomponentsOwner;
            n10 = n19;
            bl4 = bl5;
            function05 = function02;
            object13 = function03;
            function23 = function2;
            object8 = function22;
            object6 = dr0_02;
            object3 = function04;
            Object object15 = object4;
            object4 = function1;
            n20 = n4;
            ((ya2_1)object7)(bl2, (LP1)object5, subcomponent, subcomponentsOwner, n19 != 0, bl5, function0, function02, function03, function2, function22, dr0_02, function04, function1, n4, n7, n8);
            object9 = object7;
            object7 = object14;
            ((CF2)object14).d = object15;
        }
    }
}

