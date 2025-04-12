/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;

/*
 * Renamed from bA2
 */
public final class ba2_0
implements Callable {
    public final /* synthetic */ lm0_1 a;
    public final /* synthetic */ cA2 b;

    public ba2_0(cA2 cA22, lm0_1 lm0_12) {
        this.b = cA22;
        this.a = lm0_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        String string2 = "Error while resetting settings";
        String string3 = "Deleted settings file";
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    try {
                        Object object = this.b;
                        Object object2 = new StringBuilder();
                        Object object3 = "Product_Config_";
                        Object object4 = new StringBuilder((String)object3);
                        object3 = ((cA2)object).a;
                        object3 = ((CleverTapInstanceConfig)object3).a;
                        ((StringBuilder)object4).append((String)object3);
                        object3 = "_";
                        ((StringBuilder)object4).append((String)object3);
                        object = ((cA2)object).b;
                        ((StringBuilder)object4).append((String)object);
                        object = ((StringBuilder)object4).toString();
                        ((StringBuilder)object2).append((String)object);
                        object = "/config_settings.json";
                        ((StringBuilder)object2).append((String)object);
                        object = ((StringBuilder)object2).toString();
                        object2 = this.a;
                        ((lm0_1)object2).a((String)object);
                        object2 = this.b;
                        object2 = ((cA2)object2).a;
                        object2 = ((CleverTapInstanceConfig)object2).b();
                        object4 = this.b;
                        object4 = ((cA2)object4).a;
                        object4 = da2_0.a((CleverTapInstanceConfig)object4);
                        object3 = new StringBuilder(string3);
                        ((StringBuilder)object3).append((String)object);
                        string3 = ((StringBuilder)object3).toString();
                        ((b)object2).b((String)object4, string3);
                    }
                    catch (Exception exception) {
                        Object object = this.b;
                        object = ((cA2)object).a;
                        object = ((CleverTapInstanceConfig)object).b();
                        Object object5 = this.b;
                        object5 = ((cA2)object5).a;
                        object5 = da2_0.a((CleverTapInstanceConfig)object5);
                        StringBuilder stringBuilder = new StringBuilder(string2);
                        string2 = exception.getLocalizedMessage();
                        stringBuilder.append(string2);
                        string2 = stringBuilder.toString();
                        ((b)object).b((String)object5, string2);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return null;
            }
            throw throwable2;
        }
    }
}

