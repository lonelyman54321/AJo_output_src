/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 */
import android.content.IntentSender;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gQ0
 */
public final class gq0_1
implements ResultCallback {
    public final /* synthetic */ fq0_2 a;

    public gq0_1(fq0_2 fq0_22) {
        this.a = fq0_22;
    }

    public final void onResult(Result object) {
        block10: {
            block8: {
                String string2;
                block7: {
                    block6: {
                        block9: {
                            object = (LocationSettingsResult)object;
                            Intrinsics.checkNotNullParameter(object, "result1");
                            object = ((LocationSettingsResult)object).getStatus();
                            string2 = "getStatus(...)";
                            Intrinsics.checkNotNullExpressionValue(object, string2);
                            int n3 = ((Status)object).getStatusCode();
                            if (n3 == 0) break block8;
                            int n4 = 6;
                            if (n3 == n4) break block9;
                            int n7 = 8502;
                            if (n3 == n7) {
                                object = yn3_0.a;
                                string2 = "Location settings are inadequate, and cannot be fixed here. Dialog not created.";
                                Object[] objectArray = new Object[]{};
                                ((yn3$a)object).a(string2, objectArray);
                            }
                            break block10;
                        }
                        object = ((Status)object).getResolution();
                        if (object == null) break block6;
                        object = object.getIntentSender();
                        break block7;
                    }
                    boolean bl2 = false;
                    object = null;
                }
                if (object == null) break block10;
                fq0_2 fq0_22 = this.a;
                int n8 = 1984;
                try {
                    fq0_22.startIntentSenderForResult((IntentSender)object, n8, null, 0, 0, 0, null);
                }
                catch (IntentSender.SendIntentException sendIntentException) {
                    object = yn3_0.a;
                    string2 = "PendingIntent unable to execute request.";
                    Object[] objectArray = new Object[]{};
                    ((yn3$a)object).a(string2, objectArray);
                }
                break block10;
            }
            object = fq0_2.Companion;
            object = this.a;
            ((fq0_2)object).eb();
        }
    }
}

