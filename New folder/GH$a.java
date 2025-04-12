/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;

public final class GH$a
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gh_1 b;

    public GH$a(gh_1 gh_12, int n3) {
        this.b = gh_12;
        this.a = n3;
    }

    public final void onClick(View object) {
        object = this.b;
        CTInboxListViewFragment cTInboxListViewFragment = (CTInboxListViewFragment)object.g.get();
        if (cTInboxListViewFragment != null) {
            int n3 = object.h;
            int n4 = this.a;
            cTInboxListViewFragment.Qa(n3, n4);
        }
    }
}

