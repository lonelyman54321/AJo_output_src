/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 */
import android.content.Context;
import android.graphics.Bitmap;
import io.reactivex.Scheduler;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from R13
 */
public final class r13_0
implements rd1_2 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ s13_0 b;

    public r13_0(Context context, s13_0 s13_02) {
        this.a = context;
        this.b = s13_02;
    }

    public final void a() {
        this.b.b(null);
    }

    public final void b(Bitmap object) {
        Object object2 = this.a;
        Object object3 = new o13_0((Context)object2, (Bitmap)object);
        object = new o53_0((Callable)object3);
        object3 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object3);
        object3 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object3);
        object2 = this.b;
        object3 = new xy0_2(object2, 2);
        p13_0 p13_02 = new p13_0((xy0_2)object3);
        object3 = new xh0_2(object2, 1);
        object2 = new q13_0((Function1)object3);
        ((g53_0)object).f(p13_02, (o60_0)object2);
    }
}

