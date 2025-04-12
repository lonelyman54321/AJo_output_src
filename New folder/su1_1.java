/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Callable;

/*
 * Renamed from SU1
 */
public final class su1_1
implements Callable {
    public final /* synthetic */ tu1_1 a;
    public final /* synthetic */ Context b;

    public /* synthetic */ su1_1(tu1_1 tu1_12, Context context) {
        this.a = tu1_12;
        this.b = context;
    }

    public final Object call() {
        Nh0 nh0 = this.a.h;
        Context context = this.b;
        nh0.a(context);
        return null;
    }
}

