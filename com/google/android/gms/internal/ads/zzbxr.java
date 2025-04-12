/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcby;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class zzbxr
implements Runnable {
    public final /* synthetic */ OutputStream zza;
    public final /* synthetic */ byte[] zzb;

    public /* synthetic */ zzbxr(OutputStream outputStream, byte[] byArray) {
        this.zza = outputStream;
        this.zzb = byArray;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        void var2_7;
        Object object;
        Object object2;
        block8: {
            block12: {
                Object object3;
                byte[] byArray;
                block9: {
                    block11: {
                        block10: {
                            object2 = zzbxs.CREATOR;
                            object2 = this.zza;
                            byArray = this.zzb;
                            int n3 = 0;
                            object = null;
                            try {
                                object3 = new DataOutputStream((OutputStream)object2);
                            }
                            catch (Throwable throwable) {
                                break block8;
                            }
                            catch (IOException iOException) {
                                // empty catch block
                                break block9;
                            }
                            try {
                                n3 = byArray.length;
                                ((DataOutputStream)object3).writeInt(n3);
                                ((OutputStream)object3).write(byArray);
                            }
                            catch (Throwable throwable) {
                                break block10;
                            }
                            catch (IOException iOException) {
                                break block11;
                            }
                            IOUtils.closeQuietly((Closeable)object3);
                            return;
                        }
                        object = object3;
                        break block8;
                    }
                    object = object3;
                }
                object3 = "Error transporting the ad response";
                {
                    zzm.zzh((String)object3, (Throwable)byArray);
                    object3 = zzu.zzo();
                    String string2 = "LargeParcelTeleporter.pipeData.1";
                    ((zzcby)object3).zzw((Throwable)byArray, string2);
                    if (object != null) break block12;
                }
                IOUtils.closeQuietly((Closeable)object2);
                return;
            }
            IOUtils.closeQuietly((Closeable)object);
            return;
        }
        if (object == null) {
            IOUtils.closeQuietly((Closeable)object2);
            throw var2_7;
        }
        IOUtils.closeQuietly(object);
        throw var2_7;
    }
}

