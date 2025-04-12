/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  android.view.View
 */
package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import java.util.Objects;

public final class DialogFragment$c
implements F62 {
    public final /* synthetic */ DialogFragment a;

    public DialogFragment$c(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    public final void onChanged(Object object) {
        boolean bl2;
        if ((object = (mu1_1)object) != null && (bl2 = DialogFragment.access$200((DialogFragment)(object = this.a)))) {
            View view = ((Fragment)object).requireView();
            Object object2 = view.getParent();
            if (object2 == null) {
                object2 = DialogFragment.access$000((DialogFragment)object);
                if (object2 != null) {
                    object2 = "FragmentManager";
                    int n3 = 3;
                    boolean bl3 = Log.isLoggable((String)object2, (int)n3);
                    if (bl3) {
                        object2 = DialogFragment.access$000((DialogFragment)object);
                        Objects.toString(object2);
                    }
                    object = DialogFragment.access$000((DialogFragment)object);
                    object.setContentView(view);
                }
            } else {
                object = new IllegalStateException("DialogFragment can not be attached to a container view");
                throw object;
            }
        }
    }
}

