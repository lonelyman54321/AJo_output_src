/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

public final class EB2 {
    public static final EB2 a;
    public static boolean b;
    public static final hh3_2 c;
    public static HashSet d;

    static {
        EB2 eB2;
        a = eB2 = new EB2();
        c = yr1_2.b(EB2$a.c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(Bundle bundle) {
        Throwable throwable2;
        Class<EB2> clazz;
        block7: {
            Object object;
            Object object2;
            clazz = EB2.class;
            boolean bl2 = td0.b(clazz);
            if (bl2) {
                return;
            }
            try {
                boolean bl3;
                bl2 = b;
                if (!bl2) return;
                if (bundle == null) return;
                bl2 = bundle.isEmpty();
                if (bl2) return;
                object2 = d;
                if (object2 == null) {
                    return;
                }
                object2 = new ArrayList();
                object = bundle.keySet();
                String string2 = "parameters.keySet()";
                Intrinsics.checkNotNullExpressionValue(object, string2);
                object = (Iterable)object;
                object = object.iterator();
                while (bl3 = object.hasNext()) {
                    string2 = object.next();
                    Object object3 = d;
                    Intrinsics.checkNotNull(object3);
                    boolean bl4 = ((HashSet)object3).contains(string2);
                    if (bl4) continue;
                    object3 = "param";
                    Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
                    object2.add(string2);
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            object2 = object2.iterator();
            while (true) {
                boolean bl5;
                if (!(bl5 = object2.hasNext())) {
                    object2 = "pm";
                    object = "1";
                    bundle.putString((String)object2, (String)object);
                    return;
                }
                object = object2.next();
                object = (String)object;
                bundle.remove((String)object);
            }
        }
        td0.a(clazz, throwable2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        var1_1 = td0.b(this);
        if (var1_1) {
            return;
        }
        var2_2 = FacebookSdk.b();
        var2_2 = dl0_2.k((String)var2_2, false);
        if (var2_2 == null) {
            return;
        }
        var2_2 = var2_2.p;
        var4_8 = td0.b(this);
        var5_9 = null;
        if (var4_8 != 0 || var2_2 == null) ** GOTO lbl29
        try {
            var4_8 = var2_2.length();
            if (var4_8 == 0) ** GOTO lbl29
            var6_10 = new HashSet<String>();
            var7_11 = var2_2.length();
            for (var3_7 = 0; var3_7 < var7_11; ++var3_7) {
                var8_12 = var2_2.getString(var3_7);
                var9_13 = "jsonArray.getString(i)";
                Intrinsics.checkNotNullExpressionValue(var8_12, var9_13);
                var6_10.add(var8_12);
            }
            ** GOTO lbl31
        }
        catch (Throwable var2_3) {
            td0.a(this, var2_3);
lbl29:
            // 3 sources

            var4_8 = 0;
            var6_10 = null;
lbl31:
            // 2 sources

            if (var6_10 != null) ** GOTO lbl46
            var1_1 = td0.b(this);
            if (var1_1) ** GOTO lbl45
            {
                catch (Throwable var2_5) {
                    td0.a(this, var2_5);
                    return;
                }
            }
            try {
                var2_2 = EB2.c;
                var2_2 = var2_2.getValue();
                var5_9 = var2_2 = (HashSet)var2_2;
                ** GOTO lbl45
            }
            catch (Throwable var2_4) {
                td0.a(this, var2_4);
lbl45:
                // 3 sources

                var6_10 = var5_9;
lbl46:
                // 2 sources

                EB2.d = var6_10;
                return;
            }
        }
    }

    public final boolean c(Bundle object) {
        Throwable throwable2;
        block7: {
            boolean bl2;
            block6: {
                String string2 = "pm";
                boolean bl3 = td0.b(this);
                bl2 = false;
                if (bl3) {
                    return false;
                }
                if (object == null) {
                    return false;
                }
                try {
                    bl3 = object.containsKey(string2);
                    if (!bl3) break block6;
                }
                catch (Throwable throwable2) {}
                object = object.get(string2);
                string2 = "1";
                boolean bl4 = Intrinsics.areEqual(object, string2);
                if (!bl4) break block6;
                bl2 = true;
                break block7;
            }
            return bl2;
        }
        td0.a(this, throwable2);
        return false;
    }
}

