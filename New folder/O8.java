/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.ApiErrorRepo;
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

public final class O8
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ O8(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object4 = object;
                object4 = (Throwable)object;
                object2 = (e12_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((e12_0)object2).P0;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                object2 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object4, "PdpEddCheck", true, null, null, 24, null);
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n4 != 0) {
            Intrinsics.checkNotNull(object);
            n4 = ((DataCallback)object).getStatus();
            n3 = 1;
            int n7 = 0;
            Object object5 = null;
            if (n4 == 0) {
                int n8;
                Object object6;
                object = (ProductsList)((DataCallback)object).getData();
                object3 = tr2_2.a;
                n4 = (int)(tr2_2.y(((q9_0)object2).X0) ? 1 : 0);
                if (n4 != 0 && object != null && (object3 = ((ProductsList)object).getPagination()) != null && (n4 = ((Pagination)object3).getCurrentPage()) == 0) {
                    object3 = ((ProductsList)object).getSaleStartTime();
                    object6 = ((ProductsList)object).getSaleEndTime();
                    tr2_2.B((Long)object3, (Long)object6);
                }
                n4 = 0;
                object3 = null;
                if (object != null) {
                    object6 = ((ProductsList)object).getProducts();
                } else {
                    n8 = 0;
                    object6 = null;
                }
                if (object6 != null) {
                    object6 = ((ProductsList)object).getProducts();
                    Intrinsics.checkNotNull(object6);
                    n8 = object6.size();
                    if (n8 > 0) {
                        ArrayList arrayList;
                        boolean bl2;
                        object6 = ((ProductsList)object).getProducts();
                        long l2 = object6 != null && (object5 = (Product)object6.get(0)) != null ? ((Product)object5).getWishListCreatedDate() : 0L;
                        Object object7 = ((q9_0)object2).X;
                        Object object8 = "ajiohomeViewModel";
                        if (object7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                            bl2 = false;
                            object7 = null;
                        }
                        if (bl2 = w61_0.b((String)(object7 = ((x9_0)object7).r))) {
                            object7 = ((q9_0)object2).Z;
                            if (object7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("commonCmsViewDelegate");
                                bl2 = false;
                                object7 = null;
                            }
                            arrayList = ((q9_0)object2).m;
                            Pagination pagination = ((ProductsList)object).getPagination();
                            int n10 = pagination != null ? pagination.getTotalResults() : -1;
                            ((e00)object7).k(arrayList, n10, l2);
                        }
                        if ((object5 = ((q9_0)object2).X) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                            n7 = 0;
                            object5 = null;
                        }
                        if ((n7 = w61_0.b((String)(object5 = ((x9_0)object5).r))) != 0) {
                            object5 = ((q9_0)object2).X;
                            if (object5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                                n7 = 0;
                                object5 = null;
                            }
                            if ((object5 = ((x9_0)object5).q) != null && (n7 = ((gw_2)object5).e) == n3) {
                                if ((object = ((ProductsList)object).getProducts()) != null) {
                                    object5 = object = CollectionsKt.m0((Collection)object);
                                } else {
                                    n7 = 0;
                                    object5 = null;
                                }
                                object8 = object = ((q9_0)object2).R0.getValue();
                                object8 = (ky1_0)object;
                                object = z40_0.Companion;
                                long l3 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.h("price_drop_min_value");
                                object8.getClass();
                                object = md3_0.c((jD3)object8);
                                arrayList = null;
                                object2 = new my1_2((ArrayList)object5, l3, (ky1_0)object8, null);
                                n3 = 3;
                                Ae3.d((i90_0)object, null, null, (Function2)object2, n3);
                            }
                        }
                    }
                }
            } else {
                int n14 = ((DataCallback)object).getStatus();
                if (n14 == n3) {
                    object = yn3_0.a;
                    object2 = "getShowWishListObservable failed";
                    object3 = new Object[]{};
                    ((yn3$a)object).d((String)object2, (Object[])object3);
                }
            }
        }
        return Unit.a;
    }
}

