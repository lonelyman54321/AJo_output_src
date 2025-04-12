/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.media3.ui.LegacyPlayerControlView;
import com.google.android.material.search.SearchView;
import kotlin.jvm.internal.Intrinsics;

public final class Tt1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Tt1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                SearchView.e((SearchView)this.b);
                return;
            }
            case 1: {
                Object object = (ks2_1)this.b;
                String string2 = "this$0";
                Intrinsics.checkNotNullParameter(object, string2);
                object = ((ks2_1)object).d;
                if (object != null) {
                    ai0_2.a((View)object);
                }
                return;
            }
            case 0: 
        }
        ((LegacyPlayerControlView)((Object)this.b)).a();
    }
}

