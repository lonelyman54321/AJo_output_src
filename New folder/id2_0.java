/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.databinding.PdpRatingReviewParentBinding;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.ratings.RatingsResponse;
import com.ril.ajio.services.data.ratings.SubRatings;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iD2
 */
public final class id2_0
extends RecyclerView$B {
    public final PdpRatingReviewParentBinding a;
    public final hd2_0 b;

    public id2_0(PdpRatingReviewParentBinding pdpRatingReviewParentBinding, hd2_0 hd2_02) {
        Intrinsics.checkNotNullParameter(pdpRatingReviewParentBinding, "binding");
        Intrinsics.checkNotNullParameter(hd2_02, "rateReviewClickListener");
        LinearLayout linearLayout = pdpRatingReviewParentBinding.getRoot();
        super((View)linearLayout);
        this.a = pdpRatingReviewParentBinding;
        this.b = hd2_02;
    }

    public final void w(yi2_1 yi2_12) {
        Object object;
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        Iterator iterator = yi2_12.R6();
        if (iterator != null && (object = ((RatingsResponse)((Object)iterator)).getSubRatings()) != null) {
            int n3 = object.isEmpty();
            int n4 = 1;
            if ((n3 ^= n4) == n4) {
                object = LD2.a;
                if ((iterator = ((RatingsResponse)((Object)iterator)).getSubRatings()) != null && (n3 = iterator.isEmpty() ^ n4) == n4) {
                    iterator = ((ArrayList)((Object)iterator)).iterator();
                    object = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(iterator, (String)object);
                    while ((n3 = iterator.hasNext()) != 0) {
                        object = iterator.next();
                        Intrinsics.checkNotNullExpressionValue(object, "next(...)");
                        object = (SubRatings)object;
                        String string2 = ((SubRatings)object).getProductAttribute();
                        cp_1.Companion.getClass();
                        Object object2 = cp$a.e();
                        object = ((SubRatings)object).getAttributeRatings();
                        object2.getClass();
                        object2 = cp_1.r((ArrayList)object);
                        if (string2 == null || (n3 = string2.length()) <= 0 || object2 == null || (n3 = ((String)object2).length()) <= 0) continue;
                        object = yi2_12.x5();
                        Object object3 = object != null ? (object = ((Product)object).getCode()) : null;
                        object = yi2_12.x5();
                        Object object4 = object != null ? (object = ((Product)object).getName()) : null;
                        object = yi2_12.x5();
                        Object object5 = object != null ? (object = ((Product)object).getBrickName()) : null;
                        LD2.f(string2, (String)object2, null, (String)object3, (String)object4, (String)object5);
                    }
                }
            }
        }
        rz3_0.Companion.getClass();
        iterator = this.a;
        object = this.b;
        Rz3$a.h(yi2_12, (PdpRatingReviewParentBinding)((Object)iterator), (hd2_0)object);
    }
}

