/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from IF
 */
public final class if_2
implements Function1 {
    public final /* synthetic */ if_1 a;

    public /* synthetic */ if_2(if_1 if_12) {
        this.a = if_12;
    }

    public final Object invoke(Object object) {
        if_1 if_12;
        boolean bl2;
        if ((object = (Throwable)object) != null && !(bl2 = (if_12 = this.a).a())) {
            if_12.e((Throwable)object);
        }
        return Unit.a;
    }
}

