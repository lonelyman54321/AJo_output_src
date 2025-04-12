/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ReturnRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

public final class VZ1$b
implements fs0_2 {
    public final /* synthetic */ qz1_2 a;

    public VZ1$b(qz1_2 qz1_22) {
        this.a = qz1_22;
    }

    /*
     * Unable to fully structure code
     */
    public final Object c(DataCallback var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof VZ1$b$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (VZ1$b$a)var2_2;
        var5_5 = var4_4.d;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.d = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new VZ1$b$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.b;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.d;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl23
        if (var6_6 == var7_7) {
            var1_1 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl23:
            // 1 sources

            vl2_2.b(var2_2);
            var2_2 = h40_0.a;
            var9_9 = h40_0.f2();
            var6_6 = 0;
            if (var9_9 != 0) {
                var2_2 = (CartOrder)var1_1.getData();
                if (var2_2 != null && (var2_2 = var2_2.getReturnFee()) != null) {
                    var10_10 = var2_2.doubleValue();
                    var6_6 = (int)var10_10;
                } else {
                    var2_2 = (CartOrder)var1_1.getData();
                    if (var2_2 != null && (var2_2 = var2_2.getConsignmentsData()) != null && (var2_2 = (Consignment)CollectionsKt.firstOrNull((List)var2_2)) != null && (var2_2 = var2_2.getReturnRequests()) != null && (var2_2 = (ReturnRequest)CollectionsKt.firstOrNull((List)var2_2)) != null && (var2_2 = var2_2.getReturnEntries()) != null && (var2_2 = (OrderDetailLineItem)CollectionsKt.firstOrNull((List)var2_2)) != null && (var2_2 = var2_2.getEntry()) != null && (var2_2 = var2_2.getReturnFee()) != null) {
                        var2_2 = StringsKt.toIntOrNull((String)var2_2);
                    } else {
                        var9_9 = 0;
                        var2_2 = null;
                    }
                    if (var2_2 != null) {
                        var6_6 = var2_2.intValue();
                    }
                }
            }
            var2_2 = this.a;
            var2_2.A0 = var6_6;
            var2_2 = var2_2.B;
            var4_4.a = this;
            var4_4.d = var7_7;
            if ((var1_1 = var2_2.emit(var1_1, (f80_0)var4_4)) == var8_8) {
                return var8_8;
            }
            var1_1 = this;
        }
        var2_2 = var1_1.a.c;
        var4_4 = Boolean.FALSE;
        var2_2.setValue(var4_4);
        var2_2 = h40_0.a;
        var2_2 = h40_0.F();
        var4_4 = "callout2";
        var9_9 = var2_2.optBoolean((String)var4_4);
        var1_1 = var1_1.a;
        if (var9_9 != 0 || (var9_9 = h40_0.f2()) != 0 && (var9_9 = var1_1.A0) > 0) {
            AJIOApplication.Companion.getClass();
            var4_4 = AJIOApplication$a.a();
            var2_2 = new jo_2((Context)var4_4);
            var2_2 = var2_2.f();
            var4_4 = (String)var1_1.d.getValue();
            var1_1.A((String)var2_2, (String)var4_4);
        }
        return Unit.a;
    }
}

