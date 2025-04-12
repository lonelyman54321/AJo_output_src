/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.HashMap;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.i;
import kotlinx.coroutines.i$a;

/*
 * Renamed from tD2
 */
public final class td2_0
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ td2_0(int n3, Serializable serializable) {
        this.a = n3;
        this.b = serializable;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1, Object var2_2) {
        var3_3 = this.a;
        var1_1 = (Integer)var1_1;
        switch (var3_3) {
            default: {
                var3_3 = var1_1.intValue();
                var2_2 = (CoroutineContext$Element)var2_2;
                var1_1 = var2_2.getKey();
                var4_4 = ((yr2_2)this.b).b.get((CoroutineContext$a)var1_1);
                var5_6 = i$a.a;
                if (var1_1 == var5_6) ** GOTO lbl13
                var6_7 = var2_2 != var4_4 ? -1 << -1 : var3_3 + 1;
                ** GOTO lbl28
lbl13:
                // 1 sources

                var4_4 = (i)var4_4;
                var1_1 = "null cannot be cast to non-null type kotlinx.coroutines.Job";
                Intrinsics.checkNotNull(var2_2, (String)var1_1);
                var2_2 = (i)var2_2;
                while (true) {
                    var6_7 = 0;
                    var1_1 = null;
                    if (var2_2 != null) ** GOTO lbl23
                    var2_2 = null;
                    ** GOTO lbl24
lbl23:
                    // 1 sources

                    if (var2_2 != var4_4 && (var7_8 = var2_2 instanceof ut2_2)) ** GOTO lbl41
lbl24:
                    // 2 sources

                    if (var2_2 != var4_4) ** GOTO lbl29
                    if (var4_4 != null) {
                        ++var3_3;
                    }
                    var6_7 = var3_3;
lbl28:
                    // 2 sources

                    return var6_7;
lbl29:
                    // 1 sources

                    var8_9 = new StringBuilder("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
                    var8_9.append(var2_2);
                    var8_9.append(", expected child of ");
                    var8_9.append(var4_4);
                    var8_9.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                    var2_2 = var8_9.toString().toString();
                    var1_1 = new IllegalStateException((String)var2_2);
                    throw var1_1;
lbl41:
                    // 1 sources

                    var2_2 = (ut2_2)var2_2;
                    var5_6 = JobSupport.b;
                    if ((var2_2 = (ju_2)var5_6.get(var2_2)) != null) {
                        var1_1 = var2_2.getParent();
                    }
                    var2_2 = var1_1;
                }
            }
            case 0: 
        }
        var1_1.intValue();
        var2_2 = (Integer)var2_2;
        var2_2.intValue();
        var4_5 = (HashMap)this.b;
        Intrinsics.checkNotNullParameter(var4_5, "$hashMap");
        return (Integer)var4_5.put(var1_1, var2_2);
    }
}

