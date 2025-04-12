/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from XL0
 */
public final class xl0_2
extends Lambda
implements Function1 {
    public final /* synthetic */ wl0_1 c;

    public xl0_2(wl0_1 wl0_12) {
        this.c = wl0_12;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (String)object;
        String string2 = "url";
        Intrinsics.checkNotNullParameter(object, string2);
        Object object2 = this.c;
        fm0_0 fm0_02 = ((wl0_1)object2).d;
        fm0_02.getClass();
        Intrinsics.checkNotNullParameter(object, string2);
        fm0_02.a.e((String)object);
        object2 = ((wl0_1)object2).c;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, string2);
        ((yf1_2)object2).a.e((String)object);
        return Unit.a;
    }
}

