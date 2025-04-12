/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$y;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.Intrinsics;

public final class t8
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t8(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                FirebaseMessaging.i((FirebaseMessaging)object);
                return;
            }
            case 0: 
        }
        Object object2 = q9_0.Companion;
        object = (RecyclerView)object;
        Intrinsics.checkNotNullParameter(object, "$this_apply");
        object2 = ((RecyclerView)object).getLayoutManager();
        if (object2 != null) {
            RecyclerView$y recyclerView$y = new RecyclerView$y();
            ((RecyclerView$o)object2).smoothScrollToPosition((RecyclerView)object, recyclerView$y, 0);
        }
    }
}

