/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.database.entity.SharedWithMe;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SZ
 */
public final class sz_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sz_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 3;
        Object[] objectArray = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (SharedWithMe)object;
                object3 = (w23_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                Intrinsics.checkNotNullParameter(object, "sharedWithMe");
                object3.getClass();
                w23_0.d((SharedWithMe)object);
                return object;
            }
            case 1: {
                int n7 = (Integer)object;
                object3 = (pl2_1)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = pl2_1.Pa((pl2_1)object3);
                object2.getClass();
                object3 = md3_0.c((jD3)object2);
                kv0_2 kv0_22 = new kv0_2((ov0_0)object2, n7, null);
                Ae3.d((i90_0)object3, null, null, kv0_22, n3);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object3 = (e00)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = cp_1.Companion;
        int n8 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n8 != 0) {
            Intrinsics.checkNotNull(object);
            n8 = ((DataCallback)object).getStatus();
            n4 = 1;
            Object object4 = null;
            if (n8 == 0) {
                object = (ProductsList)((DataCallback)object).getData();
                object2 = tr2_2.a;
                n8 = (int)(tr2_2.y(((e00)object3).k) ? 1 : 0);
                if (n8 != 0 && object != null && (object2 = ((ProductsList)object).getPagination()) != null && (n8 = ((Pagination)object2).getCurrentPage()) == 0) {
                    object2 = ((ProductsList)object).getSaleStartTime();
                    Long l2 = ((ProductsList)object).getSaleEndTime();
                    tr2_2.B((Long)object2, l2);
                }
                if (object != null) {
                    object2 = ((ProductsList)object).getProducts();
                } else {
                    n8 = 0;
                    object2 = null;
                }
                if (object2 != null) {
                    object2 = ((ProductsList)object).getProducts();
                    Intrinsics.checkNotNull(object2);
                    n8 = object2.size();
                    if (n8 > 0) {
                        object2 = ((ProductsList)object).getProducts();
                        long l3 = object2 != null && (object2 = (Product)object2.get(0)) != null ? ((Product)object2).getWishListCreatedDate() : 0L;
                        object2 = ((e00)object3).g;
                        n8 = (int)(w61_0.b((String)object2) ? 1 : 0);
                        if (n8 != 0) {
                            object2 = ((e00)object3).w;
                            Pagination pagination = ((ProductsList)object).getPagination();
                            int n10 = pagination != null ? pagination.getTotalResults() : -1;
                            ((e00)object3).k((ArrayList)object2, n10, l3);
                        }
                        if ((n8 = (int)(w61_0.b((String)(object2 = ((e00)object3).g)) ? 1 : 0)) != 0 && (object2 = ((e00)object3).f().a) != null && (n8 = (int)(((gw_2)object2).e ? 1 : 0)) == n4) {
                            object4 = (object = ((ProductsList)object).getProducts()) != null ? (object = CollectionsKt.m0((Collection)object)) : null;
                            ky1_0 ky1_02 = ((e00)object3).b;
                            if (ky1_02 != null) {
                                object = z40_0.Companion;
                                long l4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.h("price_drop_min_value");
                                object = md3_0.c(ky1_02);
                                Object object5 = object2;
                                object2 = new my1_2((ArrayList)object4, l4, ky1_02, null);
                                Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
                            }
                        }
                    }
                }
            } else {
                int n14 = ((DataCallback)object).getStatus();
                if (n14 == n4) {
                    object = yn3_0.a;
                    String string2 = "getShowWishListObservable failed";
                    objectArray = new Object[]{};
                    ((yn3$a)object).d(string2, objectArray);
                }
            }
        }
        return Unit.a;
    }
}

