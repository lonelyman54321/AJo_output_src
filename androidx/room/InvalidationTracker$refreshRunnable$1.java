/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteException
 */
package androidx.room;

import android.database.sqlite.SQLiteException;
import androidx.room.c;
import androidx.room.c$d;
import java.io.Closeable;
import java.util.Map;
import kotlin.Unit;

public final class InvalidationTracker$refreshRunnable$1
implements Runnable {
    public final /* synthetic */ c a;

    public InvalidationTracker$refreshRunnable$1(c c2) {
        this.a = c2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final k03_0 a() {
        Throwable throwable2;
        Object object;
        block7: {
            object = this.a;
            Object object2 = new k03_0();
            object = ((c)object).a;
            Object object3 = new C53("SELECT * FROM room_table_modification_log WHERE invalidated = 1;");
            int n3 = 2;
            object = FP2.query$default((FP2)object, (ag3_0)object3, null, n3, null);
            try {
                int n4;
                while ((n4 = object.moveToNext()) != 0) {
                    n4 = 0;
                    object3 = null;
                    n4 = object.getInt(0);
                    object3 = n4;
                    ((k03_0)object2).add(object3);
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            object3 = Unit.a;
            xj3_1.b((Closeable)object, null);
            object = O03.a((k03_0)object2);
            object2 = ((k03_0)object).a;
            boolean bl2 = ((ng1_2)object2).isEmpty() ^ true;
            if (!bl2) return object;
            object2 = this.a.h;
            object3 = "Required value was null.";
            if (object2 == null) {
                object2 = object3.toString();
                object = new IllegalStateException((String)object2);
                throw object;
            }
            object2 = this.a.h;
            if (object2 != null) {
                object2.q();
                return object;
            }
            object2 = object3.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            xj3_1.b((Closeable)object, throwable2);
            throw throwable3;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        block21: {
            block20: {
                block19: {
                    var1_1 = this.a.a.getCloseLock$room_runtime_release();
                    var1_1.lock();
                    var2_3 = true;
                    var3_4 = this.a;
                    var4_5 = var3_4.c();
                    if (var4_5) break block19;
                    var1_1.unlock();
                    this.a.getClass();
                    return;
                }
                var3_4 = this.a;
                var3_4 = var3_4.f;
                var5_6 /* !! */  = null;
                var4_5 = var3_4.compareAndSet(var2_3, false);
                if (var4_5) break block20;
                var1_1.unlock();
                this.a.getClass();
                return;
            }
            var3_4 = this.a;
            var3_4 = var3_4.a;
            var4_5 = var3_4.inTransaction();
            if (!var4_5) break block21;
            var1_1.unlock();
            this.a.getClass();
            return;
        }
        var3_4 = this.a;
        var3_4 = var3_4.a;
        var3_4 = var3_4.getOpenHelper();
        var3_4 = var3_4.getWritableDatabase();
        var3_4.B();
        var5_6 /* !! */  = this.a();
        var3_4.y();
        var3_4.F();
        ** GOTO lbl51
        catch (Throwable var5_7) {
            block23: {
                var3_4.F();
                throw var5_7;
lbl51:
                // 3 sources

                while (true) {
                    var1_1.unlock();
                    var1_1 = this.a;
                    var1_1.getClass();
                    var1_1 = var5_6 /* !! */ ;
                    var1_1 = var5_6 /* !! */ ;
                    var7_10 = var1_1.isEmpty() ^ var2_3;
                    if (var7_10 == false) return;
                    var1_1 = this.a;
                    var6_9 = var1_1.k;
                    synchronized (var6_9) {
                        block22: {
                            try {
                                var1_1 = var1_1.k;
                                var1_1 = var1_1.iterator();
                                while (true) {
                                    var3_4 = var1_1;
                                    var3_4 = (CR2$e)var1_1;
                                    var8_11 = var3_4.hasNext();
                                    if (var8_11) {
                                        var3_4 = var3_4.next();
                                        var3_4 = (Map.Entry)var3_4;
                                        var3_4 = var3_4.getValue();
                                        var3_4 = (c$d)var3_4;
                                        var3_4.a(var5_6 /* !! */ );
                                        continue;
                                    }
                                    break;
                                }
                            }
                            catch (Throwable var1_2) {
                                break block22;
                            }
                            var1_1 = Unit.a;
                            return;
                        }
                        throw var1_2;
                    }
                    break;
                }
                {
                    catch (Throwable var6_8) {
                        break block23;
                    }
                    catch (IllegalStateException v0) {}
                    {
                        var5_6 /* !! */  = vz0_2.a;
                        ** GOTO lbl51
                    }
                }
            }
            var1_1.unlock();
            this.a.getClass();
            throw var6_8;
            catch (SQLiteException v1) {}
        }
        var5_6 /* !! */  = vz0_2.a;
        ** while (true)
    }
}

