/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 */
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qt2
 */
public final class qt2_1
extends Handler {
    public final /* synthetic */ rt2_2 a;

    public qt2_1(rt2_2 rt2_22) {
        this.a = rt2_22;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleMessage(Message message) {
        String string2;
        block10: {
            string2 = "message";
            boolean bl2 = td0.b((Object)this);
            if (bl2) {
                return;
            }
            bl2 = td0.b((Object)this);
            if (!bl2) break block10;
            return;
            {
                catch (Throwable throwable) {
                    td0.a((Object)this, throwable);
                    return;
                }
            }
        }
        try {
            Intrinsics.checkNotNullParameter(message, string2);
            rt2_2 rt2_22 = this.a;
            rt2_22.getClass();
            Intrinsics.checkNotNullParameter(message, string2);
            int n3 = message.what;
            int n4 = rt2_22.g;
            if (n3 != n4) return;
            message = message.getData();
            string2 = "com.facebook.platform.status.ERROR_TYPE";
            if ((string2 = message.getString(string2)) != null) {
                message = null;
                rt2_22.a(null);
            } else {
                rt2_22.a((Bundle)message);
            }
            message = rt2_22.a;
            message.unbindService((ServiceConnection)rt2_22);
            return;
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }
}

