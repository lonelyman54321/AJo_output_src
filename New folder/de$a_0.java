/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Message;

/*
 * Renamed from de$a
 */
public final class de$a_0
extends Handler {
    public final /* synthetic */ de_1 a;

    public de$a_0(de_1 de_12) {
        this.a = de_12;
    }

    public final void handleMessage(Message object) {
        super.handleMessage(object);
        int n3 = object.what;
        int n4 = 1;
        if (n3 == n4) {
            object = this.a.f;
            object.invalidate();
        }
    }
}

