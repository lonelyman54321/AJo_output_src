/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.data.options.CuratedWidgetItem;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bi2
 */
public final class bi2_1
extends RecyclerView$B
implements View.OnClickListener {
    public final int a;
    public final HomeRowData b;
    public final kc1_2 c;
    public final String d;
    public final AppCompatImageView e;
    public final TextView f;
    public final TextView g;
    public CuratedWidgetItem h;

    public bi2_1(View object, int n3, HomeRowData homeRowData, kc1_2 kc1_22, String string2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object);
        this.a = n3;
        this.b = homeRowData;
        this.c = kc1_22;
        this.d = string2;
        object = this.itemView;
        n3 = R$id.widget_image;
        object = object.findViewById(n3);
        String string3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string3);
        object = (AppCompatImageView)((Object)object);
        this.e = object;
        homeRowData = this.itemView;
        int n4 = R$id.widget_title;
        homeRowData = homeRowData.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(homeRowData, string3);
        homeRowData = (TextView)homeRowData;
        this.f = homeRowData;
        homeRowData = this.itemView;
        n4 = R$id.widget_sub_title;
        homeRowData = homeRowData.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(homeRowData, string3);
        homeRowData = (TextView)homeRowData;
        this.g = homeRowData;
        object.setOnClickListener((View.OnClickListener)this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        Object object;
        Object object2;
        bi2_1 bi2_12 = this;
        Object object3 = null;
        int n3 = 0;
        Boolean bl2 = null;
        Object object4 = this.b;
        Object object5 = object4 != null && (object2 = ((HomeRowData)object4).getBanners()) != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null ? (object2 = ((BannerData)object2).getBannerType()) : null;
        Object object6 = object4 != null && (object2 = ((HomeRowData)object4).getBanners()) != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null ? (object2 = ((BannerData)object2).getFeedLogic()) : null;
        Object object7 = object4 != null && (object2 = ((HomeRowData)object4).getBanners()) != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null ? (object2 = ((BannerData)object2).getWidgetLevel()) : null;
        object2 = object4 != null && (object2 = ((HomeRowData)object4).getBanners()) != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null ? ((BannerData)object2).getNoOfproducts() : null;
        String string2 = String.valueOf(object2);
        object2 = bi2_12.h;
        if (object2 == null || (object2 = ((CuratedWidgetItem)object2).getHeader()) == null) {
            object2 = "";
        }
        Object object8 = object2;
        object2 = od3_2.a();
        boolean bl3 = Intrinsics.areEqual(object2, object = ld3_2.STORE_AJIO.getStoreId());
        if (bl3) {
            object2 = "rilfnl";
        }
        Object object9 = object2;
        Object object10 = object4 != null && (object2 = ((HomeRowData)object4).getBanners()) != null && (object2 = (BannerData)CollectionsKt.N(0, (List)object2)) != null ? (object2 = ((BannerData)object2).getShowDefault()) : null;
        object2 = bi2_12.h;
        if (object2 != null) {
            object3 = ((CuratedWidgetItem)object2).getFilters();
        }
        String string3 = object3;
        int n4 = 80;
        object = object3;
        object3 = new WidgetRecord((String)object6, (String)object7, string2, (String)object8, null, (Boolean)object10, null, (String)object9, string3, (String)object5, n4, null);
        object2 = new StringBuilder("pdp widget - ");
        object = bi2_12.d;
        ((StringBuilder)object2).append((String)object);
        String string4 = ((StringBuilder)object2).toString();
        object2 = bi2_12.c;
        if (object2 != null) {
            int n7;
            object = bi2_12.h;
            if (object4 != null && (object4 = ((HomeRowData)object4).getBanners()) != null && (object4 = (BannerData)CollectionsKt.N(0, (List)object4)) != null) {
                bl2 = ((BannerData)object4).getEnableAdsOnPlp();
                object4 = Boolean.TRUE;
                n7 = n3 = (int)(Intrinsics.areEqual(bl2, object4) ? 1 : 0);
            } else {
                n7 = 0;
            }
            n3 = bi2_12.a;
            object2.a((WidgetRecord)object3, (CuratedWidgetItem)object, n3, n7 != 0, string4);
        }
    }
}

