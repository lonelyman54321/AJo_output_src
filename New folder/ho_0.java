/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.FacebookSdk;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ho
 */
public final class ho_0
implements kJ0$a {
    public static Object a(ReturnOrderItemDetails returnOrderItemDetails, int n3) {
        Intrinsics.checkNotNull(returnOrderItemDetails);
        return returnOrderItemDetails.getConsignment().getEntries().get(n3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(boolean var1_1) {
        if (var1_1 == false) return;
        var2_2 = sg1_1.a;
        var2_2 = sg1_1.class;
        var3_3 = td0.b(var2_2);
        if (var3_3) {
            return;
        }
        var4_4 = sg1_1.a;
        var4_4.getClass();
        var5_6 = td0.b(var4_4);
        if (!var5_6) ** GOTO lbl17
        ** GOTO lbl26
        {
            catch (Throwable var4_5) {
                td0.a(var2_2, var4_5);
                return;
            }
lbl17:
            // 1 sources

            try {
                var6_7 = FacebookSdk.b();
                var6_7 = dl0_2.k((String)var6_7, false);
                if (var6_7 != null) {
                    var6_7 = var6_7.q;
                    sg1_1.c = var6_7;
                }
                ** GOTO lbl26
            }
            catch (Throwable var6_8) {}
            {
                td0.a(var4_4, var6_8);
lbl26:
                // 3 sources

                var4_4 = sg1_1.c;
                if (var4_4 == null) return;
                sg1_1.b = var3_3 = true;
                return;
            }
        }
    }
}

