/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Message;

public final class QK2$a
implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        int n3 = message.what;
        int n4 = 1;
        if (n3 == n4) {
            ((wk2_0)message.obj).a();
            return n4 != 0;
        }
        return false;
    }
}

