/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from eh3
 */
public final class eh3_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;

    public eh3_2(Activity activity, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = activity;
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Activity activity = this.a;
        dr0_0 dr0_02 = this.b;
        object = new eh3_2(activity, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (eh3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((eh3_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        if (object != null) {
            object2 = this.b;
            object2.getClass();
            object = dr0_0.w((Activity)object);
            ((fq0_2)object).Va();
        }
        return Unit.a;
    }
}

