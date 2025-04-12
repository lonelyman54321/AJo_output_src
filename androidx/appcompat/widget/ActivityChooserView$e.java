/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.widget.ActivityChooserView;

public final class ActivityChooserView$e
extends BaseAdapter {
    public final /* synthetic */ ActivityChooserView a;

    public ActivityChooserView$e(ActivityChooserView activityChooserView) {
        this.a = activityChooserView;
    }

    public final int getCount() {
        throw null;
    }

    public final Object getItem(int n3) {
        throw null;
    }

    public final long getItemId(int n3) {
        return n3;
    }

    public final int getItemViewType(int n3) {
        return 0;
    }

    public final View getView(int n3, View view, ViewGroup viewGroup) {
        int n4;
        int n7;
        ActivityChooserView activityChooserView = this.a;
        if (view == null || (n7 = view.getId()) != (n4 = R$id.list_item)) {
            view = LayoutInflater.from((Context)activityChooserView.getContext());
            n7 = R$layout.abc_activity_chooser_view_list_item;
            n4 = 0;
            view = view.inflate(n7, viewGroup, false);
        }
        activityChooserView.getContext().getPackageManager();
        int n8 = R$id.icon;
        view = (ImageView)view.findViewById(n8);
        this.getItem(n3);
        throw null;
    }

    public final int getViewTypeCount() {
        return 3;
    }
}

