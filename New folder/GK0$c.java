/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 */
import android.os.Message;
import androidx.lifecycle.i$a;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class GK0$c
extends qg3_2
implements Function2 {
    public final /* synthetic */ i$a a;
    public final /* synthetic */ dr0_0 b;

    public GK0$c(i$a i$a, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = i$a;
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        i$a i$a = this.a;
        dr0_0 dr0_02 = this.b;
        object = new GK0$c(i$a, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (GK0$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((GK0$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = i$a.ON_STOP;
        if (object == object2) {
            int n3;
            this.b.U();
            object = new Message();
            ((Message)object).what = n3 = 1007;
            object2 = AnalyticsGAEventHandler.Companion.getInstance();
            object2.sendMessage((Message)object);
        }
        return Unit.a;
    }
}

