/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.slidingpanelayout.widget.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from KU0
 */
public final class ku0_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Activity c;

    public ku0_2(a a2, Activity activity, f80_0 f80_02) {
        this.b = a2;
        this.c = activity;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        a a2 = this.b;
        Activity activity = this.c;
        object = new ku0_2(a2, activity, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ku0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ku0_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b;
            Object object2 = ((a)object).a;
            Activity activity = this.c;
            object2 = object2.a(activity);
            KU0$b kU0$b = new KU0$b((es0_2)object2, (a)object);
            object2 = ms0_1.h(kU0$b);
            KU0$a kU0$a = new KU0$a((a)object);
            this.a = n4;
            object = object2.collect(kU0$a, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

