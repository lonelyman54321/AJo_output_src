/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzlg;
import com.google.android.gms.internal.vision.zzlh;
import com.google.android.gms.internal.vision.zzlj;
import com.google.android.gms.internal.vision.zzlo;
import java.util.Iterator;

final class zzli
extends zzlo {
    private final /* synthetic */ zzlh zza;

    private zzli(zzlh zzlh2) {
        this.zza = zzlh2;
        super(zzlh2, null);
    }

    public /* synthetic */ zzli(zzlh zzlh2, zzlg zzlg2) {
        this(zzlh2);
    }

    public final Iterator iterator() {
        zzlh zzlh2 = this.zza;
        zzlj zzlj2 = new zzlj(zzlh2, null);
        return zzlj2;
    }
}

