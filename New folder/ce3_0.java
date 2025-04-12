/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.material.internal.ViewUtils;

/*
 * Renamed from cE3
 */
public final class ce3_0
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ce3_0(View view, boolean bl2) {
        this.a = view;
        this.b = bl2;
    }

    public final void run() {
        View view = this.a;
        boolean bl2 = this.b;
        ViewUtils.a(view, bl2);
    }
}

