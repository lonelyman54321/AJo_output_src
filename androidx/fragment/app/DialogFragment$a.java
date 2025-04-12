/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 */
package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

public final class DialogFragment$a
implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogFragment a;

    public DialogFragment$a(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    public final void onCancel(DialogInterface object) {
        object = this.a;
        Dialog dialog = DialogFragment.access$000((DialogFragment)object);
        if (dialog != null) {
            dialog = DialogFragment.access$000((DialogFragment)object);
            ((DialogFragment)object).onCancel((DialogInterface)dialog);
        }
    }
}

