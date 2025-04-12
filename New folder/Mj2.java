/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 */
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$o;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

public final class Mj2 {
    public static final void a(RecyclerView$B object, LinkedHashMap object2, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string2 = "scrollStates";
        Intrinsics.checkNotNullParameter(object2, string2);
        int n3 = ((RecyclerView$B)object).getLayoutPosition();
        object = n3;
        object = (Parcelable)((LinkedHashMap)object2).get(object);
        if (object != null) {
            if (recyclerView != null && (object2 = recyclerView.getLayoutManager()) != null) {
                ((RecyclerView$o)object2).onRestoreInstanceState((Parcelable)object);
            }
        } else if (recyclerView != null && (object = recyclerView.getLayoutManager()) != null) {
            object2 = null;
            ((RecyclerView$o)object).scrollToPosition(0);
        }
    }
}

