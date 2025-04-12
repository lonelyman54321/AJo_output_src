/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from cD
 */
public final class cd_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ String b;

    public cd_2(yp0_0 yp0_02, String string2, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yp0_0 yp0_02 = this.a;
        String string2 = this.b;
        object = new cd_2(yp0_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (cd_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((cd_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = this.b;
        this.a.c((String)object);
        return Unit.a;
    }
}

