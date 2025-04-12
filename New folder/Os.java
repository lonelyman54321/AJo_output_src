/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorSpace$Named
 *  android.view.ViewStructure
 *  android.view.autofill.AutofillId
 */
import android.graphics.ColorSpace;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;

public final class Os {
    public static /* bridge */ /* synthetic */ ColorSpace.Named a() {
        return ColorSpace.Named.ACES;
    }

    public static /* bridge */ /* synthetic */ void b(ViewStructure viewStructure, AutofillId autofillId, int n3) {
        viewStructure.setAutofillId(autofillId, n3);
    }
}

