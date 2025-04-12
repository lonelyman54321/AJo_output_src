/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nG1
 */
public final class ng1_0
extends x32_0 {
    public final void Pa(View object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.plp_sort_cancel_layout;
        this.e = object2 = object.findViewById(n3);
        n3 = R$id.plp_sort_view_rv;
        object = (RecyclerView)object.findViewById(n3);
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        this.d = object;
        object2 = "recyclerView";
        List list = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            object = null;
        }
        FragmentActivity fragmentActivity = this.requireActivity();
        int n4 = 1;
        Object object3 = new LinearLayoutManager((Context)fragmentActivity, n4, false);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object3);
        object = this.Oa();
        object = object != null ? ((F12)object).d() : null;
        if (object != null) {
            object = this.d;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                object = null;
            }
            object3 = this.Oa();
            if (object3 != null) {
                list = ((F12)object3).d();
            }
            Intrinsics.checkNotNull(list);
            list = ImmutableList.copyOf((Collection)list);
            object3 = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(list, (String)object3);
            object2 = new u32_0((ImmutableList)list, this);
            ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.luxe_plp_sort_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }
}

