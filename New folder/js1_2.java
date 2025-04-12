/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from jS1
 */
public final class js1_2
implements Function1 {
    public final /* synthetic */ ks1_1 a;
    public final /* synthetic */ kS1$a b;

    public /* synthetic */ js1_2(ks1_1 ks1_12, kS1$a kS1$a) {
        this.a = ks1_12;
        this.b = kS1$a;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.b.b;
        this.a.b(object);
        return Unit.a;
    }
}

