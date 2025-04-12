/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaFormat
 */
package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzfn {
    public static void zza(MediaFormat mediaFormat, String string2, int n3) {
        int n4 = -1;
        if (n3 != n4) {
            mediaFormat.setInteger(string2, n3);
        }
    }

    public static void zzb(MediaFormat mediaFormat, List list) {
        int n3;
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            String string2 = hj0_0.a(i3, "csd-");
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])list.get(i3));
            mediaFormat.setByteBuffer(string2, byteBuffer);
        }
    }
}

