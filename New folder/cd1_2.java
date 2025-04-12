/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.SectionIndexer
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Home.BrandSubCategory;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from cD1
 */
public final class cd1_2
extends RecyclerView$f
implements SectionIndexer,
Comparable {
    public final ArrayList a;
    public final bd1_1 b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public ArrayList g;

    public cd1_2(ArrayList arrayList, bd1_1 bd1_12, String string2, boolean bl2, boolean bl3, int n3) {
        Intrinsics.checkNotNullParameter(arrayList, "dataList");
        Intrinsics.checkNotNullParameter(bd1_12, "brandClickListener");
        Intrinsics.checkNotNullParameter(string2, "pageType");
        this.a = arrayList;
        this.b = bd1_12;
        this.c = string2;
        this.d = bl2;
        this.e = bl3;
        this.f = n3;
    }

    public final int compareTo(Object object) {
        return 0;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final int getItemViewType(int n3) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            return ((dd1_2)arrayList.get((int)n3)).b;
        }
        return super.getItemViewType(n3);
    }

    public final int getPositionForSection(int n3) {
        ArrayList arrayList = this.g;
        Intrinsics.checkNotNull(arrayList);
        Object e2 = arrayList.get(n3);
        Intrinsics.checkNotNullExpressionValue(e2, "get(...)");
        return ((Number)e2).intValue();
    }

    public final int getSectionForPosition(int n3) {
        return 0;
    }

    public final Object[] getSections() {
        String[] stringArray;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        this.g = stringArray = new ArrayList();
        stringArray = this.a;
        int n3 = stringArray.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            Object object;
            Object object2 = ((dd1_2)stringArray.get((int)i3)).a;
            char c2 = object2 instanceof BrandSubCategory;
            if (c2 != '\u0000') {
                object2 = ((dd1_2)stringArray.get((int)i3)).a;
                object = "null cannot be cast to non-null type com.ril.ajio.services.data.Home.BrandSubCategory";
                Intrinsics.checkNotNull(object2, (String)object);
                object2 = ((BrandSubCategory)object2).getName();
                Intrinsics.checkNotNull(object2);
                c2 = Character.toUpperCase(((String)object2).charAt(0));
                object2 = String.valueOf(c2);
                bl2 = arrayList.contains(object2);
                if (bl2) continue;
                arrayList.add(object2);
                object2 = this.g;
                if (object2 == null) continue;
                object = i3;
                ((ArrayList)object2).add(object);
                continue;
            }
            object2 = ((dd1_2)stringArray.get((int)i3)).a;
            c2 = object2 instanceof String;
            if (c2 == '\u0000') continue;
            object2 = ((dd1_2)stringArray.get((int)i3)).a;
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type kotlin.String");
            object2 = ((String)object2).toUpperCase();
            object = "toUpperCase(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            bl2 = arrayList.contains(object2);
            if (bl2) continue;
            arrayList.add(object2);
            object2 = this.g;
            if (object2 == null) continue;
            object = i3;
            ((ArrayList)object2).add(object);
        }
        stringArray = new String[]{};
        return arrayList.toArray(stringArray);
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        Intrinsics.checkNotNullParameter(object, "viewHolder");
        Object object2 = this.a;
        Object object3 = ((ArrayList)object2).get(n3);
        Intrinsics.checkNotNullExpressionValue(object3, "get(...)");
        object3 = (dd1_2)object3;
        n3 = this.getItemViewType(n3);
        String string2 = "luxBrandData";
        if (n3 == 0) {
            object = (bd1_2)object;
            object.getClass();
            Intrinsics.checkNotNullParameter(object3, string2);
            Object object4 = ((dd1_2)object3).a;
            boolean bl2 = object4 instanceof String;
            if (bl2) {
                object4 = (CharSequence)object4;
                object = ((bd1_2)object).a;
                object.setText((CharSequence)object4);
            }
        } else {
            object = (kD1)object;
            ((ArrayList)object2).size();
            object.getClass();
            Intrinsics.checkNotNullParameter(object3, string2);
            Object object5 = ((dd1_2)object3).a;
            int n4 = object5 instanceof BrandSubCategory;
            string2 = ((kD1)object).b;
            String string3 = "";
            if (n4 != 0) {
                object5 = ((BrandSubCategory)object5).getName();
                object2 = ((dd1_2)object3).a;
                if (object5 != null && (n3 = (int)(kotlin.text.b.k((CharSequence)object5) ? 1 : 0)) == 0) {
                    object5 = object2;
                    object5 = (BrandSubCategory)object2;
                    string3 = ((BrandSubCategory)object5).getName();
                }
                object2 = (BrandSubCategory)object2;
                object5 = ((BrandSubCategory)object2).getActiveImageUrl();
                ImageView imageView = ((kD1)object).c;
                if (object5 != null && (n3 = ((String)object5).length()) != 0) {
                    boolean bl3;
                    object5 = new da$a();
                    ((da$a)object5).k = bl3 = true;
                    ((da$a)object5).g = bl3;
                    ((da$a)object5).n = object2 = ((BrandSubCategory)object2).getActiveImageUrl();
                    ((da$a)object5).u = imageView;
                    ((da$a)object5).a();
                } else {
                    object5 = imageView.getResources();
                    n4 = R$drawable.ic_placeholder_revamp;
                    Resources.Theme theme = imageView.getContext().getTheme();
                    object5 = object5.getDrawable(n4, theme);
                    imageView.setImageDrawable((Drawable)object5);
                }
                object5 = new id1_1((kD1)object, (dd1_2)object3);
                imageView.setOnClickListener((View.OnClickListener)object5);
                object5 = new jd1_1((kD1)object, (dd1_2)object3);
                string2.setOnClickListener((View.OnClickListener)object5);
            }
            object = hv3_0.u(string3);
            string2.setText((CharSequence)object);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Intrinsics.checkNotNullParameter(object, "parent");
        boolean bl2 = false;
        if (n3 == 0) {
            Object object2 = LayoutInflater.from((Context)object.getContext());
            int bl3 = R$layout.row_lux_brand_section;
            object = object2.inflate(bl3, (ViewGroup)object, false);
            Intrinsics.checkNotNull(object);
            bl2 = this.d;
            boolean n4 = this.e;
            String object3 = this.c;
            object2 = new bd1_2((View)object, object3, bl2, n4);
            return object2;
        }
        LayoutInflater layoutInflater = LayoutInflater.from((Context)object.getContext());
        int n4 = R$layout.row_lux_brand;
        View view = layoutInflater.inflate(n4, (ViewGroup)object, false);
        Intrinsics.checkNotNull(view);
        boolean bl3 = this.e;
        int n7 = this.f;
        bd1_1 bd1_12 = this.b;
        String string2 = this.c;
        boolean bl4 = this.d;
        Object object2 = object;
        object = new kD1(view, bd1_12, string2, bl4, bl3, n7);
        return object;
    }
}

