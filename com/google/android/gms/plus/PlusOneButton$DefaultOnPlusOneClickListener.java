/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.plus.PlusOneButton;
import com.google.android.gms.plus.PlusOneButton$OnPlusOneClickListener;

public class PlusOneButton$DefaultOnPlusOneClickListener
implements View.OnClickListener,
PlusOneButton$OnPlusOneClickListener {
    private final PlusOneButton$OnPlusOneClickListener zzn;
    private final /* synthetic */ PlusOneButton zzo;

    public PlusOneButton$DefaultOnPlusOneClickListener(PlusOneButton plusOneButton, PlusOneButton$OnPlusOneClickListener plusOneButton$OnPlusOneClickListener) {
        this.zzo = plusOneButton;
        this.zzn = plusOneButton$OnPlusOneClickListener;
    }

    public void onClick(View view) {
        view = (Intent)PlusOneButton.zza(this.zzo).getTag();
        PlusOneButton$OnPlusOneClickListener plusOneButton$OnPlusOneClickListener = this.zzn;
        if (plusOneButton$OnPlusOneClickListener != null) {
            plusOneButton$OnPlusOneClickListener.onPlusOneClick((Intent)view);
            return;
        }
        this.onPlusOneClick((Intent)view);
    }

    public void onPlusOneClick(Intent intent) {
        Context context = this.zzo.getContext();
        int n3 = context instanceof Activity;
        if (n3 != 0 && intent != null) {
            context = (Activity)context;
            PlusOneButton plusOneButton = this.zzo;
            n3 = PlusOneButton.zzb(plusOneButton);
            context.startActivityForResult(intent, n3);
        }
    }
}

