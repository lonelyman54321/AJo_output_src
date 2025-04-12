/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;

/*
 * Renamed from aI$a
 */
public final class ai$a_0
implements View.OnClickListener {
    public final /* synthetic */ ai_1 a;

    public ai$a_0(ai_1 ai_12) {
        this.a = ai_12;
    }

    public final void onClick(View view) {
        ai_1 ai_12 = this.a;
        ai_12.Pa(null);
        ai_12.getActivity().finish();
    }
}

