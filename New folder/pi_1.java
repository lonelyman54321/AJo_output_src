/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PI
 */
public final class pi_1
implements Callable {
    public final /* synthetic */ a a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ pi_1(Context context, a a2, String string2, String string3) {
        this.a = a2;
        this.b = context;
        this.c = string2;
        this.d = string3;
    }

    public final Object call() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$this_flushPushImpressionsOnPostAsyncSafely");
        Context context = this.b;
        Intrinsics.checkNotNullParameter(context, "$context");
        String string2 = this.c;
        Intrinsics.checkNotNullParameter(string2, "$caller");
        Object object2 = "$logTag";
        Object object3 = this.d;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = ((a)object).b;
        object2 = ((H80)object2).g;
        object3 = FB0.PUSH_NOTIFICATION_VIEWED;
        try {
            ((k0_0)object2).T(context, (FB0)((Object)object3), string2);
        }
        catch (Exception exception) {
            object = ((a)object).b.a.a;
            com.clevertap.android.sdk.b.d();
        }
        return null;
    }
}

