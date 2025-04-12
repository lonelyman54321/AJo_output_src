/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorSpace$Rgb
 *  android.graphics.ColorSpace$Rgb$TransferParameters
 *  android.view.autofill.AutofillManager
 *  android.view.autofill.AutofillManager$AutofillCallback
 */
import android.graphics.ColorSpace;
import android.view.autofill.AutofillManager;

public final class Xs {
    public static /* bridge */ /* synthetic */ ColorSpace.Rgb.TransferParameters a(ColorSpace.Rgb rgb) {
        return rgb.getTransferParameters();
    }

    public static /* bridge */ /* synthetic */ void b(AutofillManager autofillManager, AutofillManager.AutofillCallback autofillCallback) {
        autofillManager.registerCallback(autofillCallback);
    }
}

