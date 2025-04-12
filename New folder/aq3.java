/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

public final class aq3 {
    public final Context a;
    public final N50 b;
    public final wx_1 c;
    public final N50 d;
    public final N50 e;

    public aq3() {
        throw null;
    }

    public aq3(Context context, Si3 si3) {
        N50 n50;
        tx_2 tx_22;
        Object object = context.getApplicationContext();
        String string2 = "context.applicationContext";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        String string3 = "context";
        Intrinsics.checkNotNullParameter(object, string3);
        String string4 = "taskExecutor";
        Intrinsics.checkNotNullParameter(si3, string4);
        super((Context)object, si3);
        Object object2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        Intrinsics.checkNotNullParameter(object2, string3);
        Intrinsics.checkNotNullParameter(si3, string4);
        super((Context)object2, si3);
        object2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        int n3 = jV1.a;
        Intrinsics.checkNotNullParameter(object2, string3);
        Intrinsics.checkNotNullParameter(si3, string4);
        n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            n50 = new iv1_1((Context)object2, si3);
        } else {
            super((Context)object2, si3);
        }
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, string2);
        Intrinsics.checkNotNullParameter(context2, string3);
        Intrinsics.checkNotNullParameter(si3, string4);
        super(context2, si3);
        Intrinsics.checkNotNullParameter(context, string3);
        Intrinsics.checkNotNullParameter(si3, string4);
        Intrinsics.checkNotNullParameter(tx_22, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(object, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(n50, "networkStateTracker");
        Intrinsics.checkNotNullParameter(object2, "storageNotLowTracker");
        super();
        this.a = context;
        this.b = tx_22;
        this.c = object;
        this.d = n50;
        this.e = object2;
    }
}

