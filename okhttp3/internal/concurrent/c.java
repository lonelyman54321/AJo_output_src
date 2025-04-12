/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.TaskRunner$runnable$1;
import okhttp3.internal.concurrent.b;
import okhttp3.internal.concurrent.c$a;
import okhttp3.internal.concurrent.c$b;

public final class c {
    public static final c h;
    public static final Logger i;
    public final c$a a;
    public int b;
    public boolean c;
    public long d;
    public final ArrayList e;
    public final ArrayList f;
    public final TaskRunner$runnable$1 g;

    static {
        CharSequence charSequence = new StringBuilder();
        Object object = ez3.g;
        charSequence.append((String)object);
        charSequence.append(" TaskRunner");
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullParameter(charSequence, "name");
        object = new Zy3((String)charSequence, true);
        c$b c$b = new c$b((Zy3)object);
        Object object2 = new c(c$b);
        h = object2;
        object2 = Logger.getLogger(c.class.getName());
        Intrinsics.checkNotNullExpressionValue(object2, "getLogger(TaskRunner::class.java.name)");
        i = object2;
    }

    public c(c$b object) {
        Intrinsics.checkNotNullParameter(object, "backend");
        this.a = object;
        this.b = 10000;
        object = new ArrayList();
        this.e = object;
        object = new ArrayList();
        this.f = object;
        this.g = object = new TaskRunner$runnable$1(this);
    }

    public static final void a(c c2, ri3_1 object) {
        long l2;
        c2.getClass();
        Object object2 = ez3.a;
        object2 = Thread.currentThread();
        String string2 = ((Thread)object2).getName();
        String string3 = ((ri3_1)object).a;
        ((Thread)object2).setName(string3);
        try {
            l2 = ((ri3_1)object).a();
        }
        catch (Throwable throwable) {
            synchronized (c2) {
                long l3 = -1;
                c2.b((ri3_1)object, l3);
                object = Unit.a;
                ((Thread)object2).setName(string2);
                throw throwable;
                finally {
                }
            }
        }
        synchronized (c2) {
            c2.b((ri3_1)object, l2);
            object = Unit.a;
            ((Thread)object2).setName(string2);
            return;
        }
    }

