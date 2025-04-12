/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.IFilter;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ReturnRequest;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from eN0
 */
public final class en0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ en0_2(Object object, int n3, Object object2, Object object3) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var2_2 = this.a;
        var1_1 = (dt1_0)var1_1;
        switch (var2_2) {
            default: {
                var3_3 = (qz1_2)this.b;
                Intrinsics.checkNotNullParameter(var3_3, "$viewModel");
                Intrinsics.checkNotNullParameter(sz_0.a, "$this_Column");
                var4_5 = (Function0)this.d;
                Intrinsics.checkNotNullParameter(var4_5, "$onCloseSheetButtonClicked");
                Intrinsics.checkNotNullParameter(var1_1, "$this$LazyColumn");
                var3_3.getClass();
                var5_7 = new ArrayList<Serializable>();
                var6_9 = (SelectedOrderItem)this.c;
                var7_11 = false;
                var8_13 = null;
                var9_15 = var6_9 != null ? var6_9.getConsignment() : null;
                if (var6_9 != null && (var6_9 = var6_9.getCartEntry()) != null && (var6_9 = var6_9.getProduct()) != null) {
                    var6_9 = var6_9.getCode();
                } else {
                    var10_17 = 0;
                    var6_9 = null;
                }
                var11_19 = true;
                if (var9_15 == null || (var9_15 = var9_15.getReturnRequests()) == null) ** GOTO lbl44
                var9_15 = var9_15.iterator();
                while (var12_20 = var9_15.hasNext()) {
                    var13_21 = (ReturnRequest)var9_15.next();
                    var14_22 = var13_21.getReturnStatus();
                    var16_24 = kotlin.text.b.i((String)var14_22, var15_23 = "DELIVERED", var11_19);
                    if (!var16_24 && !(var16_24 = kotlin.text.b.i((String)(var14_22 = var13_21.getReturnStatus()), var15_23 = "RETURN CANCELLED", var11_19))) continue;
                    var14_22 = var13_21.getReturnCancelledEntries();
                    if (var14_22 == null) ** GOTO lbl-1000
                    var15_23 = null;
                    if ((var14_22 = (OrderDetailLineItem)var14_22.get(0)) != null && (var14_22 = var14_22.getEntry()) != null && (var14_22 = var14_22.getProduct()) != null) {
                        var14_22 = var14_22.getCode();
                    } else lbl-1000:
                    // 2 sources

                    {
                        var16_24 = false;
                        var14_22 = null;
                    }
                    if (var6_9 == null || (var16_24 = var6_9.equals(var14_22)) != var11_19) continue;
                    Intrinsics.checkNotNull(var13_21);
                    var5_7.add(var13_21);
                }
lbl44:
                // 2 sources

                var10_17 = var5_7.size();
                var13_21 = oc2_1.c;
                var9_15 = new pc2_1((Function1)var13_21, var5_7);
                var4_5 = (md2_2)var4_5;
                var13_21 = new qc2_1(var5_7, (qz1_2)var3_3, (md2_2)var4_5);
                var3_3 = new u10(-632812321, var13_21, var11_19);
                var1_1.a(var10_17, null, (Function1)var9_15, (u10)var3_3);
                return Unit.a;
            }
            case 0: 
        }
        var3_4 = (ob0_1)this.c;
        Intrinsics.checkNotNullParameter(var3_4, "$viewModel");
        var4_6 = (p83_0)this.d;
        Intrinsics.checkNotNullParameter(var4_6, "$filters");
        Intrinsics.checkNotNullParameter(var1_1, "$this$LazyColumn");
        var5_8 = null;
        var6_10 = (IFilter)this.b;
        if (var6_10 != null) {
            var8_14 = var6_10.getCouponAttributeValues();
        } else {
            var7_12 = 0;
            var8_14 = null;
        }
        if (var8_14 != null) {
            var8_14 = var6_10.getCouponAttributeValues();
            Intrinsics.checkNotNull(var8_14);
            var7_12 = var8_14.size();
            var9_16 = new gN0$b((ob0_1)var3_4, var4_6, var6_10);
            var10_18 = true;
            var3_4 = new u10(-558327987, var9_16, var10_18);
            var17_25 = 6;
            bt1.b((dt1_0)var1_1, var7_12, null, (u10)var3_4, var17_25);
        }
        return Unit.a;
    }
}

