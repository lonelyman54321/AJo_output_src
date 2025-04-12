/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.AppDataBase;
import kotlin.Unit;

public final class RU2$a
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public RU2$a(fs0_2 fs0_22, String string2, String string3) {
        this.a = fs0_22;
        this.b = string2;
        this.c = string3;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof RU2$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (RU2$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new RU2$a$a(this, (f80_0)var2_2);
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
            var9_9 = od3_2.a();
            var10_10 = this.b;
            var11_11 = this.c;
            var12_12 = var2_2.updateSearchWIthImgUrl(var10_10, var11_11, var9_9);
            if (var12_12 == 0 && (var2_2 = var1_1.searchDao().getLastEnteredRow()) != null && ((var9_9 = var2_2.getImgUrl()) == null || (var6_6 = var9_9.length()) == 0)) {
                var1_1 = var1_1.searchDao();
                var2_2 = var2_2.getSearchText();
                var9_9 = od3_2.a();
                var1_1.updateSearchWIthImgUrl(var10_10, (String)var2_2, var9_9);
            }
            var1_1 = Boolean.TRUE;
            var4_4.b = var7_7;
            var2_2 = this.a;
            if ((var1_1 = var2_2.emit(var1_1, var4_4)) == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

