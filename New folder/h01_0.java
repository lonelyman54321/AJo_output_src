/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from h01
 */
public final class h01_0
extends Lambda
implements Function1 {
    public final /* synthetic */ dr_2 c;

    public h01_0(le_2 le_22) {
        this.c = le_22;
        super(1);
    }

    public final Object invoke(Object object) {
        object = i01.b;
        Unit unit = null;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
        if (bl3) {
            object = this.c;
            unit = Unit.a;
            object.j(unit);
        }
        return Unit.a;
    }
}

