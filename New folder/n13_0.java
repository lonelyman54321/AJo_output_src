/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import io.reactivex.Scheduler;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from N13
 */
public final class n13_0 {
    public static final N13$a Companion;
    public static n13_0 a;

    static {
        N13$a n13$a;
        Companion = n13$a = new Object();
    }

    public final void a(String object, Context object2, s13_0 object3) {
        Intrinsics.checkNotNullParameter(object2, "context");
        Intrinsics.checkNotNullParameter(object3, "shareFileListener");
        Object object4 = new i13_0(this, (Context)object2);
        Object object5 = new o53_0((Callable)object4);
        object4 = qt2_2.c;
        object4 = ((g53_0)object5).h((Scheduler)object4);
        object5 = ti_2.a();
        object4 = ((g53_0)object4).e((Scheduler)object5);
        object5 = new j13_0(this, (String)object, (Context)object2, (s13_0)object3);
        object = new k13_0((Function1)object5);
        object2 = new Object();
        object3 = new m13_0((l13_0)object2);
        ((g53_0)object4).f((o60_0)object, (o60_0)object3);
    }
}

