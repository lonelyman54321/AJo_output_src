/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.analytics.utils.GAUtils;
import com.ril.ajio.analytics.utils.GAUtils$Companion;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class t21$c
extends RecyclerView$s {
    public final /* synthetic */ t21_0 a;

    public t21$c(t21_0 t21_02) {
        this.a = t21_02;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        Object object2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (n3 == 0) {
            int n4;
            int n7;
            object = this.a;
            Object object3 = ((t21_0)object).u;
            object2 = ((t21_0)object).E;
            if (object2 != null) {
                n7 = ((LinearLayoutManager)object2).findLastCompletelyVisibleItemPosition();
                object2 = n7;
            } else {
                n7 = 0;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            n7 = (Integer)object2;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            if (object3 != null && n7 > (n4 = ((t21_0)object).D)) {
                kp_1 kp_12;
                String string2;
                Object object4;
                Object object5;
                ArrayList<Object> arrayList2 = new ArrayList<Object>();
                n4 = ((t21_0)object).D;
                if (n4 <= n7) {
                    while (true) {
                        int n8;
                        if (n4 < (n8 = ((ArrayList)object3).size())) {
                            ((Product)((ArrayList)object3).get(n4)).setPosition(n4);
                            object5 = (Product)((ArrayList)object3).get(n4);
                            object4 = "product";
                            Intrinsics.checkNotNullParameter(object5, (String)object4);
                            boolean bl2 = og1_1.b();
                            if (!bl2) {
                                object4 = h40_0.a;
                                bl2 = h40_0.Y1();
                                if (bl2 && (bl2 = h40_0.T0())) {
                                    object4 = ((Product)object5).getAverageRating();
                                    string2 = ((Product)object5).getNumUserRatings();
                                    kp_12 = new kp_1((Product)object5);
                                    ai0_2.r(kp_12, object4, string2);
                                }
                            }
                            arrayList2.add(object5);
                            object5 = ((ArrayList)object3).get(n4);
                            arrayList.add(object5);
                        }
                        if (n4 == n7) break;
                        ++n4;
                    }
                }
                if ((n3 = arrayList2.isEmpty() ^ 1) != 0) {
                    object5 = GAEcommerceEvents.INSTANCE;
                    object3 = GAUtils.Companion;
                    object4 = ((GAUtils$Companion)object3).getGAViewItemSearchResults();
                    string2 = "bag screen - wishlist halfcut screen";
                    kp_12 = null;
                    String string3 = "wishlist halfcut screen";
                    String string4 = "bag screen";
                    ((GAEcommerceEvents)object5).pushWishListImpressionData((String)object4, arrayList2, string2, false, string3, string4);
                }
                ((t21_0)object).D = ++n7;
            }
        }
    }
}

