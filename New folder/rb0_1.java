/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Rb0
 */
public final class rb0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ String b;

    public rb0_1(ob0_1 ob0_12, String string2, f80_0 f80_02) {
        this.a = ob0_12;
        this.b = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        String string2 = this.b;
        object = new rb0_1(ob0_12, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (rb0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((rb0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a.E;
        String string2 = this.b;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, "user interaction", "header menu navigation click", "back button", "header_menu_navigation_click", string2, null, null, null, "", false, null, 1760, null);
        return Unit.a;
    }
}

