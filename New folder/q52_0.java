/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.customviews.widgets.RecyclerItemTouchHelper;
import com.ril.ajio.data.database.entity.Notifications;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q52
 */
public final class q52_0
extends RecyclerItemTouchHelper {
    public final /* synthetic */ p52_0 a;

    public q52_0(p52_0 p52_02, FragmentActivity fragmentActivity) {
        this.a = p52_02;
        Intrinsics.checkNotNull(fragmentActivity);
        super((Context)fragmentActivity);
    }

    public final void onSwiped(RecyclerView$B object, int n3) {
        Intrinsics.checkNotNullParameter(object, "p0");
        int n4 = ((RecyclerView$B)object).getAdapterPosition();
        Object object2 = this.a;
        ArrayList arrayList = ((p52_0)object2).c;
        arrayList = arrayList != null ? ((dz1_2)((Object)arrayList)).b : null;
        Intrinsics.checkNotNull(arrayList);
        arrayList = (Notifications)arrayList.get(n4);
        dz1_2 dz1_22 = ((p52_0)object2).c;
        if (dz1_22 != null) {
            Serializable serializable = dz1_22.b;
            if (serializable != null) {
                serializable = (Notifications)serializable.remove(n4);
            }
            dz1_22.notifyItemRemoved(n4);
        }
        if ((object = ((p52_0)object2).a) != null) {
            object2 = ((Notifications)((Object)arrayList)).getId();
            object.ga((String)object2);
        }
    }
}

