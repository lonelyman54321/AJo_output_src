/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b$g;
import androidx.fragment.app.b$h;
import androidx.fragment.app.n$c;
import androidx.fragment.app.n$c$b;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gn0
 */
public final class gn0_0
implements Runnable {
    public final /* synthetic */ b$g a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ gn0_0(b$g b$g, ViewGroup viewGroup) {
        this.a = b$g;
        this.b = viewGroup;
    }

    public final void run() {
        boolean bl2;
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ViewGroup viewGroup = this.b;
        Intrinsics.checkNotNullParameter(viewGroup, "$container");
        Iterator iterator = ((Iterable)((b$g)object).c).iterator();
        while (bl2 = iterator.hasNext()) {
            object = ((b$h)iterator.next()).a;
            View view = ((n$c)object).c.getView();
            if (view == null) continue;
            object = ((n$c)object).a;
            ((n$c$b)((Object)object)).applyState(view, viewGroup);
        }
    }
}

