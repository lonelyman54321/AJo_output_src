/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.ratings.ImageReviewResponse;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mh0
 */
public final class mh0_1 {
    public static final void a(yi2_1 yi2_12, ArrayList arrayList, Function0 function0, gx0_2 gx0_22, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        gx0_2 gx0_23 = gx0_22;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(arrayList, "thumbnailArray");
        Intrinsics.checkNotNullParameter(gx0_22, "imgClicked");
        int n7 = 645308208;
        Object object3 = b30_02;
        Object object4 = b30_02.g(n7);
        int n8 = arrayList.isEmpty();
        int n10 = 1;
        if ((n8 ^= n10) != 0) {
            object3 = LP1$a.b;
            object2 = j.c;
            long l2 = OX.f;
            Object object5 = fg2_1.a;
            object2 = a.b((LP1)object2, l2, (i13)object5);
            int n14 = 16;
            float f5 = n14;
            object2 = h.e((LP1)object2, f5);
            object = zp.c;
            Gx$a gx$a = Nc$a.m;
            int n15 = 0;
            object = oZ.a((zp$l)object, gx$a, (b30_0)object4, 0);
            int n16 = ((j30_0)object4).P;
            object5 = ((j30_0)object4).P();
            object2 = a30_0.c((b30_0)object4, (LP1)object2);
            N20.W.getClass();
            Serializable serializable = N20$a.b;
            Object object6 = ((j30_0)object4).a;
            int n17 = object6 instanceof mp;
            if (n17 != 0) {
                ((j30_0)object4).A();
                n17 = ((j30_0)object4).O;
                if (n17 != 0) {
                    ((j30_0)object4).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object4).n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object4, object, (Function2)((Object)serializable));
                object = N20$a.d;
                Ow3.a((b30_0)object4, object5, (Function2)object);
                object = N20$a.f;
                boolean bl2 = ((j30_0)object4).O;
                if (bl2 || !(bl2 = Intrinsics.areEqual(object5 = ((j30_0)object4).v(), serializable = Integer.valueOf(n16)))) {
                    rk_0.a(n16, (j30_0)object4, n16, (N20$a$a)object);
                }
                object = N20$a.c;
                Ow3.a((b30_0)object4, object2, (Function2)object);
                object2 = AndroidCompositionLocals_androidKt.b;
                object2 = ((Context)((j30_0)object4).j((H30)object2)).getResources();
                n14 = R$string.customer_photos;
                Object object7 = object2.getString(n14);
                Intrinsics.checkNotNullExpressionValue(object7, "getString(...)");
                long l3 = xx_1.e;
                long l4 = Em3.f(14);
                f5 = 7;
                bl2 = false;
                object5 = null;
                n16 = 0;
                gx$a = null;
                n17 = 14;
                object2 = object3;
                object2 = h.i((LP1)object3, f5, 0.0f, 0.0f, 0.0f, n17);
                long l7 = 0L;
                serializable = null;
                int n18 = 24966;
                int n19 = 104;
                object = object7;
                n10 = 0;
                mm3_0.a((LP1)object2, (String)object7, l3, null, l4, null, l7, (b30_0)object4, n18, n19);
                int n20 = 8;
                float f6 = n20;
                object3 = h.e((LP1)object3, f6);
                Q93.b((b30_0)object4, (LP1)object3);
                if (yi2_12 != null && (object3 = yi2_12.R6()) != null && (object3 = ((RatingsResponse)object3).getImageReview()) != null && (object3 = ((ImageReviewResponse)object3).getTotalReviews()) != null) {
                    n20 = n8 = ((Integer)object3).intValue();
                } else {
                    n20 = 0;
                    f6 = 0.0f;
                    object2 = null;
                }
                ((j30_0)object4).K(872286768);
                n8 = n4 & 0x1C00 ^ 0xC00;
                n14 = 2048;
                f5 = 2.87E-42f;
                n15 = n8 > n14 && (n8 = (int)(((j30_0)object4).J(gx0_23) ? 1 : 0)) != 0 || (n8 = n4 & 0xC00) == n14 ? 1 : 0;
                object3 = ((j30_0)object4).v();
                if (n15 != 0 || object3 == (object = b30$a.a)) {
                    object3 = new kh0_2(gx0_23);
                    ((j30_0)object4).o(object3);
                }
                object7 = object3;
                object7 = (gx0_2)object3;
                ((j30_0)object4).T(false);
                n8 = n4 << 9;
                n10 = 458752;
                n15 = n8 & n10 | 0x1030;
                n16 = 0;
                gx$a = null;
                serializable = null;
                n14 = 0;
                f5 = 0.0f;
                object = null;
                int n21 = 20;
                object5 = arrayList;
                object6 = function0;
                sh0_0.a(n20, null, null, arrayList, null, function0, (gx0_2)object7, (b30_0)object4, n15, n21);
                n8 = 1;
                ((j30_0)object4).T(n8 != 0);
            } else {
                s20.a();
                throw null;
            }
        }
        if ((object2 = ((j30_0)object4).X()) != null) {
            object4 = object;
            object3 = yi2_12;
            gx0_23 = gx0_22;
            n4 = n3;
            ((CF2)object2).d = object = new lh0_1(yi2_12, arrayList, function0, gx0_22, n3);
        }
    }
}

