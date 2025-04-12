/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable
 */
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.foreground.a;
import java.util.HashMap;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from eI3
 */
public final class ei3_0
implements Function0 {
    public final /* synthetic */ fi3_0 a;
    public final /* synthetic */ UUID b;
    public final /* synthetic */ AV0 c;
    public final /* synthetic */ Context d;

    public /* synthetic */ ei3_0(fi3_0 fi3_02, UUID uUID, AV0 aV0, Context context) {
        this.a = fi3_02;
        this.b = uUID;
        this.c = aV0;
        this.d = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object invoke() {
        Object object;
        int n3;
        Object object2 = this.a;
        Object object3 = this.b;
        Object object4 = this.c;
        Context context = this.d;
        object2.getClass();
        object3 = ((UUID)object3).toString();
        EI3 eI3 = ((fi3_0)object2).c.i((String)object3);
        if (eI3 != null && (n3 = (object = eI3.b).isFinished()) == 0) {
            block6: {
                object2 = (kz2_0)((fi3_0)object2).b;
                object = ((kz2_0)object2).k;
                // MONITORENTER : object
                Object object5 = qx1.a();
                object5.getClass();
                object5 = ((kz2_0)object2).g;
                object5 = ((HashMap)object5).remove(object3);
                object5 = (WI3)object5;
                if (object5 == null) break block6;
                Object object6 = ((kz2_0)object2).a;
                if (object6 == null) {
                    object6 = ((kz2_0)object2).b;
                    String string2 = "ProcessorForegroundLck";
                    object6 = QE3.a((Context)object6, string2);
                    ((kz2_0)object2).a = object6;
                    object6.acquire();
                }
                object6 = ((kz2_0)object2).f;
                ((HashMap)object6).put(object3, object5);
                object3 = ((kz2_0)object2).b;
                object5 = ((WI3)object5).a;
                object5 = JI3.a((EI3)object5);
                object3 = androidx.work.impl.foreground.a.b((Context)object3, (gI3)object5, (AV0)object4);
                object2 = ((kz2_0)object2).b;
                t70.startForegroundService((Context)object2, (Intent)object3);
            }
            // MONITOREXIT : object
            object2 = JI3.a(eI3);
            object3 = new Intent(context, SystemForegroundService.class);
            object3.setAction("ACTION_NOTIFY");
            int n4 = ((AV0)object4).a;
            object3.putExtra("KEY_NOTIFICATION_ID", n4);
            n3 = ((AV0)object4).b;
            object3.putExtra("KEY_FOREGROUND_SERVICE_TYPE", n3);
            object4 = ((AV0)object4).c;
            object3.putExtra("KEY_NOTIFICATION", (Parcelable)object4);
            object4 = ((gI3)object2).a;
            object3.putExtra("KEY_WORKSPEC_ID", (String)object4);
            int n7 = ((gI3)object2).b;
            object3.putExtra("KEY_GENERATION", n7);
            context.startService((Intent)object3);
            return null;
        }
        object3 = new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        throw object3;
    }
}

