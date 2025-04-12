/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.h;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aP2
 */
public final class ap2_2
implements gx0_2 {
    public final /* synthetic */ Boolean a;
    public final /* synthetic */ Context b;

    public ap2_2(Boolean bl2, Context context) {
        this.a = bl2;
        this.b = context;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        long l2;
        ap2_2 ap2_22 = this;
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n4 = ((Number)object6).intValue();
        Object object7 = "$this$OutlinedButton";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n7 = n4 & 0x51;
        n4 = 16;
        if (n7 == n4 && (n7 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            return Unit.a;
        }
        n7 = R$drawable.ic_helpful_item;
        n4 = 0;
        object6 = km2.a(n7, (b30_0)object5, 0);
        object4 = LP1$a.b;
        Object object8 = Boolean.TRUE;
        Boolean bl2 = ap2_22.a;
        int n8 = Intrinsics.areEqual(bl2, object8);
        Object object9 = gy_0.a;
        int n10 = 5;
        int n14 = 29;
        if (n8 != 0) {
            object5.K(-1723308838);
            n8 = R$color.color_green_ratings;
            l2 = oy_0.a((b30_0)object5, n8);
            n3 = Build.VERSION.SDK_INT;
            if (n3 >= n14) {
                object9 = ((gy_0)object9).a(l2, n10);
            } else {
                n14 = zx_0.i(l2);
                PorterDuff.Mode mode = Lf.b(n10);
                object9 = new PorterDuffColorFilter(n14, mode);
            }
            object7 = new ay_1(l2, n10, (ColorFilter)object9);
            object5.E();
        } else {
            object5.K(-1723305677);
            n8 = R$color.color_6d6d6d;
            l2 = oy_0.a((b30_0)object5, n8);
            n3 = Build.VERSION.SDK_INT;
            if (n3 >= n14) {
                object9 = ((gy_0)object9).a(l2, n10);
            } else {
                n14 = zx_0.i(l2);
                PorterDuff.Mode mode = Lf.b(n10);
                object9 = new PorterDuffColorFilter(n14, mode);
            }
            object7 = new ay_1(l2, n10, (ColorFilter)object9);
            object5.E();
        }
        Object object10 = object7;
        int n15 = 440;
        int n16 = 56;
        object7 = "";
        n10 = 0;
        n14 = 0;
        Object var24_30 = null;
        object9 = object4;
        Object object11 = object5;
        Pd1.a((im2)object6, (String)object7, (LP1)object4, null, null, 0.0f, (TX)object10, (b30_0)object5, n15, n16);
        n4 = (int)(Intrinsics.areEqual(bl2, object8) ? 1 : 0);
        n8 = 4;
        object9 = "getString(...)";
        Context context = ap2_22.b;
        if (n4 != 0) {
            object5.K(-1882758910);
            object6 = context.getResources();
            n10 = R$string.marked_as_helpful;
            String string2 = object6.getString(n10);
            Intrinsics.checkNotNullExpressionValue(string2, (String)object9);
            n4 = R$color.color_green_ratings;
            long l3 = oy_0.a((b30_0)object5, n4);
            object8 = tv0_0.m;
            float f5 = n8;
            n10 = 0;
            context = null;
            int n17 = 14;
            n14 = 0;
            object7 = object4;
            object6 = h.i((LP1)object4, f5, 0.0f, 0.0f, 0.0f, n17);
            int n18 = 3078;
            int n19 = 112;
            l2 = 0L;
            n7 = 0;
            object4 = null;
            long l4 = 0L;
            object7 = string2;
            long l7 = l3;
            Comparable<Boolean> comparable = object8;
            n3 = 0;
            Object var20_24 = null;
            l3 = l4;
            object8 = object5;
            mm3_0.a((LP1)object6, (String)object7, l7, (tv0_0)comparable, l2, null, l4, (b30_0)object5, n18, n19);
            object5.E();
            return Unit.a;
        }
        object6 = Boolean.FALSE;
        n4 = (int)(Intrinsics.areEqual(bl2, object6) ? 1 : 0);
        if (n4 != 0) {
            object5.K(-1882423893);
            object6 = context.getResources();
            n10 = R$string.mark_as_helpful;
            String string3 = object6.getString(n10);
            Intrinsics.checkNotNullExpressionValue(string3, (String)object9);
            n4 = R$color.color_6d6d6d;
            long l8 = oy_0.a((b30_0)object5, n4);
            object8 = tv0_0.m;
            float f6 = n8;
            n10 = 0;
            context = null;
            int n20 = 14;
            n14 = 0;
            object7 = object4;
            object6 = h.i((LP1)object4, f6, 0.0f, 0.0f, 0.0f, n20);
            int n21 = 3078;
            int n22 = 112;
            l2 = 0L;
            n7 = 0;
            object4 = null;
            long l12 = 0L;
            object7 = string3;
            long l14 = l8;
            Comparable<Boolean> comparable = object8;
            n3 = 0;
            Object var20_26 = null;
            l8 = l12;
            object8 = object5;
            mm3_0.a((LP1)object6, (String)object7, l14, (tv0_0)comparable, l2, null, l12, (b30_0)object5, n21, n22);
            object5.E();
            return Unit.a;
        }
        n7 = -1882107941;
        object5.K(n7);
        object5.E();
        return Unit.a;
    }
}

