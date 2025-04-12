/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.variables.callbacks.VariablesChangedCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/*
 * Renamed from KI
 */
public final class ki_1 {
    public boolean a = false;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final ta3_1 f;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ki_1(ta3_1 ta3_12) {
        Object object = new ArrayList();
        this.b = object;
        object = new ArrayList();
        this.c = object;
        object = new ArrayList();
        this.d = object;
        object = new ArrayList();
        this.e = object;
        this.f = ta3_12;
        object = new hi_1(this, 0);
        synchronized (ta3_12) {
            ta3_12.c = object;
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(JSONObject var1_1) {
        Objects.toString(var1_1);
        com.clevertap.android.sdk.b.d();
        if (var1_1 == null) {
            this.b();
            return;
        }
        var2_2 = 1;
        this.a = var2_2;
        var1_1 = wm1_1.c((JSONObject)var1_1);
        var3_3 = new HashMap();
        var1_1 = var1_1.entrySet().iterator();
        while (true) {
            if (!(var4_4 = var1_1.hasNext())) {
                var1_1 = this.f;
                var4_4 = false;
                var5_5 = null;
                var16_16 = new ii_2(this, 0);
                synchronized (var1_1) {
                    var6_6 /* !! */  = var1_1.b;
                    var5_5 = new HashMap(var6_6 /* !! */ );
                    var1_1.a((HashMap)var3_3, (HashMap)var5_5);
                    var1_1.d((HashMap)var5_5, (Function0)var16_16);
                    var16_16 = var1_1.h;
                    var16_16 = jh_1.a((CleverTapInstanceConfig)var16_16);
                    var16_16 = var16_16.b();
                    var3_3 = new sa3_1((ta3_1)var1_1);
                    var5_5 = "VarCache#saveDiffsAsync";
                    var16_16.c((String)var5_5, (Callable)var3_3);
                    var1_1.e();
                    return;
                }
            }
            var5_5 = (Map.Entry)var1_1.next();
            var6_6 /* !! */  = (String)var5_5.getKey();
            var8_8 = var6_6 /* !! */ .contains(var7_7 = ".");
            if (var8_8 != 0) {
                var8_8 = 0;
                var7_7 = null;
                var9_9 = "\\.";
                try {
                    var6_6 /* !! */  = var6_6 /* !! */ .split(var9_9);
                }
                catch (Throwable v0) {
                    var6_6 /* !! */  = new String[]{};
                }
            } else {
                var6_6 /* !! */  = (String)var5_5.getKey();
                var5_5 = var5_5.getValue();
                var3_3.put(var6_6 /* !! */ , var5_5);
                continue;
            }
            var10_10 = var6_6 /* !! */ .length - var2_2;
            var11_11 /* !! */  = var3_3;
            while (true) {
                if (var8_8 >= (var12_12 = var6_6 /* !! */ .length)) ** break;
                var13_13 = var6_6 /* !! */ [var8_8];
                if (var8_8 == var10_10) {
                    var14_14 /* !! */  = var5_5.getValue();
                    var11_11 /* !! */ .put(var13_13, var14_14 /* !! */ );
                } else {
                    var14_14 /* !! */  = var11_11 /* !! */ .get(var13_13);
                    var15_15 = var14_14 /* !! */  instanceof Map;
                    if (!var15_15) {
                        var14_14 /* !! */  = new V();
                        var11_11 /* !! */ .put(var13_13, var14_14 /* !! */ );
                        var11_11 /* !! */  = var14_14 /* !! */ ;
                    } else {
                        var11_11 /* !! */  = (Map)var11_11 /* !! */ .get(var13_13);
                    }
                }
                ++var8_8;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        boolean bl2 = this.a;
        if (bl2) return;
        this.a = bl2 = true;
        ta3_1 ta3_12 = this.f;
        ji_2 ji_22 = new ji_2(this, 0);
        synchronized (ta3_12) {
            ta3_12.c(ji_22);
            ta3_12.e();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c() {
        Object object;
        boolean bl2;
        Object object3 = this.d;
        // MONITORENTER : object3
        Object object2 = this.d;
        object2 = ((ArrayList)object2).iterator();
        while (bl2 = object2.hasNext()) {
            object = object2.next();
            object = (VariablesChangedCallback)object;
            yz3_0.j(object);
        }
        object2 = this.e;
        // MONITORENTER : object2
        object3 = this.e;
        object3 = ((ArrayList)object3).iterator();
        while (true) {
            if (!(bl2 = object3.hasNext())) {
                object3 = this.e;
                ((ArrayList)object3).clear();
                // MONITOREXIT : object2
                return;
            }
            object = object3.next();
            object = (VariablesChangedCallback)object;
            yz3_0.j(object);
        }
    }
}

