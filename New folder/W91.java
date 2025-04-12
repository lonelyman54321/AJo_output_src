/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;

public final class W91 {
    public static final ux1_2 a = Q93.a("io.ktor.client.plugins.HttpCallValidator");
    public static final nv_2 b;
    public static final xq_2 c;

    static {
        Object object = W91$a.a;
        int n3 = 1;
        Object object2 = new oc_2(n3);
        Object object3 = "HttpResponseValidator";
        b = td0_2.a((String)object3, (Function0)object, (Function1)object2);
        object = Reflection.getOrCreateKotlinClass(Boolean.class);
        object2 = Boolean.TYPE;
        try {
            object2 = Reflection.typeOf((Class)object2);
        }
        catch (Throwable throwable) {
            object2 = null;
        }
        object3 = new at3_0((yn1_2)object, (kn1_1)object2);
        c = object = new xq_2("ExpectSuccessAttributeKey", (at3_0)object3);
    }

    /*
     * Unable to fully structure code
     */
    public static final Unit a(List var0, Throwable var1_1, bb1_2 var2_2, f80_0 var3_3) {
        var4_4 = var3_3 instanceof y91_0;
        if (!var4_4) ** GOTO lbl-1000
        var5_5 = var3_3;
        var5_5 = (y91_0)var3_3;
        var6_6 = var5_5.e;
        var7_7 = -1 << -1;
        var8_8 = var6_6 & var7_7;
        if (var8_8 != 0) {
            var5_5.e = var6_6 -= var7_7;
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = new h80_0((f80_0)var3_3);
        }
        var3_3 = var5_5.d;
        var9_9 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var5_5.e;
        var7_7 = 2;
        var8_8 = 1;
        if (var6_6 == 0) ** GOTO lbl29
        if (var6_6 == var8_8 || var6_6 == var7_7) {
            var0 = var5_5.c;
            var1_1 = var5_5.b;
            var2_2 = var5_5.a;
            vl2_2.b(var3_3);
            var10_10 = var2_2;
            var2_2 = var1_1;
            var1_1 = var10_10;
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl29:
            // 1 sources

            vl2_2.b(var3_3);
            var3_3 = new StringBuilder("Processing exception ");
            var3_3.append(var1_1);
            var3_3.append(" for request ");
            var9_9 = var2_2.getUrl();
            var3_3.append(var9_9);
            var3_3 = var3_3.toString();
            var9_9 = W91.a;
            var9_9.g((String)var3_3);
            var0 = ((Iterable)var0).iterator();
        }
        var11_11 = var0.hasNext();
        if (var11_11) {
            var3_3 = (I21)var0.next();
            var6_6 = var3_3 instanceof tc0_2;
            if (var6_6 == 0) {
                var6_6 = var3_3 instanceof yj2_2;
                if (var6_6 != 0) {
                    ((yj2_2)var3_3).getClass();
                    var5_5.a = var1_1;
                    var5_5.b = var2_2;
                    var5_5.c = var0;
                    var5_5.e = var7_7;
                    throw null;
                }
                var0 = new NoWhenBranchMatchedException();
                throw var0;
            }
            ((tc0_2)var3_3).getClass();
            var5_5.a = var1_1;
            var5_5.b = var2_2;
            var5_5.c = var0;
            var5_5.e = var8_8;
            throw null;
        }
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object b(List var0, jb1_2 var1_1, f80_0 var2_2) {
        block5: {
            var3_3 = var2_2 instanceof z91_0;
            if (!var3_3) ** GOTO lbl-1000
            var4_4 = var2_2;
            var4_4 = (z91_0)var2_2;
            var5_5 = var4_4.d;
            var6_6 = -1 << -1;
            var7_7 = var5_5 & var6_6;
            if (var7_7 != 0) {
                var4_4.d = var5_5 -= var6_6;
            } else lbl-1000:
            // 2 sources

            {
                var4_4 = new h80_0((f80_0)var2_2);
            }
            var2_2 = var4_4.c;
            var8_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
            var6_6 = var4_4.d;
            var7_7 = 1;
            if (var6_6 == 0) ** GOTO lbl24
            if (var6_6 == var7_7) {
                var0 = var4_4.b;
                var1_1 = var4_4.a;
                vl2_2.b(var2_2);
            } else {
                var0 = new Iterator<T>("call to 'resume' before 'invoke' with coroutine");
                throw var0;
lbl24:
                // 1 sources

                vl2_2.b(var2_2);
                var2_2 = new StringBuilder("Validating response for request ");
                var9_9 = var1_1.a().c().getUrl();
                var2_2.append(var9_9);
                var2_2 = var2_2.toString();
                var9_9 = W91.a;
                var9_9.g((String)var2_2);
                var0 = ((Iterable)var0).iterator();
            }
            while (var10_10 = var0.hasNext()) {
                var2_2 = (Function2)var0.next();
                var4_4.a = var1_1;
                var4_4.b = var0;
                var4_4.d = var7_7;
                if ((var2_2 = var2_2.invoke(var1_1, var4_4)) != var8_8 /* !! */ ) continue;
                break block5;
            }
            var8_8 /* !! */  = Unit.a;
        }
        return var8_8 /* !! */ ;
    }
}

