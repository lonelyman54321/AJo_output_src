/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfs;
import com.google.android.gms.internal.clearcut.zzfw;
import com.google.android.gms.internal.clearcut.zzfx;
import com.google.android.gms.internal.clearcut.zzfy;
import com.google.android.gms.internal.clearcut.zzfz;

public class zzfu
extends zzfz {
    protected zzfw zzrj;

    public /* synthetic */ Object clone() {
        return this.zzeo();
    }

    public void zza(zzfs zzfs2) {
        Cloneable cloneable;
        int n3;
        zzfw zzfw2 = this.zzrj;
        if (zzfw2 == null) {
            return;
        }
        zzfw2 = null;
        for (int i3 = 0; i3 < (n3 = ((zzfw)(cloneable = this.zzrj)).size()); ++i3) {
            cloneable = this.zzrj.zzaq(i3);
            ((zzfx)cloneable).zza(zzfs2);
        }
    }

    public int zzen() {
        zzfw zzfw2 = this.zzrj;
        if (zzfw2 != null) {
            Cloneable cloneable;
            int n3;
            zzfw2 = null;
            for (int i3 = 0; i3 < (n3 = ((zzfw)(cloneable = this.zzrj)).size()); ++i3) {
                cloneable = this.zzrj.zzaq(i3);
                ((zzfx)cloneable).zzen();
            }
        }
        return 0;
    }

    public zzfu zzeo() {
        zzfu zzfu2 = (zzfu)super.zzep();
        zzfy.zza(this, zzfu2);
        return zzfu2;
    }

    public /* synthetic */ zzfz zzep() {
        return (zzfu)this.clone();
    }
}

