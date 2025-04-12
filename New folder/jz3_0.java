/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Jz3
 */
public final class jz3_0
implements Function1 {
    public final /* synthetic */ fr0_1 a;

    public jz3_0(fr0_1 fr0_12) {
        this.a = fr0_12;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        this.a.dispose();
        return Unit.a;
    }
}

