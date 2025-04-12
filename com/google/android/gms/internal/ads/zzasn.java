/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzasm;
import com.google.android.gms.internal.ads.zzaso;
import com.google.android.gms.internal.ads.zzasq;
import com.google.android.gms.internal.ads.zzasr;
import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzhkb;
import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzasn
implements zzaso {
    private static final Logger zzb = Logger.getLogger(zzasn.class.getName());
    final ThreadLocal zza;

    public zzasn() {
        zzasm zzasm2 = new zzasm(this);
        this.zza = zzasm2;
    }

    public abstract zzasr zza(String var1, byte[] var2, String var3);

    public final zzasr zzb(zzhkb object, zzass object2) {
        Object object3;
        long l2;
        int n3;
        long l3 = object.zzb();
        Object object4 = ((ByteBuffer)this.zza.get()).rewind();
        int n4 = 8;
        ((Buffer)object4).limit(n4);
        while ((n3 = object.zza((ByteBuffer)(object4 = (ByteBuffer)this.zza.get()))) != n4) {
            if (n3 >= 0) continue;
            object.zze(l3);
            object = new EOFException();
            throw object;
        }
        ((ByteBuffer)this.zza.get()).rewind();
        Object object5 = (ByteBuffer)this.zza.get();
        l3 = zzasq.zze((ByteBuffer)object5);
        long l4 = 8;
        n3 = 0;
        object4 = null;
        long l7 = 1L;
        long l8 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l8 < 0 && (l2 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1)) > 0) {
            object = zzb;
            object2 = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder(80);
            stringBuilder.append("Plausibility check failed: size < 8 (size = ");
            stringBuilder.append(l3);
            stringBuilder.append("). Stop parsing!");
            object5 = stringBuilder.toString();
            ((Logger)object).logp((Level)object2, "com.coremedia.iso.AbstractBoxParser", "parseBox", (String)object5);
            return null;
        }
        Object object6 = (ByteBuffer)this.zza.get();
        int n7 = 4;
        Object object7 = new byte[n7];
        ((ByteBuffer)object6).get((byte[])object7);
        String string2 = "ISO-8859-1";
        try {
            object6 = new String((byte[])object7, string2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object2 = new RuntimeException(unsupportedEncodingException);
            throw object2;
        }
        long l12 = -16;
        n7 = 16;
        long l14 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
        if (l14 == false) {
            ((ByteBuffer)this.zza.get()).limit(n7);
            object5 = (ByteBuffer)this.zza.get();
            object.zza((ByteBuffer)object5);
            ((ByteBuffer)this.zza.get()).position(n4);
            object5 = (ByteBuffer)this.zza.get();
            l3 = zzasq.zzf((ByteBuffer)object5) + l12;
        } else {
            l7 = 0L;
            long l15 = l3 - l7;
            n4 = (int)(l15 == 0L ? 0 : (l15 < 0L ? -1 : 1));
            if (n4 == 0) {
                l3 = object.zzc();
                l7 = object.zzb();
                l3 -= l7;
            } else {
                l7 = -8;
                l3 += l7;
            }
        }
        Object object8 = "uuid";
        n4 = (int)(((String)object8).equals(object6) ? 1 : 0);
        if (n4 != 0) {
            object4 = (ByteBuffer)this.zza.get();
            n4 = ((ByteBuffer)this.zza.get()).limit() + n7;
            ((ByteBuffer)object4).limit(n4);
            object4 = (ByteBuffer)this.zza.get();
            object.zza((ByteBuffer)object4);
            object4 = new byte[n7];
            object8 = (ByteBuffer)this.zza.get();
            for (n4 = ((Buffer)object8).position() + -16; n4 < (n7 = ((Buffer)(object7 = (Object)((ByteBuffer)this.zza.get()))).position()); ++n4) {
                object7 = (ByteBuffer)this.zza.get();
                n7 = ((Buffer)object7).position() + -16;
                object3 = (ByteBuffer)this.zza.get();
                byte by2 = ((ByteBuffer)object3).get(n4);
                n7 = n4 - n7;
                object4[n7] = by2;
            }
            l3 += l12;
        }
        l12 = l3;
        boolean bl2 = object2 instanceof zzasr;
        if (bl2) {
            object5 = object2;
            object5 = ((zzasr)object2).zza();
        } else {
            object5 = "";
        }
        object5 = this.zza((String)object6, (byte[])object4, (String)object5);
        object5.zzc((zzass)object2);
        ((ByteBuffer)this.zza.get()).rewind();
        Object object9 = object2 = this.zza.get();
        object9 = (ByteBuffer)object2;
        object7 = object5;
        object3 = object;
        object5.zzb((zzhkb)object, (ByteBuffer)object9, l12, this);
        return object5;
    }
}

