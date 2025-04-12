/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer
 */
import android.view.Choreographer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from xl0$a
 */
public final class xl0$a_0
extends qg3_2
implements Function2 {
    public xl0$a_0() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xl0$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xl0$a_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        return Choreographer.getInstance();
    }
}

