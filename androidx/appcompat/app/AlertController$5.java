/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController$RecycleListView;

class AlertController$5
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ AlertController c;

    public AlertController$5(AlertController alertController, View view, View view2) {
        this.c = alertController;
        this.a = view;
        this.b = view2;
    }

    public final void run() {
        AlertController$RecycleListView alertController$RecycleListView = this.c.g;
        View view = this.a;
        View view2 = this.b;
        AlertController.b((View)alertController$RecycleListView, view, view2);
    }
}

