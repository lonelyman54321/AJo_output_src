/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.myaccount.order.data.PriorityDeliveryRefundTrackerData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from iq1
 */
public final class iq1_1 {
    public static final /* synthetic */ int a;

    public static String a(String object, Double d2) {
        Object[] objectArray;
        block6: {
            block10: {
                String string2;
                Object object2;
                int n3;
                block11: {
                    boolean bl2;
                    double d5;
                    block9: {
                        String string3;
                        block7: {
                            block8: {
                                int n4;
                                int n7;
                                n3 = 1;
                                objectArray = "";
                                if (object == null || d2 == null) break block6;
                                object2 = h40_0.a;
                                object2 = h40_0.j0().getPostOrder();
                                if (object2 == null) {
                                    int n8 = 31;
                                    n7 = 0;
                                    string3 = null;
                                    n4 = 0;
                                    string2 = null;
                                    object2 = new PriorityDeliveryRefundTrackerData(false, null, null, null, null, n8, null);
                                }
                                if ((n7 = Intrinsics.areEqual(d2, d5 = 0.0)) != 0) {
                                    return ((PriorityDeliveryRefundTrackerData)object2).getFree();
                                }
                                n7 = ((String)object).hashCode();
                                n4 = -1872451388;
                                string2 = "format(...)";
                                if (n7 == n4) break block7;
                                n4 = 74702359;
                                if (n7 == n4) break block8;
                                n4 = 1440752412;
                                if (n7 != n4 || !(bl2 = ((String)object).equals(string3 = "WILL_BE_INITIATED"))) break block9;
                                object = StringCompanionObject.INSTANCE;
                                object = ((PriorityDeliveryRefundTrackerData)object2).getRefundYetToBeInitiated();
                                objectArray = new Object[n3];
                                objectArray[0] = d2;
                                object = xh2_0.a(objectArray, n3, (String)object, string2);
                                break block10;
                            }
                            string3 = "REFUNDED";
                            bl2 = ((String)object).equals(string3);
                            if (!bl2) break block9;
                            object = StringCompanionObject.INSTANCE;
                            object = ((PriorityDeliveryRefundTrackerData)object2).getRefunded();
                            objectArray = new Object[n3];
                            objectArray[0] = d2;
                            object = xh2_0.a(objectArray, n3, (String)object, string2);
                            break block10;
                        }
                        string3 = "REFUND_INITIATED";
                        bl2 = ((String)object).equals(string3);
                        if (bl2) break block11;
                    }
                    if (bl2 = Intrinsics.areEqual(d2, d5)) {
                        objectArray = ((PriorityDeliveryRefundTrackerData)object2).getFree();
                    }
                    return objectArray;
                }
                object = StringCompanionObject.INSTANCE;
                object = ((PriorityDeliveryRefundTrackerData)object2).getRefundInitiated();
                objectArray = new Object[n3];
                objectArray[0] = d2;
                object = xh2_0.a(objectArray, n3, (String)object, string2);
            }
            return object;
        }
        return objectArray;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean b(xp1_0 object) {
        xp1_0 xp1_02 = ((xp1_0)object).c;
        if (xp1_02 == null) return false;
        xp1_02 = ((xp1_0)object).A();
        if (xp1_02 == null) return true;
        xp1_02 = xp1_02.c;
        if (xp1_02 == null) return true;
        object = ((xp1_0)object).z;
        boolean bl2 = ((bq1)object).b;
        if (!bl2) return false;
        return true;
    }
}

