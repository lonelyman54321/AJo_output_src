/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from gD
 */
public final class gd_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Subcomponent c;

    public gd_2(yp0_0 yp0_02, String string2, Subcomponent subcomponent, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = string2;
        this.c = subcomponent;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.b;
        Subcomponent subcomponent = this.c;
        yp0_0 yp0_02 = this.a;
        object = new gd_2(yp0_02, string2, subcomponent, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (gd_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gd_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = "";
        object2 = this.b;
        Object object3 = object2 == null ? object : object2;
        object2 = this.c.getId();
        Object object4 = object2 == null ? object : object2;
        yp0_0.d(this.a, "post share click", (String)object3, (String)object4, null, 8);
        return Unit.a;
    }
}

