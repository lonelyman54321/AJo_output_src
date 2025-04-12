/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$p;

/*
 * Renamed from vD3
 */
public final class vd3_1
implements RecyclerView$p {
    public final void b(View view) {
    }

    public final void d(View object) {
        int n3;
        object = (RecyclerView$LayoutParams)object.getLayoutParams();
        int n4 = object.width;
        int n7 = -1;
        if (n4 == n7 && (n3 = object.height) == n7) {
            return;
        }
        object = new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        throw object;
    }
}

