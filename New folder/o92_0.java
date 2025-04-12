/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from o92
 */
public final class o92_0
extends qg3_2
implements Function2 {
    public o92_0() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (o92_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((o92_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = new Bundle();
        String string2 = "onboarding screen";
        object.putString("screen_type", string2);
        vb0_0.a(AnalyticsManager.Companion, string2, (Bundle)object);
        return Unit.a;
    }
}

