/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaso;
import com.google.android.gms.internal.ads.zzasr;
import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzhkb;
import com.google.android.gms.internal.ads.zzhkh;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class zzhjw
implements zzasr {
    private static final zzhkh zza = zzhkh.zzb(zzhjw.class);
    protected final String zzb;
    boolean zzc;
    boolean zzd;
    long zze;
    long zzf = -1;
    zzhkb zzg;
    private zzass zzh;
    private ByteBuffer zzi;
    private ByteBuffer zzj = null;

    public zzhjw(String string2) {
        boolean bl2;
        this.zzb = string2;
        this.zzd = bl2 = true;
        this.zzc = bl2;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    private final void zzd() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block7: {
                    IOException iOException2;
                    block6: {
                        boolean bl2 = this.zzd;
                        if (bl2) break block7;
                        Object object = zza;
                        String string2 = "mem mapping ";
                        String string3 = this.zzb;
                        int n3 = string3.length();
                        string2 = n3 != 0 ? string2.concat(string3) : (string3 = new String(string2));
                        catch (Throwable throwable2) {
                            break block5;
                        }
                        catch (IOException iOException2) {
                            break block6;
                        }
                        ((zzhkh)object).zza(string2);
                        object = this.zzg;
                        long l2 = this.zze;
                        long l3 = this.zzf;
                        this.zzi = object = object.zzd(l2, l3);
                        this.zzd = bl2 = true;
                        return;
                    }
                    RuntimeException runtimeException = new RuntimeException(iOException2);
                    throw runtimeException;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final void zzb(zzhkb zzhkb2, ByteBuffer byteBuffer, long l2, zzaso zzaso2) {
        long l3;
        this.zze = l3 = zzhkb2.zzb();
        byteBuffer.remaining();
        this.zzf = l2;
        this.zzg = zzhkb2;
        l3 = zzhkb2.zzb() + l2;
        zzhkb2.zze(l3);
        this.zzd = false;
        this.zzc = false;
        this.zzg();
    }

    public final void zzc(zzass zzass2) {
        this.zzh = zzass2;
    }

    public abstract void zzf(ByteBuffer var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                int n3;
                String string2;
                Object object;
                try {
                    this.zzd();
                    object = zza;
                    string2 = "parsing details of ";
                    String string3 = this.zzb;
                    int n4 = string3.length();
                    string2 = n4 != 0 ? string2.concat(string3) : (string3 = new String(string2));
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                ((zzhkh)object).zza(string2);
                object = this.zzi;
                if (object == null) {
                    return;
                }
                this.zzc = n3 = 1;
                ((ByteBuffer)object).rewind();
                this.zzf((ByteBuffer)object);
                n3 = ((Buffer)object).remaining();
                if (n3 > 0) {
                    this.zzj = object = ((ByteBuffer)object).slice();
                }
                object = null;
                this.zzi = null;
                return;
            }
            throw throwable2;
        }
    }
}

