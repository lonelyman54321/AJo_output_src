/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rc3
 */
public final class rc3_2
implements Function1 {
    public final /* synthetic */ uc3_2 a;

    public /* synthetic */ rc3_2(uc3_2 uc3_22) {
        this.a = uc3_22;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        uc3_2 uc3_22 = this.a;
        Intrinsics.checkNotNullParameter(uc3_22, "this$0");
        zr1_1 zr1_12 = uc3_22.k;
        Intrinsics.checkNotNull(object);
        object = uc3_22.a.handleApiException((Throwable)object, "BackGround_StoreMetaData");
        zr1_12.k(object);
        return Unit.a;
    }
}

