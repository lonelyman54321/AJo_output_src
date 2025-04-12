/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.services.data.Price;

/*
 * Renamed from ax0
 */
public final class ax0_1 {
    public static final ax0_1 a;

    static {
        ax0_1 ax0_12;
        a = ax0_12 = new Object();
    }

    public static float a(Price object) {
        String string2;
        boolean bl2;
        float f5 = 0.0f;
        if (object != null && !(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((Price)object).getValue()))) && (object = ((Price)object).getValue()) != null) {
            f5 = Float.parseFloat((String)object);
        }
        return f5;
    }

    public static float b(float f5, float f6) {
        float f7 = f6 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object > 0) {
            f5 = f6;
        } else {
            float f8 = f5 - 0.0f;
            Object object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object2 <= 0) {
                f5 = 0.0f;
            }
        }
        return f5;
    }
}

