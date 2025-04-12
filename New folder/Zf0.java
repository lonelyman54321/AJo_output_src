/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IBinder$DeathRecipient
 */
import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.CustomTabsService$a;
import java.util.NoSuchElementException;

public final class Zf0
implements IBinder.DeathRecipient {
    public final /* synthetic */ CustomTabsService$a a;
    public final /* synthetic */ cg0 b;

    public /* synthetic */ Zf0(CustomTabsService$a a2, cg0 cg02) {
        this.a = a2;
        this.b = cg02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void binderDied() {
        Throwable throwable2;
        block7: {
            Object object = this.a;
            Object object2 = this.b;
            object = ((CustomTabsService$a)object).a;
            object.getClass();
            try {
                a53 a532 = ((CustomTabsService)((Object)object)).a;
                // MONITORENTER : a532
            }
            catch (NoSuchElementException noSuchElementException) {
                return;
            }
            try {
                object2 = ((cg0)object2).a;
                object2 = object2 == null ? null : object2.asBinder();
                if (object2 == null) {
                    // MONITOREXIT : a532
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            Object object3 = ((CustomTabsService)((Object)object)).a;
            object3 = ((a53)object3).get(object2);
            object3 = (IBinder.DeathRecipient)object3;
            object2.unlinkToDeath((IBinder.DeathRecipient)object3, 0);
            object = ((CustomTabsService)((Object)object)).a;
            ((a53)object).remove(object2);
            // MONITOREXIT : a532
            return;
        }
        // MONITOREXIT : a532
        throw throwable2;
    }
}

