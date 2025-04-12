/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.IntentSender$SendIntentException
 */
import android.app.Activity;
import android.content.IntentSender;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/*
 * Renamed from v73
 */
public final class v73_0
implements OnCompleteListener {
    public final /* synthetic */ x73_0 a;

    public v73_0(x73_0 x73_02) {
        this.a = x73_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onComplete(Task object) {
        boolean bl2 = ((Task)object).isSuccessful();
        x73_0 x73_02 = this.a;
        if (bl2) {
            return;
        }
        bl2 = (object = ((Task)object).getException()) instanceof ResolvableApiException;
        if (!bl2) return;
        object = (ResolvableApiException)object;
        try {
            Activity activity = x73_02.b;
            int n3 = 1;
            ((ResolvableApiException)object).startResolutionForResult(activity, n3);
            return;
        }
        catch (IntentSender.SendIntentException sendIntentException) {
            return;
        }
    }
}

