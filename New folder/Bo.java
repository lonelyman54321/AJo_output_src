/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Trace
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.R$string;
import java.util.HashMap;
import java.util.HashSet;

public final class Bo {
    public static volatile Bo d;
    public static final Object e;
    public final HashMap a;
    public final HashSet b;
    public final Context c;

    static {
        Object object;
        e = object = new Object();
    }

    public Bo(Context object) {
        this.c = object = object.getApplicationContext();
        this.b = object;
        super();
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Bo c(Context context) {
        Object object = d;
        if (object != null) return d;
        object = e;
        synchronized (object) {
            try {
                Bo bo2 = d;
                if (bo2 != null) return d;
                d = bo2 = new Bo(context);
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Bundle object) {
        ClassNotFoundException classNotFoundException2;
        Object object2;
        block6: {
            boolean bl2;
            HashSet hashSet;
            HashSet hashSet2;
            object2 = this.c;
            int n3 = R$string.androidx_startup;
            object2 = object2.getString(n3);
            if (object == null) return;
            try {
                hashSet2 = new HashSet();
                Object object3 = object.keySet();
                object3 = object3.iterator();
                while (true) {
                    boolean bl3 = object3.hasNext();
                    hashSet = this.b;
                    if (bl3) {
                        Object object4 = object3.next();
                        object4 = (String)object4;
                        boolean bl4 = false;
                        Object object5 = null;
                        object5 = object.getString(object4, null);
                        bl4 = ((String)object2).equals(object5);
                        if (!bl4 || !(bl4 = ((Class)(object5 = wh1_0.class)).isAssignableFrom((Class<?>)(object4 = Class.forName(object4))))) continue;
                        hashSet.add(object4);
                        continue;
                    }
                    break;
                }
            }
            catch (ClassNotFoundException classNotFoundException2) {
                break block6;
            }
            object = hashSet.iterator();
            while (bl2 = object.hasNext()) {
                object2 = object.next();
                object2 = (Class)object2;
                this.b((Class)object2, hashSet2);
            }
            return;
        }
        object2 = new RuntimeException(classNotFoundException2);
        throw object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b(Class var1_1, HashSet var2_4) {
        block9: {
            block11: {
                block10: {
                    var3_5 = "Cannot initialize ";
                    var4_6 = gp3_0.b();
                    if (var4_6) {
                        try {
                            var5_7 = var1_1.getSimpleName();
                            var5_7 = gp3_0.c((String)var5_7);
                            Trace.beginSection((String)var5_7);
                        }
                        catch (Throwable var1_2) {
                            break block9;
                        }
                    }
                    if (var4_6 = var2_4.contains(var1_1)) ** GOTO lbl-1000
                    var3_5 = this.a;
                    var4_6 = var3_5.containsKey(var1_1);
                    if (var4_6) ** GOTO lbl47
                    var2_4.add(var1_1);
                    var4_6 = false;
                    var5_7 = null;
                    try {
                        var6_8 = var1_1.getDeclaredConstructor(null);
                        var5_7 = var6_8.newInstance(null);
                        var5_7 = (wh1_0)var5_7;
                        var6_8 = var5_7.dependencies();
                        var7_9 = var6_8.isEmpty();
                        if (var7_9) break block10;
                        var6_8 = var6_8.iterator();
                        while (var7_9 = var6_8.hasNext()) {
                            var8_10 /* !! */  = var6_8.next();
                            var9_11 = var3_5.containsKey(var8_10 /* !! */  = (Class)var8_10 /* !! */ );
                            if (var9_11) continue;
                            this.b((Class)var8_10 /* !! */ , (HashSet)var2_4);
                        }
                    }
                    catch (Throwable var1_3) {
                        ** GOTO lbl-1000
                    }
                }
                var6_8 = this.c;
                var5_7 = var5_7.a(var6_8);
                var2_4.remove(var1_1);
                var3_5.put(var1_1, var5_7);
                break block11;
lbl-1000:
                // 1 sources

                {
                    var2_4 = new RuntimeException(var1_3);
                    throw var2_4;
lbl47:
                    // 1 sources

                    var5_7 = var3_5.get(var1_1);
                }
            }
            Trace.endSection();
            return var5_7;
lbl-1000:
            // 1 sources

            {
                var1_1 = var1_1.getName();
                var2_4 = new StringBuilder((String)var3_5);
                var2_4.append((String)var1_1);
                var1_1 = ". Cycle detected.";
                var2_4.append((String)var1_1);
                var1_1 = var2_4.toString();
                var2_4 = new IllegalStateException((String)var1_1);
                throw var2_4;
            }
        }
        Trace.endSection();
        throw var1_2;
    }
}

