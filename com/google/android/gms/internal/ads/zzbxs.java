/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.ParcelFileDescriptor
 *  android.os.ParcelFileDescriptor$AutoCloseInputStream
 *  android.os.ParcelFileDescriptor$AutoCloseOutputStream
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class zzbxs
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    ParcelFileDescriptor zza;
    private Parcelable zzb;
    private boolean zzc;

    static {
        zzbxt zzbxt2 = new zzbxt();
        CREATOR = zzbxt2;
    }

    public zzbxs(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
        this.zzb = null;
        this.zzc = true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void writeToParcel(Parcel parcel, int n3) {
        Object object;
        int n4;
        block10: {
            ParcelFileDescriptor parcelFileDescriptor = this.zza;
            if (parcelFileDescriptor == null) {
                block9: {
                    void var4_8;
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
                    Object object2;
                    block8: {
                        parcelFileDescriptor = Parcel.obtain();
                        Object object3 = this.zzb;
                        object3.writeToParcel((Parcel)parcelFileDescriptor, 0);
                        object3 = parcelFileDescriptor.marshall();
                        n4 = 0;
                        parcelFileDescriptor = null;
                        try {
                            object = ParcelFileDescriptor.createPipe();
                            int n7 = 1;
                            object2 = object[n7];
                            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor)object2);
                        }
                        catch (IOException iOException) {
                            autoCloseOutputStream = null;
                            break block8;
                        }
                        try {
                            object2 = zzcci.zza;
                            zzbxr zzbxr2 = new zzbxr((OutputStream)autoCloseOutputStream, (byte[])object3);
                            object2.execute(zzbxr2);
                            parcelFileDescriptor = object[0];
                            break block9;
                        }
                        catch (IOException iOException) {}
                    }
                    zzm.zzh("Error transporting the ad response", (Throwable)var4_8);
                    object = "LargeParcelTeleporter.pipeData.2";
                    object2 = zzu.zzo();
                    ((zzcby)object2).zzw((Throwable)var4_8, (String)object);
                    IOUtils.closeQuietly((Closeable)autoCloseOutputStream);
                }
                this.zza = parcelFileDescriptor;
                break block10;
                finally {
                    parcelFileDescriptor.recycle();
                }
            }
        }
        n4 = SafeParcelWriter.beginObjectHeader(parcel);
        object = this.zza;
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)object, n3, false);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final SafeParcelable zza(Parcelable.Creator object) {
        Throwable throwable2222222;
        Object object2;
        block8: {
            boolean bl2 = this.zzc;
            if (!bl2) return (SafeParcelable)this.zzb;
            object2 = this.zza;
            if (object2 == null) {
                zzm.zzg("File descriptor is empty, returning null.");
                return null;
            }
            Object object3 = this.zza;
            Object object4 = new ParcelFileDescriptor.AutoCloseInputStream(object3);
            object2 = new DataInputStream((InputStream)object4);
            int n3 = ((DataInputStream)object2).readInt();
            object3 = new byte[n3];
            ((DataInputStream)object2).readFully((byte[])object3, 0, n3);
            {
                catch (Throwable throwable2222222) {
                    break block8;
                }
                catch (IOException iOException) {}
                object4 = "Could not read from parcel file descriptor";
                {
                    zzm.zzh((String)object4, iOException);
                }
                IOUtils.closeQuietly((Closeable)object2);
                return null;
            }
            IOUtils.closeQuietly((Closeable)object2);
            object2 = Parcel.obtain();
            try {
                object2.unmarshall((byte[])object3, 0, n3);
                object2.setDataPosition(0);
                object = object.createFromParcel((Parcel)object2);
                object = (Parcelable)object;
                this.zzb = object;
                this.zzc = false;
                return (SafeParcelable)this.zzb;
            }
            finally {
                object2.recycle();
            }
        }
        IOUtils.closeQuietly((Closeable)object2);
        throw throwable2222222;
    }
}

