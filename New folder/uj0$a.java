/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Handler
 *  android.os.Looper
 */
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

public final class uj0$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ dr0_0 c;

    public uj0$a(f80_0 f80_02, dr0_0 dr0_02, Activity activity, String string2) {
        this.a = string2;
        this.b = activity;
        this.c = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Activity activity = this.b;
        dr0_0 dr0_02 = this.c;
        String string2 = this.a;
        object = new uj0$a(f80_02, dr0_02, activity, string2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (uj0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((uj0$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = new String[]{"/post/"};
        int n3 = 6;
        String string2 = this.a;
        Object object2 = null;
        object = (String)CollectionsKt.T(StringsKt.a0(string2, object, false, 0, n3));
        j90_02 = this.b;
        if (j90_02 != null) {
            object2 = Looper.getMainLooper();
            string2 = new Handler(object2);
            dr0_0 dr0_02 = this.c;
            object2 = new tj0_0(dr0_02, (Activity)j90_02, (String)object);
            long l2 = uj0_0.b();
            string2.postDelayed((Runnable)object2, l2);
        }
        return Unit.a;
    }
}

