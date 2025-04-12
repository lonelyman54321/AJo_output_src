/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jc2
 */
public final class jc2_2
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ jc2_2(u8_0 u8_02, int n3) {
        this.a = u8_02;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).getClass();
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$closeButtonClick");
        int n3 = Me3.b(this.b | 1);
        jd2_1.j((u8_0)object2, (b30_0)object, n3);
        return Unit.a;
    }
}

