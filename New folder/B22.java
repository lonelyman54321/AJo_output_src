/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.lifecycle.LiveData;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.onscrolllistener.RecyclerViewScrollListener;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class B22
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ B22(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        block21: {
            block18: {
                int n3;
                Object object2;
                int n4;
                Object object3;
                Object object4;
                int n7;
                block19: {
                    Object object5;
                    Object object6;
                    block20: {
                        boolean n8 = false;
                        object6 = null;
                        n7 = 1;
                        object4 = this.b;
                        object3 = "this$0";
                        int n10 = this.a;
                        switch (n10) {
                            default: {
                                object = (Throwable)object;
                                object4 = (uc3_2)object4;
                                Intrinsics.checkNotNullParameter(object4, (String)object3);
                                object6 = ((uc3_2)object4).j;
                                Intrinsics.checkNotNull(object);
                                object = ((uc3_2)object4).i.handleApiException((Throwable)object, "BackGround_AllCMSCategories");
                                ((LiveData)object6).k(object);
                                return Unit.a;
                            }
                            case 0: 
                        }
                        object = (DataCallback)object;
                        object4 = (q22_0)object4;
                        Intrinsics.checkNotNullParameter(object4, (String)object3);
                        object4.getClass();
                        fq2_1.e.stop();
                        object3 = ((q22_0)object4).cb().d;
                        n4 = ((bv2_0)object3).O;
                        if (n4 != 0 || (n4 = nn_2.b((cp$a)(object3 = cp_1.Companion), (DataCallback)object)) == 0) break block18;
                        object3 = ((q22_0)object4).N;
                        object2 = ((q22_0)object4).O;
                        hv3_0.t0((ShimmerFrameLayout)((Object)object3), (View)object2);
                        if (object == null || (n4 = ((DataCallback)object).getStatus()) != 0) break block19;
                        object6 = ((q22_0)object4).cb().d;
                        object3 = (ProductsList)((DataCallback)object).getData();
                        object2 = "";
                        if (object3 == null || (object3 = ((ProductsList)object3).getLastSavedCohort()) == null) {
                            object3 = object2;
                        }
                        object6.getClass();
                        Intrinsics.checkNotNullParameter(object3, "<set-?>");
                        ((bv2_0)object6).J0 = object3;
                        object6 = ((q22_0)object4).cb().d;
                        object3 = (ProductsList)((DataCallback)object).getData();
                        if (object3 != null) {
                            object3 = ((ProductsList)object3).getUserGroup();
                        } else {
                            n4 = 0;
                            object3 = null;
                        }
                        if (object3 != null) {
                            ((bv2_0)object6).I0 = object3;
                        } else {
                            object6.getClass();
                        }
                        ((q22_0)object4).R0 = object6 = ProductsList.Companion.getSEARCH_PAGE();
                        object6 = (ProductsList)((DataCallback)object).getData();
                        ((q22_0)object4).xb((ProductsList)object6);
                        ((q22_0)object4).yb();
                        object6 = ((q22_0)object4).cb();
                        object3 = ((DataCallback)object).getData();
                        Intrinsics.checkNotNull(object3);
                        object3 = (ProductsList)object3;
                        ((F12)object6).n((ProductsList)object3, n7 != 0);
                        boolean bl2 = ((q22_0)object4).zb();
                        if (!bl2) break block20;
                        object = Unit.a;
                        break block21;
                    }
                    boolean bl3 = ((q22_0)object4).jb();
                    if (bl3) {
                        object6 = ((q22_0)object4).cb().d;
                        object5 = (ProductsList)((DataCallback)object).getData();
                        if (object5 != null) {
                            object5 = ((ProductsList)object5).getQuickFilters();
                        } else {
                            n7 = 0;
                            object5 = null;
                        }
                        ((bv2_0)object6).E((List)object5);
                        object4.o0();
                        object6 = (ProductsList)((DataCallback)object).getData();
                        if (object6 != null && (object6 = ((ProductsList)object6).getPagination()) != null) {
                            int n14 = ((Pagination)object6).getCurrentPage();
                            object6 = n14;
                        } else {
                            boolean bl4 = false;
                            object6 = null;
                        }
                        ((q22_0)object4).kb((Integer)object6);
                    }
                    object6 = (ProductsList)((DataCallback)object).getData();
                    ((q22_0)object4).wb((ProductsList)object6);
                    object6 = (ProductsList)((DataCallback)object).getData();
                    ((q22_0)object4).Ta((ProductsList)object6);
                    object = (ProductsList)((DataCallback)object).getData();
                    if (object != null && (object6 = ((ProductsList)object).getProducts()) != null) {
                        int n15;
                        n7 = object6.size();
                        if (n7 > (n15 = 10)) {
                            n7 = 10;
                        }
                        object4 = el1_2.a;
                        if ((object = ((ProductsList)object).getFreeTextSearch()) != null) {
                            object2 = object;
                        }
                        object = CollectionsKt.f0((Iterable)object6, n7);
                        Intrinsics.checkNotNullParameter(object2, "searchString");
                        object6 = "products";
                        Intrinsics.checkNotNullParameter(object, (String)object6);
                        boolean bl5 = el1_2.j();
                        if (bl5) {
                            object6 = el1_2.b;
                            object5 = new ol1_2((String)object2, (List)object, null);
                            int n16 = 3;
                            Ae3.d((i90_0)object6, null, null, (Function2)object5, n16);
                        }
                    }
                    break block18;
                }
                if (object == null || (n3 = ((DataCallback)object).getStatus()) == n7) {
                    object = StringCompanionObject.INSTANCE;
                    n3 = R$string.acc_error_message_page_load_fail;
                    object = hv3_0.K(n3);
                    object3 = hv3_0.K(R$string.something_wrong_msg);
                    object2 = new Object[n7];
                    object2[0] = object3;
                    object = xh2_0.a(object2, n7, (String)object, "format(...)");
                    n4 = R$string.something_wrong_msg;
                    object3 = hv3_0.K(n4);
                    hv3_0.o0(n7, (String)object3, (String)object);
                    object = ((q22_0)object4).P;
                    Intrinsics.checkNotNull(object);
                    ((RecyclerViewScrollListener)object).setLoadingSate(false);
                }
            }
            object = Unit.a;
        }
        return object;
    }
}

