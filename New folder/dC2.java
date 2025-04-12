/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;

public final class dC2
implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ XB2$a b;
    public final /* synthetic */ hC2 c;

    public dC2(hC2 hC22, String string2, XB2$a xB2$a) {
        this.c = hC22;
        this.a = string2;
        this.b = xB2$a;
    }

    public final Object call() {
        boolean bl2;
        String string2;
        Object object = this.c;
        object.getClass();
        String string3 = this.a;
        boolean bl3 = TextUtils.isEmpty((CharSequence)string3);
        XB2$a xB2$a = this.b;
        if (!bl3 && xB2$a != null && (bl3 = string3.equalsIgnoreCase(string2 = ((hC2)object).d(xB2$a)))) {
            bl3 = true;
        } else {
            bl3 = false;
            string2 = null;
        }
        CleverTapInstanceConfig cleverTapInstanceConfig = ((hC2)object).f;
        String string4 = "PushProvider";
        if (xB2$a != null) {
            CharSequence charSequence = new StringBuilder();
            charSequence.append((Object)xB2$a);
            String string5 = "Token Already available value: ";
            charSequence.append(string5);
            charSequence.append(bl3);
            charSequence = charSequence.toString();
            cleverTapInstanceConfig.e(string4, (String)charSequence);
        }
        if (!bl3 && !(bl2 = TextUtils.isEmpty((CharSequence)(string2 = xB2$a.getTokenPrefKey())))) {
            string2 = gc3_0.l(cleverTapInstanceConfig, string2);
            object = gc3_0.e(((hC2)object).g).edit().putString(string2, string3);
            try {
                object.commit();
            }
            catch (Throwable throwable) {
                com.clevertap.android.sdk.b.l();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append((Object)xB2$a);
            string2 = "Cached New Token successfully ";
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append(string3);
            object = ((StringBuilder)object).toString();
            cleverTapInstanceConfig.e(string4, (String)object);
        }
        return null;
    }
}

