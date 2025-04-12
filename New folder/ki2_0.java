/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ki2
 */
public final class ki2_0
extends RecyclerView$s {
    public final /* synthetic */ ji2_1 a;

    public ki2_0(ji2_1 ji2_12) {
        this.a = ji2_12;
    }

    public final void onScrollStateChanged(RecyclerView object, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(object, "recyclerView");
        object = this.a;
        Object object2 = ((ji2_1)object).f;
        String string2 = "mColorLayoutManager";
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        n3 = object2.findFirstCompletelyVisibleItemPosition();
        LinearLayoutManager linearLayoutManager = ((ji2_1)object).f;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            linearLayoutManager = null;
        }
        int n7 = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        n4 = 8;
        String string3 = "prevIv";
        if (n3 > 0) {
            object2 = ((ji2_1)object).k;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object2 = null;
            }
            object2.setVisibility(0);
        } else {
            object2 = ((ji2_1)object).k;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object2 = null;
            }
            object2.setVisibility(n4);
        }
        n3 = ((ji2_1)object).m + -1;
        string3 = "nextIv";
        if (n7 < n3) {
            object = ((ji2_1)object).l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object3 = object;
            }
            object3.setVisibility(0);
        } else {
            object = ((ji2_1)object).l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                object3 = object;
            }
            object3.setVisibility(n4);
        }
    }
}

