/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class cC2
implements Callable {
    public final /* synthetic */ hC2 a;
    public final /* synthetic */ List b;

    public /* synthetic */ cC2(hC2 hC22, ArrayList arrayList) {
        this.a = hC22;
        this.b = arrayList;
    }

    public final Object call() {
        block7: {
            CleverTapInstanceConfig cleverTapInstanceConfig;
            String string2;
            boolean bl2;
            Object object;
            Object object2;
            block6: {
                object2 = this.a;
                object2.getClass();
                object = this.b;
                bl2 = object.isEmpty();
                string2 = "PushProvider";
                cleverTapInstanceConfig = ((hC2)object2).f;
                if (!bl2) break block6;
                object2 = "No push providers found!. Make sure to install at least one push provider";
                cleverTapInstanceConfig.e(string2, (String)object2);
                break block7;
            }
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                Object object3;
                Object object4;
                int n3;
                Object object5;
                block10: {
                    String string3;
                    block9: {
                        int n4;
                        block8: {
                            object5 = (ci_0)object.next();
                            n3 = object5.minSDKSupportVersionCode();
                            n4 = 70103;
                            string3 = "Invalid Provider: ";
                            if (n4 >= n3) break block8;
                            object4 = "Provider: %s version %s does not match the SDK version %s. Make sure all CleverTap dependencies are the same version.";
                            cleverTapInstanceConfig.e(string2, (String)object4);
                            break block9;
                        }
                        object4 = object5.getPushType();
                        if (object4 != (object3 = XB2$a.FCM) || (n3 = object5.getPlatform()) == (n4 = 1)) break block10;
                        object4 = new StringBuilder(string3);
                        object3 = object5.getClass();
                        ((StringBuilder)object4).append(object3);
                        ((StringBuilder)object4).append(" delivery is only available for Android platforms.");
                        object3 = object5.getPushType();
                        ((StringBuilder)object4).append(object3);
                        object4 = ((StringBuilder)object4).toString();
                        cleverTapInstanceConfig.e(string2, (String)object4);
                    }
                    object4 = new StringBuilder(string3);
                    object5 = object5.getClass();
                    ((StringBuilder)object4).append(object5);
                    object5 = ((StringBuilder)object4).toString();
                    cleverTapInstanceConfig.e(string2, (String)object5);
                    continue;
                }
                n3 = (int)(object5.isSupported() ? 1 : 0);
                if (n3 == 0) {
                    object3 = "Unsupported Provider: ";
                    object4 = new StringBuilder((String)object3);
                    object5 = object5.getClass();
                    ((StringBuilder)object4).append(object5);
                    object5 = ((StringBuilder)object4).toString();
                    cleverTapInstanceConfig.e(string2, (String)object5);
                    continue;
                }
                n3 = (int)(object5.isAvailable() ? 1 : 0);
                if (n3 != 0) {
                    object4 = new StringBuilder("Available Provider: ");
                    object3 = object5.getClass();
                    ((StringBuilder)object4).append(object3);
                    object4 = ((StringBuilder)object4).toString();
                    cleverTapInstanceConfig.e(string2, (String)object4);
                    object4 = ((hC2)object2).b;
                    ((ArrayList)object4).add(object5);
                    continue;
                }
                object3 = "Unavailable Provider: ";
                object4 = new StringBuilder((String)object3);
                object5 = object5.getClass();
                ((StringBuilder)object4).append(object5);
                object5 = ((StringBuilder)object4).toString();
                cleverTapInstanceConfig.e(string2, (String)object5);
            }
        }
        return null;
    }
}

