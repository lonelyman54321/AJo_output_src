/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Db2
 */
public final class db2_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ou0_0 a;

    public db2_2(ou0_0 ou0_02, f80_0 f80_02) {
        this.a = ou0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ou0_0 ou0_02 = this.a;
        object = new db2_2(ou0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (db2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((db2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        ou0_0 ou0_02 = this.a;
        object2 = new cb2_1(ou0_02);
        object.postDelayed((Runnable)object2, 1500L);
        return Unit.a;
    }
}

