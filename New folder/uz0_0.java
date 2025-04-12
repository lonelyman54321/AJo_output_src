/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.EnhancedIntentService;

/*
 * Renamed from Uz0
 */
public final class uz0_0
implements Runnable {
    public final /* synthetic */ EnhancedIntentService a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ TaskCompletionSource c;

    public /* synthetic */ uz0_0(EnhancedIntentService enhancedIntentService, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.a = enhancedIntentService;
        this.b = intent;
        this.c = taskCompletionSource;
    }

    public final void run() {
        Intent intent = this.b;
        TaskCompletionSource taskCompletionSource = this.c;
        EnhancedIntentService.a(this.a, intent, taskCompletionSource);
    }
}

