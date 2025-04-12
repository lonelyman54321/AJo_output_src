/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObserver
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ListAdapter
 *  android.widget.SpinnerAdapter
 */
package androidx.appcompat.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

public final class AppCompatSpinner$c
implements ListAdapter,
SpinnerAdapter {
    public SpinnerAdapter a;
    public ListAdapter b;

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final int getCount() {
        int n3;
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            n3 = 0;
            spinnerAdapter = null;
        } else {
            n3 = spinnerAdapter.getCount();
        }
        return n3;
    }

    public final View getDropDownView(int n3, View view, ViewGroup viewGroup) {
        View view2;
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            n3 = 0;
            view2 = null;
        } else {
            view2 = spinnerAdapter.getDropDownView(n3, view, viewGroup);
        }
        return view2;
    }

    public final Object getItem(int n3) {
        Object object;
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter == null) {
            n3 = 0;
            object = null;
        } else {
            object = spinnerAdapter.getItem(n3);
        }
        return object;
    }

    public final long getItemId(int n3) {
        SpinnerAdapter spinnerAdapter = this.a;
        long l2 = spinnerAdapter == null ? (long)-1 : spinnerAdapter.getItemId(n3);
        return l2;
    }

    public final int getItemViewType(int n3) {
        return 0;
    }

    public final View getView(int n3, View view, ViewGroup viewGroup) {
        return this.getDropDownView(n3, view, viewGroup);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean hasStableIds() {
        boolean bl2;
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter != null && (bl2 = spinnerAdapter.hasStableIds())) {
            bl2 = true;
        } else {
            bl2 = false;
            spinnerAdapter = null;
        }
        return bl2;
    }

    public final boolean isEmpty() {
        int n3 = this.getCount();
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean isEnabled(int n3) {
        ListAdapter listAdapter = this.b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(n3);
        }
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.a;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }
}

