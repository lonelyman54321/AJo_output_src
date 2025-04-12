/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.preference.Preference;
import androidx.preference.Preference$b;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceGroupAdapter$a;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class PreferenceGroupAdapter
extends RecyclerView$f
implements Preference$b {
    public ArrayList a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(ArrayList arrayList, PreferenceGroup preference) {
        ArrayList arrayList2;
        synchronized (preference) {
            arrayList2 = preference.A;
            Collections.sort(arrayList2);
        }
        arrayList2 = preference.A;
        int n3 = arrayList2.size();
        if (n3 <= 0) {
            return;
        }
        preference = preference.l(0);
        arrayList.add(preference);
        new PreferenceGroupAdapter$a(preference);
        throw null;
    }

    public final int getItemCount() {
        throw null;
    }

    public final long getItemId(int n3) {
        boolean bl2 = this.hasStableIds();
        if (!bl2) {
            return -1;
        }
        return this.h(n3).a();
    }

    public final int getItemViewType(int n3) {
        Preference preference = this.h(n3);
        new PreferenceGroupAdapter$a(preference);
        throw null;
    }

    public final Preference h(int n3) {
        if (n3 < 0) {
            return null;
        }
        throw null;
    }

    public final void i() {
        ArrayList arrayList;
        boolean bl2;
        Iterator iterator = this.a.iterator();
        while (bl2 = iterator.hasNext()) {
            arrayList = (Preference)iterator.next();
            ((Preference)((Object)arrayList)).w = null;
        }
        int n3 = this.a.size();
        this.a = arrayList = new ArrayList(n3);
        this.g(arrayList, null);
        throw null;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        boolean bl2;
        int n4;
        WeakHashMap weakHashMap;
        Drawable drawable2;
        recyclerView$B = (ly2_1)recyclerView$B;
        Preference preference = this.h(n3);
        Drawable drawable3 = recyclerView$B.itemView.getBackground();
        if (drawable3 != (drawable2 = ((ly2_1)recyclerView$B).a)) {
            drawable3 = recyclerView$B.itemView;
            weakHashMap = ViewCompat.a;
            drawable3.setBackground(drawable2);
        }
        if ((drawable3 = (TextView)((ly2_1)recyclerView$B).w(n4 = 16908310)) != null && (drawable2 = ((ly2_1)recyclerView$B).b) != null && !(bl2 = ((Object)(weakHashMap = drawable3.getTextColors())).equals(drawable2))) {
            drawable3.setTextColor((ColorStateList)drawable2);
        }
        preference.f((ly2_1)recyclerView$B);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        throw null;
    }
}

