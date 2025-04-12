/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.HashSet;

/*
 * Renamed from Ot1
 */
public final class ot1_2
implements cd1_0 {
    public final dd1_0 a;
    public final CleverTapInstanceConfig b;

    public ot1_2(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.b = cleverTapInstanceConfig;
        Object object = q50_0.b;
        Object object2 = new dd1_0((HashSet)object);
        this.a = object2;
        object2 = new StringBuilder("LegacyIdentityRepo Setting the default IdentitySet[");
        object = this.a;
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append("]");
        object2 = ((StringBuilder)object2).toString();
        cleverTapInstanceConfig.e("ON_USER_LOGIN", (String)object2);
    }

    public final boolean a(String string2) {
        HashSet hashSet = this.a.a;
        boolean bl2 = yz3_0.a(string2, hashSet);
        StringBuilder stringBuilder = new StringBuilder("isIdentity [Key: ");
        stringBuilder.append(string2);
        stringBuilder.append(" , Value: ");
        stringBuilder.append(bl2);
        stringBuilder.append("]");
        string2 = stringBuilder.toString();
        this.b.e("ON_USER_LOGIN", string2);
        return bl2;
    }

    public final dd1_0 b() {
        return this.a;
    }
}

