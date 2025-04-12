/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$s;
import kotlin.jvm.internal.Intrinsics;

public final class I41
implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ M41 a;

    public /* synthetic */ I41(M41 m41) {
        this.a = m41;
    }

    public final void onScrollChanged() {
        M41 m41 = this.a;
        Intrinsics.checkNotNullParameter(m41, "this$0");
        Object object = m41.h;
        Object object2 = null;
        object = object != null ? object.getParent() : null;
        boolean bl2 = object instanceof ViewGroup;
        object = bl2 ? (ViewGroup)object : null;
        bl2 = object instanceof RecyclerView;
        if (bl2) {
            object2 = object;
            object2 = (RecyclerView)object;
        }
        if (object2 != null) {
            object = new N41(m41);
            ((RecyclerView)object2).addOnScrollListener((RecyclerView$s)object);
        }
    }
}

