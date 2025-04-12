/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from J71
 */
public final class j71_0
extends RecyclerView$s {
    public final /* synthetic */ i71_0 a;

    public j71_0(i71_0 i71_02) {
        this.a = i71_02;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        Object object2 = "recyclerView";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (n3 == 0) {
            object = this.a;
            Object object3 = ((i71_0)object).c;
            object2 = null;
            if (object3 != null) {
                object3 = ((RecyclerView)object3).getLayoutManager();
            } else {
                n3 = 0;
                object3 = null;
            }
            boolean bl2 = object3 instanceof LinearLayoutManager;
            if (bl2) {
                object2 = object3;
                object2 = (LinearLayoutManager)object3;
            }
            if (object2 != null) {
                n3 = ((LinearLayoutManager)object2).findLastVisibleItemPosition();
            } else {
                n3 = 0;
                object3 = null;
            }
            ((i71_0)object).Sa(n3);
        }
    }
}

