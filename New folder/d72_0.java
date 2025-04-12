/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from D72
 */
public final class d72_0
implements Function1 {
    public final /* synthetic */ il2_2 a;

    public /* synthetic */ d72_0(il2_2 il2_22) {
        this.a = il2_22;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.a;
        if (object != null) {
            ((il2_2)object).close();
        }
        return Unit.a;
    }
}

