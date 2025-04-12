/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

public final class DialogFragment$b
implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment a;

    public DialogFragment$b(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    public final void onDismiss(DialogInterface object) {
        object = this.a;
        Dialog dialog = DialogFragment.access$000((DialogFragment)object);
        if (dialog != null) {
            dialog = DialogFragment.access$000((DialogFragment)object);
            ((DialogFragment)object).onDismiss((DialogInterface)dialog);
        }
    }
}

