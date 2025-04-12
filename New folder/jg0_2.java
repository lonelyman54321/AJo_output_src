/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jg0
 */
public final class jg0_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jg0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     */
    public final Object invoke() {
        int bl2 = this.a;
        switch (bl2) {
            default: {
                void var1_4;
                String string2 = "$progress$delegate";
                bb1_1 bb1_12 = (bb1_1)this.b;
                Intrinsics.checkNotNullParameter(bb1_12, string2);
                float f5 = ml2_1.b(bb1_12);
                double d2 = f5;
                double d5 = 0.53;
                double d7 = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
                if (d7 > 0) {
                    boolean bl3 = true;
                    f5 = Float.MIN_VALUE;
                } else {
                    boolean bl4 = false;
                    f5 = 0.0f;
                    string2 = null;
                }
                return (boolean)var1_4;
            }
            case 0: 
        }
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$onClick");
        function1.invoke("TOPBAR");
        return Unit.a;
    }
}

