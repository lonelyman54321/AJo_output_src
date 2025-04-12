/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.OrderListFunctionalRepo;
import com.ril.ajio.myaccount.order.fragment.b;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import com.ril.ajio.services.entity.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from db
 */
public final class db_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ db_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this.b;
        var3_3 = this.a;
        switch (var3_3) {
            default: {
                var1_1 = (String)var1_1;
                var2_2 = (Function1)var2_2;
                Intrinsics.checkNotNullParameter(var2_2, "$onQueryChanged");
                Intrinsics.checkNotNullParameter(var1_1, "query");
                var2_2.invoke(var1_1);
                return Unit.a;
            }
            case 1: {
                var1_1 = (Component)var1_1;
                var4_4 = com.ril.ajio.myaccount.order.fragment.b.Companion;
                var2_2 = (b)var2_2;
                Intrinsics.checkNotNullParameter(var2_2, "this$0");
                var4_4 = var2_2.f;
                if (var4_4 != null || var1_1 == null) ** GOTO lbl56
                var4_4 = var1_1.getBanners();
                if (var4_4 == null) ** GOTO lbl24
                var3_3 = (int)var4_4.isEmpty();
                var5_6 = 1;
                if ((var3_3 ^= var5_6) == var5_6) ** GOTO lbl25
lbl24:
                // 2 sources

                if ((var3_3 = (int)var1_1.isDynamicAdsFlowEnabled()) == 0) ** GOTO lbl56
lbl25:
                // 2 sources

                var2_2.f = var1_1;
                var4_4 = OrderListFunctionalRepo.INSTANCE;
                var6_7 = var4_4.getOrderList();
                var5_6 = var6_7.size();
                var7_8 = 5;
                var8_9 = 2;
                if (var5_6 > var8_9) {
                    var6_7 = var4_4.getOrderList();
                    var9_10 = new OrderItemLine();
                    var9_10.setBannerComponent((Component)var1_1);
                    var9_10.setViewType(var7_8);
                    var1_1 = Unit.a;
                    var6_7.add(var8_9, var9_10);
                } else {
                    var6_7 = var4_4.getOrderList();
                    var10_11 = new OrderItemLine();
                    var10_11.setBannerComponent((Component)var1_1);
                    var10_11.setViewType(var7_8);
                    var6_7.add(var10_11);
                }
                var1_1 = var2_2.i;
                var2_2 = null;
                if (var1_1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRecyclerView");
                    var1_1 = null;
                }
                if ((var5_6 = (var1_1 = var1_1.getAdapter()) instanceof if2_0) != 0) {
                    var2_2 = var1_1;
                    var2_2 = (if2_0)var1_1;
                }
                if (var2_2 != null) {
                    var2_2.a = var1_1 = var4_4.getOrderList();
                    var2_2.notifyDataSetChanged();
                }
lbl56:
                // 5 sources

                return Unit.a;
            }
            case 0: 
        }
        var1_1 = (UY2)var1_1;
        var2_2 = (lq_2)var2_2;
        Intrinsics.checkNotNullParameter(var2_2, "$subCategory");
        Intrinsics.checkNotNullParameter(var1_1, "$this$semantics");
        var4_5 = var2_2.a.getInactiveAltText();
        if (var4_5 == null && (var4_5 = (var2_2 = var2_2.a).getName()) == null) {
            var4_5 = "category";
        }
        RY2.e((UY2)var1_1, var4_5);
        return Unit.a;
    }
}

