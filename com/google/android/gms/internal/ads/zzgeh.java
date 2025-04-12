/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import com.google.android.gms.internal.ads.zzfyv;
import com.google.android.gms.internal.ads.zzgeh$zza;
import com.google.android.gms.internal.ads.zzgeh$zzb;
import com.google.android.gms.internal.ads.zzgeh$zzc;
import com.google.android.gms.internal.ads.zzgeh$zzd;
import com.google.android.gms.internal.ads.zzgeh$zze;
import com.google.android.gms.internal.ads.zzgeh$zzf;
import com.google.android.gms.internal.ads.zzgeh$zzg;
import com.google.android.gms.internal.ads.zzgeh$zzh;
import com.google.android.gms.internal.ads.zzgeh$zzj;
import com.google.android.gms.internal.ads.zzgeh$zzk;
import com.google.android.gms.internal.ads.zzgfh;
import com.google.android.gms.internal.ads.zzggd;
import com.google.android.gms.internal.ads.zzggw;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzgeh
extends zzggw
implements ListenableFuture {
    private static final Object zzbc;
    private static final zzgeh$zza zzbf;
    static final boolean zzd;
    static final zzggd zze;
    private volatile zzgeh$zzd listeners;
    private volatile Object value;
    private volatile zzgeh$zzk waiters;

    static {
        Object object;
        Class<Object> clazz;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Class<Object> clazz2;
        block17: {
            zzgeh$zze zzgeh$zze;
            boolean bl2;
            clazz2 = zzgeh$zzk.class;
            object8 = "guava.concurrent.generate_cancellation_cause";
            object7 = "false";
            object8 = System.getProperty((String)object8, (String)object7);
            try {
                bl2 = Boolean.parseBoolean((String)object8);
            }
            catch (SecurityException securityException) {
                bl2 = false;
                object8 = null;
            }
            zzd = bl2;
            object7 = zzgeh.class;
            zze = object8 = new zzggd((Class)object7);
            bl2 = false;
            object8 = null;
            try {
                object6 = new zzgeh$zzj(null);
                object5 = null;
                object4 = null;
                break block17;
            }
            catch (Error error) {
            }
            catch (Exception exception) {
                // empty catch block
            }
            object3 = Thread.class;
            object5 = "thread";
            object5 = AtomicReferenceFieldUpdater.newUpdater(clazz2, object3, (String)object5);
            object3 = "next";
            object2 = AtomicReferenceFieldUpdater.newUpdater(clazz2, clazz2, (String)object3);
            object3 = "waiters";
            clazz = AtomicReferenceFieldUpdater.newUpdater(object7, clazz2, (String)object3);
            clazz2 = zzgeh$zzd.class;
            object3 = "listeners";
            object = AtomicReferenceFieldUpdater.newUpdater(object7, clazz2, (String)object3);
            clazz2 = Object.class;
            object3 = "value";
            object4 = AtomicReferenceFieldUpdater.newUpdater(object7, clazz2, (String)object3);
            object3 = zzgeh$zze;
            try {
                zzgeh$zze = new zzgeh$zze((AtomicReferenceFieldUpdater)object5, (AtomicReferenceFieldUpdater)object2, (AtomicReferenceFieldUpdater)((Object)clazz), (AtomicReferenceFieldUpdater)object, (AtomicReferenceFieldUpdater)object4);
                object4 = null;
                object5 = object6;
                object6 = zzgeh$zze;
                break block17;
            }
            catch (Error error) {
            }
            catch (Exception exception) {
                // empty catch block
            }
            object7 = new zzgeh$zzg(null);
            object4 = clazz2;
            object5 = object6;
            object6 = object7;
        }
        zzbf = object6;
        if (object4 != null) {
            object2 = zze;
            clazz2 = ((zzggd)object2).zza();
            clazz = Level.SEVERE;
            object6 = "<clinit>";
            object7 = "com.google.common.util.concurrent.AbstractFuture";
            object8 = clazz;
            ((Logger)((Object)clazz2)).logp((Level)((Object)clazz), (String)object7, (String)object6, "UnsafeAtomicHelper is broken!", (Throwable)object5);
            object3 = ((zzggd)object2).zza();
            clazz2 = "<clinit>";
            object = "SafeAtomicHelper is broken!";
            object2 = "com.google.common.util.concurrent.AbstractFuture";
            object5 = clazz;
            clazz = clazz2;
            ((Logger)object3).logp((Level)object8, (String)object2, (String)((Object)clazz2), (String)object, (Throwable)object4);
        }
        clazz2 = new Class<Object>();
        zzbc = clazz2;
    }

    private static final Object zzA(Object object) {
        boolean bl2 = object instanceof zzgeh$zzb;
        if (!bl2) {
            bl2 = object instanceof zzgeh$zzc;
            if (!bl2) {
                Object object2 = zzbc;
                if (object == object2) {
                    object = null;
                }
                return object;
            }
            object = ((zzgeh$zzc)object).zzb;
            ExecutionException executionException = new ExecutionException((Throwable)object);
            throw executionException;
        }
        object = ((zzgeh$zzb)object).zzd;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause((Throwable)object);
        throw cancellationException;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object zze(ListenableFuture object) {
        ExecutionException executionException2;
        boolean bl2;
        Object object2;
        block14: {
            CancellationException cancellationException2;
            IllegalArgumentException illegalArgumentException;
            block13: {
                void var0_3;
                Object object3;
                boolean bl3;
                object2 = "get() did not throw CancellationException, despite reporting isCancelled() == true: ";
                bl2 = object instanceof zzgeh$zzh;
                illegalArgumentException = null;
                if (bl2) {
                    object = ((zzgeh)object).value;
                    boolean bl4 = object instanceof zzgeh$zzb;
                    if (bl4) {
                        object2 = object;
                        object2 = (zzgeh$zzb)object;
                        bl2 = ((zzgeh$zzb)object2).zzc;
                        if (bl2) {
                            object = ((zzgeh$zzb)object2).zzd;
                            object = object != null ? (object2 = new zzgeh$zzb(false, (Throwable)object)) : zzgeh$zzb.zzb;
                        }
                    }
                    Objects.requireNonNull(object);
                    return object;
                }
                bl2 = object instanceof zzggw;
                if (bl2) {
                    Object object4 = object;
                    object4 = ((zzggw)object).zzl();
                    if (object4 != null) {
                        return new zzgeh$zzc((Throwable)object4);
                    }
                }
                if (bl3 = (zzd ^ true) & (bl2 = ((Future)object).isCancelled())) {
                    object = zzgeh$zzb.zzb;
                    Objects.requireNonNull(object);
                    return object;
                }
                try {
                    object3 = zzgeh.zzf((Future)object);
                    if (bl2) {
                        String string2 = String.valueOf(object);
                        string2 = ((String)object2).concat(string2);
                        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(string2);
                        return new zzgeh$zzb(false, illegalArgumentException2);
                    }
                }
                catch (Error error) {
                    return new zzgeh$zzc((Throwable)var0_3);
                }
                catch (Exception exception) {
                    return new zzgeh$zzc((Throwable)var0_3);
                }
                catch (CancellationException cancellationException2) {
                    break block13;
                }
                catch (ExecutionException executionException2) {
                    break block14;
                }
                if (object3 != null) return object3;
                return zzbc;
            }
            if (bl2) return new zzgeh$zzb(false, cancellationException2);
            object = String.valueOf(object);
            object = "get() threw CancellationException, despite reporting isCancelled() == false: ".concat((String)object);
            illegalArgumentException = new IllegalArgumentException((String)object, cancellationException2);
            return new zzgeh$zzc(illegalArgumentException);
        }
        if (bl2) {
            object = String.valueOf(object);
            object = ((String)object2).concat((String)object);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object, executionException2);
            return new zzgeh$zzb(false, illegalArgumentException);
        }
        object2 = executionException2.getCause();
        return new zzgeh$zzc((Throwable)object2);
    }

    private static Object zzf(Future future) {
        boolean bl2 = false;
        Thread thread2 = null;
        while (true) {
            block5: {
                try {
                    future = future.get();
                    if (!bl2) break block5;
                }
                catch (Throwable throwable) {
                    if (bl2) {
                        thread2 = Thread.currentThread();
                        thread2.interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    continue;
                }
                thread2 = Thread.currentThread();
                thread2.interrupt();
            }
            return future;
            break;
        }
    }

    public static /* bridge */ /* synthetic */ zzgeh$zza zzg() {
        return zzbf;
    }

    public static /* bridge */ /* synthetic */ zzgeh$zzd zzh(zzgeh zzgeh2) {
        return zzgeh2.listeners;
    }

    public static /* bridge */ /* synthetic */ zzgeh$zzk zzi(zzgeh zzgeh2) {
        return zzgeh2.waiters;
    }

    public static /* bridge */ /* synthetic */ Object zzj(zzgeh zzgeh2) {
        return zzgeh2.value;
    }

    public static /* bridge */ /* synthetic */ Object zzk(ListenableFuture listenableFuture) {
        return zzgeh.zze(listenableFuture);
    }

    public static /* bridge */ /* synthetic */ void zzm(zzgeh zzgeh2, zzgeh$zzd zzgeh$zzd) {
        zzgeh2.listeners = zzgeh$zzd;
    }

    public static /* bridge */ /* synthetic */ void zzn(zzgeh zzgeh2, Object object) {
        zzgeh2.value = object;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzgeh zzgeh2, zzgeh$zzk zzgeh$zzk) {
        zzgeh2.waiters = zzgeh$zzk;
    }

    public static /* bridge */ /* synthetic */ void zzp(zzgeh zzgeh2, boolean bl2) {
        zzgeh.zzx(zzgeh2, false);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzu(StringBuilder stringBuilder) {
        ExecutionException executionException222;
        Exception exception222;
        String string2;
        block8: {
            block6: {
                Object object;
                Object object2;
                block7: {
                    string2 = "]";
                    try {
                        object2 = zzgeh.zzf(this);
                        object = "SUCCESS, result=[";
                        stringBuilder.append((String)object);
                        if (object2 == null) {
                            object2 = "null";
                            stringBuilder.append((String)object2);
                            break block6;
                        }
                        if (object2 != this) break block7;
                        object2 = "this future";
                        stringBuilder.append((String)object2);
                        break block6;
                    }
                    catch (Exception exception222) {
                        break block8;
                    }
                    catch (ExecutionException executionException222) {
                    }
                }
                object = object2.getClass();
                object = ((Class)object).getName();
                stringBuilder.append((String)object);
                object = "@";
                stringBuilder.append((String)object);
                int n3 = System.identityHashCode(object2);
                object2 = Integer.toHexString(n3);
                stringBuilder.append((String)object2);
            }
            stringBuilder.append(string2);
            return;
        }
        stringBuilder.append("UNKNOWN, cause=[");
        Class<?> clazz = exception222.getClass();
        stringBuilder.append(clazz);
        stringBuilder.append(" thrown from get()]");
        return;
        catch (CancellationException cancellationException) {
            stringBuilder.append("CANCELLED");
            return;
        }
        stringBuilder.append("FAILURE, cause=[");
        Throwable throwable = executionException222.getCause();
        stringBuilder.append(throwable);
        stringBuilder.append(string2);
    }

    private final void zzv(StringBuilder stringBuilder) {
        int n3 = stringBuilder.length();
        stringBuilder.append("PENDING");
        Object object = this.value;
        boolean bl2 = object instanceof zzgeh$zzf;
        String string2 = "]";
        if (bl2) {
            String string3 = ", setFuture=[";
            stringBuilder.append(string3);
            object = ((zzgeh$zzf)object).zzb;
            this.zzw(stringBuilder, object);
            stringBuilder.append(string2);
        } else {
            String string4;
            block8: {
                object = this.zza();
                try {
                    object = zzfyv.zza((String)object);
                    break block8;
                }
                catch (StackOverflowError stackOverflowError) {
                }
                catch (Exception exception) {
                    // empty catch block
                }
                object = String.valueOf(object.getClass());
                string4 = "Exception thrown from implementation: ";
                object = string4.concat((String)object);
            }
            if (object != null) {
                string4 = ", info=[";
                stringBuilder.append(string4);
                stringBuilder.append((String)object);
                stringBuilder.append(string2);
            }
        }
        int n4 = this.isDone();
        if (n4 != 0) {
            n4 = stringBuilder.length();
            stringBuilder.delete(n3, n4);
            this.zzu(stringBuilder);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzw(StringBuilder stringBuilder, Object object) {
        Class<?> clazz;
        if (object == this) {
            object = "this future";
            try {
                stringBuilder.append((String)object);
                return;
            }
            catch (StackOverflowError stackOverflowError) {
            }
            catch (Exception exception) {}
        } else {
            stringBuilder.append(object);
            return;
        }
        stringBuilder.append("Exception thrown from implementation: ");
        clazz = clazz.getClass();
        stringBuilder.append(clazz);
    }

    private static void zzx(zzgeh object, boolean bl2) {
        Object object2 = null;
        block0: while (true) {
            Object object3 = zzbf;
            Object object4 = zzgeh$zzk.zza;
            object3 = ((zzgeh$zza)object3).zzb((zzgeh)object, (zzgeh$zzk)object4);
            while (object3 != null) {
                object4 = ((zzgeh$zzk)object3).thread;
                if (object4 != null) {
                    ((zzgeh$zzk)object3).thread = null;
                    LockSupport.unpark((Thread)object4);
                }
                object3 = ((zzgeh$zzk)object3).next;
            }
            if (bl2) {
                ((zzgeh)object).zzq();
            }
            ((zzgeh)object).zzb();
            Object object5 = zzbf;
            object3 = zzgeh$zzd.zza;
            object = ((zzgeh$zza)object5).zza((zzgeh)object, (zzgeh$zzd)object3);
            Object object6 = object2;
            object2 = object;
            object = object6;
            while (object2 != null) {
                object5 = ((zzgeh$zzd)object2).next;
                ((zzgeh$zzd)object2).next = object;
                object = object2;
                object2 = object5;
            }
            while (object != null) {
                object2 = ((zzgeh$zzd)object).next;
                object5 = ((zzgeh$zzd)object).zzb;
                Objects.requireNonNull(object5);
                object5 = (Runnable)object5;
                boolean bl3 = object5 instanceof zzgeh$zzf;
                if (bl3) {
                    object5 = (zzgeh$zzf)object5;
                    object = ((zzgeh$zzf)object5).zza;
                    object3 = ((zzgeh)object).value;
                    if (object3 == object5 && (bl2 = ((zzgeh$zza)(object4 = zzbf)).zzf((zzgeh)object, object5, object3 = zzgeh.zze(((zzgeh$zzf)object5).zzb)))) {
                        bl2 = false;
                        object5 = null;
                        continue block0;
                    }
                } else {
                    object = ((zzgeh$zzd)object).zzc;
                    Objects.requireNonNull(object);
                    object = (Executor)object;
                    zzgeh.zzy((Runnable)object5, (Executor)object);
                }
                object = object2;
            }
            break;
        }
    }

    private static void zzy(Runnable object, Executor object2) {
        try {
            object2.execute((Runnable)object);
            return;
        }
        catch (Exception exception) {
            Logger logger = zze.zza();
            Level level = Level.SEVERE;
            object = String.valueOf(object);
            object2 = String.valueOf(object2);
            String string2 = UX.c("RuntimeException while executing runnable ", (String)object, " with executor ", (String)object2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", string2, exception);
            return;
        }
    }

    private final void zzz(zzgeh$zzk object) {
        zzgeh$zzk zzgeh$zzk;
        ((zzgeh$zzk)object).thread = null;
        block0: while ((object = this.waiters) != (zzgeh$zzk = zzgeh$zzk.zza)) {
            zzgeh$zzk = null;
            while (object != null) {
                zzgeh$zzk zzgeh$zzk2 = ((zzgeh$zzk)object).next;
                Object object2 = ((zzgeh$zzk)object).thread;
                if (object2 != null) {
                    zzgeh$zzk = object;
                } else if (zzgeh$zzk != null) {
                    zzgeh$zzk.next = zzgeh$zzk2;
                    object = zzgeh$zzk.thread;
                    if (object == null) {
                        continue block0;
                    }
                } else {
                    object2 = zzbf;
                    boolean bl2 = ((zzgeh$zza)object2).zzg(this, (zzgeh$zzk)object, zzgeh$zzk2);
                    if (!bl2) continue block0;
                }
                object = zzgeh$zzk2;
            }
            break block0;
        }
    }

    public void addListener(Runnable runnable2, Executor executor) {
        zzgeh$zzd zzgeh$zzd;
        zzfyg.zzc(runnable2, "Runnable was null.");
        Object object = "Executor was null.";
        zzfyg.zzc(executor, object);
        boolean bl2 = this.isDone();
        if (!bl2 && (object = this.listeners) != (zzgeh$zzd = zzgeh$zzd.zza)) {
            Object object2;
            zzgeh$zzd = new zzgeh$zzd(runnable2, executor);
            do {
                zzgeh$zzd.next = object;
                object2 = zzbf;
                bl2 = ((zzgeh$zza)object2).zze(this, (zzgeh$zzd)object, zzgeh$zzd);
                if (!bl2) continue;
                return;
            } while ((object = this.listeners) != (object2 = zzgeh$zzd.zza));
        }
        zzgeh.zzy(runnable2, executor);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean cancel(boolean bl2) {
        zzgeh$zzb zzgeh$zzb;
        String string2;
        Object object;
        boolean bl3;
        Object object2 = this.value;
        boolean bl4 = object2 instanceof zzgeh$zzf;
        boolean bl5 = false;
        if (object2 == null) {
            bl3 = true;
        } else {
            bl3 = false;
            object = null;
        }
        if (!(bl4 |= bl3)) return bl5;
        bl4 = zzd;
        if (bl4) {
            string2 = "Future.cancel() was called.";
            object = new CancellationException(string2);
            zzgeh$zzb = new zzgeh$zzb(bl2, (Throwable)object);
        } else {
            zzgeh$zzb = bl2 ? zzgeh$zzb.zza : zzgeh$zzb.zzb;
            Objects.requireNonNull(zzgeh$zzb);
        }
        boolean bl6 = false;
        string2 = null;
        object = this;
        while (true) {
            zzgeh$zza zzgeh$zza;
            boolean bl7;
            if (bl7 = (zzgeh$zza = zzbf).zzf((zzgeh)object, object2, zzgeh$zzb)) {
                zzgeh.zzx((zzgeh)object, bl2);
                bl3 = object2 instanceof zzgeh$zzf;
                if (!bl3) return true;
                object2 = ((zzgeh$zzf)object2).zzb;
                bl3 = object2 instanceof zzgeh$zzh;
                if (bl3) {
                    object = object2;
                    object = (zzgeh)object2;
                    object2 = ((zzgeh)object).value;
                    if (object2 == null) {
                        bl6 = true;
                    } else {
                        bl6 = false;
                        string2 = null;
                    }
                    bl7 = object2 instanceof zzgeh$zzf;
                    if (!(bl6 |= bl7)) return true;
                    bl6 = true;
                    continue;
                }
                object2.cancel(bl2);
                return true;
            }
            object2 = ((zzgeh)object).value;
            bl7 = object2 instanceof zzgeh$zzf;
            if (!bl7) return bl6;
        }
    }

    public Object get() {
        boolean bl2 = Thread.interrupted();
        if (!bl2) {
            zzgeh$zzk zzgeh$zzk;
            boolean bl3;
            Object object = this.value;
            boolean bl4 = true;
            if (object != null) {
                bl3 = true;
            } else {
                bl3 = false;
                zzgeh$zzk = null;
            }
            boolean bl5 = object instanceof zzgeh$zzf ^ bl4;
            if (bl3 &= bl5) {
                return zzgeh.zzA(object);
            }
            object = this.waiters;
            zzgeh$zzk = zzgeh$zzk.zza;
            if (object != zzgeh$zzk) {
                Object object2;
                zzgeh$zzk = new zzgeh$zzk();
                do {
                    block8: {
                        boolean bl6;
                        object2 = zzbf;
                        ((zzgeh$zza)object2).zzc(zzgeh$zzk, (zzgeh$zzk)object);
                        bl2 = ((zzgeh$zza)object2).zzg(this, (zzgeh$zzk)object, zzgeh$zzk);
                        if (!bl2) continue;
                        do {
                            LockSupport.park(this);
                            bl2 = Thread.interrupted();
                            if (bl2) break block8;
                            object = this.value;
                            if (object != null) {
                                bl5 = true;
                                continue;
                            }
                            bl5 = false;
                            object2 = null;
                        } while (!(bl5 &= (bl6 = object instanceof zzgeh$zzf ^ bl4)));
                        return zzgeh.zzA(object);
                    }
                    this.zzz(zzgeh$zzk);
                    object = new InterruptedException();
                    throw object;
                } while ((object = this.waiters) != (object2 = zzgeh$zzk.zza));
            }
            object = this.value;
            Objects.requireNonNull(object);
            return zzgeh.zzA(object);
        }
        InterruptedException interruptedException = new InterruptedException();
        throw interruptedException;
    }

    public Object get(long l2, TimeUnit timeUnit) {
        zzgeh zzgeh2 = this;
        long l3 = l2;
        Object object = timeUnit;
        long l4 = timeUnit.toNanos(l2);
        Object object2 = Thread.interrupted();
        if (object2 == 0) {
            boolean bl2;
            int n3;
            Object object3;
            boolean bl3;
            Object object4;
            Object object5;
            long l7;
            long l8;
            long l12;
            int n4;
            int n7;
            Object object6;
            block17: {
                object6 = this.value;
                n7 = 1;
                n4 = object6 != null ? 1 : 0;
                int n8 = object6 instanceof zzgeh$zzf ^ n7;
                if ((n4 &= n8) != 0) {
                    return zzgeh.zzA(object6);
                }
                l12 = 0L;
                long l14 = l4 - l12;
                object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                l8 = object2 > 0 ? System.nanoTime() + l4 : l12;
                l7 = 1000L;
                long l15 = l4 - l7;
                object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                if (object2 >= 0) {
                    object6 = zzgeh2.waiters;
                    object5 = zzgeh$zzk.zza;
                    if (object6 != object5) {
                        object5 = new zzgeh$zzk();
                        do {
                            block16: {
                                long l16;
                                object4 = zzbf;
                                ((zzgeh$zza)object4).zzc((zzgeh$zzk)object5, (zzgeh$zzk)object6);
                                object2 = ((zzgeh$zza)object4).zzg(zzgeh2, (zzgeh$zzk)object6, (zzgeh$zzk)object5);
                                if (object2 == 0) continue;
                                do {
                                    long l17 = 2147483647999999999L;
                                    l4 = Math.min(l4, l17);
                                    LockSupport.parkNanos(zzgeh2, l4);
                                    bl3 = Thread.interrupted();
                                    if (bl3) break block16;
                                    object3 = zzgeh2.value;
                                    n3 = object3 != null ? 1 : 0;
                                    object2 = object3 instanceof zzgeh$zzf ^ n7;
                                    if ((n3 &= object2) != 0) {
                                        return zzgeh.zzA(object3);
                                    }
                                    l4 = System.nanoTime();
                                } while ((object2 = (Object)((l16 = (l4 = l8 - l4) - l7) == 0L ? 0 : (l16 < 0L ? -1 : 1))) >= 0);
                                zzgeh2.zzz((zzgeh$zzk)object5);
                                break block17;
                            }
                            zzgeh2.zzz((zzgeh$zzk)object5);
                            InterruptedException interruptedException = new InterruptedException();
                            throw interruptedException;
                        } while ((object6 = zzgeh2.waiters) != (object4 = zzgeh$zzk.zza));
                    }
                    Object object7 = zzgeh2.value;
                    Objects.requireNonNull(object7);
                    return zzgeh.zzA(object7);
                }
            }
            while ((object2 = (Object)(l4 == l12 ? 0 : (l4 < l12 ? -1 : 1))) > 0) {
                object3 = zzgeh2.value;
                n3 = object3 != null ? 1 : 0;
                object2 = object3 instanceof zzgeh$zzf ^ n7;
                if ((n3 &= object2) != 0) {
                    return zzgeh.zzA(object3);
                }
                bl3 = Thread.interrupted();
                if (!bl3) {
                    l4 = System.nanoTime();
                    l4 = l8 - l4;
                    continue;
                }
                InterruptedException interruptedException = new InterruptedException();
                throw interruptedException;
            }
            object6 = this.toString();
            object4 = ((Object)((Object)timeUnit)).toString();
            Object object8 = Locale.ROOT;
            object4 = ((String)object4).toLowerCase((Locale)object8);
            object8 = ((Object)((Object)timeUnit)).toString().toLowerCase((Locale)object8);
            object5 = "Waited ";
            StringBuilder stringBuilder = new StringBuilder((String)object5);
            stringBuilder.append(l3);
            Object object9 = " ";
            stringBuilder.append((String)object9);
            stringBuilder.append((String)object8);
            Object object10 = stringBuilder.toString();
            l8 = l4 + l7;
            long l18 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
            if (l18 < 0) {
                long l19;
                object10 = ((String)object10).concat(" (plus ");
                l4 = -l4;
                object8 = TimeUnit.NANOSECONDS;
                l8 = ((TimeUnit)((Object)object)).convert(l4, (TimeUnit)((Object)object8));
                long l20 = ((TimeUnit)((Object)object)).toNanos(l8);
                Object object11 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
                if (object11 != false && (n4 = (l19 = (l4 -= l20) - l7) == 0L ? 0 : (l19 < 0L ? -1 : 1)) <= 0) {
                    n7 = 0;
                }
                if (object11 > 0) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object10);
                    ((StringBuilder)object).append(l8);
                    ((StringBuilder)object).append((String)object9);
                    ((StringBuilder)object).append((String)object4);
                    object10 = ((StringBuilder)object).toString();
                    if (n7 != 0) {
                        object = ",";
                        object10 = ((String)object10).concat((String)object);
                    }
                    object10 = ((String)object10).concat((String)object9);
                }
                if (n7 != 0) {
                    object9 = new StringBuilder();
                    ((StringBuilder)object9).append((String)object10);
                    ((StringBuilder)object9).append(l4);
                    ((StringBuilder)object9).append(" nanoseconds ");
                    object10 = ((StringBuilder)object9).toString();
                }
                object9 = "delay)";
                object10 = ((String)object10).concat((String)object9);
            }
            if (bl2 = this.isDone()) {
                object9 = ((String)object10).concat(" but future completed as timeout expired");
                object10 = new TimeoutException((String)object9);
                throw object10;
            }
            object10 = n1.a((String)object10, " for ", (String)object6);
            object9 = new TimeoutException((String)object10);
            throw object9;
        }
        InterruptedException interruptedException = new InterruptedException();
        throw interruptedException;
    }

    public boolean isCancelled() {
        return this.value instanceof zzgeh$zzb;
    }

    public boolean isDone() {
        boolean bl2;
        Object object = this.value;
        boolean bl3 = object instanceof zzgeh$zzf;
        boolean bl4 = true;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2 & (bl3 ^= bl4);
    }

    public String toString() {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        String string3 = this.getClass().getName();
        boolean bl2 = string3.startsWith(string2 = "com.google.common.util.concurrent.");
        if (bl2) {
            string3 = this.getClass().getSimpleName();
            stringBuilder.append(string3);
        } else {
            string3 = this.getClass().getName();
            stringBuilder.append(string3);
        }
        stringBuilder.append('@');
        string3 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string3);
        string3 = "[status=";
        stringBuilder.append(string3);
        bl2 = this.isCancelled();
        if (bl2) {
            string3 = "CANCELLED";
            stringBuilder.append(string3);
        } else {
            bl2 = this.isDone();
            if (bl2) {
                this.zzu(stringBuilder);
            } else {
                this.zzv(stringBuilder);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public String zza() {
        boolean bl2 = this instanceof ScheduledFuture;
        if (bl2) {
            Future future = this;
            future = (ScheduledFuture)((Object)this);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Ov2.a(future.getDelay(timeUnit), "remaining delay=[", " ms]");
        }
        return null;
    }

    public void zzb() {
    }

    public boolean zzc(Object object) {
        boolean bl2;
        if (object == null) {
            object = zzbc;
        }
        if (bl2 = zzbf.zzf(this, null, object)) {
            zzgeh.zzx(this, false);
            return true;
        }
        return false;
    }

    public boolean zzd(Throwable object) {
        object.getClass();
        zzgeh$zzc zzgeh$zzc = new zzgeh$zzc((Throwable)object);
        object = zzbf;
        boolean bl2 = ((zzgeh$zza)object).zzf(this, null, zzgeh$zzc);
        zzgeh$zzc = null;
        if (bl2) {
            zzgeh.zzx(this, false);
            return true;
        }
        return false;
    }

    public final Throwable zzl() {
        Object object;
        boolean bl2;
        boolean bl3 = this instanceof zzgeh$zzh;
        if (bl3 && (bl2 = (object = this.value) instanceof zzgeh$zzc)) {
            return ((zzgeh$zzc)object).zzb;
        }
        return null;
    }

    public void zzq() {
    }

    public final void zzr(Future future) {
        boolean bl2 = future != null;
        boolean bl3 = this.isCancelled();
        if (bl2 &= bl3) {
            bl2 = this.zzt();
            future.cancel(bl2);
        }
    }

    public final boolean zzs(ListenableFuture object) {
        boolean bl2;
        boolean bl3;
        object.getClass();
        Object object2 = this.value;
        Object object3 = null;
        if (object2 == null) {
            bl3 = object.isDone();
            bl2 = true;
            boolean bl4 = false;
            if (bl3) {
                object2 = zzbf;
                boolean bl5 = ((zzgeh$zza)object2).zzf(this, null, object = zzgeh.zze((ListenableFuture)object));
                if (bl5) {
                    zzgeh.zzx(this, false);
                    return bl2;
                }
                return false;
            }
            zzgeh$zza zzgeh$zza = zzbf;
            object2 = new zzgeh$zzf(this, (ListenableFuture)object);
            bl4 = zzgeh$zza.zzf(this, null, object2);
            if (bl4) {
                object3 = zzgfh.zza;
                try {
                    object.addListener((Runnable)object2, (Executor)object3);
                }
                catch (Throwable throwable) {
                    try {
                        object3 = new zzgeh$zzc(throwable);
                    }
                    catch (Error | Exception throwable2) {
                        object3 = zzgeh$zzc.zza;
                    }
                    zzgeh$zza zzgeh$zza2 = zzbf;
                    zzgeh$zza2.zzf(this, object2, object3);
                }
                return bl2;
            }
            object2 = this.value;
        }
        if (bl2 = object2 instanceof zzgeh$zzb) {
            object2 = (zzgeh$zzb)object2;
            bl3 = ((zzgeh$zzb)object2).zzc;
            object.cancel(bl3);
        }
        return false;
    }

    public final boolean zzt() {
        Object object = this.value;
        boolean bl2 = object instanceof zzgeh$zzb;
        if (bl2) {
            object = (zzgeh$zzb)object;
            boolean bl3 = ((zzgeh$zzb)object).zzc;
            if (bl3) {
                return true;
            }
        }
        return false;
    }
}

