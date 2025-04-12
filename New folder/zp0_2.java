/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from zP0
 */
public final class zp0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ Bundle b;

    public zp0_2(yp0_0 yp0_02, Bundle bundle, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = bundle;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yp0_0 yp0_02 = this.a;
        Bundle bundle = this.b;
        object = new zp0_2(yp0_02, bundle, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (zp0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zp0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((yp0_0)object).a;
        String string2 = ((yp0_0)object).b;
        String string3 = ((yp0_0)object).c;
        Bundle bundle = this.b;
        ((NewCustomEventsRevamp)object2).newPushCustomScreenView("brand screen", "brand screen", string2, bundle, string3);
        return Unit.a;
    }
}

