/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.search.SearchView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Hb
 */
public final class hb_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hb_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                SearchView.f((SearchView)this.b, view);
                return;
            }
            case 0: 
        }
        ib_2 ib_22 = (ib_2)this.b;
        Intrinsics.checkNotNullParameter(ib_22, "this$0");
        ib_22.dismiss();
    }
}

