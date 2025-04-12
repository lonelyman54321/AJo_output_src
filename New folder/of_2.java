/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from oF
 */
public final class of_2
implements Function1 {
    public final /* synthetic */ gf_2 a;
    public final /* synthetic */ gf_2 b;

    public /* synthetic */ of_2(if_1 if_12, if_1 if_13) {
        this.a = if_12;
        this.b = if_13;
    }

    public final Object invoke(Object object) {
        if ((object = (Throwable)object) == null) {
            object = Unit.a;
        } else {
            kf_1.a(this.a, (Throwable)object);
            gf_2 gf_22 = this.b;
            kf_1.a(gf_22, (Throwable)object);
            object = Unit.a;
        }
        return object;
    }
}

