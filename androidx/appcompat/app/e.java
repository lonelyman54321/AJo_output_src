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
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.AlertController$b;

public final class e
implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView a;
    public final /* synthetic */ AlertController b;
    public final /* synthetic */ AlertController$b c;

    public e(AlertController$b alertController$b, AlertController$RecycleListView alertController$RecycleListView, AlertController alertController) {
        this.c = alertController$b;
        this.a = alertController$RecycleListView;
        this.b = alertController;
    }

    public final void onItemClick(AdapterView object, View object2, int n3, long l2) {
        object = this.c;
        object2 = object.E;
        AlertController$RecycleListView alertController$RecycleListView = this.a;
        if (object2 != null) {
            boolean bl2 = alertController$RecycleListView.isItemChecked(n3);
            object2[n3] = (View)bl2;
        }
        object = object.I;
        object2 = this.b.b;
        boolean bl3 = alertController$RecycleListView.isItemChecked(n3);
        object.onClick((DialogInterface)object2, n3, bl3);
    }
}