    public final void b(ri3_1 object, long l2) {
        Object object2 = ez3.a;
        object2 = ((ri3_1)object).c;
        Intrinsics.checkNotNull(object2);
        ri3_1 ri3_12 = ((b)object2).d;
        if (ri3_12 == object) {
            boolean bl2;
            boolean bl3 = ((b)object2).f;
            ((b)object2).f = false;
            ((b)object2).d = null;
            ArrayList arrayList = this.e;
            arrayList.remove(object2);
            long l3 = -1;
            boolean bl4 = true;
            long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l4 != false && !bl3 && !(bl3 = ((b)object2).c)) {
                ((b)object2).e((ri3_1)object, l2, bl4);
            }
            if (bl2 = ((ArrayList)(object = ((b)object2).e)).isEmpty() ^ bl4) {
                object = this.f;
                ((ArrayList)object).add(object2);
            }
            return;
        }
        String string2 = "Check failed.".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ri3_1 c() {
        var1_1 = this;
        var2_2 = ez3.a;
        block4: while (true) {
            block15: {
                var2_2 = var1_1.f;
                var3_4 = var2_2.isEmpty();
                var4_5 = false;
                if (var3_4) {
                    return null;
                }
                var5_6 = var1_1.a;
                var6_7 = var5_6.nanoTime();
                var8_8 = var2_2.iterator();
                var9_9 = 0x7FFFFFFFFFFFFFFFL;
                var11_10 = null;
                while (true) {
                    var12_11 = var8_8.hasNext();
                    var13_12 = 1;
                    if (!var12_11) break;
                    var14_13 = (ri3_1)((b)var8_8.next()).e.get(0);
                    var15_14 = var14_13.d - var6_7;
                    var17_15 = var6_7;
                    var19_16 = 0L;
                    cfr_temp_0 = (var15_14 = Math.max(var19_16, var15_14)) - var19_16;
                    var21_17 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var21_17 /* !! */  > 0) {
                        var9_9 = Math.min(var15_14, var9_9);
                    } else {
                        if (var11_10 != null) {
                            var4_5 = true;
                            break block15;
                        }
                        var11_10 = var14_13;
                    }
                    var6_7 = var17_15;
                    var4_5 = false;
                }
                var17_15 = var6_7;
                var4_5 = false;
            }
            if (var11_10 != null) {
                var22_19 /* !! */  = ez3.a;
                var11_10.d = var6_7 = (long)-1;
                var22_19 /* !! */  = (byte[])var11_10.c;
                Intrinsics.checkNotNull(var22_19 /* !! */ );
                var22_19 /* !! */ .e.remove(var11_10);
                var2_2.remove(var22_19 /* !! */ );
                var22_19 /* !! */ .d = var11_10;
                var23_20 = var1_1.e;
                var23_20.add(var22_19 /* !! */ );
                if (var4_5 || !(var4_5 = var1_1.c) && (var24_18 /* !! */  = var2_2.isEmpty() ^ var13_12) != 0) {
                    var2_2 = var1_1.g;
                    var5_6.execute((Runnable)var2_2);
                }
                return var11_10;
            }
            var24_18 /* !! */  = var1_1.c;
            if (var24_18 /* !! */  != 0) {
                var19_16 = var1_1.d - var17_15;
                cfr_temp_1 = var9_9 - var19_16;
                var24_18 /* !! */  = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                if (var24_18 /* !! */  < 0) {
                    var5_6.a(var1_1);
                }
                return null;
            }
            var1_1.c = var13_12;
            var1_1.d = var6_7 = var17_15 + var9_9;
            var5_6.b(var1_1, var9_9);
lbl66:
            // 2 sources

            while (true) {
                var1_1.c = false;
                continue block4;
                break;
            }
            {
                catch (Throwable var2_3) {
                    break;
                }
                catch (InterruptedException v0) {}
                {
                    this.d();
                    ** continue;
                }
            }
        }
        var1_1.c = false;
        throw var2_3;
    }

    public final void d() {
        int n3;
        int n4;
        ArrayList arrayList = this.e;
        for (n3 = arrayList.size() + -1; (n4 = -1) < n3; n3 += -1) {
            b b2 = (b)arrayList.get(n3);
            b2.b();
        }
        arrayList = this.f;
        for (n3 = arrayList.size() + -1; n4 < n3; n3 += -1) {
            Object object = (b)arrayList.get(n3);
            ((b)object).b();
            object = ((b)object).e;
            boolean bl2 = ((ArrayList)object).isEmpty();
            if (!bl2) continue;
            arrayList.remove(n3);
        }
    }

    public final void e(b object) {
        Intrinsics.checkNotNullParameter(object, "taskQueue");
        Object object2 = ez3.a;
        object2 = ((b)object).d;
        if (object2 == null) {
            object2 = ((b)object).e;
            boolean bl2 = ((ArrayList)object2).isEmpty() ^ true;
            ArrayList arrayList = this.f;
            if (bl2) {
                object2 = "<this>";
                Intrinsics.checkNotNullParameter(arrayList, (String)object2);
                bl2 = arrayList.contains(object);
                if (!bl2) {
                    arrayList.add(object);
                }
            } else {
                arrayList.remove(object);
            }
        }
        boolean bl3 = this.c;
        object2 = this.a;
        if (bl3) {
            object2.a(this);
        } else {
            object = this.g;
            object2.execute((Runnable)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final b f() {
        int n3;
        synchronized (this) {
            int n4;
            n3 = this.b;
            this.b = n4 = n3 + 1;
        }
        String string2 = hj0_0.a(n3, "Q");
        return new b(this, string2);
    }
}

