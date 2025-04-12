/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.vision.text;

import android.content.Context;
import com.google.android.gms.internal.vision.zzam;
import com.google.android.gms.internal.vision.zzan;
import com.google.android.gms.vision.text.TextRecognizer;

public class TextRecognizer$Builder {
    private Context zza;
    private zzam zzb;

    public TextRecognizer$Builder(Context object) {
        this.zza = object;
        this.zzb = object;
    }

    public TextRecognizer build() {
        Object object = this.zza;
        zzam zzam2 = this.zzb;
        zzan zzan2 = new zzan((Context)object, zzam2);
        object = new TextRecognizer(zzan2, null);
        return object;
    }
}

