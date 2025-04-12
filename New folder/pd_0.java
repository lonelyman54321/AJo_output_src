/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pd
 */
public final class pd_0
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View a;

    public /* synthetic */ pd_0(View view) {
        this.a = view;
    }

    public final void onGlobalLayout() {
        boolean bl2;
        Object object = this.a;
        Object object2 = "$view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ViewCompat.i(object);
        if (object != null) {
            object = object.a;
            int n3 = 8;
            bl2 = object.o(n3);
        } else {
            bl2 = true;
        }
        if (bl2) {
            object = sq0_1.d;
            object2 = new qg3_2(2, null);
            int n4 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object2, n4);
        }
    }
}

