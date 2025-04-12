/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.datepicker.MaterialDatePicker;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wH1
 */
public final class wh1_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ wh1_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View view) {
        int n3 = this.a;
        switch (n3) {
            default: {
                n32_0 n32_02 = (n32_0)this.b;
                Intrinsics.checkNotNullParameter(n32_02, "this$0");
                n32_02.dismiss();
                return;
            }
            case 1: {
                gu1_2 gu1_22 = (gu1_2)this.b;
                Intrinsics.checkNotNullParameter(gu1_22, "this$0");
                gu1_22.Oa();
                return;
            }
            case 0: 
        }
        MaterialDatePicker.Oa((MaterialDatePicker)this.b, view);
    }
}

