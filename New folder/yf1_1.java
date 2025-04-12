/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yf1
 */
public final class yf1_1
implements Runnable {
    public final /* synthetic */ ng1$a a;
    public final /* synthetic */ Context b;

    public /* synthetic */ yf1_1(ng1$a ng1$a, Context context) {
        this.a = ng1$a;
        this.b = context;
    }

    public final void run() {
        ng1$a ng1$a = this.a;
        Object object = this.b;
        Class<ag1_0> clazz = ag1_0.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            Object object2 = "$billingClientVersion";
            Intrinsics.checkNotNullParameter((Object)ng1$a, (String)object2);
            object2 = "$context";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object2 = ag1_0.a;
            object = object.getPackageName();
            String string2 = "context.packageName";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            try {
                ((ag1_0)object2).a(ng1$a, (String)object);
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

