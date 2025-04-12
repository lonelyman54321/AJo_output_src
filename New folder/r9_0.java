/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 */
import android.content.IntentSender;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from r9
 */
public final class r9_0
implements ResultCallback {
    public final /* synthetic */ q9_0 a;

    public r9_0(q9_0 q9_02) {
        this.a = q9_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onResult(Result object) {
        object = (LocationSettingsResult)object;
        Intrinsics.checkNotNullParameter(object, "result1");
        object = ((LocationSettingsResult)object).getStatus();
        Object object2 = "getStatus(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        int n3 = ((Status)object).getStatusCode();
        Object[] objectArray = this.a;
        Object[] objectArray2 = null;
        if (n3 != 0) {
            int n4 = 6;
            if (n3 != n4) {
                int n7 = 8502;
                if (n3 != n7) return;
                object = yn3_0.a;
                object2 = "Location settings are inadequate, and cannot be fixed here. Dialog not created.";
                objectArray = new Object[]{};
                ((yn3$a)object).a((String)object2, objectArray);
                return;
            } else {
                object2 = yn3_0.a;
                Object object3 = "Location settings are not satisfied.";
                Object[] objectArray3 = new Object[]{};
                ((yn3$a)object2).a((String)object3, objectArray3);
                object2 = objectArray.getActivity();
                if (object2 == null) return;
                n3 = (int)(objectArray.isAdded() ? 1 : 0);
                if (n3 == 0) return;
                object = ((Status)object).getResolution();
                if (object == null) return;
                object = object.getIntentSender();
                Object object4 = object;
                if (object == null) return;
                object3 = this.a;
                int n8 = 102;
                try {
                    ((Fragment)object3).startIntentSenderForResult((IntentSender)object, n8, null, 0, 0, 0, null);
                    return;
                }
                catch (Exception exception) {
                    object = yn3_0.a;
                    object2 = "unable to execute request.";
                    objectArray = new Object[]{};
                    ((yn3$a)object).a((String)object2, objectArray);
                    return;
                }
                catch (IntentSender.SendIntentException sendIntentException) {
                    object = yn3_0.a;
                    object2 = "PendingIntent unable to execute request.";
                    objectArray = new Object[]{};
                    ((yn3$a)object).a((String)object2, objectArray);
                }
            }
            return;
        } else {
            object = yn3_0.a;
            object2 = "All location settings are satisfied.";
            objectArray2 = new Object[]{};
            ((yn3$a)object).a((String)object2, objectArray2);
            object = q9_0.Companion;
            objectArray.Eb();
        }
    }
}

