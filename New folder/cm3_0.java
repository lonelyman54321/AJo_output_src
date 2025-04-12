/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from cm3
 */
public final class cm3_0
extends Lambda
implements Function0 {
    public final /* synthetic */ Yl3 c;

    public cm3_0(Yl3 yl3) {
        this.c = yl3;
        super(0);
    }

    public final Object invoke() {
        Object object = this.c;
        Sl sl = ((Yl3)object).c;
        object = (Tl3)((Yl3)object).b.getValue();
        object = object != null && (object = ((Tl3)object).a) != null ? ((Sl3)object).a : null;
        return Intrinsics.areEqual(sl, object);
    }
}

