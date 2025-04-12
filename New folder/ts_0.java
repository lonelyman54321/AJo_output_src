/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from TS
 */
public final class ts_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;

    public ts_0(Function1 function1, boolean bl2) {
        this.c = function1;
        this.d = bl2;
        super(0);
    }

    public final Object invoke() {
        Boolean bl2 = this.d ^ true;
        this.c.invoke(bl2);
        return Unit.a;
    }
}

