/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/*
 * Renamed from iG2
 */
public final class ig2_2 {
    public static final int a(RecyclerView object) {
        if (object != null && (object = ((RecyclerView)object).getLayoutManager()) != null) {
            return ((LinearLayoutManager)object).findFirstCompletelyVisibleItemPosition();
        }
        return -1;
    }
}

