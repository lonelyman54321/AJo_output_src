/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xs2
 */
public final class xs2_2
implements Function1 {
    public final /* synthetic */ ys2_1 a;
    public final /* synthetic */ String b;

    public /* synthetic */ xs2_2(ys2_1 ys2_12) {
        this.a = ys2_12;
        this.b = "pickFromStoreList";
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        ys2_1 ys2_12 = this.a;
        Intrinsics.checkNotNullParameter(ys2_12, "this$0");
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        zr1_1 zr1_12 = ys2_12.c;
        Intrinsics.checkNotNull(object);
        object = ys2_12.b.handleApiException((Throwable)object, string2);
        zr1_12.k(object);
        return Unit.a;
    }
}

