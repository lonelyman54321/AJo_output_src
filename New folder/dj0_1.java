/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FcmBroadcastProcessor;

/*
 * Renamed from dJ0
 */
public final class dj0_1
implements Continuation {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ dj0_1(Context context, Intent intent, boolean bl2) {
        this.a = context;
        this.b = intent;
        this.c = bl2;
    }

    public final Object then(Task task2) {
        Intent intent = this.b;
        boolean bl2 = this.c;
        return FcmBroadcastProcessor.a(this.a, intent, bl2, task2);
    }
}

