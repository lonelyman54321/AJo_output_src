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
 * Renamed from vV
 */
public final class vv_2
implements Callable {
    public final /* synthetic */ H80 a;
    public final /* synthetic */ l80_0 b;
    public final /* synthetic */ CleverTapInstanceConfig c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ kd3_0 e;
    public final /* synthetic */ df1_1 f;

    public vv_2(H80 h80, l80_0 l80_02, CleverTapInstanceConfig cleverTapInstanceConfig, Context context, kd3_0 kd3_02, df1_1 df1_12) {
        this.a = h80;
        this.b = l80_02;
        this.c = cleverTapInstanceConfig;
        this.d = context;
        this.e = kd3_02;
        this.f = df1_12;
    }

    public final Object call() {
        Object object = this.a;
        Object object2 = ((H80)object).c;
        if (object2 != null && (object2 = ((mp0_0)object2).f()) != null) {
            object2 = this.b;
            Object object3 = ((l80_0)object2).a;
            if (object3 == null) {
                object3 = ((H80)object).a.b();
                CharSequence charSequence = new StringBuilder();
                CharSequence charSequence2 = this.c.a;
                charSequence = h30_0.a(charSequence, (String)charSequence2, ":async_deviceID");
                charSequence2 = new StringBuilder("Initializing InAppFC with device Id = ");
                Object object4 = ((H80)object).c.f();
                ((StringBuilder)charSequence2).append((String)object4);
                charSequence2 = ((StringBuilder)charSequence2).toString();
                ((b)object3).b((String)charSequence, (String)charSequence2);
                object = ((H80)object).c;
                String string2 = ((mp0_0)object).f();
                Context context = this.d;
                CleverTapInstanceConfig cleverTapInstanceConfig = this.c;
                kd3_0 kd3_02 = this.e;
                df1_1 df1_12 = this.f;
                object4 = object3;
                ((l80_0)object2).a = object3 = new Gf1(context, cleverTapInstanceConfig, string2, kd3_02, df1_12);
            }
        }
        return null;
    }
}

