/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.os.Bundle
 */
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class pn
extends DialogFragment {
    public pn() {
    }

    public pn(int n3) {
        super(n3);
    }

    public Dialog onCreateDialog(Bundle object) {
        Context context = this.getContext();
        int n3 = this.getTheme();
        object = new on(context, n3);
        return object;
    }

    public void setupDialog(Dialog dialog, int n3) {
        block4: {
            block2: {
                int n4;
                Dialog dialog2;
                block3: {
                    int n7;
                    boolean bl2 = dialog instanceof on;
                    if (!bl2) break block2;
                    dialog2 = dialog;
                    dialog2 = (on)dialog;
                    n4 = 1;
                    if (n3 == n4 || n3 == (n7 = 2)) break block3;
                    n7 = 3;
                    if (n3 != n7) break block4;
                    dialog = dialog.getWindow();
                    n3 = 24;
                    dialog.addFlags(n3);
                }
                dialog2.supportRequestWindowFeature(n4);
                break block4;
            }
            super.setupDialog(dialog, n3);
        }
    }
}

