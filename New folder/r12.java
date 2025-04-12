/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class r12
implements F62 {
    public final /* synthetic */ s12 a;

    public /* synthetic */ r12(s12 s122) {
        this.a = s122;
    }

    public final void onChanged(Object object) {
        int n3 = 0;
        String string2 = null;
        int n4 = 1;
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n7 != 0) {
            object3 = ((s12)object2).b;
            if (object3 != null) {
                object3.stopLoader();
            }
            if ((n7 = ((DataCallback)object).getStatus()) == 0) {
                int n8;
                object3 = ((s12)object2).Ta();
                if (object3 != null) {
                    object = (ProductsList)((DataCallback)object).getData();
                    object3.l((ProductsList)object);
                }
                object = ((s12)object2).h;
                n7 = 0;
                object3 = null;
                if (object != null) {
                    object = ((RecyclerView)object).getAdapter();
                } else {
                    n8 = 0;
                    object = null;
                }
                n8 = object instanceof FI0;
                if (n8 != 0) {
                    object = ((s12)object2).h;
                    if (object != null) {
                        object = ((RecyclerView)object).getAdapter();
                    } else {
                        n8 = 0;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.plp.filters.adapters.FacetNameAdapter");
                    object = (FI0)object;
                    Object object4 = ((s12)object2).Ta();
                    object4 = object4 != null && (object4 = ((F12)object4).d) != null ? ((bv2_0)object4).N : null;
                    Intrinsics.checkNotNull(object4);
                    object4 = ((ProductsList)object4).getFacets();
                    Intrinsics.checkNotNull(object4);
                    object4 = ImmutableList.copyOf((Collection)((s12)object2).Va((List)object4));
                    Intrinsics.checkNotNullExpressionValue(object4, "copyOf(...)");
                    object.getClass();
                    String string3 = "facetList";
                    Intrinsics.checkNotNullParameter(object4, string3);
                    ((FI0)object).a = object4;
                    ((RecyclerView$f)object).notifyDataSetChanged();
                }
                ((s12)object2).updateTitle();
                object = ((s12)object2).Ta();
                if (object != null && (object = ((F12)object).d) != null) {
                    object = ((bv2_0)object).X;
                } else {
                    n8 = 0;
                    object = null;
                }
                if (object != null) {
                    object = ((s12)object2).Ta();
                    if (object != null && (object = ((F12)object).d) != null) {
                        object = ((bv2_0)object).X;
                    } else {
                        n8 = 0;
                        object = null;
                    }
                    Intrinsics.checkNotNull(object);
                    ((s12)object2).ab((Facet)object);
                }
                if ((object = ((s12)object2).Ta()) != null && (object = ((F12)object).d) != null && (n8 = ((bv2_0)object).h0) == n4) {
                    object = ((s12)object2).Ta();
                    if (object != null && (object = ((F12)object).d) != null) {
                        ((bv2_0)object).h0 = false;
                    }
                    n8 = R$string.no_product_selected_filter;
                    object = hv3_0.K(n8);
                    hv3_0.o0(n4, (String)object, null);
                }
                if ((n8 = ((s12)object2).m) != 0) {
                    ((s12)object2).m = false;
                    ((s12)object2).bb();
                }
            } else {
                int n10 = ((DataCallback)object).getStatus();
                if (n10 == n4) {
                    object = StringCompanionObject.INSTANCE;
                    n10 = R$string.acc_error_message;
                    object = hv3_0.K(n10);
                    int n14 = R$string.something_wrong_msg;
                    object2 = hv3_0.K(n14);
                    object3 = new Object[n4];
                    object3[0] = object2;
                    object = xh2_0.a(object3, n4, (String)object, "format(...)");
                    n3 = R$string.something_wrong_msg;
                    string2 = hv3_0.K(n3);
                    hv3_0.o0(n4, string2, (String)object);
                }
            }
        }
    }
}

