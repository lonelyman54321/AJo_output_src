/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

public final class GP2
extends yg3$a {
    public yi0_0 b;
    public final GP2$a c;
    public final String d;
    public final String e;

    public GP2(yi0_0 yi0_02, GP2$a gP2$a, String string2, String string3) {
        Intrinsics.checkNotNullParameter(yi0_02, "configuration");
        Intrinsics.checkNotNullParameter(gP2$a, "delegate");
        Intrinsics.checkNotNullParameter(string2, "identityHash");
        Intrinsics.checkNotNullParameter(string3, "legacyHash");
        int n3 = gP2$a.version;
        super(n3);
        this.b = yi0_02;
        this.c = gP2$a;
        this.d = string2;
        this.e = string3;
    }

    public final void b(ex0_1 ex0_12) {
        Intrinsics.checkNotNullParameter(ex0_12, "db");
        super.b(ex0_12);
    }

    public final void c(ex0_1 object) {
        Throwable throwable2;
        Object object2;
        block8: {
            boolean bl2;
            int n3;
            block7: {
                object2 = "db";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = ((ex0_1)object).r0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
                try {
                    n3 = object2.moveToFirst();
                    bl2 = false;
                    if (n3 == 0) break block7;
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                n3 = object2.getInt(0);
                if (n3 != 0) break block7;
                bl2 = true;
            }
            n3 = 0;
            Object object3 = null;
            xj3_1.b((Closeable)object2, null);
            object2 = this.c;
            ((GP2$a)object2).createAllTables((xg3_1)object);
            if (!bl2) {
                object3 = ((GP2$a)object2).onValidateSchema((xg3_1)object);
                bl2 = ((GP2$b)object3).a;
                if (!bl2) {
                    object2 = new StringBuilder("Pre-packaged database has an invalid schema: ");
                    object3 = ((GP2$b)object3).b;
                    ((StringBuilder)object2).append((String)object3);
                    object2 = ((StringBuilder)object2).toString();
                    object = new IllegalStateException((String)object2);
                    throw object;
                }
            }
            this.g((ex0_1)object);
            ((GP2$a)object2).onCreate((xg3_1)object);
            return;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            xj3_1.b((Closeable)object2, throwable2);
            throw throwable3;
        }
    }

    public final void d(ex0_1 ex0_12, int n3, int n4) {
        Intrinsics.checkNotNullParameter(ex0_12, "db");
        this.f(ex0_12, n3, n4);
    }

    public final void e(ex0_1 object) {
        Throwable throwable2;
        Object object2;
        block18: {
            Object object3;
            block23: {
                block22: {
                    boolean bl2;
                    block21: {
                        boolean bl3;
                        String string2;
                        String string3;
                        block20: {
                            block19: {
                                int n3;
                                block17: {
                                    block16: {
                                        object2 = "db";
                                        Intrinsics.checkNotNullParameter(object, (String)object2);
                                        super.e((ex0_1)object);
                                        Intrinsics.checkNotNullParameter(object, (String)object2);
                                        object2 = ((ex0_1)object).r0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
                                        try {
                                            n3 = object2.moveToFirst();
                                            bl2 = false;
                                            string3 = null;
                                            if (n3 == 0) break block16;
                                        }
                                        catch (Throwable throwable2) {
                                            break block18;
                                        }
                                        n3 = object2.getInt(0);
                                        if (n3 == 0) break block16;
                                        n3 = 1;
                                        break block17;
                                    }
                                    n3 = 0;
                                    object3 = null;
                                }
                                xj3_1.b((Closeable)object2, null);
                                object2 = this.c;
                                if (n3 == 0) break block21;
                                string2 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";
                                object3 = new C53(string2);
                                object3 = ((ex0_1)object).j((ag3_0)object3);
                                try {
                                    bl3 = object3.moveToFirst();
                                    if (!bl3) break block19;
                                }
                                catch (Throwable throwable3) {}
                                try {
                                    string3 = object3.getString(0);
                                }
                                finally {
                                    break block20;
                                }
                            }
                            bl2 = false;
                            string3 = null;
                        }
                        xj3_1.b((Closeable)object3, null);
                        object3 = this.d;
                        bl3 = Intrinsics.areEqual(object3, string3);
                        if (!bl3 && !(bl3 = Intrinsics.areEqual(string2 = this.e, string3))) {
                            object2 = UX.c("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", (String)object3, ", found: ", string3);
                            object = new IllegalStateException((String)object2);
                            throw object;
                        }
                        break block22;
                    }
                    object3 = ((GP2$a)object2).onValidateSchema((xg3_1)object);
                    bl2 = ((GP2$b)object3).a;
                    if (!bl2) break block23;
                    ((GP2$a)object2).onPostMigrate((xg3_1)object);
                    this.g((ex0_1)object);
                }
                ((GP2$a)object2).onOpen((xg3_1)object);
                this.b = null;
                return;
            }
            object2 = new StringBuilder("Pre-packaged database has an invalid schema: ");
            object3 = ((GP2$b)object3).b;
            ((StringBuilder)object2).append((String)object3);
            object2 = ((StringBuilder)object2).toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable4) {
            xj3_1.b((Closeable)object2, throwable2);
            throw throwable4;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void f(ex0_1 var1_1, int var2_2, int var3_3) {
        block18: {
            block17: {
                block15: {
                    block16: {
                        block13: {
                            var4_4 = this;
                            var5_5 = var1_1;
                            var6_6 = var2_2;
                            var7_7 = var3_3;
                            Intrinsics.checkNotNullParameter(var1_1, "db");
                            var8_8 = this.b;
                            var9_9 = this.c;
                            if (var8_8 == null) break block15;
                            var8_8 = var8_8.d;
                            var8_8.getClass();
                            if (var2_2 == var3_3) {
                                var8_8 = mz0_2.a;
                            } else {
                                var10_10 = var3_3 > var2_2;
                                var11_11 = new ArrayList<Object>();
                                var12_12 = var6_6;
                                while (var10_10 != false ? var12_12 < var7_7 : var12_12 > var7_7) {
                                    block14: {
                                        var13_13 = var8_8.a;
                                        var14_14 = var12_12;
                                        var13_13 = (TreeMap)var13_13.get(var14_14);
                                        var14_14 = null;
                                        if (var13_13 == null) lbl-1000:
                                        // 2 sources

                                        {
                                            while (true) {
                                                var15_22 = false;
                                                var8_8 = null;
                                                break block13;
                                                break;
                                            }
                                        }
                                        var16_15 = var10_10 != false ? var13_13.descendingKeySet() : var13_13.keySet();
                                        var16_15 = var16_15.iterator();
                                        while (var17_16 = var16_15.hasNext()) {
                                            var18_17 = (Integer)var16_15.next();
                                            var19_18 = "targetVersion";
                                            if (var10_10) {
                                                var20_19 = var12_12 + 1;
                                                Intrinsics.checkNotNullExpressionValue(var18_17, var19_18);
                                                var21_20 = var18_17;
                                                if (var20_19 > var21_20 || var21_20 > var7_7) continue;
                                            } else {
                                                Intrinsics.checkNotNullExpressionValue(var18_17, var19_18);
                                                var20_19 = var18_17;
                                                if (var7_7 > var20_19 || var20_19 >= var12_12) continue;
                                            }
                                            var22_21 = (E)var13_13.get(var18_17);
                                            Intrinsics.checkNotNull(var22_21);
                                            var11_11.add(var22_21);
                                            var12_12 = var18_17;
                                            var20_19 = 1;
                                            break block14;
                                        }
                                        var20_19 = 0;
                                        var22_21 = null;
                                    }
                                    if (var20_19 != 0) continue;
                                    ** continue;
                                }
                                var8_8 = var11_11;
                            }
                        }
                        if (var8_8 == null) break block15;
                        var9_9.onPreMigrate((xg3_1)var5_5);
                        var8_8 = var8_8;
                        var23_23 = var8_8.iterator();
                        while ((var7_7 = (int)var23_23.hasNext()) != 0) {
                            var24_25 = (XO1)var23_23.next();
                            var24_25.migrate((xg3_1)var5_5);
                        }
                        var23_23 = var9_9.onValidateSchema((xg3_1)var5_5);
                        var7_7 = (int)var23_23.a;
                        if (var7_7 == 0) break block16;
                        var9_9.onPostMigrate((xg3_1)var5_5);
                        this.g(var1_1);
                        break block17;
                    }
                    var24_25 = new StringBuilder("Migration didn't properly handle: ");
                    var23_23 = var23_23.b;
                    var24_25.append((String)var23_23);
                    var23_23 = var24_25.toString();
                    var5_5 = new IllegalStateException((String)var23_23);
                    throw var5_5;
                }
                if ((var8_8 = var4_4.b) == null || (var15_22 = var8_8.a(var6_6, var7_7))) break block18;
                var9_9.dropAllTables((xg3_1)var5_5);
                var9_9.createAllTables((xg3_1)var5_5);
            }
            return;
        }
        var23_24 = z41.a("A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.", var6_6, var7_7);
        var5_5 = new IllegalStateException(var23_24);
        throw var5_5;
    }

    public final void g(ex0_1 ex0_12) {
        ex0_12.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String string2 = this.d;
        Intrinsics.checkNotNullParameter(string2, "hash");
        StringBuilder stringBuilder = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        stringBuilder.append(string2);
        stringBuilder.append("')");
        string2 = stringBuilder.toString();
        ex0_12.o(string2);
    }
}

