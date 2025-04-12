/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Message
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 */
package androidx.appcompat.app;

import android.os.Message;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AlertController;

public final class AlertController$a
implements View.OnClickListener {
    public final /* synthetic */ AlertController a;

    public AlertController$a(AlertController alertController) {
        this.a = alertController;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Button button = ((AlertController)object2).o;
        if ((object = object == button && (button = ((AlertController)object2).q) != null ? Message.obtain((Message)button) : (object == (button = ((AlertController)object2).s) && (button = ((AlertController)object2).u) != null ? Message.obtain((Message)button) : (object == (button = ((AlertController)object2).w) && (object = ((AlertController)object2).y) != null ? Message.obtain((Message)object) : null))) != null) {
            object.sendToTarget();
        }
        object = ((AlertController)object2).P;
        object2 = ((AlertController)object2).b;
        object.obtainMessage(1, object2).sendToTarget();
    }
}

