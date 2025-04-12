/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class WB$c
extends qg3_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Activity c;

    public WB$c(f80_0 f80_02, dr0_0 dr0_02, Activity activity, String string2) {
        this.a = dr0_02;
        this.b = string2;
        this.c = activity;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.b;
        Activity activity = this.c;
        dr0_0 dr0_02 = this.a;
        object = new WB$c(f80_02, dr0_02, activity, string2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (WB$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((WB$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = ib$a_0.a;
        object2 = this.b;
        Activity activity = this.c;
        this.a.J((iB)object, (String)object2, activity);
        return Unit.a;
    }
}

