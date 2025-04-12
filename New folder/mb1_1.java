/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from mb1
 */
public final class mb1_1 {
    /*
     * Unable to fully structure code
     */
    public static final Object a(jb1_2 var0, Charset var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof mb1$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (mb1$a)var2_2;
        var5_5 = var4_4.c;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.c = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new h80_0((f80_0)var2_2);
        }
        var2_2 = var4_4.b;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.c;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl23
        if (var6_6 == var7_7) {
            var0 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl23:
            // 1 sources

            vl2_2.b(var2_2);
            Intrinsics.checkNotNullParameter(var0, "<this>");
            var2_2 = oa1_0.b((ma1_0)var0);
            var6_6 = 0;
            var9_9 = null;
            var2_2 = var2_2 != null ? m70_0.a((b41_0)var2_2) : null;
            if (var2_2 != null) {
                var1_1 = var2_2;
            }
            var1_1 = var1_1.newDecoder();
            var0 = var0.a();
            var2_2 = b93_0.class;
            var10_10 = Reflection.getOrCreateKotlinClass(var2_2);
            try {
                var9_9 = Reflection.typeOf(var2_2);
            }
            catch (Throwable v0) {}
            var2_2 = new at3_0(var10_10, var9_9);
            var4_4.a = var1_1;
            var4_4.c = var7_7;
            var2_2 = var0.a((at3_0)var2_2, var4_4);
            if (var2_2 == var8_8) {
                return var8_8;
            }
            var0 = var1_1;
        }
        if (var2_2 != null) {
            var2_2 = (b93_0)var2_2;
            Intrinsics.checkNotNull(var0);
            return hz0_2.c((CharsetDecoder)var0, (b93_0)var2_2, -1 >>> 1);
        }
        var0 = new NullPointerException("null cannot be cast to non-null type kotlinx.io.Source");
        throw var0;
    }

    public static final bb1_2 b(jb1_2 jb1_22) {
        Intrinsics.checkNotNullParameter(jb1_22, "<this>");
        return jb1_22.a().c();
    }
}

