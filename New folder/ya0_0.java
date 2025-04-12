/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.customviews.widgets.OnFragmentInteractionListener;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YA0
 */
public final class ya0_0
implements View.OnClickListener {
    public final /* synthetic */ OnFragmentInteractionListener a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ ya0_0(OnFragmentInteractionListener onFragmentInteractionListener, String string2) {
        this.a = onFragmentInteractionListener;
        this.b = string2;
        this.c = 12134;
    }

    public final void onClick(View object) {
        String string2 = this.b;
        Intrinsics.checkNotNullParameter(string2, "$tag");
        object = this.a;
        if (object != null) {
            int n3 = this.c;
            object.onFragmentInteraction(string2, n3, null);
        }
    }
}

