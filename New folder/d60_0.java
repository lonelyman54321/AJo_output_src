/*
 * Decompiled with CFR 0.152.
 */
import io.ktor.serialization.ContentConvertException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from D60
 */
public final class d60_0 {
    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Object a(ArrayList var0, uf_1 var1_1, at3_0 var2_2, Charset var3_3, f80_0 var4_4) {
        var5_5 = var4_4 instanceof b60_0;
        if (!var5_5) ** GOTO lbl-1000
        var6_6 = var4_4;
        var6_6 = (b60_0)var4_4;
        var7_7 = var6_6.d;
        var8_8 = -1 << -1;
        var9_9 = var7_7 & var8_8;
        if (var9_9 != 0) {
            var6_6.d = var7_7 -= var8_8;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = new h80_0((f80_0)var4_4);
        }
        var4_4 = var6_6.c;
        var10_10 = j90_0.COROUTINE_SUSPENDED;
        var8_8 = var6_6.d;
        var9_9 = 1;
        if (var8_8 == 0) ** GOTO lbl24
        if (var8_8 == var9_9) {
            var2_2 = var6_6.b;
            var1_1 = var6_6.a;
            vl2_2.b(var4_4);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl24:
            // 1 sources

            vl2_2.b(var4_4);
            var4_4 = new ns0_1((Iterable)var0);
            var0 = new a60_0((ns0_1)var4_4, (Charset)var3_3, var2_2, (uf_1)var1_1);
            var3_3 = new c60_0((uf_1)var1_1, null);
            var6_6.a = var1_1;
            var6_6.b = var2_2;
            var6_6.d = var9_9;
            var4_4 = ms0_1.l((es0_2)var0, (Function2)var3_3, (f80_0)var6_6);
            if (var4_4 == var10_10) {
                return var10_10;
            }
        }
        if (var4_4 != null) return var4_4;
        var11_11 = var1_1.i();
        if (var11_11 == 0) return var1_1;
        var0 = var2_2.b;
        if (var0 != null && (var11_11 = var0.isMarkedNullable()) == var9_9) {
            return g52_0.a;
        }
        var1_1 = new StringBuilder("No suitable converter found for ");
        var1_1.append(var2_2);
        var1_1 = var1_1.toString();
        var0 = new ContentConvertException((String)var1_1, null);
        throw var0;
    }
}

