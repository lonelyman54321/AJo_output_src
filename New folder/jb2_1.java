/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jb2
 */
public final class jb2_1
implements gx0_2 {
    public final /* synthetic */ Function2 a;

    public jb2_1(u10 u102) {
        this.a = u102;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (kl_0)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(object, "$this$AnimatedVisibility");
        object = 0;
        this.a.invoke(object2, object);
        return Unit.a;
    }
}

