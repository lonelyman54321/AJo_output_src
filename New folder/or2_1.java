/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ril.ajio.utility.SMSBroadcastReceiver;
import com.ril.ajio.utility.b;
import com.ril.ajio.utility.b$b;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oR2
 */
public final class or2_1
implements OnCompleteListener {
    public final /* synthetic */ b a;
    public final /* synthetic */ nr2_2 b;

    public /* synthetic */ or2_1(b b2, nr2_2 nr2_22) {
        this.a = b2;
        this.b = nr2_22;
    }

    public final void onComplete(Task object) {
        b b2 = this.a;
        Intrinsics.checkNotNullParameter(b2, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$smsRetrieverCallback");
        Object object3 = "task";
        Intrinsics.checkNotNullParameter(object, object3);
        boolean bl2 = ((Task)object).isSuccessful();
        if (bl2) {
            object = new b$b((nr2_2)object2);
            object3 = b2.b;
            if (object3 != null) {
                ((SMSBroadcastReceiver)((Object)object3)).a = object;
            }
            object2 = "com.google.android.gms.auth.api.phone.SMS_RETRIEVED";
            object = new IntentFilter((String)object2);
            int n3 = 2;
            b2 = b2.a;
            t70.registerReceiver((Context)b2, (BroadcastReceiver)object3, (IntentFilter)object, n3);
        }
    }
}

