/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.Intrinsics;

public final class mC0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ mC0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (gd1_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((gd1_2)object2).b;
                if (object != null) {
                    object.p5();
                }
                return;
            }
            case 0: 
        }
        object2 = (oc0_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        boolean bl2 = ((oc0_2)object2).l;
        if (bl2 && (object = ((oc0_2)object2).k) != null) {
            object = ((h5_0)object).o;
            object2 = Boolean.TRUE;
            ((LiveData)object).k(object2);
        }
    }
}

