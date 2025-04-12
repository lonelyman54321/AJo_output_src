/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

/*
 * Renamed from IR
 */
public abstract class ir_2
implements ox0_2 {
    public final CoroutineContext a;
    public final int b;
    public final he_2 c;

    public ir_2(CoroutineContext coroutineContext, int n3, he_2 he_22) {
        this.a = coroutineContext;
        this.b = n3;
        this.c = he_22;
    }

    public Object collect(fs0_2 object, f80_0 object2) {
        gr_2 gr_22 = new gr_2((fs0_2)object, this, null);
        if ((object = d.c(gr_22, object2)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        return object;
    }

    /*
     * Unable to fully structure code
     */
    public final es0_2 e(CoroutineContext var1_1, int var2_2, he_2 var3_3) {
        var4_4 = this.a;
        var1_1 = var1_1.plus(var4_4);
        var5_5 = he_2.SUSPEND;
        var6_6 = this.c;
        var7_7 = this.b;
        if (var3_3 == var5_5) {
            var8_8 = -3;
            if (var7_7 != var8_8) {
                if (var2_2 == var8_8) {
                    while (true) {
                        var2_2 = var7_7;
                        break;
                    }
                } else {
                    var8_8 = -2;
                    if (var7_7 != var8_8) {
                        if (var2_2 == var8_8) ** continue;
                        if ((var2_2 += var7_7) < 0) {
                            var2_2 = -1 >>> 1;
                        }
                    }
                }
            }
            var3_3 = var6_6;
        }
        if ((var9_9 = Intrinsics.areEqual(var1_1, var4_4)) && var2_2 == var7_7 && var3_3 == var6_6) {
            return this;
        }
        return this.h(var1_1, var2_2, var3_3);
    }

    public String f() {
        return null;
    }

    public abstract Object g(pz2_2 var1, f80_0 var2);

    public abstract ir_2 h(CoroutineContext var1, int var2, he_2 var3);

    public es0_2 i() {
        return null;
    }

    public af2_2 j(i90_0 object) {
        int n3 = this.b;
        int n4 = -3;
        if (n3 == n4) {
            n3 = -2;
        }
        l90_0 l90_02 = l90_0.ATOMIC;
        hr_2 hr_22 = new hr_2(this, null);
        he_2 he_22 = this.c;
        le_2 le_22 = sr_2.a(n3, 4, he_22);
        CoroutineContext coroutineContext = this.a;
        object = a90_0.b((i90_0)object, coroutineContext);
        boolean bl2 = true;
        coroutineContext = new fr_2((CoroutineContext)object, le_22, bl2, bl2);
        l90_02.invoke(hr_22, coroutineContext, (f80_0)((Object)coroutineContext));
        return coroutineContext;
    }

    public String toString() {
        int n3;
        String string2;
        Object object;
        int n4 = 4;
        Object object2 = new ArrayList(n4);
        Object object3 = this.f();
        if (object3 != null) {
            ((ArrayList)object2).add(object3);
        }
        if ((object = this.a) != (object3 = f.a)) {
            string2 = "context=";
            object3 = new StringBuilder(string2);
            ((StringBuilder)object3).append(object);
            object3 = ((StringBuilder)object3).toString();
            ((ArrayList)object2).add(object3);
        }
        if ((n3 = this.b) != (n4 = -3)) {
            string2 = "capacity=";
            object3 = new StringBuilder(string2);
            ((StringBuilder)object3).append(n3);
            object3 = ((StringBuilder)object3).toString();
            ((ArrayList)object2).add(object3);
        }
        if ((object = this.c) != (object3 = he_2.SUSPEND)) {
            string2 = "onBufferOverflow=";
            object3 = new StringBuilder(string2);
            ((StringBuilder)object3).append(object);
            object3 = ((StringBuilder)object3).toString();
            ((ArrayList)object2).add(object3);
        }
        StringBuilder stringBuilder = new StringBuilder();
        object3 = this.getClass().getSimpleName();
        stringBuilder.append((String)object3);
        stringBuilder.append('[');
        object2 = CollectionsKt.R(object2, ", ", null, null, null, 62);
        return ui0_1.a(stringBuilder, (String)object2, ']');
    }
}

