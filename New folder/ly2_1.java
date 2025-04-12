/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.util.SparseArray
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.preference.R$id;
import androidx.recyclerview.widget.RecyclerView$B;

/*
 * Renamed from ly2
 */
public final class ly2_1
extends RecyclerView$B {
    public final Drawable a;
    public final ColorStateList b;
    public final SparseArray c;
    public boolean d;
    public boolean e;

    public ly2_1(View view) {
        super(view);
        SparseArray sparseArray;
        this.c = sparseArray = new SparseArray(4);
        int n3 = 16908310;
        TextView textView = (TextView)view.findViewById(n3);
        sparseArray.put(n3, (Object)textView);
        n3 = 0x1020010;
        View view2 = view.findViewById(n3);
        sparseArray.put(n3, (Object)view2);
        n3 = 16908294;
        view2 = view.findViewById(n3);
        sparseArray.put(n3, (Object)view2);
        n3 = R$id.icon_frame;
        view2 = view.findViewById(n3);
        sparseArray.put(n3, (Object)view2);
        n3 = 16908350;
        view2 = view.findViewById(n3);
        sparseArray.put(n3, (Object)view2);
        view = view.getBackground();
        this.a = view;
        if (textView != null) {
            view = textView.getTextColors();
            this.b = view;
        }
    }

    public final View w(int n3) {
        SparseArray sparseArray = this.c;
        View view = (View)sparseArray.get(n3);
        if (view != null) {
            return view;
        }
        view = this.itemView.findViewById(n3);
        if (view != null) {
            sparseArray.put(n3, (Object)view);
        }
        return view;
    }
}

