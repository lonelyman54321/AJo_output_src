/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from U22
 */
public final class u22_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ q22_0 a;
    public final /* synthetic */ boolean b;

    public u22_0(q22_0 q22_02, boolean bl2, f80_0 f80_02) {
        this.a = q22_02;
        this.b = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        q22_0 q22_02 = this.a;
        boolean bl2 = this.b;
        object = new u22_0(q22_02, bl2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (u22_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((u22_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = (Boolean)((q22_0)object).Y0.getValue();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            bl2 = this.b;
            if (bl2) {
                object = ((q22_0)object).cb();
                ((F12)object).k(false);
            } else {
                object = ((q22_0)object).cb();
                bl2 = true;
                ((F12)object).k(bl2);
            }
        } else {
            object = ((q22_0)object).cb();
            ((F12)object).k(false);
        }
        return Unit.a;
    }
}

