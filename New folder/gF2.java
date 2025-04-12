/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class gF2
extends RecyclerView$B {
    public final AV2 a;
    public boolean b;
    public ArrayList c;
    public final TextView d;
    public final LinearLayout e;
    public final TextView f;
    public final RecyclerView g;
    public final LinearLayoutManager h;
    public zv2_2 i;

    public gF2(View object, AV2 aV2) {
        TextView textView;
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object);
        this.a = aV2;
        this.b = false;
        int n3 = R$id.recent_option;
        this.d = textView = (TextView)object.findViewById(n3);
        n3 = R$id.recent_history_container;
        textView = (LinearLayout)object.findViewById(n3);
        this.e = textView;
        n3 = R$id.recent_search_tv;
        this.f = textView = (TextView)object.findViewById(n3);
        n3 = R$id.rv_search_history;
        object = (RecyclerView)object.findViewById(n3);
        this.g = object;
        textView = this.itemView.getContext();
        super((Context)textView, 0, false);
        this.h = object;
    }

    public final void w(ArrayList object) {
        int n3;
        Object object2;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "searchList");
        this.c = object;
        boolean bl2 = this.b;
        Object object4 = this.d;
        if (!bl2) {
            bl2 = og1_1.c();
            object3 = "Edit";
            if (bl2) {
                if (object4 != null) {
                    object = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(object, "getDefault(...)");
                    object = ((String)object3).toUpperCase((Locale)object);
                    Intrinsics.checkNotNullExpressionValue(object, "toUpperCase(...)");
                    object2 = "<u>";
                    object3 = new StringBuilder((String)object2);
                    ((StringBuilder)object3).append((String)object);
                    ((StringBuilder)object3).append("</u>");
                    object = hv3_0.f(((StringBuilder)object3).toString());
                    object4.setText((CharSequence)object);
                }
            } else if (object4 != null) {
                object4.setText((CharSequence)object3);
            }
            if (object4 != null) {
                n3 = 2;
                object = new iT(this, n3);
                object4.setOnClickListener((View.OnClickListener)object);
            }
        }
        if ((object = this.g) != null) {
            object3 = this.h;
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object3);
        }
        if ((object3 = this.c) != null) {
            n3 = ((ArrayList)object3).size();
            object3 = n3;
        } else {
            n3 = 0;
            object3 = null;
        }
        Intrinsics.checkNotNull(object3);
        n3 = (Integer)object3;
        object2 = this.e;
        Object object5 = this.f;
        int n4 = 8;
        if (n3 > 0) {
            n3 = 0;
            object3 = null;
            if (object != null) {
                object.setVisibility(0);
            }
            object5.setVisibility(0);
            if (object2 != null) {
                object2.setVisibility(0);
            }
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            object5 = "recentSearchNewUIEnabled";
            boolean bl3 = ((ao0_0)object2).a((String)object5);
            if (bl3) {
                if (object4 != null) {
                    object4.setVisibility(0);
                }
            } else if (object4 != null) {
                object4.setVisibility(n4);
            }
            object3 = this.c;
            object2 = this.a;
            object4 = new zv2_2((ArrayList)object3, (AV2)object2);
            this.i = object4;
            n3 = (int)(this.b ? 1 : 0);
            object4.c = n3;
            if (object != null) {
                ((RecyclerView)object).setAdapter((RecyclerView$f)object4);
            }
        } else {
            if (object != null) {
                object.setVisibility(n4);
            }
            object5.setVisibility(n4);
            if (object4 != null) {
                object4.setVisibility(n4);
            }
            if (object2 != null) {
                object2.setVisibility(n4);
            }
        }
    }
}

