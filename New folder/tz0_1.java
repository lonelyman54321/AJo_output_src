/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.EnhancedIntentService;

/*
 * Renamed from Tz0
 */
public final class tz0_1
implements OnCompleteListener {
    public final /* synthetic */ EnhancedIntentService a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ tz0_1(EnhancedIntentService enhancedIntentService, Intent intent) {
        this.a = enhancedIntentService;
        this.b = intent;
    }

    public final void onComplete(Task task2) {
        EnhancedIntentService enhancedIntentService = this.a;
        Intent intent = this.b;
        EnhancedIntentService.b(enhancedIntentService, intent, task2);
    }
}

