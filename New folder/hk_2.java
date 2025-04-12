/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HK
 */
public final class hk_2
implements View.OnClickListener {
    public final /* synthetic */ jk_2 a;

    public /* synthetic */ hk_2(jk_2 jk_22) {
        this.a = jk_22;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((jk_2)object).m;
        Object object3 = Boolean.TRUE;
        boolean bl2 = Intrinsics.areEqual(object2, object3);
        if (bl2) {
            ((BottomSheetDialogFragment)object).dismiss();
            object = ((db2_1)((jk_2)object).o.getValue()).C;
            ((LiveData)object).k(object3);
        } else {
            object2 = ((jk_2)object).l;
            if (object2 != null) {
                object3 = ((jk_2)object).n;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
                    object3 = null;
                }
                object3.startLoader();
                object = ((jk_2)object).i;
                if (object != null) {
                    Intrinsics.checkNotNullParameter(object2, "returnId");
                    String string2 = "ODP";
                    Intrinsics.checkNotNullParameter(string2, "returnCancelRequestPage");
                    object3 = md3_0.c((jD3)object);
                    nk_2 nk_22 = new nk_2((ok_2)object, (String)object2, string2, null);
                    int n3 = 3;
                    Ae3.d((i90_0)object3, null, null, nk_22, n3);
                }
            }
        }
    }
}

