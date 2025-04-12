/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from Px1
 */
public final class px1_1 {
    public static final void a(Appendable appendable, String string2, String string3) {
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        StringBuilder stringBuilder = new StringBuilder("-> ");
        stringBuilder.append(string2);
        stringBuilder.append(": ");
        stringBuilder.append(string3);
        string2 = stringBuilder.toString();
        appendable.append(string2).append('\n');
    }

    public static final void b(Appendable appendable, Set object, List list) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(appendable, "<this>");
        Intrinsics.checkNotNullParameter(object, "headers");
        Intrinsics.checkNotNullParameter(list, "sanitizedHeaders");
        object = CollectionsKt.k0((Iterable)object);
        Object object2 = new Object();
        object = ((Iterable)CollectionsKt.e0((Iterable)object, (Comparator)object2)).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            object2 = (List)object2.getValue();
            Iterator iterator = list;
            iterator = ((Iterable)list).iterator();
            boolean bl3 = iterator.hasNext();
            if (!bl3) {
                Object object3 = object2;
                object3 = (Iterable)object2;
                String string3 = "; ";
                int n3 = 62;
                object2 = CollectionsKt.R((Iterable)object3, string3, null, null, null, n3);
                px1_1.a(appendable, string2, (String)object2);
                continue;
            }
            ((xr2_1)iterator.next()).getClass();
            throw null;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object c(StringBuilder var0, k70_0 var1_1, uf_1 var2_2, f80_0 var3_3) {
        block12: {
            block11: {
                block13: {
                    var4_4 = var3_3 instanceof px1$b_0;
                    if (!var4_4) ** GOTO lbl-1000
                    var5_5 = var3_3;
                    var5_5 = (px1$b_0)var3_3;
                    var6_6 = var5_5.d;
                    var7_7 = -1 << -1;
                    var8_8 = var6_6 & var7_7;
                    if (var8_8 != 0) {
                        var5_5.d = var6_6 -= var7_7;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var5_5 = new h80_0((f80_0)var3_3);
                    }
                    var3_3 = var5_5.c;
                    var9_9 = j90_0.COROUTINE_SUSPENDED;
                    var7_7 = var5_5.d;
                    var8_8 = 1;
                    if (var7_7 == 0) break block13;
                    if (var7_7 != var8_8) {
                        var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var0;
                    }
                    var0 = var5_5.b;
                    var1_1 = var5_5.a;
                    try {
                        vl2_2.b(var3_3);
                        ** GOTO lbl-1000
                    }
                    catch (Throwable v0) {
                        var0 = var1_1;
                        break block11;
                    }
                }
                vl2_2.b(var3_3);
                var3_3 = new StringBuilder("BODY Content-Type: ");
                var3_3.append(var1_1);
                var3_3 = var3_3.toString();
                var0.append((String)var3_3);
                var10_11 = '\n';
                var0.append(var10_11);
                var11_12 = "BODY START";
                var0.append(var11_12);
                var0.append(var10_11);
                if (var1_1 == null || (var1_1 = m70_0.a((b41_0)var1_1)) == null) {
                    var1_1 = Charsets.UTF_8;
                }
                try {
                    var5_5.a = var0;
                    var5_5.b = var1_1;
                    var5_5.d = var8_8;
                    var3_3 = wf_1.k(var2_2, var5_5);
                    if (var3_3 == var9_9) {
                        return var9_9;
                    }
                    var12_10 = var1_1;
                    var1_1 = var0;
                    var0 = var12_10;
                }
                catch (Throwable v1) {}
lbl-1000:
                // 2 sources

                {
                    var3_3 = (b93_0)var3_3;
                    var13_13 = 2;
                    var0 = be3_1.a((b93_0)var3_3, (Charset)var0, var13_13);
                    break block12;
                }
            }
            var12_10 = null;
            var1_1 = var0;
            var0 = null;
        }
        if (var0 == null) {
            var0 = "[response body omitted]";
        }
        var1_1.append((String)var0);
        var1_1.append("\nBODY END");
        return Unit.a;
    }

    public static final void d(StringBuilder stringBuilder, jb1_2 object, fw1_2 object2, List list) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(stringBuilder, "log");
        Intrinsics.checkNotNullParameter(object, "response");
        Intrinsics.checkNotNullParameter(object2, "level");
        CharSequence charSequence = "sanitizedHeaders";
        Intrinsics.checkNotNullParameter(list, (String)charSequence);
        boolean bl3 = object2.getInfo();
        char c2 = '\n';
        if (bl3) {
            charSequence = new StringBuilder("RESPONSE: ");
            Object object3 = ((jb1_2)object).e();
            ((StringBuilder)charSequence).append(object3);
            charSequence = ((StringBuilder)charSequence).toString();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(c2);
            charSequence = new StringBuilder("METHOD: ");
            object3 = ((jb1_2)object).a().c().getMethod();
            ((StringBuilder)charSequence).append(object3);
            charSequence = ((StringBuilder)charSequence).toString();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(c2);
            charSequence = new StringBuilder("FROM: ");
            object3 = ((jb1_2)object).a().c().getUrl();
            ((StringBuilder)charSequence).append(object3);
            charSequence = ((StringBuilder)charSequence).toString();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(c2);
        }
        if (bl2 = object2.getHeaders()) {
            object2 = "COMMON HEADERS";
            stringBuilder.append((String)object2);
            stringBuilder.append(c2);
            object = object.getHeaders().entries();
            px1_1.b(stringBuilder, (Set)object, list);
        }
    }
}

