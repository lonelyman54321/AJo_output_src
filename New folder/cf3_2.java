/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Cf3
 */
public final class cf3_2
implements h23_0 {
    public final h23_0 a;
    public final Function2 b;

    public cf3_2(i23_0 i23_02, uj_1 uj_12) {
        this.a = i23_02;
        this.b = uj_12;
    }

    public final List c() {
        return this.a.c();
    }

    /*
     * Unable to fully structure code
     */
    public final Object collect(fs0_2 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof cf3$a_1;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (cf3$a_1)var2_2;
        var5_5 = var4_4.c;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.c = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new cf3$a_1(this, (f80_0)var2_2);
        }
        var2_2 = var4_4.a;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.c;
        var7_7 = 1;
        if (var6_6 != 0) {
            if (var6_6 != var7_7) {
                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var1_1;
            }
            vl2_2.b(var2_2);
        } else {
            vl2_2.b(var2_2);
            var9_9 = this.b;
            var2_2 = new bf3_2((fs0_2)var1_1, var9_9);
            var4_4.c = var7_7;
            var1_1 = this.a.collect((fs0_2)var2_2, var4_4);
            if (var1_1 == var8_8) {
                return var8_8;
            }
        }
        var1_1 = new KotlinNothingValueException();
        throw var1_1;
    }
}

