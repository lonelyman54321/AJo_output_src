/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import in.juspay.hypersdk.data.JuspayResponseHandler;
import in.juspay.hypersdk.ui.HyperPaymentsCallbackAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from an1
 */
public final class an1_1
extends HyperPaymentsCallbackAdapter {
    public static final an1$a Companion;
    public bn1_1 a;

    static {
        an1$a an1$a;
        Companion = an1$a = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onEvent(JSONObject object, JuspayResponseHandler object2) {
        Exception exception2;
        Object[] objectArray;
        block9: {
            int n3;
            String string2;
            object2 = "UNHANDLED JUSPAY EVENT ";
            if (object == null) return;
            objectArray = "event";
            try {
                objectArray = object.getString((String)objectArray);
                string2 = "getString(...)";
                Intrinsics.checkNotNullExpressionValue(objectArray, string2);
                object.toString();
                n3 = objectArray.hashCode();
            }
            catch (Exception exception2) {
                break block9;
            }
            switch (n3) {
                default: {
                    break;
                }
                case 1858061443: {
                    object = "initiate_result";
                    boolean bl2 = objectArray.equals(object);
                    if (!bl2) break;
                    object = this.a;
                    if (object == null) return;
                    object.V0();
                    return;
                }
                case 334457749: {
                    object = "show_loader";
                    boolean bl3 = objectArray.equals(object);
                    if (bl3) return;
                    break;
                }
                case 24468461: {
                    string2 = "process_result";
                    n3 = (int)(objectArray.equals(string2) ? 1 : 0);
                    if (n3 == 0) break;
                    object2 = "payload";
                    object = object.optJSONObject((String)object2);
                    String.valueOf(object);
                    object2 = this.a;
                    if (object2 == null) return;
                    object2.i0((JSONObject)object);
                    return;
                }
                case -174112336: {
                    object = "hide_loader";
                    boolean bl4 = objectArray.equals(object);
                    if (bl4) return;
                }
            }
            object = yn3_0.a;
            object2 = ((String)object2).concat((String)objectArray);
            objectArray = null;
            objectArray = new Object[]{};
            ((yn3$a)object).d((String)object2, objectArray);
            return;
        }
        object2 = yn3_0.a;
        objectArray = "Juspay Exception";
        ((yn3$a)object2).l((String)objectArray);
        ((yn3$a)object2).e(exception2);
        bn1_1 bn1_12 = this.a;
        if (bn1_12 == null) return;
        object2 = null;
        bn1_12.i0(null);
    }
}

