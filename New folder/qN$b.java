/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 */
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

public final class qN$b
extends Handler {
    public final /* synthetic */ qn_2 a;

    public qN$b(qn_2 qn_22, Looper looper) {
        this.a = qn_22;
        super(looper);
    }

    public final void handleMessage(Message object) {
        String string2 = "msg";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((Message)object).arg1;
        int n4 = 1;
        if (n3 == n4) {
            object = qn_2.Companion;
            object = this.a;
            ((qn_2)object).Qa();
        }
    }
}

