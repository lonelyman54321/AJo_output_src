/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class GR0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ GR0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        Object object3 = "this$0";
        int n4 = 1;
        Object object4 = this.b;
        int n7 = this.a;
        switch (n7) {
            default: {
                object = (String)object;
                object4 = (vv2_2)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                Intrinsics.checkNotNullParameter(object, "it");
                ((vv2_2)object4).F0 = n4;
                ((vv2_2)object4).G0 = object;
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                object4 = (q22_0)object4;
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object4.getClass();
                fq2_1.e.stop();
                object3 = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n8 != 0) {
                    object3 = ((q22_0)object4).N;
                    View view = ((q22_0)object4).O;
                    hv3_0.t0((ShimmerFrameLayout)((Object)object3), view);
                    n8 = ((DataCallback)object).getStatus();
                    if (n8 == 0) {
                        object3 = ((q22_0)object4).cb().d;
                        Object object5 = (ProductsList)((DataCallback)object).getData();
                        if (object5 == null || (object5 = ((ProductsList)object5).getLastSavedCohort()) == null) {
                            object5 = "";
                        }
                        object3.getClass();
                        Intrinsics.checkNotNullParameter(object5, "<set-?>");
                        ((bv2_0)object3).J0 = object5;
                        object3 = ((q22_0)object4).cb().d;
                        object5 = (ProductsList)((DataCallback)object).getData();
                        n7 = 0;
                        Object var9_10 = null;
                        if (object5 != null) {
                            object5 = ((ProductsList)object5).getUserGroup();
                        } else {
                            n4 = 0;
                            object5 = null;
                        }
                        if (object5 != null) {
                            ((bv2_0)object3).I0 = object5;
                        } else {
                            object3.getClass();
                        }
                        ((q22_0)object4).R0 = object3 = ProductsList.Companion.getCATEGORY_PAGE();
                        object3 = (ProductsList)((DataCallback)object).getData();
                        if (object3 != null && (object3 = ((ProductsList)object3).getShowAdsOnNextPage()) != null) {
                            object5 = ((q22_0)object4).cb().d;
                            ((bv2_0)object5).w = object3;
                        }
                        object3 = (ProductsList)((DataCallback)object).getData();
                        ((q22_0)object4).xb((ProductsList)object3);
                        ((q22_0)object4).yb();
                        object3 = ((q22_0)object4).cb();
                        object5 = ((DataCallback)object).getData();
                        Intrinsics.checkNotNull(object5);
                        object5 = (ProductsList)object5;
                        ((F12)object3).n((ProductsList)object5, false);
                        n3 = ((q22_0)object4).zb();
                        if (n3 != 0) {
                            return Unit.a;
                        }
                        n3 = ((q22_0)object4).jb();
                        if (n3 != 0) {
                            void var9_12;
                            object2 = ((q22_0)object4).cb().d;
                            object3 = (ProductsList)((DataCallback)object).getData();
                            if (object3 != null) {
                                object3 = ((ProductsList)object3).getQuickFilters();
                            } else {
                                n8 = 0;
                                object3 = null;
                            }
                            ((bv2_0)object2).E((List)object3);
                            object4.o0();
                            object2 = (ProductsList)((DataCallback)object).getData();
                            if (object2 != null && (object2 = ((ProductsList)object2).getPagination()) != null) {
                                n3 = ((Pagination)object2).getCurrentPage();
                                Integer n10 = n3;
                            }
                            ((q22_0)object4).kb((Integer)var9_12);
                        }
                        object2 = (ProductsList)((DataCallback)object).getData();
                        ((q22_0)object4).wb((ProductsList)object2);
                        object = (ProductsList)((DataCallback)object).getData();
                        ((q22_0)object4).Ta((ProductsList)object);
                        ((q22_0)object4).lb();
                        return Unit.a;
                    } else {
                        int n14 = ((DataCallback)object).getStatus();
                        if (n14 != n4) return Unit.a;
                        object = StringCompanionObject.INSTANCE;
                        n14 = R$string.acc_error_message_page_load_fail;
                        object = hv3_0.K(n14);
                        object3 = hv3_0.K(R$string.something_wrong_msg);
                        Object[] objectArray = new Object[n4];
                        objectArray[0] = object3;
                        object = xh2_0.a(objectArray, n4, (String)object, "format(...)");
                        n8 = R$string.something_wrong_msg;
                        object3 = hv3_0.K(n8);
                        hv3_0.o0(n4, (String)object3, (String)object);
                        object = ((q22_0)object4).P;
                        Intrinsics.checkNotNull(object);
                        ((RecyclerViewScrollListener)object).setLoadingSate(false);
                    }
                    return Unit.a;
                } else {
                    object = ((q22_0)object4).N;
                    object3 = ((q22_0)object4).O;
                    hv3_0.t0((ShimmerFrameLayout)((Object)object), (View)object3);
                    object = ((q22_0)object4).B;
                    if (object != null) {
                        object.setVisibility(0);
                    }
                    if ((object = ((q22_0)object4).E) != null) {
                        object.setVisibility(0);
                    }
                    if ((object = ((q22_0)object4).G) == null) return Unit.a;
                    object.setVisibility(0);
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (Integer)object;
        object.getClass();
        ((dr0_0)object4).Q.setValue(object);
        return Unit.a;
    }
}

