/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.util.concurrent.Callable;

/*
 * Renamed from cJ0
 */
public final class cj0_1
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ cj0_1(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    public final Object call() {
        Context context = this.a;
        Intent intent = this.b;
        return FcmBroadcastProcessor.b(context, intent);
    }
}

