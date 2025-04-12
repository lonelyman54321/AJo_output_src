/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 */
package androidx.fragment.app;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

class DialogFragment$1
implements Runnable {
    public final /* synthetic */ DialogFragment a;

    public DialogFragment$1(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    public final void run() {
        DialogFragment dialogFragment = this.a;
        DialogInterface.OnDismissListener onDismissListener = DialogFragment.access$100(dialogFragment);
        dialogFragment = DialogFragment.access$000(dialogFragment);
        onDismissListener.onDismiss((DialogInterface)dialogFragment);
    }
}

