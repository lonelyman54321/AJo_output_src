/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 *  org.json.JSONObject
 */
import android.os.Message;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.analytics.handler.OnGAEventHandlerListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

public final class DR0$b
extends qg3_2
implements Function2 {
    public final /* synthetic */ wq0_0 a;
    public final /* synthetic */ dr0_0 b;

    public DR0$b(wq0_0 wq0_02, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = wq0_02;
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        wq0_0 wq0_02 = this.a;
        dr0_0 dr0_02 = this.b;
        object = new DR0$b(wq0_02, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (DR0$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((DR0$b)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = new Message();
        ((Message)object).what = 1006;
        object2 = new JSONObject();
        Object object3 = this.a;
        object2.put("fleek_impression_obj", object3);
        object3 = "brand screen";
        object2.put("screenName", object3);
        object2.put("screenType", object3);
        ((Message)object).obj = object2;
        object = vg_1.a(AnalyticsGAEventHandler.Companion, (Message)object);
        object2 = this.b.P0;
        ((AnalyticsGAEventHandler)((Object)object)).setOnGAEventHandlerListener((OnGAEventHandlerListener)object2);
        return Unit.a;
    }
}

