/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from XU
 */
public final class xu_1
implements g03_0 {
    public final Function1 a;
    public final av_1 b;

    public xu_1(Function1 object) {
        Intrinsics.checkNotNullParameter(object, "compute");
        this.a = object;
        this.b = object = new av_1();
    }

    public final KSerializer a(yn1_2 yn1_22) {
        Intrinsics.checkNotNullParameter(yn1_22, "key");
        Object object = this.b;
        Object object2 = rn1_2.a(yn1_22);
        object = wu_1.a((av_1)object, (Class)object2);
        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
        object = (sr1_2)object;
        object2 = ((sr1_2)object).reference.get();
        if (object2 == null) {
            object2 = new XU$a(this, yn1_22);
            object2 = ((sr1_2)object).a((Function0)object2);
        }
        return ((yi_2)object2).a;
    }
}

