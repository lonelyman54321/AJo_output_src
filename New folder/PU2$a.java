/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.entity.SearchEntry;
import kotlin.Unit;

public final class PU2$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ SearchEntry b;

    public PU2$a(fs0_2 fs0_22, SearchEntry searchEntry) {
        this.a = fs0_22;
        this.b = searchEntry;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof PU2$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (PU2$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new PU2$a$a(this, (f80_0)var2_2);
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
            var1_1 = (AppDataBase)var1_1;
            var2_2 = var1_1.searchDao();
            var9_9 = this.b;
            var2_2.insertSearch((SearchEntry)var9_9);
            var1_1 = var1_1.searchDao();
            var2_2 = od3_2.a();
            var9_9 = h40_0.a;
            var9_9 = h40_0.z0();
            var10_10 = "recentSearchMaxLimit";
            var6_6 = (int)var9_9.has(var10_10);
            if (var6_6 != 0 && (var6_6 = (var9_9 = h40_0.z0()).getInt(var10_10)) > 0) {
                var9_9 = h40_0.z0();
                var6_6 = var9_9.getInt(var10_10);
            } else {
                var6_6 = 10;
            }
            var1_1.removeOldEntries((String)var2_2, var6_6);
            var1_1 = Boolean.TRUE;
            var4_4.b = var7_7;
            var2_2 = this.a;
            var1_1 = var2_2.emit(var1_1, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

