/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from vC
 */
public final class vc_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;

    public vc_2(yp0_0 yp0_02, f80_0 f80_02) {
        this.a = yp0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yp0_0 yp0_02 = this.a;
        object = new vc_2(yp0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vc_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vc_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object.getClass();
        j90_02 = new Bundle();
        String string2 = od3_2.a();
        j90_02.putString("store_type", string2);
        string2 = od3_2.a();
        j90_02.putString("contains_store", string2);
        cp0_2 cp0_22 = new cp0_2((yp0_0)object, (Bundle)j90_02, null);
        Ae3.d(((yp0_0)object).d, null, null, cp0_22, 3);
        return Unit.a;
    }
}

