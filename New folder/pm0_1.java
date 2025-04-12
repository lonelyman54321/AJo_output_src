/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.ImageSearchResponse;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.query.CurrentQuery;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;

/*
 * Renamed from Pm0
 */
public final class pm0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pm0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 0;
        String string2 = null;
        int n7 = 1;
        Object[] objectArray = this.b;
        int n8 = this.a;
        switch (n8) {
            default: {
                object = (ImageSearchResponse)object;
                objectArray = (s12)objectArray;
                Intrinsics.checkNotNullParameter(objectArray, "this$0");
                Object object3 = objectArray.b;
                if (object3 != null) {
                    object3.stopLoader();
                }
                if (object != null) {
                    object3 = new ProductsList();
                    Object object4 = ((ImageSearchResponse)object).getProducts();
                    String string3 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.ril.ajio.services.data.Product.Product>";
                    Intrinsics.checkNotNull(object4, string3);
                    object4 = TypeIntrinsics.asMutableList(object4);
                    ((ProductsList)object3).setProducts((List)object4);
                    object4 = ((ImageSearchResponse)object).getProduct_types();
                    ((ProductsList)object3).setProduct_types((List)object4);
                    object4 = ((ImageSearchResponse)object).getPagination();
                    ((ProductsList)object3).setPagination((Pagination)object4);
                    object4 = ((ImageSearchResponse)object).getIm_id();
                    ((ProductsList)object3).setIm_id((String)object4);
                    object4 = ((ImageSearchResponse)object).getCurrentQuery();
                    ((ProductsList)object3).setCurrentQuery((CurrentQuery)object4);
                    object4 = ((ImageSearchResponse)object).getSorts();
                    ((ProductsList)object3).setSorts((List)object4);
                    object4 = ((ImageSearchResponse)object).getFacets();
                    ((ProductsList)object3).setFacets((List)object4);
                    object = ((ImageSearchResponse)object).getPriceRevealMetaInfo();
                    ((ProductsList)object3).setPriceRevealMetaInfo((PriceRevealMetaInfo)object);
                    int n10 = objectArray.n;
                    ((ProductsList)object3).setFromImageSearch(n10 != 0);
                    object = objectArray.Ta();
                    if (object != null) {
                        ((F12)object).l((ProductsList)object3);
                    }
                    if ((object = objectArray.h) != null) {
                        object = ((RecyclerView)object).getAdapter();
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    n10 = object instanceof FI0;
                    if (n10 != 0) {
                        object = objectArray.h;
                        if (object != null) {
                            object = ((RecyclerView)object).getAdapter();
                        } else {
                            n10 = 0;
                            object = null;
                        }
                        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.plp.filters.adapters.FacetNameAdapter");
                        object = (FI0)object;
                        object3 = objectArray.Ta();
                        if (object3 != null && (object3 = ((F12)object3).d) != null) {
                            object3 = ((bv2_0)object3).N;
                        } else {
                            n8 = 0;
                            object3 = null;
                        }
                        Intrinsics.checkNotNull(object3);
                        object3 = ((ProductsList)object3).getFacets();
                        Intrinsics.checkNotNull(object3);
                        object3 = ImmutableList.copyOf((Collection)objectArray.Va((List)object3));
                        Intrinsics.checkNotNullExpressionValue(object3, "copyOf(...)");
                        object.getClass();
                        object4 = "facetList";
                        Intrinsics.checkNotNullParameter(object3, (String)object4);
                        ((FI0)object).a = object3;
                        ((RecyclerView$f)object).notifyDataSetChanged();
                    }
                    objectArray.updateTitle();
                    object = objectArray.Ta();
                    if (object != null && (object = ((F12)object).d) != null) {
                        object = ((bv2_0)object).X;
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    if (object != null) {
                        object = objectArray.Ta();
                        if (object != null && (object = ((F12)object).d) != null) {
                            object = ((bv2_0)object).X;
                        } else {
                            n10 = 0;
                            object = null;
                        }
                        Intrinsics.checkNotNull(object);
                        objectArray.ab((Facet)object);
                    }
                    if ((object = objectArray.Ta()) != null && (object = ((F12)object).d) != null && (n10 = ((bv2_0)object).h0) == n7) {
                        object = objectArray.Ta();
                        if (object != null && (object = ((F12)object).d) != null) {
                            ((bv2_0)object).h0 = false;
                        }
                        n10 = R$string.no_product_selected_filter;
                        object = hv3_0.K(n10);
                        hv3_0.o0(n7, (String)object, null);
                    }
                    if ((n10 = objectArray.m) != 0) {
                        objectArray.m = false;
                        objectArray.bb();
                    }
                } else {
                    object = StringCompanionObject.INSTANCE;
                    int n14 = R$string.acc_error_message;
                    object = hv3_0.K(n14);
                    n4 = R$string.something_wrong_msg;
                    string2 = hv3_0.K(n4);
                    objectArray = new Object[n7];
                    objectArray[0] = string2;
                    object = xh2_0.a(objectArray, n7, (String)object, "format(...)");
                    n3 = R$string.something_wrong_msg;
                    object2 = hv3_0.K(n3);
                    hv3_0.o0(n7, (String)object2, (String)object);
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (v91_0)object;
        Intrinsics.checkNotNullParameter(object, "$this$HttpResponseValidator");
        ((v91_0)object).c = n3 = ((la1_2)objectArray).g;
        object2 = new qg3_2(2, null);
        Intrinsics.checkNotNullParameter(object2, "block");
        ((v91_0)object).a.add(object2);
        return Unit.a;
    }
}

