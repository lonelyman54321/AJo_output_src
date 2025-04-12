/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.entity.ListShareProductExperience;
import java.util.List;
import kotlin.Unit;

/*
 * Renamed from N23$a
 */
public final class n23$a_0
implements fs0_2 {
    public final /* synthetic */ fs0_2 a;
    public final /* synthetic */ List b;

    public n23$a_0(fs0_2 fs0_22, List list) {
        this.a = fs0_22;
        this.b = list;
    }

    /*
     * Unable to fully structure code
     */
    public final Object emit(Object var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof N23$a$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (N23$a$a)var2_2;
        var5_5 = var4_4.b;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7) {
            var4_4.b = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new N23$a$a(this, (f80_0)var2_2);
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
            var2_2 = this.b;
            if (var2_2 != null) {
                var9_9 = var2_2;
                var9_9 = ((Iterable)var2_2).iterator();
                while (var10_10 = var9_9.hasNext()) {
                    var11_11 = (ListShareProductExperience)var9_9.next();
                    var11_11.setDeleted((boolean)var7_7);
                }
            }
            var12_12 = var1_1.shareProductExperienceDao().updateSharedClosetProduct((List)var2_2);
            var2_2 = new Integer(var12_12);
            var4_4.b = var7_7;
            var1_1 = this.a.emit(var2_2, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        return Unit.a;
    }
}

