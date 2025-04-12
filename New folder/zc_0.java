/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ZC
 */
public final class zc_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ Resource b;

    public zc_0(yp0_0 yp0_02, Resource resource, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = resource;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yp0_0 yp0_02 = this.a;
        Resource resource = this.b;
        object = new zc_0(yp0_02, resource, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (zc_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((zc_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.b;
        this.a.e("add_to_wishlist", (Resource)object2);
        return Unit.a;
    }
}

