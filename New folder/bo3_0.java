/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout$LayoutParams
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Home.NativeCategoryNavigationListDetail;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Bo3
 */
public final class bo3_0
extends RecyclerView$f {
    public final ArrayList a;
    public final C32 b;
    public final String c;
    public int d;

    public bo3_0(ArrayList arrayList, C32 c32, String string2) {
        Intrinsics.checkNotNullParameter(c32, "listener");
        this.a = arrayList;
        this.b = c32;
        this.c = string2;
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        int n4 = recyclerView$B instanceof Bo3$a;
        if (n4 != 0) {
            String string2;
            int n7;
            String[] stringArray;
            int n8;
            recyclerView$B = (Bo3$a)recyclerView$B;
            n4 = 0;
            object = null;
            Serializable serializable = this.a;
            serializable = serializable != null ? (NativeCategoryNavigationListDetail)CollectionsKt.N(n3, (List)((Object)serializable)) : null;
            int n10 = this.d;
            recyclerView$B.getClass();
            C32 c32 = this.b;
            Intrinsics.checkNotNullParameter(c32, "listener");
            int n14 = 1;
            double d2 = 0.75;
            Object object2 = ((Bo3$a)recyclerView$B).b;
            if (object2 != null && (n8 = ((String)object2).length()) > 0 && (n8 = (object2 = StringsKt.a0((CharSequence)object2, stringArray = new String[]{":"}, false, 0, n7 = 6)).size()) > n14) {
                string2 = (String)object2.get(n14);
                d2 = Double.parseDouble(string2);
                object2 = (String)object2.get(0);
                double d5 = Double.parseDouble((String)object2);
                d2 /= d5;
            }
            int n15 = hv3_0.F();
            n8 = mz3_0.d(10);
            n15 -= n8;
            n8 = mz3_0.d(40);
            n15 = (n15 - n8) / 4;
            double d7 = (double)n15 * d2;
            string2 = serializable != null ? ((NativeCategoryNavigationListDetail)serializable).getNativeCategoryName() : null;
            AppCompatImageView appCompatImageView = ((Bo3$a)recyclerView$B).c;
            appCompatImageView.setContentDescription(string2);
            string2 = appCompatImageView.getLayoutParams();
            ((ViewGroup.LayoutParams)string2).width = n15;
            ((ViewGroup.LayoutParams)string2).height = n8 = (int)d7;
            stringArray = new LinearLayout.LayoutParams((ViewGroup.LayoutParams)string2);
            appCompatImageView.setLayoutParams((ViewGroup.LayoutParams)stringArray);
            string2 = ((Bo3$a)recyclerView$B).d;
            stringArray = string2.getLayoutParams();
            stringArray.width = n15;
            float f5 = hv3_0.x(2.0f);
            stringArray.height = n15 = (int)f5;
            object2 = new LinearLayout.LayoutParams((ViewGroup.LayoutParams)stringArray);
            string2.setLayoutParams((ViewGroup.LayoutParams)object2);
            object2 = new da$a();
            ((da$a)object2).k = n14;
            ((da$a)object2).g = n14;
            if (serializable != null) {
                object = ((NativeCategoryNavigationListDetail)serializable).getImgUrlForTab();
            }
            ((da$a)object2).n = object;
            ((da$a)object2).u = appCompatImageView;
            ((da$a)object2).a();
            if (n10 == n3) {
                string2.setVisibility(0);
            } else {
                n4 = 8;
                string2.setVisibility(n4);
            }
            object = new ao3_0(c32, n3, (NativeCategoryNavigationListDetail)serializable);
            recyclerView$B = ((Bo3$a)recyclerView$B).e;
            recyclerView$B.setOnClickListener((View.OnClickListener)object);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.new_collapsing_naigation_item;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.c;
        Bo3$a bo3$a = new Bo3$a((View)viewGroup, (String)object);
        return bo3$a;
    }
}

