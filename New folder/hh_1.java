/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.text.TextUtils;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from HH
 */
public final class hh_1 {
    public final HashMap a;

    public hh_1() {
        HashMap hashMap;
        this.a = hashMap = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        synchronized (this) {
            HashMap hashMap = this.a;
            hashMap.clear();
            b.d();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ArrayList b(JSONArray jSONArray) {
        synchronized (this) {
            try {
                Exception exception2;
                block10: {
                    int n3;
                    this.a();
                    ArrayList<Object> arrayList = null;
                    if (jSONArray == null || (n3 = jSONArray.length()) <= 0) {
                        b.d();
                        return null;
                    }
                    ArrayList<Object> arrayList2 = new ArrayList<Object>();
                    int n4 = 0;
                    while (true) {
                        block9: {
                            block8: {
                                try {
                                    int n7 = jSONArray.length();
                                    if (n4 >= n7) break;
                                    Object object = jSONArray.get(n4);
                                    object = (JSONObject)object;
                                    object = CleverTapDisplayUnit.a((JSONObject)object);
                                    Object object2 = ((CleverTapDisplayUnit)object).d;
                                    boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
                                    if (!bl2) break block8;
                                    object2 = this.a;
                                    String string2 = ((CleverTapDisplayUnit)object).g;
                                    ((HashMap)object2).put(string2, object);
                                    arrayList2.add(object);
                                    break block9;
                                }
                                catch (Exception exception2) {
                                    break block10;
                                }
                            }
                            b.d();
                        }
                        ++n4;
                    }
                    boolean bl3 = arrayList2.isEmpty();
                    if (bl3) return arrayList;
                    return arrayList2;
                }
                exception2.getLocalizedMessage();
                b.d();
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

