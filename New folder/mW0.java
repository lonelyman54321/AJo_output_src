/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import androidx.fragment.app.FragmentManager;

public final class mW0
implements p60_0 {
    public final /* synthetic */ FragmentManager a;

    public /* synthetic */ mW0(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void accept(Object object) {
        object = (Configuration)object;
        FragmentManager fragmentManager = this.a;
        boolean bl2 = fragmentManager.Q();
        if (bl2) {
            bl2 = false;
            fragmentManager.i(false, (Configuration)object);
        }
    }
}

