/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ez3
 */
public final class ez3_0
implements Function1 {
    public final /* synthetic */ l41_0 a;
    public final /* synthetic */ bg2_2 b;

    public /* synthetic */ ez3_0(q41_0 q41_02, bg2_2 bg2_22) {
        this.a = q41_02;
        this.b = bg2_22;
    }

    public final Object invoke(Object object) {
        object = (p41_0)object;
        Intrinsics.checkNotNullParameter(object, "$this$buildHeaders");
        object.getClass();
        l41_0 l41_02 = this.a;
        Object object2 = "stringValues";
        Intrinsics.checkNotNullParameter(l41_02, (String)object2);
        we3_2 we3_22 = new we3_2((xe3_2)object);
        l41_02.a(we3_22);
        l41_02 = this.b.c();
        Intrinsics.checkNotNullParameter(l41_02, (String)object2);
        object2 = new we3_2((xe3_2)object);
        l41_02.a((Function2)object2);
        return Unit.a;
    }
}

