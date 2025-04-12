/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from pF
 */
public final class pf_2
implements Function1 {
    public final /* synthetic */ if_1 a;
    public final /* synthetic */ if_1 b;

    public /* synthetic */ pf_2(if_1 if_12, if_1 if_13) {
        this.a = if_12;
        this.b = if_13;
    }

    public final Object invoke(Object object) {
        if ((object = (Throwable)object) == null) {
            object = Unit.a;
        } else {
            this.a.e((Throwable)object);
            if_1 if_12 = this.b;
            if_12.e((Throwable)object);
            object = Unit.a;
        }
        return object;
    }
}

