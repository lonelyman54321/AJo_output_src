/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ZL0
 */
public final class zl0_1
extends Lambda
implements Function1 {
    public final /* synthetic */ wl0_1 c;
    public final /* synthetic */ Function1 d;

    public zl0_1(wl0_1 wl0_12, Function1 function1) {
        this.c = wl0_12;
        this.d = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Pair)object;
        Intrinsics.checkNotNullParameter(object, "meta");
        wl0_1 wl0_12 = this.c;
        ps0_1 ps0_12 = ps0_1.FAILED;
        wl0_1.a(wl0_12, (Pair)object, ps0_12);
        this.d.invoke(object);
        return Unit.a;
    }
}

