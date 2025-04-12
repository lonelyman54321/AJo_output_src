/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.FacetValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class VP$b
implements TextWatcher {
    public final /* synthetic */ vp_1 a;

    public VP$b(vp_1 vp_12) {
        this.a = vp_12;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "arg0");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "arg0");
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        Iterator iterator;
        Intrinsics.checkNotNullParameter(object, "query");
        Object object2 = this.a;
        Object object3 = ((vp_1)object2).f;
        if (object3 != null) {
            object3 = ((RecyclerView)object3).getAdapter();
        } else {
            n4 = 0;
            object3 = null;
        }
        n7 = object3 instanceof wp_1;
        if (n7 != 0 && (iterator = ((vp_1)object2).Pa()) != null && (iterator = ((F12)((Object)iterator)).d) != null && (iterator = ((bv2_0)((Object)iterator)).Z) != null) {
            boolean bl2;
            ArrayList<Object> arrayList = new ArrayList<Object>();
            iterator = ((ArrayList)((Object)iterator)).iterator();
            Object object4 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(iterator, (String)object4);
            while (bl2 = iterator.hasNext()) {
                boolean bl3;
                String string2;
                object4 = iterator.next();
                Intrinsics.checkNotNullExpressionValue(object4, "next(...)");
                String string3 = ((FacetValue)(object4 = (FacetValue)object4)).getDisplayName();
                boolean bl4 = StringsKt.F(string3, string2 = object.toString(), bl3 = true);
                if (!bl4) continue;
                arrayList.add(object4);
            }
            boolean bl5 = arrayList.isEmpty();
            n7 = 8;
            bl2 = false;
            object4 = null;
            if (bl5) {
                object = ((vp_1)object2).g;
                if (object != null) {
                    object.setVisibility(0);
                }
                if ((object = ((vp_1)object2).g) != null) {
                    n4 = R$string.filter_search_no_prd_found;
                    object3 = hv3_0.K(n4);
                    object.setContentDescription((CharSequence)object3);
                }
                object3 = Looper.getMainLooper();
                object = new Handler((Looper)object3);
                arrayList = null;
                object3 = new WP(object2, 0);
                long l2 = 300L;
                object.postDelayed((Runnable)object3, l2);
                object = ((vp_1)object2).f;
                if (object != null) {
                    object.setVisibility(n7);
                }
            } else {
                object = ((vp_1)object2).g;
                if (object != null) {
                    object.setVisibility(n7);
                }
                if ((object = ((vp_1)object2).f) != null) {
                    object.setVisibility(0);
                }
                object3 = (wp_1)object3;
                object = ImmutableList.copyOf((Collection)((vp_1)object2).Ra(arrayList));
                Intrinsics.checkNotNullExpressionValue(object, "copyOf(...)");
                object3.getClass();
                object2 = "facetValueList";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                ((wp_1)object3).a = object;
                ((RecyclerView$f)object3).notifyDataSetChanged();
            }
        }
    }
}

