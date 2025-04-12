/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import in.juspay.hypersdk.analytics.LogManager$Companion;

/*
 * Renamed from Jw1
 */
public final class jw1_2
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    public /* synthetic */ jw1_2(Context context, String string2) {
        this.a = context;
        this.b = string2;
    }

    public final void run() {
        Context context = this.a;
        String string2 = this.b;
        LogManager$Companion.b(context, string2);
    }
}

