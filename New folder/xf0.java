/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.SearchableInfo
 *  android.database.Cursor
 *  android.widget.Filter
 *  android.widget.Filter$FilterResults
 */
import android.app.SearchableInfo;
import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;

public final class xf0
extends Filter {
    public xf0$a a;

    public final CharSequence convertResultToString(Object object) {
        object = (Cursor)object;
        return ((pg3_1)this.a).d((Cursor)object);
    }

    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int n3;
        pg3_1 pg3_12;
        block9: {
            pg3_12 = (pg3_1)this.a;
            if (charSequence == null) {
                charSequence = "";
            } else {
                pg3_12.getClass();
                charSequence = charSequence.toString();
            }
            SearchView searchView = pg3_12.k;
            int n4 = searchView.getVisibility();
            if (n4 == 0 && (n3 = searchView.getWindowVisibility()) == 0) {
                try {
                    searchView = pg3_12.l;
                }
                catch (RuntimeException runtimeException) {}
                charSequence = pg3_12.h((SearchableInfo)searchView, (String)charSequence);
                if (charSequence == null) break block9;
                charSequence.getCount();
            }
        }
        charSequence = null;
        pg3_12 = new Filter.FilterResults();
        if (charSequence != null) {
            ((Filter.FilterResults)pg3_12).count = n3 = charSequence.getCount();
            ((Filter.FilterResults)pg3_12).values = charSequence;
        } else {
            charSequence = null;
            ((Filter.FilterResults)pg3_12).count = 0;
            ((Filter.FilterResults)pg3_12).values = null;
        }
        return pg3_12;
    }

    public final void publishResults(CharSequence object, Filter.FilterResults object2) {
        Object object3 = object = this.a;
        object3 = ((gf0_0)object).c;
        object2 = object2.values;
        if (object2 != null && object2 != object3) {
            object2 = (Cursor)object2;
            object = (pg3_1)object;
            ((pg3_1)object).c((Cursor)object2);
        }
    }
}

