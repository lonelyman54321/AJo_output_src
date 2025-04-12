/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;

public final class vd3$d
extends qk2_2 {
    public final /* synthetic */ vd3_2 d;

    public vd3$d(vd3_2 vd3_22) {
        this.d = vd3_22;
        this.c = 501L;
    }

    public final void onPageScrolled(int n3, float f5, int n4) {
        this.d.c = n3;
    }

    public final void onPageSelected(int n3) {
        this.b = n3;
        vd3_2 vd3_22 = this.d;
        vd3_22.b = n3;
        Object object = vd3_22.d;
        Object object2 = "BRAND_THUMBNAIL";
        n3 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
        if (n3 != 0 || (n3 = (int)(Intrinsics.areEqual(object = vd3_22.d, object2 = "TOP_STORIES") ? 1 : 0)) != 0) {
            int n4;
            n3 = vd3_22.b;
            object2 = vd3_22.f;
            if (object2 != null && (object2 = ((ViewPager2)((Object)object2)).getAdapter()) != null) {
                n4 = ((RecyclerView$f)object2).getItemCount();
            } else {
                n4 = 0;
                object2 = null;
            }
            if (n3 >= (n4 += -4)) {
                object = vd3_22.i;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
                    n3 = 0;
                    object = null;
                }
                ((dr0_0)object).B();
            }
        }
    }
}

