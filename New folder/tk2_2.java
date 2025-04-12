/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.b_0;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.k$b;
import androidx.recyclerview.widget.k$d;
import androidx.viewpager2.adapter.a;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tk2
 */
public final class tk2_2
extends a {
    public final FragmentManager j;
    public final String k;
    public final ArrayList l;
    public final HashMap m;

    public tk2_2(FragmentManager cloneable, i i3, String string2) {
        Intrinsics.checkNotNullParameter(cloneable, "fragmentManager");
        Intrinsics.checkNotNullParameter(i3, "lifecycle");
        Intrinsics.checkNotNullParameter(string2, "key");
        super((FragmentManager)((Object)cloneable), i3);
        this.j = cloneable;
        this.k = string2;
        this.l = cloneable = new Cloneable();
        super();
        this.m = cloneable;
    }

    public final int getItemCount() {
        return this.l.size();
    }

    public final long getItemId(int n3) {
        ArrayList arrayList = this.l;
        Subcomponent subcomponent = (Subcomponent)arrayList.get(n3);
        long l2 = subcomponent != null ? subcomponent.getIdUnique() : 0L;
        return l2;
    }

    public final boolean h(long l2) {
        Object object = this.l;
        boolean bl2 = object instanceof Collection;
        boolean bl3 = false;
        if (!bl2 || !(bl2 = object.isEmpty())) {
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                long l3;
                long l4;
                Subcomponent subcomponent = (Subcomponent)object.next();
                if (subcomponent == null || (bl2 = (l4 = (l3 = subcomponent.getIdUnique()) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1))) continue;
                bl3 = true;
                break;
            }
        }
        return bl3;
    }

    public final Fragment i(int n3) {
        ld3_1.Companion.getClass();
        String string2 = this.k;
        Intrinsics.checkNotNullParameter(string2, "key");
        ld3_1 ld3_12 = new ld3_1();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_POSITION", n3);
        bundle.putString("KEY_PAGE", string2);
        ld3_12.setArguments(bundle);
        Integer n4 = n3;
        this.m.put(n4, ld3_12);
        return ld3_12;
    }

    public final void n(List object) {
        Intrinsics.checkNotNullParameter(object, "newItems");
        ArrayList arrayList = this.l;
        Object object2 = new zk2_2(arrayList, (List)object);
        object2 = androidx.recyclerview.widget.k.a((k$b)object2);
        Intrinsics.checkNotNullExpressionValue(object2, "calculateDiff(...)");
        arrayList.clear();
        object = (Collection)object;
        arrayList.addAll(object);
        object = new b_0(this);
        ((k$d)object2).b((iv1_0)object);
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3, List list) {
        recyclerView$B = (iw0_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Intrinsics.checkNotNullParameter(list, "payloads");
        Object object = list;
        object = list;
        boolean bl2 = object.isEmpty() ^ true;
        if (bl2) {
            long l2 = recyclerView$B.getItemId();
            String string2 = "f";
            object = Wm2.a(l2, string2);
            FragmentManager fragmentManager = this.j;
            if ((object = fragmentManager.E((String)object)) == null) {
                super.onBindViewHolder(recyclerView$B, n3, list);
            }
        } else {
            super.onBindViewHolder(recyclerView$B, n3, list);
        }
    }
}

