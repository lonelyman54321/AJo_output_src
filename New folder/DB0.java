/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import com.facebook.FacebookSdk;
import com.facebook.appevents.c;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class DB0 {
    public static final DB0 a;
    public static boolean b;
    public static final ArrayList c;
    public static final HashSet d;

    static {
        AbstractCollection abstractCollection = new AbstractCollection();
        a = abstractCollection;
        c = abstractCollection = new AbstractCollection();
        abstractCollection = new AbstractCollection();
        d = abstractCollection;
    }

    public static final void b(ArrayList object) {
        Throwable throwable2;
        Class<DB0> clazz;
        block14: {
            block13: {
                Object object2;
                boolean bl2;
                block12: {
                    clazz = DB0.class;
                    bl2 = td0.b(clazz);
                    if (bl2) {
                        return;
                    }
                    object2 = "events";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    bl2 = b;
                    if (bl2) break block12;
                    return;
                }
                try {
                    object = ((ArrayList)object).iterator();
                }
                catch (Throwable throwable2) {}
                while (true) {
                    bl2 = object.hasNext();
                    if (!bl2) break block13;
                    break;
                }
                {
                    object2 = object.next();
                    object2 = (c)object2;
                    HashSet hashSet = d;
                    object2 = ((c)object2).e;
                    bl2 = hashSet.contains(object2);
                    if (!bl2) continue;
                    object.remove();
                    continue;
                }
                break block14;
            }
            return;
        }
        td0.a(clazz, throwable2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            block14: {
                boolean bl2;
                JSONObject jSONObject;
                Object object;
                block15: {
                    int n3;
                    block13: {
                        block12: {
                            boolean bl3 = td0.b(this);
                            if (!bl3) break block12;
                            return;
                        }
                        object = FacebookSdk.b();
                        n3 = 0;
                        jSONObject = null;
                        object = dl0_2.k((String)object, false);
                        if (object != null) break block13;
                        return;
                    }
                    try {
                        object = ((al0_2)object).o;
                        if (object == null || (n3 = ((String)object).length()) <= 0) break block14;
                        jSONObject = new JSONObject((String)object);
                        object = c;
                        ((ArrayList)object).clear();
                        object = jSONObject.keys();
                        break block15;
                    }
                    catch (Throwable throwable2) {}
                    td0.a(this, throwable2);
                    return;
                    catch (Exception exception) {}
                    break block14;
                }
                while (bl2 = object.hasNext()) {
                    Object object2 = object.next();
                    Object object3 = jSONObject.getJSONObject(object2 = (String)object2);
                    if (object3 == null) continue;
                    Object object4 = "is_deprecated_event";
                    boolean bl4 = object3.optBoolean((String)object4);
                    if (bl4) {
                        object3 = d;
                        object4 = "key";
                        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                        ((HashSet)object3).add(object2);
                        continue;
                    }
                    object4 = "deprecated_param";
                    object3 = object3.optJSONArray((String)object4);
                    ArrayList arrayList = "key";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)((Object)arrayList));
                    arrayList = new ArrayList();
                    String string2 = "eventName";
                    Intrinsics.checkNotNullParameter(object2, string2);
                    string2 = "deprecateParams";
                    Intrinsics.checkNotNullParameter(arrayList, string2);
                    object4 = new Object();
                    ((DB0$a)object4).a = object2;
                    ((DB0$a)object4).b = arrayList;
                    if (object3 != null) {
                        object2 = lz3_0.h((JSONArray)object3);
                        object3 = "<set-?>";
                        Intrinsics.checkNotNullParameter(object2, (String)object3);
                        ((DB0$a)object4).b = object2;
                    }
                    object2 = c;
                    ((ArrayList)object2).add((Object)object4);
                }
            }
            return;
            catch (Throwable throwable322) {}
            throw throwable322;
        }
    }
}

