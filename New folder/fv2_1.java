/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.ImageSearchResponse;
import com.ril.ajio.services.data.Product.AdaptiveSearchReplayResponse;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.data.Sort;
import com.ril.ajio.services.query.ProductListQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.g;

/*
 * Renamed from fv2
 */
public final class fv2_1
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ bv2_0 b;

    public fv2_1(bv2_0 bv2_02, f80_0 f80_02) {
        this.b = bv2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        bv2_0 bv2_02 = this.b;
        fv2_1 fv2_12 = new fv2_1(bv2_02, f80_02);
        fv2_12.a = object;
        return fv2_12;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (fv2_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((fv2_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (i90_0)this.a;
        object = new ProductListQuery();
        object2 = this.b;
        Object object3 = ((bv2_0)object2).P;
        if (object3 != null) {
            object3 = ((ProductListQuery)object3).getSelectedSort();
        } else {
            n3 = 0;
            object3 = null;
        }
        ((ProductListQuery)object).setSelectedSort((Sort)object3);
        object3 = ((bv2_0)object2).P;
        Intrinsics.checkNotNull(object3);
        n3 = ((ProductListQuery)object3).getCurrentPage();
        int n4 = 1;
        ((ProductListQuery)object).setCurrentPage(n3 += n4);
        object3 = ((bv2_0)object2).P;
        Intrinsics.checkNotNull(object3);
        object3 = ((ProductListQuery)object3).getQueryText();
        ((ProductListQuery)object).setQueryText((String)object3);
        object3 = ((bv2_0)object2).P;
        Intrinsics.checkNotNull(object3);
        object3 = ((ProductListQuery)object3).getCategoryId();
        ((ProductListQuery)object).setCategoryId((String)object3);
        object3 = ((bv2_0)object2).P;
        Intrinsics.checkNotNull(object3);
        n3 = ((ProductListQuery)object3).getPageSize();
        ((ProductListQuery)object).setPageSize(n3);
        object3 = ((bv2_0)object2).P;
        Intrinsics.checkNotNull(object3);
        object3 = ((ProductListQuery)object3).getPageType();
        ((ProductListQuery)object).setPageType((String)object3);
        object3 = od3_2.a();
        Object object4 = ld3_2.STORE_AJIO.getStoreId();
        n3 = (int)(Intrinsics.areEqual(object3, object4) ? 1 : 0);
        if (n3 != 0) {
            object3 = h40_0.a;
            n3 = (int)(h40_0.z1() ? 1 : 0);
            if (n3 != 0) {
                object3 = bv2_0.Companion;
                object3.getClass();
                n3 = (int)(bv2_0.b2 ? 1 : 0);
                if (n3 != 0) {
                    int n7;
                    object3 = ((bv2_0)object2).M;
                    if (object3 != null) {
                        object3 = ((ProductsList)object3).getResponseSource();
                    } else {
                        n3 = 0;
                        object3 = null;
                    }
                    if (object3 != null && (n7 = ((String)object3).length()) != 0) {
                        n7 = 0;
                        object4 = null;
                    } else {
                        n7 = 1;
                    }
                    if ((n7 ^= n4) == 0) {
                        n3 = 0;
                        object3 = null;
                    }
                    if (object3 == null) {
                        object3 = "Saas";
                    }
                    ((ProductListQuery)object).setPreviousSource((String)object3);
                    ((ProductListQuery)object).setOspreySearch(n4 != 0);
                    ((bv2_0)object2).U0 = object3 = ((ProductListQuery)object).getPreviousSource();
                }
            }
        }
        if ((object3 = ((bv2_0)object2).P) != null && (object3 = ((ProductListQuery)object3).getShowAdsOnNextPage()) != null) {
            ((ProductListQuery)object).setShowAdsOnNextPage((Boolean)object3);
        } else {
            object3 = Boolean.FALSE;
            ((ProductListQuery)object).setShowAdsOnNextPage((Boolean)object3);
        }
        object3 = ((bv2_0)object2).P;
        if (object3 != null) {
            object3 = ((ProductListQuery)object3).getAdaptiveSearchReplayResponse();
        } else {
            n3 = 0;
            object3 = null;
        }
        ((ProductListQuery)object).setAdaptiveSearchReplayResponse((AdaptiveSearchReplayResponse)object3);
        object3 = ((bv2_0)object2).P;
        if (object3 != null) {
            object3 = ((ProductListQuery)object3).getWidgetRecord();
        } else {
            n3 = 0;
            object3 = null;
        }
        ((ProductListQuery)object).setWidgetRecord((WidgetRecord)object3);
        object3 = ((bv2_0)object2).w();
        ((ProductListQuery)object).setUrgencyDriverEnabled((Boolean)object3);
        n3 = (int)(((bv2_0)object2).y ? 1 : 0);
        if (n3 != 0) {
            Intrinsics.checkNotNullParameter(object, "productListQuery");
            object3 = (ImageSearchResponse)((bv2_0)object2).q.d();
            g g3 = ir0_2.a;
            g3 = em0_2.b;
            object4 = new dv2_2((ImageSearchResponse)object3, (bv2_0)object2, (ProductListQuery)object, null);
            int n8 = 2;
            object2 = ((bv2_0)object2).e;
            Ae3.d((i90_0)object2, g3, null, (Function2)object4, n8);
        } else {
            n3 = (int)(((bv2_0)object2).B ? 1 : 0);
            if (n3 != 0) {
                ((bv2_0)object2).n((ProductListQuery)object);
            } else {
                object3 = Boolean.TRUE;
                ((bv2_0)object2).h((ProductListQuery)object, (Boolean)object3);
            }
        }
        return Unit.a;
    }
}

