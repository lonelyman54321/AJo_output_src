/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from TZ1
 */
public final class tz1_2
extends qg3_2
implements Function2 {
    public tz1_2() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (tz1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tz1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        km_1.a(AnalyticsManager.Companion, "unique package code screen");
        return Unit.a;
    }
}

