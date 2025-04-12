/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import androidx.fragment.app.b$g;
import androidx.fragment.app.b$h;
import androidx.fragment.app.n$c;
import androidx.recyclerview.widget.RecyclerView$B;
import com.jio.jioads.adinterfaces.JioAdView$JioAdCompanion;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Product.HomeWidgetTypes;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hn0
 */
public final class hn0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hn0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                JioAdView$JioAdCompanion.a((Function0)this.b);
                return;
            }
            case 1: {
                Object object = (p71_0)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = ((p71_0)object).b;
                if (object2 != null) {
                    int n4 = ((RecyclerView$B)object).getBindingAdapterPosition();
                    if ((n4 = (int)(object2.A(n4) ? 1 : 0)) == 0) {
                        n4 = ((RecyclerView$B)object).getBindingAdapterPosition();
                        Object object3 = object2.E(n4);
                        NewCustomEventsRevamp newCustomEventsRevamp = null;
                        if (object3 != null && (object3 = ((RecentlyViewedProducts)object3).getProducts()) != null) {
                            n4 = object3.size();
                        } else {
                            n4 = 0;
                            object3 = null;
                        }
                        if (n4 > 0) {
                            n4 = ((RecyclerView$B)object).getBindingAdapterPosition();
                            if ((object2 = object2.E(n4)) != null && (object2 = ((RecentlyViewedProducts)object2).getProducts()) != null && (object2 = (Product)CollectionsKt.N(0, (List)object2)) != null) {
                                object2 = ((Product)object2).getProductType();
                            } else {
                                n3 = 0;
                                object2 = null;
                            }
                            object3 = HomeWidgetTypes.HOME_WIDGET_TYPE_PRODUCT;
                            if (object2 == object3) {
                                ((p71_0)object).w();
                                object2 = AnalyticsManager.Companion;
                                newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
                                String string2 = newCustomEventsRevamp.getEVENT_CATEGORY_DYNAMIC_EXPLORE();
                                String string3 = newCustomEventsRevamp.getDYNAMIC_WIDGET_VIEW();
                                object = ((p71_0)object).r;
                                object3 = " dynamic_{";
                                String string4 = cP.a((String)object3, (String)object, "}}");
                                String string5 = newCustomEventsRevamp.getEVENT_NAME_EXPLORE_ALL();
                                String string6 = av_0.a((AnalyticsManager$Companion)object2);
                                String string7 = bv_0.a((AnalyticsManager$Companion)object2);
                                String string8 = cv_0.a((AnalyticsManager$Companion)object2);
                                String string9 = "home landing screen";
                                int n7 = 1536;
                                NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, string2, string3, string4, string5, string6, string9, string7, null, string8, false, null, n7, null);
                            }
                        }
                    }
                }
                return;
            }
            case 0: 
        }
        b$g b$g = (b$g)this.b;
        Intrinsics.checkNotNullParameter(b$g, "this$0");
        int n8 = 2;
        Log.isLoggable((String)"FragmentManager", (int)n8);
        Iterator iterator = ((Iterable)b$g.c).iterator();
        while ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            n$c n$c = ((b$h)iterator.next()).a;
            n$c.c(b$g);
        }
    }
}

