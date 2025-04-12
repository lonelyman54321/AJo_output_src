/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Handler
 *  android.os.Message
 */
package androidx.appcompat.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

public final class AlertController$c
extends Handler {
    public WeakReference a;

    public final void handleMessage(Message message) {
        int n3 = message.what;
        int n4 = -3;
        if (n3 != n4 && n3 != (n4 = -2) && n3 != (n4 = -1)) {
            n4 = 1;
            if (n3 == n4) {
                message = (DialogInterface)message.obj;
                message.dismiss();
            }
        } else {
            DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener)message.obj;
            DialogInterface dialogInterface = (DialogInterface)this.a.get();
            int n7 = message.what;
            onClickListener.onClick(dialogInterface, n7);
        }
    }
}

