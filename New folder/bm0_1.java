/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from bM0
 */
public final class bm0_1
extends Lambda
implements Function1 {
    public final /* synthetic */ wl0_1 c;
    public final /* synthetic */ Function1 d;

    public bm0_1(wl0_1 wl0_12, Function1 function1) {
        this.c = wl0_12;
        this.d = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Pair)object;
        Intrinsics.checkNotNullParameter(object, "meta");
        Object object2 = wl0_1.g;
        wl0_1 wl0_12 = this.c;
        fm0_0 fm0_02 = wl0_12.d;
        yf1_2 yf1_22 = wl0_12.c;
        object2 = new Pair(fm0_02, yf1_22);
        wl0$a_0.a((Pair)object, (Pair)object2);
        object2 = ps0_1.SUCCESSFUL;
        wl0_1.a(wl0_12, (Pair)object, (ps0_1)((Object)object2));
        this.d.invoke(object);
        return Unit.a;
    }
}

