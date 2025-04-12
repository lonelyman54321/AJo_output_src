/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.a;
import com.clevertap.android.sdk.b;

/*
 * Renamed from YB2
 */
public final class yb2_0
implements n2_0 {
    public static boolean c(Bundle object) {
        boolean bl2;
        String string2 = "0";
        boolean bl3 = string2.equals(object = object.getString("pt_id"));
        if (!bl3 && object != null && !(bl2 = ((String)object).isEmpty())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final boolean a(Context context, Bundle bundle, int n3) {
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean b(Context context, String object, Bundle bundle) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block4: {
                    block7: {
                        block5: {
                            Object object2;
                            Object object3;
                            block6: {
                                object3 = "omr_invoke_time_in_millis";
                                try {
                                    long l2 = System.currentTimeMillis();
                                    bundle.putLong((String)object3, l2);
                                    object3 = zb2_0.a(bundle);
                                    object3 = a.h(context, (String)object3);
                                    object2 = a.i(bundle);
                                    boolean bl2 = ((m52_0)object2).a;
                                    if (!bl2) break block4;
                                    if (object3 == null) break block5;
                                    object2 = ((a)object3).b;
                                    object2 = ((H80)object2).a;
                                    String string2 = "PushProvider";
                                    CharSequence charSequence = new StringBuilder();
                                    charSequence.append((String)object);
                                    String string3 = "received notification from CleverTap: ";
                                    charSequence.append(string3);
                                    string3 = bundle.toString();
                                    charSequence.append(string3);
                                    charSequence = charSequence.toString();
                                    ((CleverTapInstanceConfig)object2).e(string2, (String)charSequence);
                                    bl2 = yb2_0.c(bundle);
                                    if (!bl2 || (object2 = a.f) == null) break block6;
                                    object2.b(context, (String)object, bundle);
                                    break block7;
                                }
                                catch (Throwable throwable2) {
                                    break block8;
                                }
                            }
                            object = "source";
                            object = bundle.getString((String)object);
                            object2 = "signedcall";
                            ((String)object2).equals(object);
                            object = new Object();
                            ((a)object3).r((ec1_1)object, context, bundle);
                            break block7;
                        }
                        bundle.toString();
                        b.d();
                        b.d();
                    }
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }
}

