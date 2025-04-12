/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from ya1
 */
public final class ya1_2
implements Function1 {
    public final /* synthetic */ ma1_1 a;

    public /* synthetic */ ya1_2(ma1_1 ma1_12) {
        this.a = ma1_12;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        this.a.close();
        return Unit.a;
    }
}

