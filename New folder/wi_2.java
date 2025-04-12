/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wI
 */
public final class wi_2
implements Callable {
    public final /* synthetic */ Context a;

    public /* synthetic */ wi_2(Context context) {
        this.a = context;
    }

    public final Object call() {
        Context context = this.a;
        Intrinsics.checkNotNullParameter(context, "$context");
        yi_1.c = gc3_0.e(context).getBoolean("firstTimeRequest", true);
        return null;
    }
}

