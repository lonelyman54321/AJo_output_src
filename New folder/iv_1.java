/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.a;
import java.util.concurrent.Callable;

/*
 * Renamed from iV
 */
public final class iv_1
implements Callable {
    public final /* synthetic */ com.clevertap.android.sdk.a a;
    public final /* synthetic */ CleverTapInstanceConfig b;

    public /* synthetic */ iv_1(com.clevertap.android.sdk.a a2, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.a = a2;
        this.b = cleverTapInstanceConfig;
    }

    public final Object call() {
        Object object = this.a;
        object.getClass();
        Object object2 = this.b;
        boolean bl2 = ((CleverTapInstanceConfig)object2).p;
        if (bl2) {
            object2 = jh_1.a(((com.clevertap.android.sdk.a)object).b.a).b();
            lv_0 lv_02 = new lv_0((com.clevertap.android.sdk.a)object);
            object = "Manifest Validation";
            ((a)object2).c((String)object, lv_02);
        }
        return null;
    }
}

