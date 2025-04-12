/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.material.sidesheet;

import android.view.View;
import com.google.android.material.sidesheet.SheetDialog;

public final class a
implements View.OnClickListener {
    public final /* synthetic */ SheetDialog a;

    public /* synthetic */ a(SheetDialog sheetDialog) {
        this.a = sheetDialog;
    }

    public final void onClick(View view) {
        SheetDialog.b(this.a, view);
    }
}

