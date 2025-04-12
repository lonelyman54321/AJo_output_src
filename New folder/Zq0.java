/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public final class Zq0
implements Mq0 {
    public final DR2 a;
    public final File b;
    public final long c;
    public final Oq0 d;
    public Xq0 e;

    public Zq0(File object) {
        Oq0 oq0;
        this.d = oq0 = new Oq0();
        this.b = object;
        this.c = 0xFA00000L;
        this.a = object = new DR2();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(qn1_0 var1_1, di0 var2_4) {
        block23: {
            block22: {
                var3_6 = "Had two simultaneous puts for: ";
                var4_7 = this.a.b((qn1_0)var1_1);
                var5_8 = this.d;
                synchronized (var5_8) {
                    var6_9 = var5_8.a;
                    var6_9 = var6_9.get(var4_7);
                    var6_9 = (Oq0$a)var6_9;
                    if (var6_9 == null) {
                        var6_9 = var5_8.b;
                        var6_9 = var6_9.a();
                        var7_10 = var5_8.a;
                        var7_10.put(var4_7, var6_9);
                    }
                    var8_11 = var6_9.b;
                    var9_12 = 1;
                    var6_9.b = var8_11 += var9_12;
                    // MONITOREXIT @DISABLED, blocks:[0, 12] lbl18 : MonitorExitStatement: MONITOREXIT : var5_8
                    var6_9.a.lock();
                    var5_8 = "DiskLruCacheWrapper";
                    var10_13 = 2;
                }
                try {
                    var11_14 = Log.isLoggable((String)var5_8, (int)var10_13);
                    if (var11_14) {
                        Objects.toString(var1_1);
                    }
                    var1_1 = this.c();
                    var5_8 = var1_1.k(var4_7);
                    if (var5_8 != null) {
                        this.d.a(var4_7);
                        return;
                    }
                    if ((var1_1 = var1_1.d(var4_7)) == null) ** GOTO lbl64
                }
                catch (Throwable var1_3) {
                    ** GOTO lbl67
                }
                var3_6 = var1_1.b();
                var5_8 = var2_4.b;
                var6_9 = var2_4.c;
                var2_4 = var2_4.a;
                var12_15 = (int)var2_4.b(var5_8, (File)var3_6, (Z92)var6_9);
                if (var12_15 == 0) break block22;
                var2_4 = var1_1.d;
                Xq0.a((Xq0)var2_4, (Xq0$c)var1_1, (boolean)var9_12);
                var1_1.c = var9_12;
            }
            ** try [egrp 6[TRYBLOCK] [26 : 253->257)] { 
lbl-1000:
            // 1 sources

            {
                var12_15 = (int)var1_1.c;
                if (var12_15 != 0) break block23;
            }
            var1_1.a();
            break block23;
            catch (Throwable var2_5) {
                try {
                    var13_16 = var1_1.c;
                    if (var13_16) ** GOTO lbl69
                }
lbl59:
                // 4 sources

                catch (IOException v0) {}
                var1_1.a();
                ** GOTO lbl69
                {
                    catch (IOException v1) {}
lbl64:
                    // 1 sources

                    var2_4 = var3_6.concat(var4_7);
                    var1_1 = new IllegalStateException((String)var2_4);
                    throw var1_1;
lbl67:
                    // 1 sources

                    this.d.a(var4_7);
                    throw var1_3;
lbl69:
                    // 3 sources

                    ** try [egrp 10[TRYBLOCK] [34 : 287->307)] { 
lbl70:
                    // 1 sources

                    throw var2_5;
                }
            }
            var1_1 = "DiskLruCacheWrapper";
            var12_15 = 5;
            Log.isLoggable((String)var1_1, (int)var12_15);
            break block23;
            catch (IOException v2) {}
        }
        this.d.a(var4_7);
        return;
        {
            catch (Throwable var1_2) {}
            throw var1_2;
        }
    }

    public final File b(qn1_0 object) {
        block6: {
            File[] fileArray = this.a.b((qn1_0)object);
            String string2 = "DiskLruCacheWrapper";
            boolean bl2 = Log.isLoggable((String)string2, (int)2);
            if (bl2) {
                Objects.toString(object);
            }
            object = null;
            Xq0 xq0 = this.c();
            fileArray = xq0.k((String)fileArray);
            if (fileArray == null) break block6;
            fileArray = fileArray.a;
            bl2 = false;
            xq0 = null;
            try {
                object = fileArray[0];
            }
            catch (IOException iOException) {
                int n3 = 5;
                Log.isLoggable((String)string2, (int)n3);
            }
        }
        return object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Xq0 c() {
        synchronized (this) {
            try {
                Object object = this.e;
                if (object != null) return this.e;
                object = this.b;
                long l2 = this.c;
                this.e = object = Xq0.p((File)object, l2);
                return this.e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void clear() {
        // MONITORENTER : this
        var1_1 = this.c();
        var1_1.close();
        var1_1 = var1_1.a;
        cz3.a((File)var1_1);
lbl7:
        // 2 sources

        while (true) {
            this.d();
            return;
            break;
        }
        {
            catch (Throwable var1_3) {
            }
            catch (IOException v0) {}
            var1_1 = "DiskLruCacheWrapper";
            var2_4 = 5;
            {
                Log.isLoggable((String)var1_1, (int)var2_4);
                ** continue;
            }
        }
        {
            this.d();
            throw var1_3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            Object var1_1 = null;
            this.e = null;
            return;
        }
    }
}

