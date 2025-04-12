/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.LinearLayout
 */
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.HeaderRecyclerViewAdapter;
import com.ril.ajio.services.data.CouponPromotion.CouponEntity;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from et
 */
public final class et_2
extends HeaderRecyclerViewAdapter {
    public ArrayList a;
    public m82_0 b;
    public o82_0 c;
    public LayoutInflater d;

    public final int getBasicItemCount() {
        return this.a.size();
    }

    public final int getBasicItemType(int n3) {
        return n3;
    }

    public final void onBindBasicItemView(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        recyclerView$B = (jt_0)recyclerView$B;
        Object object = this.a.get(n3);
        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
        object = (CouponEntity)object;
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(object, "entity");
        Object object2 = Ft2.a(String.valueOf(((CouponEntity)object).getEossVoucherValue()), " Points");
        ((jt_0)recyclerView$B).d.setText((CharSequence)object2);
        boolean n7 = ((CouponEntity)object).isSelected();
        Object object3 = ((jt_0)recyclerView$B).c;
        object3.setChecked(n7);
        boolean bl2 = ((CouponEntity)object).isSelected();
        LinearLayout linearLayout = ((jt_0)recyclerView$B).g;
        if (bl2) {
            int n8 = R$drawable.coupon_used_disabled;
            object2 = hv3_0.r(n8);
            linearLayout.setBackground((Drawable)object2);
        } else {
            int n10 = R$drawable.coupon_item_bg;
            object2 = hv3_0.r(n10);
            linearLayout.setBackground((Drawable)object2);
        }
        object2 = ((jt_0)recyclerView$B).e;
        String string2 = ((CouponEntity)object).getDescription();
        object2.setText((CharSequence)string2);
        object2 = new wd_0(1, recyclerView$B, object);
        linearLayout.setOnClickListener((View.OnClickListener)object2);
        object2 = new Object();
        object3.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)object2);
        object2 = new ht_0(recyclerView$B, (Serializable)object, 0);
        recyclerView$B = ((jt_0)recyclerView$B).f;
        recyclerView$B.setOnClickListener((View.OnClickListener)object2);
        object2 = new da$a();
        ((da$a)object2).k = n4 = 1;
        ((da$a)object2).o = n4;
        n4 = mz3_0.d(154);
        int n14 = mz3_0.d(130);
        ((da$a)object2).d = n4;
        ((da$a)object2).e = n14;
        object3 = UrlHelper.Companion.getInstance();
        object = ((CouponEntity)object).getImageUrl();
        ((da$a)object2).n = object = ((UrlHelper)object3).getImageUrl((String)object);
        ((da$a)object2).u = recyclerView$B;
        ((da$a)object2).a();
    }

    public final void onBindFooterView(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
    }

    public final void onBindHeaderView(RecyclerView$B recyclerView$B, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        recyclerView$B = recyclerView$B.itemView.getLayoutParams();
        Intrinsics.checkNotNull(recyclerView$B, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        ((StaggeredGridLayoutManager$LayoutParams)((Object)recyclerView$B)).b = true;
    }

    public final RecyclerView$B onCreateBasicItemViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        n3 = R$layout.availblecoupon_promotion_row;
        viewGroup = this.d.inflate(n3, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        m82_0 m82_02 = this.b;
        o82_0 o82_02 = this.c;
        jt_0 jt_02 = new jt_0((View)viewGroup, m82_02, o82_02);
        return jt_02;
    }

    public final RecyclerView$B onCreateFooterViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return null;
    }

    public final RecyclerView$B onCreateHeaderViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        n3 = R$layout.availablecoupon_promotion_header_row;
        viewGroup = this.d.inflate(n3, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "itemView");
        ft_0 ft_02 = new RecyclerView$B((View)viewGroup);
        return ft_02;
    }

    public final boolean useFooter() {
        return false;
    }

    public final boolean useHeader() {
        return true;
    }
}

