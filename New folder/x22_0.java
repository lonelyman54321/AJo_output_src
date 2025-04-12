/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.OrderListFunctionalRepo;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import com.ril.ajio.services.data.Product.BrandDetails;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from x22
 */
public final class x22_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ x22_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3 = 0;
        float f5 = 0.0f;
        Object object2 = null;
        Object object3 = "this$0";
        Fragment fragment = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (Float)object;
                Object object4 = com.ril.ajio.myaccount.order.fragment.b.Companion;
                fragment = (b)fragment;
                Intrinsics.checkNotNullParameter(fragment, (String)object3);
                object3 = ((b)fragment).R;
                if (object3 != null) {
                    int n7 = ((Number)object3).intValue();
                    if ((object3 = (OrderItemLine)CollectionsKt.N(n7, (List)(object4 = OrderListFunctionalRepo.INSTANCE.getOrderList()))) != null) {
                        object2 = ((OrderItemLine)object3).getBaseProductId();
                    }
                    if (object != null) {
                        float f6 = ((Number)object).floatValue();
                        n7 = 0;
                        object3 = null;
                        float f7 = f6 - 0.0f;
                        n4 = (int)(f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1));
                        if (n4 == 0) {
                            ((b)fragment).Wa(0.0f, (String)object2);
                        } else {
                            ((b)fragment).Wa(f6, (String)object2);
                        }
                        object2 = h40_0.a;
                        n3 = h40_0.v1();
                        if (n3 != 0) {
                            n3 = 0x40800000;
                            f5 = 4.0f;
                            float f8 = f6 - f5;
                            Object object5 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                            if (object5 >= 0) {
                                object = new Object();
                                object2 = ((b)fragment).E;
                                ((lq2_1)object2).a((Function1)object);
                            }
                        }
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        fragment = (q22_0)fragment;
        Intrinsics.checkNotNullParameter(fragment, (String)object3);
        object3 = cp_1.Companion;
        int n8 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n8 != 0) {
            kx3_0.a = n8 = 1;
            Object object6 = ((q22_0)fragment).Ua();
            object6.stopLoader();
            n4 = ((DataCallback)object).getStatus();
            if (n4 == 0) {
                float f11;
                int n10;
                object = ((q22_0)fragment).cb().e.c;
                if (object != null) {
                    n10 = ((Product)object).getViewHolderPos();
                    object = n10;
                } else {
                    n10 = 0;
                    object = null;
                    f11 = 0.0f;
                }
                ((q22_0)fragment).qb((Integer)object);
                object = ((q22_0)fragment).cb();
                n10 = (int)(((F12)object).b() ? 1 : 0);
                object3 = "plp screen";
                if (n10 != 0) {
                    object = ((q22_0)fragment).cb().d.M;
                    if (object != null && (object = ((ProductsList)object).getBrandDetails()) != null) {
                        object = ((BrandDetails)object).getMetaData();
                    } else {
                        n10 = 0;
                        object = null;
                        f11 = 0.0f;
                    }
                    if (object != null) {
                        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                        object6 = ((q22_0)fragment).cb().e.c;
                        Intrinsics.checkNotNull(object6);
                        String string2 = "";
                        ((GTMEvents)object).pushRemoveFromClosetWidgetEventFleek((Product)object6, (String)object3, string2);
                    }
                }
                n10 = 4;
                f11 = 5.6E-45f;
                rw_1.a(n10, null);
                object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                object2 = sq0_1.d((String)object3);
                object3 = "Delete From Closet";
                object6 = "Delete Button";
                ((GTMEvents)object).pushButtonTapEvent((String)object3, object6, (String)object2);
                object = ((q22_0)fragment).L0;
                if (object != null) {
                    object2 = ((q22_0)fragment).cb().e.c;
                    if (object2 != null) {
                        n3 = ((Product)object2).getViewHolderPos();
                    } else {
                        n3 = -1;
                        f5 = 0.0f / 0.0f;
                    }
                    ((n32_0)object).Oa(n3);
                }
            } else {
                int n14 = ((DataCallback)object).getStatus();
                if (n14 == n8) {
                    n14 = 5;
                    float f12 = 7.0E-45f;
                    rw_1.a(n14, null);
                }
            }
        }
        return Unit.a;
    }
}

