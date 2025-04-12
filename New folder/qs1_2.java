/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.HeaderRecyclerViewAdapter;
import com.ril.ajio.services.data.CouponPromotion.CouponEntity;
import com.ril.ajio.services.data.CouponPromotion.CouponPromotion;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qS1
 */
public final class qs1_2
extends HeaderRecyclerViewAdapter {
    public m82_0 a;
    public CouponPromotion b;
    public LayoutInflater c;
    public ArrayList d;

    public final int getBasicItemCount() {
        int n3;
        ArrayList arrayList = this.d;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            Intrinsics.checkNotNull(arrayList);
            n3 = arrayList.size();
        }
        return n3;
    }

    public final int getBasicItemType(int n3) {
        return n3;
    }

    public final void onBindBasicItemView(RecyclerView$B object, int n3) {
        Intrinsics.checkNotNullParameter(object, "holder");
        object = (ts1_2)object;
        Object object2 = this.d;
        Intrinsics.checkNotNull(object2);
        Object object3 = ((ArrayList)object2).get(n3);
        Intrinsics.checkNotNullExpressionValue(object3, "get(...)");
        object3 = (CouponEntity)object3;
        object.getClass();
        object2 = "entity";
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        boolean n4 = ((CouponEntity)object3).isCouponUsed();
        int n7 = 130;
        int n8 = 154;
        LinearLayout linearLayout = ((ts1_2)object).f;
        String string2 = null;
        FrameLayout frameLayout = ((ts1_2)object).e;
        ImageView imageView = ((ts1_2)object).b;
        boolean bl2 = true;
        if (n4) {
            frameLayout.setVisibility(0);
            linearLayout.setVisibility(4);
            frameLayout.setEnabled(false);
            object = new da$a();
            ((da$a)object).k = bl2;
            ((da$a)object).o = bl2;
            int n10 = mz3_0.d(n8);
            n7 = mz3_0.d(n7);
            ((da$a)object).d = n10;
            ((da$a)object).e = n7;
            object2 = UrlHelper.Companion.getInstance();
            object3 = ((CouponEntity)object3).getImageUrl();
            ((da$a)object).n = object3 = ((UrlHelper)object2).getImageUrl((String)object3);
            ((da$a)object).u = imageView;
            ((da$a)object).a();
            object = null;
            imageView.setOnClickListener(null);
        } else {
            int n14 = 8;
            frameLayout.setVisibility(n14);
            linearLayout.setVisibility(0);
            object2 = ((ts1_2)object).c;
            string2 = ((CouponEntity)object3).getCouponCode();
            object2.setText((CharSequence)string2);
            object2 = ((ts1_2)object).d;
            string2 = ((CouponEntity)object3).getDescription();
            object2.setText((CharSequence)string2);
            string2 = null;
            object2 = new ss1_2(0, object3, object);
            linearLayout.setOnClickListener((View.OnClickListener)object2);
            object2 = new da$a();
            ((da$a)object2).k = bl2;
            ((da$a)object2).o = bl2;
            n8 = mz3_0.d(n8);
            n7 = mz3_0.d(n7);
            ((da$a)object2).d = n8;
            ((da$a)object2).e = n7;
            Object object4 = UrlHelper.Companion.getInstance();
            String string3 = ((CouponEntity)object3).getImageUrl();
            ((da$a)object2).n = object4 = ((UrlHelper)object4).getImageUrl(string3);
            ((da$a)object2).u = imageView;
            ((da$a)object2).a();
            n7 = 1;
            object2 = new RT((RecyclerView$B)object, (Serializable)object3, n7);
            imageView.setOnClickListener((View.OnClickListener)object2);
        }
    }

    public final void onBindFooterView(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
    }

    public final void onBindHeaderView(RecyclerView$B object, int n3) {
        n3 = 1;
        Intrinsics.checkNotNullParameter(object, "holder");
        object = (rs1_2)object;
        object.getClass();
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "data");
        Object object3 = ((RecyclerView$B)object).itemView.getLayoutParams();
        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        object3 = (StaggeredGridLayoutManager$LayoutParams)((Object)object3);
        Object object4 = ((rs1_2)object).b.getValue();
        Object[] objectArray = "getValue(...)";
        Intrinsics.checkNotNullExpressionValue(object4, (String)objectArray);
        object4 = (UserInformation)object4;
        boolean n4 = ((UserInformation)object4).isUserOnline();
        object = ((rs1_2)object).a;
        if (n4) {
            object4 = ((CouponPromotion)object2).getMyCoupons();
            int n7 = ((ArrayList)object4).size();
            if (n7 == 0) {
                int n8 = R$string.textview_coupon_discount__message_5;
                object2 = hv3_0.K(n8);
                object.setText((CharSequence)object2);
            } else {
                object4 = ((CouponPromotion)object2).getSaleStartTime();
                objectArray = ((CouponPromotion)object2).getSaleEndTime();
                object2 = ((CouponPromotion)object2).getServerTime();
                if ((object2 = cb2_0.a((String)object4, (String)objectArray, (String)object2)) != null) {
                    boolean bl2 = ((fn3_0)object2).d;
                    if (bl2) {
                        int n10 = R$string.textview_coupon_discount__message_9;
                        object2 = hv3_0.K(n10);
                        object.setText((CharSequence)object2);
                    } else {
                        int n14 = R$string.textview_coupon_discount__message_7;
                        object2 = ((fn3_0)object2).e;
                        objectArray = new Object[n3];
                        objectArray[0] = object2;
                        object2 = hv3_0.L(n14, objectArray);
                        object.setText((CharSequence)object2);
                    }
                }
            }
        } else {
            int n15 = R$string.textview_coupon_discount__message_6;
            object2 = hv3_0.K(n15);
            object.setText((CharSequence)object2);
        }
        object3.b = n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3, List list) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Intrinsics.checkNotNullParameter(list, "payloads");
        super.onBindViewHolder(recyclerView$B, n3, list);
    }

    public final RecyclerView$B onCreateBasicItemViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        n3 = R$layout.mycoupon_promotion_row;
        viewGroup = this.c.inflate(n3, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        m82_0 m82_02 = this.a;
        ts1_2 ts1_22 = new ts1_2((View)viewGroup, m82_02);
        return ts1_22;
    }

    public final RecyclerView$B onCreateFooterViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return null;
    }

    public final RecyclerView$B onCreateHeaderViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        n3 = R$layout.mycoupon_promotion_header_row;
        viewGroup = this.c.inflate(n3, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        rs1_2 rs1_22 = new rs1_2((View)viewGroup);
        return rs1_22;
    }

    public final boolean useFooter() {
        return false;
    }

    public final boolean useHeader() {
        return true;
    }
}

