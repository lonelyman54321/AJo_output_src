/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Rv3
extends qg3_2
implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ Context b;

    public Rv3(Context context, f80_0 f80_02) {
        this.b = context;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        boolean bl2;
        Context context = this.b;
        Rv3 rv3 = new Rv3(context, f80_02);
        rv3.a = bl2 = ((Boolean)object).booleanValue();
        return rv3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Boolean)object;
        ((Boolean)object).booleanValue();
        object2 = (f80_0)object2;
        object = (Rv3)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Rv3)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        boolean bl2 = this.a;
        dk2_0.a(this.b, RescheduleReceiver.class, bl2);
        return Unit.a;
    }
}

