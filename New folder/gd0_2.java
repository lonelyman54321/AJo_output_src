/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 */
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.home.eosspromotion.view.AvailableCouponsComponentView;
import com.ril.ajio.home.eosspromotion.view.CouponsPointsComponentView;
import com.ril.ajio.home.eosspromotion.view.CouponsSpaceView;
import com.ril.ajio.home.eosspromotion.view.MyCouponsComponentView;
import com.ril.ajio.services.data.CouponPromotion.CouponPromotion;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gd0
 */
public final class gd0_2
extends RecyclerView$f {
    public m82_0 a;
    public CouponPromotion b;

    public final int getItemCount() {
        return 4;
    }

    public final int getItemViewType(int n3) {
        int n4;
        if (n3 != 0) {
            n4 = 1;
            if (n3 != n4 && n3 != (n4 = 2) && n3 != (n4 = 3)) {
                n4 = -1;
            }
        } else {
            n4 = 0;
        }
        return n4;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        recyclerView$B = (hd0_2)recyclerView$B;
        CouponPromotion couponPromotion = this.b;
        ((hd0_2)recyclerView$B).w(couponPromotion);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Intrinsics.checkNotNullParameter(object, "parent");
        object = this.a;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    CouponsSpaceView couponsSpaceView = new CouponsSpaceView(null);
                    hd0_2 hd0_22 = new hd0_2(couponsSpaceView, (m82_0)object);
                    return hd0_22;
                }
                AvailableCouponsComponentView availableCouponsComponentView = new AvailableCouponsComponentView(null);
                hd0_2 hd0_23 = new hd0_2(availableCouponsComponentView, (m82_0)object);
                object = this.b;
                hd0_23.w((CouponPromotion)object);
                return hd0_23;
            }
            MyCouponsComponentView myCouponsComponentView = new MyCouponsComponentView(null);
            hd0_2 hd0_24 = new hd0_2(myCouponsComponentView, (m82_0)object);
            object = this.b;
            hd0_24.w((CouponPromotion)object);
            return hd0_24;
        }
        CouponsPointsComponentView couponsPointsComponentView = new CouponsPointsComponentView(null);
        hd0_2 hd0_25 = new hd0_2(couponsPointsComponentView, (m82_0)object);
        object = this.b;
        hd0_25.w((CouponPromotion)object);
        return hd0_25;
    }
}

