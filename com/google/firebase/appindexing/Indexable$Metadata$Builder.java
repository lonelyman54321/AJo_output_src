/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.google.firebase.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.icing.zzfw;
import com.google.firebase.appindexing.builders.IndexableBuilder;
import com.google.firebase.appindexing.internal.zzac;

public final class Indexable$Metadata$Builder {
    private boolean zza;
    private int zzb;
    private String zzc;
    private final Bundle zzd;

    public Indexable$Metadata$Builder() {
        String string2;
        int n3;
        this.zza = n3 = zzfw.zzd().zza();
        this.zzb = n3 = zzfw.zzd().zzb();
        this.zzc = string2 = zzfw.zzd().zzc();
        this.zzd = string2;
    }

    public Indexable$Metadata$Builder setScope(int n3) {
        int n4;
        int n7 = 1;
        n4 = n3 > 0 && n3 <= (n4 = 3) ? 1 : 0;
        CharSequence charSequence = new StringBuilder(69);
        charSequence.append("The scope of this indexable is not valid, scope value is ");
        charSequence.append(n3);
        charSequence.append(".");
        charSequence = charSequence.toString();
        Preconditions.checkArgument(n4 != 0, charSequence);
        long l2 = n3;
        long[] lArray = new long[n7];
        lArray[0] = l2;
        IndexableBuilder.zzd(this.zzd, "scope", lArray);
        return this;
    }

    public Indexable$Metadata$Builder setScore(int n3) {
        boolean bl2 = n3 >= 0;
        CharSequence charSequence = new StringBuilder(53);
        charSequence.append("Negative score values are invalid. Value: ");
        charSequence.append(n3);
        charSequence = charSequence.toString();
        Preconditions.checkArgument(bl2, charSequence);
        this.zzb = n3;
        return this;
    }

    public Indexable$Metadata$Builder setSliceUri(Uri stringArray) {
        Preconditions.checkNotNull(stringArray);
        stringArray = stringArray.toString();
        stringArray = new String[]{stringArray};
        IndexableBuilder.zza(this.zzd, "sliceUri", stringArray);
        return this;
    }

    public Indexable$Metadata$Builder setWorksOffline(boolean bl2) {
        this.zza = bl2;
        return this;
    }

    public final zzac zza() {
        boolean bl2 = this.zza;
        int n3 = this.zzb;
        String string2 = this.zzc;
        Bundle bundle = this.zzd;
        zzac zzac2 = new zzac(bl2, n3, string2, bundle, null);
        return zzac2;
    }
}

