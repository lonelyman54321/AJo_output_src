/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xI
 */
public final class xi_2
implements Callable {
    public final /* synthetic */ Context a;

    public /* synthetic */ xi_2(Context context) {
        this.a = context;
    }

    public final Object call() {
        Context context = this.a;
        String string2 = "$context";
        Intrinsics.checkNotNullParameter(context, string2);
        boolean bl2 = yi_1.c;
        context = gc3_0.e(context).edit();
        String string3 = "firstTimeRequest";
        context = context.putBoolean(string3, bl2);
        try {
            context.commit();
        }
        catch (Throwable throwable) {
            b.l();
        }
        return null;
    }
}

