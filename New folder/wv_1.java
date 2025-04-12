/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;

/*
 * Renamed from wV
 */
public final class wv_1
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ l80_0 b;
    public final /* synthetic */ CleverTapInstanceConfig c;
    public final /* synthetic */ mp0_0 d;
    public final /* synthetic */ tf_0 e;
    public final /* synthetic */ we f;

    public wv_1(Context context, l80_0 l80_02, CleverTapInstanceConfig cleverTapInstanceConfig, mp0_0 mp0_02, ck_1 ck_12, we we2) {
        this.a = context;
        this.b = l80_02;
        this.c = cleverTapInstanceConfig;
        this.d = mp0_02;
        this.e = ck_12;
        this.f = we2;
    }

    public final Object call() {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
        Object object = cleverTapInstanceConfig.b();
        CharSequence charSequence = new StringBuilder();
        String string2 = cleverTapInstanceConfig.a;
        String string3 = ":async_deviceID";
        charSequence = h30_0.a((StringBuilder)charSequence, string2, string3);
        Object object2 = new StringBuilder("Initializing Feature Flags with device Id = ");
        Object object3 = this.d;
        Object object4 = ((mp0_0)object3).f();
        ((StringBuilder)object2).append((String)object4);
        object2 = ((StringBuilder)object2).toString();
        ((b)object).b((String)charSequence, (String)object2);
        boolean bl2 = cleverTapInstanceConfig.h;
        if (bl2) {
            cleverTapInstanceConfig.b().getClass();
            object = "Feature Flag is not enabled for this instance";
            com.clevertap.android.sdk.b.f((String)object);
        } else {
            nh_1 nh_12;
            charSequence = ((mp0_0)object3).f();
            object = this.a;
            lm0_1 lm0_12 = new lm0_1((Context)object, cleverTapInstanceConfig);
            object4 = this.f;
            object3 = object = this.e;
            object3 = (ck_1)object;
            object = nh_12;
            object2 = cleverTapInstanceConfig;
            this.b.d = nh_12 = new nh_1((String)charSequence, cleverTapInstanceConfig, (ck_1)object3, (i0_0)object4, lm0_12);
            object = cleverTapInstanceConfig.b();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(string3);
            charSequence = ((StringBuilder)charSequence).toString();
            object2 = "Feature Flags initialized";
            ((b)object).b((String)charSequence, (String)object2);
        }
        return null;
    }
}

