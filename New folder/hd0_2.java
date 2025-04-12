/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.FrameLayout
 */
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.services.data.CouponPromotion.CouponPromotion;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hd0
 */
public final class hd0_2
extends RecyclerView$B {
    public hd0_2(FrameLayout frameLayout, m82_0 m82_02) {
        Intrinsics.checkNotNullParameter(frameLayout, "itemView");
        Intrinsics.checkNotNullParameter(m82_02, "onClickListener");
        super((View)frameLayout);
        ((jc1_2)frameLayout).setOnClickCouponListener(m82_02);
    }

    public final void w(CouponPromotion couponPromotion) {
        Intrinsics.checkNotNullParameter(couponPromotion, "data");
        Object object = this.itemView;
        boolean bl2 = object instanceof jc1_2;
        if (bl2) {
            String string2 = "null cannot be cast to non-null type com.ril.ajio.home.eosspromotion.IComponentView";
            Intrinsics.checkNotNull(object, string2);
            object = (jc1_2)object;
            object.setData(couponPromotion);
        }
    }
}

