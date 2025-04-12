/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tagmanager.zzbk;

public class TagManagerPreviewActivity
extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getIntent().getData();
        if (bundle == null) {
            return;
        }
        zzbk.zzf(this.getIntent(), (Context)this);
    }
}

