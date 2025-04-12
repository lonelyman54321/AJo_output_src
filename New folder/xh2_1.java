/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xh2
 */
public final class xh2_1
extends RecyclerView$s {
    public final /* synthetic */ yh2_0 a;

    public xh2_1(yh2_0 yh2_02) {
        this.a = yh2_02;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(object, "recyclerView");
        object = this.a;
        Object object2 = ((yh2_0)object).d;
        String string2 = "mColorLayoutManager";
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        n3 = object2.findFirstCompletelyVisibleItemPosition();
        LinearLayoutManager linearLayoutManager = ((yh2_0)object).d;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            linearLayoutManager = null;
        }
        int n7 = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        n4 = 8;
        String string3 = "prevIv";
        if (n3 > 0) {
            object2 = ((yh2_0)object).j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object2 = null;
            }
            object2.setVisibility(0);
        } else {
            object2 = ((yh2_0)object).j;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object2 = null;
            }
            object2.setVisibility(n4);
        }
        n3 = ((yh2_0)object).l + -1;
        string3 = "nextIv";
        if (n7 < n3) {
            object = ((yh2_0)object).k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object3 = object;
            }
            object3.setVisibility(0);
        } else {
            object = ((yh2_0)object).k;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object3 = object;
            }
            object3.setVisibility(n4);
        }
    }
}

