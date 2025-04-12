/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Facet;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VD1
 */
public final class vd1_0
extends zp_0 {
    public final void Qa(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.facet_value_rv;
        object = (RecyclerView)object.findViewById(n3);
        this.c = object;
        Object object2 = this.requireActivity();
        int n4 = 1;
        String string2 = null;
        object = new LinearLayoutManager((Context)object2, n4, false);
        object2 = this.c;
        if (object2 != null) {
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        }
        if ((object = (object = this.Pa()) != null && (object = ((F12)object).d) != null ? ((bv2_0)object).X : null) != null) {
            object = this.Pa();
            Intrinsics.checkNotNull(object);
            object = ((F12)object).d.X;
            Intrinsics.checkNotNull(object);
            object2 = this.c;
            if (object2 != null) {
                object = ((Facet)object).getCategoryGenderItemCount();
                Intrinsics.checkNotNullParameter(object, "categoryTitleCountMap");
                string2 = "categoryTitleClickListener";
                Intrinsics.checkNotNullParameter(this, string2);
                ud1_0 ud1_02 = new XP((HashMap)object, this);
                ((RecyclerView)object2).setAdapter(ud1_02);
            }
        }
    }
}

