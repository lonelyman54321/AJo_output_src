/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cM2
 */
public final class cm2_2
implements Function1 {
    public final /* synthetic */ Vo0 a;
    public final /* synthetic */ float b;

    public /* synthetic */ cm2_2(float f5, Vo0 vo0) {
        this.a = vo0;
        this.b = f5;
    }

    public final Object invoke(Object object) {
        ((Integer)object).intValue();
        Vo0 vo0 = this.a;
        Intrinsics.checkNotNullParameter(vo0, "$density");
        float f5 = (float)((double)this.b * -0.5);
        return vo0.e0(f5);
    }
}

