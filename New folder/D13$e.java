/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class D13$e
extends qg3_2
implements Function2 {
    public final /* synthetic */ C13 a;
    public final /* synthetic */ Activity b;

    public D13$e(C13 c13, Activity activity, f80_0 f80_02) {
        this.a = c13;
        this.b = activity;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        C13 c13 = this.a;
        Activity activity = this.b;
        object = new D13$e(c13, activity, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (D13$e)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((D13$e)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        j90_02 = this.b;
        return D13.c((C13)object, (Context)j90_02);
    }
}

