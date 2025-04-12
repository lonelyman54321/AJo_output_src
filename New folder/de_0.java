/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.material.AnchoredDragFinishedSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.d;

/*
 * Renamed from De
 */
public final class de_0 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(Function0 var0, Function2 var1_1, f80_0 var2_2) {
        block10: {
            var3_3 = var2_2 instanceof ee_0;
            if (!var3_3) ** GOTO lbl-1000
            var4_4 = var2_2;
            var4_4 = (ee_0)var2_2;
            var5_5 = var4_4.b;
            var6_6 = -1 << -1;
            var7_7 = var5_5 & var6_6;
            if (var7_7 != 0) {
                var4_4.b = var5_5 -= var6_6;
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = new h80_0((f80_0)var2_2);
            }
            var2_2 = var4_4.a;
            var8_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
            var6_6 = var4_4.b;
            var7_7 = 1;
            if (var6_6 != 0) {
                if (var6_6 == var7_7) {
                    vl2_2.b(var2_2);
                    break block10;
                }
                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var0;
            }
            vl2_2.b(var2_2);
            var6_6 = 0;
            try {
                var2_2 = new fe_1((Function0)var0, var1_1, null);
            }
            catch (AnchoredDragFinishedSignal v0) {}
            var4_4.b = var7_7;
            var0 = d.c((Function2)var2_2, var4_4);
            if (var0 != var8_8 /* !! */ ) break block10;
        }
        var8_8 /* !! */  = Unit.a;
        return var8_8 /* !! */ ;
    }

    public static final Object b(Re object, Object object2, float f5, f80_0 f80_02) {
        aS1 aS12 = aS1.Default;
        De$a de$a = new De$a((Re)object, f5, null);
        if ((object = ((Re)object).b(object2, aS12, de$a, f80_02)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

