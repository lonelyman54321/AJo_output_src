/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 */
package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController$b;

public final class d
implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController a;
    public final /* synthetic */ AlertController$b b;

    public d(AlertController$b alertController$b, AlertController alertController) {
        this.b = alertController$b;
        this.a = alertController;
    }

    public final void onItemClick(AdapterView object, View view, int n3, long l2) {
        object = this.b;
        view = ((AlertController$b)object).w;
        AlertController alertController = this.a;
        on on3 = alertController.b;
        view.onClick((DialogInterface)on3, n3);
        boolean bl2 = ((AlertController$b)object).G;
        if (!bl2) {
            object = alertController.b;
            ((on)object).dismiss();
        }
    }
}

