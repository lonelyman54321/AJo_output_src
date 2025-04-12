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
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from p80
 */
public final class p80_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ p80_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (oc0_2)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = ((oc0_2)object).k;
                if (object != null) {
                    object = ((h5_0)object).n;
                    object2 = Boolean.TRUE;
                    ((LiveData)object).k(object2);
                }
                return;
            }
            case 0: 
        }
        object = (r80_0)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        ((BottomSheetDialogFragment)object).dismiss();
    }
}

