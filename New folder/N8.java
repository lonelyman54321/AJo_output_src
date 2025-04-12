/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.google.gson.Gson;
import com.ril.ajio.data.model.ClosetComponentTimeTrack;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Order.orderhistory.OrderHistory;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import com.ril.ajio.services.data.Order.orderhistory.Orders;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class N8
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ N8(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        block13: {
            block14: {
                Object object2;
                Object object3;
                block15: {
                    Object object4;
                    String string2;
                    Object object5;
                    block17: {
                        int n3;
                        int n4;
                        Object object6;
                        block16: {
                            object3 = this.b;
                            object2 = "this$0";
                            int n7 = this.a;
                            switch (n7) {
                                default: {
                                    Object object7 = object;
                                    object7 = (Throwable)object;
                                    object3 = (op2_2)object3;
                                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                                    object = ((op2_2)object3).l;
                                    ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                                    Intrinsics.checkNotNull(object7);
                                    object3 = apiErrorRepo.handleApiException((Throwable)object7, "PAYMENT_PayNowByWallet", true, "single page checkout", "Forward");
                                    ((LiveData)object).k(object3);
                                    return Unit.a;
                                }
                                case 0: 
                            }
                            object = (DataCallback)object;
                            object3 = (q9_0)object3;
                            Intrinsics.checkNotNullParameter(object3, (String)object2);
                            object2 = cp_1.Companion;
                            int n8 = nn_2.b((cp$a)object2, (DataCallback)object);
                            if (n8 == 0) break block13;
                            Intrinsics.checkNotNull(object);
                            n8 = ((DataCallback)object).getStatus();
                            if (n8 != 0) break block14;
                            object = (OrderHistory)((DataCallback)object).getData();
                            object2 = ((q9_0)object3).n;
                            n7 = 0;
                            if (object != null) {
                                int n10;
                                if (object2 == null) {
                                    object2 = new ArrayList();
                                } else {
                                    ((ArrayList)object2).clear();
                                }
                                object5 = ((OrderHistory)object).getOrders();
                                if (object5 != null && (n10 = ((ArrayList)(object5 = ((OrderHistory)object).getOrders())).size()) != 0) {
                                    int n14;
                                    object5 = new ArrayList();
                                    string2 = null;
                                    for (int i3 = 0; i3 < (n14 = ((ArrayList)(object4 = ((OrderHistory)object).getOrders())).size()); ++i3) {
                                        object4 = (Orders)((OrderHistory)object).getOrders().get(i3);
                                        if (object4 == null || (object6 = ((Orders)object4).getOrderItemLines()) == null || (n4 = ((ArrayList)(object6 = ((Orders)object4).getOrderItemLines())).size()) == 0) continue;
                                        object6 = ((Orders)object4).getOrderItemLines();
                                        n4 = ((ArrayList)object6).size();
                                        for (int i8 = 0; i8 < n4; ++i8) {
                                            OrderItemLine orderItemLine = (OrderItemLine)((Orders)object4).getOrderItemLines().get(i8);
                                            String string3 = ((Orders)object4).getPaymentMode();
                                            orderItemLine.setPaymentMode(string3);
                                            string3 = ((Orders)object4).getOrderDate();
                                            orderItemLine.setOrderDate(string3);
                                            float f5 = ((Orders)object4).getDiscount();
                                            orderItemLine.setDiscount(f5);
                                            f5 = ((Orders)object4).getTotalAmount();
                                            orderItemLine.setTotalAmount(f5);
                                            f5 = ((Orders)object4).getShippingCharge();
                                            orderItemLine.setShippingCharge(f5);
                                            ((ArrayList)object5).add(orderItemLine);
                                        }
                                    }
                                } else {
                                    n10 = 0;
                                    object5 = null;
                                }
                                if (object5 != null) {
                                    ((ArrayList)object2).addAll(object5);
                                }
                            }
                            ((q9_0)object3).n = object2;
                            if (object != null && (object2 = ((OrderHistory)object).getOrders()) != null && (n3 = ((ArrayList)(object = ((OrderHistory)object).getOrders())).size()) != 0) break block13;
                            object = (ky1_0)((q9_0)object3).R0.getValue();
                            object3 = k7.i("ddMMyyyy");
                            object.getClass();
                            Intrinsics.checkNotNullParameter(object3, "date4Closet");
                            object5 = ((ky1_0)object).h;
                            string2 = "closet_card_in_home";
                            object2 = ((sw_0)object5).getPreference(string2, "");
                            if (object2 == null) break block15;
                            object4 = new Gson();
                            object6 = ClosetComponentTimeTrack.class;
                            if ((object2 = (ClosetComponentTimeTrack)((Gson)object4).fromJson((String)object2, (Class)object6)) != null) break block16;
                            object = new ClosetComponentTimeTrack((String)object3, 0);
                            if ((object = ((Gson)object4).toJson(object)) != null) {
                                ((sw_0)object5).putPreference(string2, (String)object);
                            }
                            break block15;
                        }
                        object6 = ((ClosetComponentTimeTrack)object2).getDdMmYyyy();
                        n4 = Intrinsics.areEqual(object6, object3);
                        if (n4 == 0) break block17;
                        object3 = z40_0.Companion;
                        object = ((Hj)object).getApplication();
                        object3.getClass();
                        object = z40$a.a((Context)object).a;
                        object3 = "android_closet_card_max_click";
                        long l2 = ((ao0_0)object).h((String)object3);
                        n3 = (int)l2;
                        int n15 = ((ClosetComponentTimeTrack)object2).getCount();
                        if (n15 >= n3) break block13;
                        break block15;
                    }
                    ((ClosetComponentTimeTrack)object2).setDdMmYyyy((String)object3);
                    ((ClosetComponentTimeTrack)object2).setCount(0);
                    object = ((Gson)object4).toJson(object2);
                    if (object != null) {
                        ((sw_0)object5).putPreference(string2, (String)object);
                    }
                }
                object = yn3_0.a;
                object3 = "CLOSET active orders check - can show closet";
                object2 = new Object[]{};
                ((yn3$a)object).a((String)object3, (Object[])object2);
                break block13;
            }
            ((DataCallback)object).getStatus();
        }
        return Unit.a;
    }
}

