/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Message;
import com.bumptech.glide.RequestManager;

public final class DZ0$c
implements Handler.Callback {
    public final /* synthetic */ DZ0 a;

    public DZ0$c(DZ0 dZ0) {
        this.a = dZ0;
    }

    public final boolean handleMessage(Message object) {
        boolean bl2 = ((Message)object).what;
        DZ0 dZ0 = this.a;
        boolean bl3 = true;
        if (bl2 == bl3) {
            object = (DZ0$a)((Message)object).obj;
            dZ0.b((DZ0$a)object);
            return bl3;
        }
        boolean bl4 = 2 != 0;
        if (bl2 == bl4) {
            object = (DZ0$a)((Message)object).obj;
            RequestManager requestManager = dZ0.d;
            requestManager.l((ki3_1)object);
        }
        return false;
    }
}

