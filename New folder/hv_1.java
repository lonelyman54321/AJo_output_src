/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  org.json.JSONObject
 */
import android.os.Bundle;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.task.a;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/*
 * Renamed from hV
 */
public final class hv_1
implements Callable {
    public final /* synthetic */ com.clevertap.android.sdk.a a;
    public final /* synthetic */ CTInboxMessage b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ hv_1(com.clevertap.android.sdk.a a2, CTInboxMessage cTInboxMessage) {
        this.a = a2;
        this.b = cTInboxMessage;
        this.c = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object call() {
        Object object4;
        Object object3;
        Object object;
        Bundle bundle;
        CTInboxMessage cTInboxMessage;
        Object object2;
        block9: {
            block6: {
                block8: {
                    block7: {
                        object2 = this.a;
                        cTInboxMessage = this.b;
                        bundle = this.c;
                        object2.getClass();
                        object = cTInboxMessage.l;
                        com.clevertap.android.sdk.b.c();
                        object = cTInboxMessage.l;
                        com.clevertap.android.sdk.b.c();
                        object3 = ((com.clevertap.android.sdk.a)object2).b.h.b;
                        // MONITORENTER : object3
                        object4 = ((com.clevertap.android.sdk.a)object2).b;
                        object4 = ((H80)object4).j;
                        object4 = ((l80_0)object4).e;
                        if (object4 == null) break block6;
                        if ((object = ((oi_1)object4).c((String)object)) == null) break block7;
                        object = ((ui_2)object).c();
                        object4 = new CTInboxMessage((JSONObject)object);
                        break block8;
                    }
                    object4 = null;
                }
                // MONITOREXIT : object3
                break block9;
            }
            object = ((com.clevertap.android.sdk.a)object2).f();
            ((com.clevertap.android.sdk.a)object2).b();
            object4 = "Notification Inbox not initialized";
            object.getClass();
            com.clevertap.android.sdk.b.f((String)object4);
            // MONITOREXIT : object3
            object4 = null;
        }
        boolean bl2 = ((CTInboxMessage)object4).k;
        if (bl2) return null;
        object = ((com.clevertap.android.sdk.a)object2).b.j.e;
        if (object != null) {
            object3 = jh_1.a(((oi_1)object).h).b();
            object4 = new mi_2((oi_1)object, cTInboxMessage);
            object = "markReadInboxMessage";
            ((a)object3).c((String)object, (Callable)object4);
        } else {
            object = ((com.clevertap.android.sdk.a)object2).f();
            ((com.clevertap.android.sdk.a)object2).b();
            object3 = "Notification Inbox not initialized";
            object.getClass();
            com.clevertap.android.sdk.b.f((String)object3);
        }
        object2 = ((com.clevertap.android.sdk.a)object2).b.f;
        bl2 = false;
        object = null;
        ((we)object2).Z(false, cTInboxMessage, bundle);
        return null;
    }
}

