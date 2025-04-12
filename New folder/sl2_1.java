/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.facebook.FacebookSdk;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from sL2
 */
public final class sl2_1 {
    public static final sl2_1 a;
    public static boolean b;
    public static final ArrayList c;
    public static final CopyOnWriteArraySet d;

    static {
        AbstractCollection abstractCollection = new AbstractCollection();
        a = abstractCollection;
        c = abstractCollection = new AbstractCollection();
        abstractCollection = new AbstractCollection();
        d = abstractCollection;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final String a(String var1_1, String var2_3) {
        block24: {
            var3_4 = td0.b(this);
            if (var3_4) {
                return null;
            }
            var5_6 = sl2_1.c;
            var4_5 = new ArrayList(var5_6);
            var4_5 = var4_5.iterator();
            block20: while (true) {
                var6_7 = var4_5.hasNext();
                if (!var6_7) break block24;
                var5_6 = var4_5.next();
                var5_6 = (sl2$a_0)var5_6;
                if (var5_6 == null) continue;
                var7_8 = var5_6.a;
                var8_9 = Intrinsics.areEqual(var1_1, var7_8);
                if (!var8_9) continue;
                var7_8 = var5_6.b;
                var7_8 = var7_8.keySet();
                var7_8 = var7_8.iterator();
                while (true) {
                    var9_10 = var7_8.hasNext();
                    if (var9_10) ** break;
                    continue block20;
                    var10_11 /* !! */  = var7_8.next();
                    var10_11 /* !! */  = (String)var10_11 /* !! */ ;
                    if (!(var11_12 = Intrinsics.areEqual(var2_3, var10_11 /* !! */ ))) continue;
                    break;
                }
                break;
            }
            var1_1 = var5_6.b;
            var1_1 = var1_1.get(var10_11 /* !! */ );
            try {
                return (String)var1_1;
            }
            catch (Throwable var1_2) {
                td0.a(this, var1_2);
            }
        }
lbl49:
        // 2 sources

        return null;
        catch (Exception v0) {
            ** continue;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        boolean bl2;
        Iterator iterator;
        CopyOnWriteArraySet copyOnWriteArraySet;
        JSONObject jSONObject;
        Object object;
        boolean bl3 = td0.b(this);
        if (bl3) {
            return;
        }
        try {
            object = FacebookSdk.b();
            int n3 = 0;
            jSONObject = null;
            object = dl0_2.k((String)object, false);
            if (object == null) {
                return;
            }
            object = ((al0_2)object).o;
            if (object == null) return;
            n3 = ((String)object).length();
            if (n3 == 0) {
                return;
            }
            jSONObject = new JSONObject((String)object);
            object = c;
            ((ArrayList)object).clear();
            copyOnWriteArraySet = d;
            copyOnWriteArraySet.clear();
            iterator = jSONObject.keys();
        }
        catch (Throwable throwable) {}
        td0.a(this, throwable);
        return;
        catch (Exception exception) {
            return;
        }
        while (bl2 = iterator.hasNext()) {
            boolean bl4;
            Object object2 = iterator.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(object2 = (String)object2);
            if (jSONObject2 == null) continue;
            Object object3 = "restrictive_param";
            object3 = jSONObject2.optJSONObject((String)object3);
            Object object4 = "key";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
            object4 = new HashMap();
            String string2 = "eventName";
            Intrinsics.checkNotNullParameter(object2, string2);
            string2 = "restrictiveParams";
            Intrinsics.checkNotNullParameter(object4, string2);
            sl2$a_0 sl2$a_0 = new Object();
            sl2$a_0.a = object2;
            sl2$a_0.b = object4;
            if (object3 != null) {
                object3 = lz3_0.j((JSONObject)object3);
                object4 = "<set-?>";
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                sl2$a_0.b = object3;
                ((ArrayList)object).add(sl2$a_0);
            }
            if (!(bl4 = jSONObject2.has((String)(object3 = "process_event_name")))) continue;
            copyOnWriteArraySet.add(object2);
        }
    }
}

