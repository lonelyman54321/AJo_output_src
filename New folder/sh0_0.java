/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sh0
 */
public final class sh0_0 {
    public static final void a(int n3, ProductReview productReview, Boolean bl2, List list, LP1 lP1, Function0 function0, gx0_2 gx0_22, b30_0 b30_02, int n4, int n7) {
        nh0_1 nh0_12;
        Object object;
        Object object2;
        float f5;
        int n8;
        Object object3 = "imgClicked";
        Intrinsics.checkNotNullParameter(gx0_22, (String)object3);
        float f6 = 1.4757561E-20f;
        Object object4 = b30_02;
        j30_0 j30_02 = b30_02.g(512450968);
        int n10 = n7 & 4;
        Object object5 = n10 != 0 ? (object3 = Boolean.TRUE) : bl2;
        n10 = n7 & 0x10;
        if (n10 != 0) {
            object3 = LP1$a.b;
            n8 = 1065353216;
            f5 = 1.0f;
            object2 = j.c((LP1)object3, f5);
            n10 = 7;
            f6 = 9.8E-45f;
            float f7 = n10;
            int n14 = 14;
            object = object3 = h.i((LP1)object2, f7, 0.0f, 0.0f, 0.0f, n14);
        } else {
            object = lP1;
        }
        n10 = n7 & 0x20;
        n8 = 0;
        f5 = 0.0f;
        object4 = null;
        Function0 function02 = n10 != 0 ? null : function0;
        if (list != null) {
            object3 = list;
            object3 = list;
            n8 = 5;
            f5 = 7.0E-45f;
            object4 = object3 = CollectionsKt.f0((Iterable)object3, n8);
        }
        Object object6 = jt1.a(j30_02);
        f6 = 8;
        zp$i zp$i = zp.g(f6);
        object3 = nh0_12;
        object2 = list;
        nh0_12 = new nh0_1((List)object4, list, n3, (Boolean)object5, function02, gx0_22, productReview);
        n10 = n4 >> 12 & 0xE | 0x6000;
        oh0_1 oh0_12 = null;
        int n15 = 236;
        xq1_0.b((LP1)object, (ft1_2)object6, null, false, zp$i, null, null, false, nh0_12, j30_02, n10, n15);
        object6 = j30_02.X();
        if (object6 != null) {
            object3 = oh0_12;
            n8 = n3;
            object2 = productReview;
            oh0_12 = new oh0_1(n3, productReview, (Boolean)object5, list, (LP1)object, function02, gx0_22, n4, n7);
            ((CF2)object6).d = oh0_12;
        }
    }
}

