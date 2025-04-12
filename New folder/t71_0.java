/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from t71
 */
public final class t71_0
extends RecyclerView$B {
    public final g71_0 a;
    public nh_2 b;
    public List c;

    public t71_0(View object, g71_0 g71_02) {
        Intrinsics.checkNotNullParameter(object, "parentView");
        Intrinsics.checkNotNullParameter(g71_02, "homeComponentClickListener");
        super((View)object);
        this.a = g71_02;
        object = mz0_2.a;
        this.c = object;
    }

    public static void w(ConstraintLayout constraintLayout, BannerData bannerData, boolean bl2) {
        int n3 = bannerData.getWidth();
        int n4 = bannerData.getHeight();
        if (bl2) {
            float f5 = hv3_0.x(45.0f);
            int n7 = (int)f5;
            n4 += n7;
        }
        ConstraintLayout$LayoutParams constraintLayout$LayoutParams = new ConstraintLayout$LayoutParams(n3, n4);
        constraintLayout.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
    }
}

