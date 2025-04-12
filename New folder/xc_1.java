/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from XC
 */
public final class xc_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ Component c;

    public xc_1(yp0_0 yp0_02, dr0_0 dr0_02, Component component, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = dr0_02;
        this.c = component;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        Component component = this.c;
        yp0_0 yp0_02 = this.a;
        object = new xc_1(yp0_02, dr0_02, component, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xc_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xc_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        this.b.getClass();
        object = dr0_0.y(this.c);
        this.a.c((String)object);
        return Unit.a;
    }
}

