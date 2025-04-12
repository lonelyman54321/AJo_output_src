/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from aD
 */
public final class ad_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Component d;

    public ad_2(yp0_0 yp0_02, dr0_0 dr0_02, boolean bl2, Component component, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = dr0_02;
        this.c = bl2;
        this.d = component;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2 = this.c;
        Component component = this.d;
        yp0_0 yp0_02 = this.a;
        dr0_0 dr0_02 = this.b;
        object = new ad_2(yp0_02, dr0_02, bl2, component, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ad_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ad_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        boolean bl2 = this.c ^ true;
        object2 = this.b;
        object2.getClass();
        object = bl2 ? "brand follow" : "brand unfollow";
        object2 = dr0_0.y(this.d);
        if (object2 == null) {
            object2 = "";
        }
        this.a.a((String)object, (String)object2);
        return Unit.a;
    }
}

