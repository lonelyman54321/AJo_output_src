/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DY1
 */
public final class dy1_2
implements Function1 {
    public final /* synthetic */ ky1_0 a;

    public /* synthetic */ dy1_2(ky1_0 ky1_02) {
        this.a = ky1_02;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        ky1_0 ky1_02 = this.a;
        Intrinsics.checkNotNullParameter(ky1_02, "this$0");
        zr1_1 zr1_12 = ky1_02.l;
        Intrinsics.checkNotNull(object);
        object = ky1_02.c.handleApiException((Throwable)object, "CartProductsSizeVariantAuth");
        zr1_12.k(object);
        return Unit.a;
    }
}

