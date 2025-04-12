/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.database.entity.SearchEntry;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NU2$a
 */
public final class nu2$a_0
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;

    public nu2$a_0(fs0_2 fs0_22) {
        this.a = fs0_22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof NU2$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (NU2$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new NU2$a$a(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.b;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl22
        if (var6_6 == var7_7) {
            vl2_2.b(var2_2);
        } else {
            var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var1_1;
lbl22:
            // 1 sources

            vl2_2.b(var2_2);
            var1_1 = (LU2)var1_1;
            var2_2 = var1_1.b;
            if (var2_2 != null && !(var9_9 = var2_2.isEmpty())) {
                var2_2 = var1_1.a;
                if (var2_2 != null && (var2_2 = var2_2.searchDao()) != null) {
                    var10_10 = var1_1.b;
                    Intrinsics.checkNotNull(var10_10);
                    var6_6 = var10_10.size() - var7_7;
                    var2_2 = var2_2.loadRowsExceptFirst(var6_6);
                } else {
                    var9_9 = false;
                    var2_2 = null;
                }
                var10_10 = new List<Object>();
                var11_11 = z40_0.Companion;
                var11_11 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var11_11).a;
                var12_12 = var11_11.g("search_history_duration");
                var13_13 = Calendar.getInstance();
                var14_14 = var13_13.getTimeInMillis();
                if (var2_2 != null) {
                    var2_2 = var2_2.iterator();
                    while (var16_15 = var2_2.hasNext()) {
                        var17_16 = (SearchEntry)var2_2.next();
                        var18_17 = var17_16.getTime();
                        var18_17 = var14_14 - var18_17;
                        var20_18 = TimeUnit.MILLISECONDS;
                        cfr_temp_0 = (var18_17 = var20_18.toDays(var18_17)) - (var21_19 = (long)var12_12);
                        var23_20 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var23_20 /* !! */  <= 0) continue;
                        var17_16 = var17_16.getSearchText();
                        var10_10.add(var17_16);
                    }
                }
                var1_1.c = var10_10;
            }
            var4_4.b = var7_7;
            var2_2 = this.a;
            if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

