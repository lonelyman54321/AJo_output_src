/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from CK
 */
public final class ck_2
extends ArrayAdapter {
    public final ArrayList a;

    public ck_2(FragmentActivity fragmentActivity, int n3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        Intrinsics.checkNotNullParameter(arrayList, "data");
        super((Context)fragmentActivity, n3, (List)arrayList);
        this.a = arrayList;
    }

    public final View b(int n3, ViewGroup viewGroup) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.cancel_reason_spinner_layout;
        viewGroup = object.inflate(n4, viewGroup, false);
        int n7 = R$id.tv_reasons;
        object = viewGroup.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioTextView)object;
        ArrayList arrayList = this.a;
        String string2 = (String)arrayList.get(n3);
        if (string2 != null) {
            string2 = ((Object)StringsKt.m0(string2)).toString();
        } else {
            n3 = 0;
            string2 = null;
        }
        object.setText((CharSequence)string2);
        return viewGroup;
    }

    public final View getDropDownView(int n3, View view, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return this.b(n3, viewGroup);
    }

    public final View getView(int n3, View view, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View view2 = this.b(n3, viewGroup);
        Intrinsics.checkNotNull(view2);
        return view2;
    }
}

