/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from yC
 */
public final class yc_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public yc_2(yp0_0 yp0_02, String string2, String string3, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = string2;
        this.c = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.b;
        String string3 = this.c;
        yp0_0 yp0_02 = this.a;
        object = new yc_2(yp0_02, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yc_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yc_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = "";
        object2 = this.b;
        Object object3 = object2 == null ? object : object2;
        object2 = this.c;
        Object object4 = object2 == null ? object : object2;
        yp0_0.d(this.a, "share brand page", (String)object3, null, (String)object4, 4);
        return Unit.a;
    }
}

