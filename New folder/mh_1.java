/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;

/*
 * Renamed from MH
 */
public final class mh_1
implements Callable {
    public final /* synthetic */ nh_1 a;

    public mh_1(nh_1 nh_12) {
        this.a = nh_12;
    }

    public final Object call() {
        Object object = this.a;
        i0_0 i0_02 = ((nh_1)object).d;
        try {
            i0_02.I();
        }
        catch (Exception exception) {
            b b2 = ((nh_1)object).a.b();
            object = ((nh_1)object).b();
            String string2 = exception.getLocalizedMessage();
            b2.b((String)object, string2);
        }
        return null;
    }
}

