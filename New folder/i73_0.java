/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from I73
 */
public final class i73_0
extends Lambda
implements Function0 {
    public final /* synthetic */ D73 c;
    public final /* synthetic */ QI0 d;

    public i73_0(D73 d73, QI0 qI0) {
        this.c = d73;
        this.d = qI0;
        super(0);
    }

    public final Object invoke() {
        Object object = this.d;
        D73 d73 = this.c;
        Object object2 = ((QI0)object).a;
        boolean bl2 = Intrinsics.areEqual(d73, object2);
        if (!bl2) {
            object2 = ((QI0)object).b;
            h73_0 h73_02 = new h73_0(d73);
            cx_2.w((List)object2, h73_02);
            object = ((QI0)object).c;
            if (object != null) {
                object.invalidate();
            }
        }
        return Unit.a;
    }
}

