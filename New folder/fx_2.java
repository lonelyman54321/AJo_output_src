/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from fX
 */
public final class fx_2
extends qg3_2
implements Function1 {
    public final /* synthetic */ pe1_0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ fb3_2 c;

    public fx_2(pe1_0 pe1_02, Context context, fb3_2 fb3_22, f80_0 f80_02) {
        this.a = pe1_02;
        this.b = context;
        this.c = fb3_22;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        Context context = this.b;
        fb3_2 fb3_22 = this.c;
        pe1_0 pe1_02 = this.a;
        fx_2 fx_22 = new fx_2(pe1_02, context, fb3_22, f80_02);
        return fx_22;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (fx_2)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((fx_2)object).invokeSuspend(unit);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.c;
        Object object3 = this.a;
        Context context = this.b;
        object = new fX$a((pe1_0)object3, context, (fb3_2)object2, null);
        f f5 = f.a;
        object3 = he_2.SUSPEND;
        object2 = new jr_2((Function2)object, f5, -2, (he_2)((Object)object3));
        return object2;
    }
}

