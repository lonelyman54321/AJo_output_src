/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from rQ0
 */
public final class rq0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Bundle b;

    public rq0_1(String string2, Bundle bundle, f80_0 f80_02) {
        this.a = string2;
        this.b = bundle;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        Bundle bundle = this.b;
        object = new rq0_1(string2, bundle, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rq0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rq0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object2 = this.a;
        Bundle bundle = this.b;
        ((GTMEvents)object).pushOpenScreenEvent((String)object2, bundle);
        return Unit.a;
    }
}

