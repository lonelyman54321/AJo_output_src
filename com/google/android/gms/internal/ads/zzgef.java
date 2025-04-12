/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgfj;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzggl;
import com.google.android.gms.internal.ads.zzggw;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

abstract class zzgef
extends zzgfj
implements Runnable {
    ListenableFuture zza;
    Class zzb;
    Object zzc;

    public zzgef(ListenableFuture listenableFuture, Class clazz, Object object) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = clazz;
        this.zzc = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        Object object2;
        Object object3;
        Class clazz;
        Object object4;
        block21: {
            boolean bl2;
            block19: {
                ExecutionException executionException2;
                String string2;
                block20: {
                    block18: {
                        boolean bl3;
                        object4 = this.zza;
                        clazz = this.zzb;
                        object3 = this.zzc;
                        boolean bl4 = false;
                        boolean bl5 = true;
                        if (object4 == null) {
                            bl2 = true;
                        } else {
                            bl2 = false;
                            object2 = null;
                        }
                        if (clazz == null) {
                            bl3 = true;
                        } else {
                            bl3 = false;
                            string2 = null;
                        }
                        bl2 |= bl3;
                        if (object3 == null) {
                            bl4 = true;
                        }
                        if (bl4 |= bl2) return;
                        bl4 = this.isCancelled();
                        if (bl4) {
                            return;
                        }
                        bl4 = false;
                        this.zza = null;
                        bl5 = object4 instanceof zzggw;
                        if (bl5) {
                            object = object4;
                            try {
                                object = (zzggw)object4;
                                object = ((zzggw)object).zzl();
                                break block18;
                            }
                            catch (Throwable throwable) {
                                break block19;
                            }
                            catch (ExecutionException executionException2) {
                                break block20;
                            }
                        }
                        bl5 = false;
                        object = null;
                    }
                    if (object != null) break block19;
                    object2 = zzgft.zzp((Future)object4);
                    break block21;
                }
                object2 = executionException2.getCause();
                if (object2 == null) {
                    string2 = String.valueOf(object4.getClass());
                    object = String.valueOf(executionException2.getClass());
                    String string3 = "Future type ";
                    String string4 = " threw ";
                    String string5 = " without a cause";
                    object = uc0_0.a(string3, string2, string4, (String)object, string5);
                    object2 = new NullPointerException((String)object);
                }
                object = object2;
            }
            bl2 = false;
            object2 = null;
        }
        if (object == null) {
            this.zzc(object2);
            return;
        }
        boolean bl6 = clazz.isInstance(object);
        if (!bl6) {
            this.zzs((ListenableFuture)object4);
            return;
        }
        try {
            object4 = this.zze(object3, (Throwable)object);
            this.zzb = null;
            this.zzc = null;
            this.zzf(object4);
            return;
        }
        catch (Throwable throwable) {
            try {
                zzggl.zza(throwable);
                this.zzd(throwable);
                return;
            }
            finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    public final String zza() {
        Object object = this.zza;
        Object object2 = this.zzb;
        Object object3 = this.zzc;
        CharSequence charSequence = super.zza();
        if (object != null) {
            object = object.toString();
            String string2 = "inputFuture=[";
            String string3 = "], ";
            object = cP.a(string2, (String)object, string3);
        } else {
            object = "";
        }
        if (object2 != null && object3 != null) {
            object2 = object2.toString();
            object3 = object3.toString();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("exceptionType=[");
            ((StringBuilder)charSequence).append((String)object2);
            ((StringBuilder)charSequence).append("], fallback=[");
            ((StringBuilder)charSequence).append((String)object3);
            ((StringBuilder)charSequence).append("]");
            return ((StringBuilder)charSequence).toString();
        }
        if (charSequence != null) {
            return ((String)object).concat((String)charSequence);
        }
        return null;
    }

    public final void zzb() {
        ListenableFuture listenableFuture = this.zza;
        this.zzr(listenableFuture);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zze(Object var1, Throwable var2);

    public abstract void zzf(Object var1);
}

