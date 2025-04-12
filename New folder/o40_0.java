/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.HashSet;

/*
 * Renamed from O40
 */
public final class o40_0
implements cd1_0 {
    public final dd1_0 a;
    public final CleverTapInstanceConfig b;

    public o40_0(Context object, CleverTapInstanceConfig cleverTapInstanceConfig, mp0_0 object2, ea3_1 object3) {
        this.b = cleverTapInstanceConfig;
        String string2 = "SP_KEY_PROFILE_IDENTITIES";
        object2 = gc3_0.h((Context)object, cleverTapInstanceConfig, string2, "");
        Object object4 = new StringBuilder("getCachedIdentityKeysForAccount:");
        ((StringBuilder)object4).append((String)object2);
        object4 = ((StringBuilder)object4).toString();
        String string3 = "ON_USER_LOGIN";
        cleverTapInstanceConfig.e(string3, (String)object4);
        object2 = ((String)object2).split(",");
        object4 = new dd1_0((String[])object2);
        super("ConfigurableIdentityRepoPrefIdentitySet [");
        ((StringBuilder)object2).append(object4);
        String string4 = "]";
        ((StringBuilder)object2).append(string4);
        object2 = ((StringBuilder)object2).toString();
        cleverTapInstanceConfig.e(string3, (String)object2);
        Object object5 = cleverTapInstanceConfig.t;
        object2 = new dd1_0((String[])object5);
        Object object6 = "ConfigurableIdentityRepoConfigIdentitySet [";
        super((String)object6);
        ((StringBuilder)object5).append(object2);
        ((StringBuilder)object5).append(string4);
        object5 = ((StringBuilder)object5).toString();
        cleverTapInstanceConfig.e(string3, (String)object5);
        object5 = ((dd1_0)object4).a;
        boolean bl2 = ((HashSet)object5).isEmpty() ^ true;
        HashSet hashSet = ((dd1_0)object2).a;
        String string5 = "], [Config:";
        if (bl2 && (bl2 = hashSet.isEmpty() ^ true) && !(bl2 = ((dd1_0)object4).equals(object2))) {
            bl2 = false;
            object6 = new String[]{};
            int n3 = -1;
            int n4 = 531;
            object6 = zB1.a(object6, n4, n3);
            ((ea3_1)object3).b((da3_1)object6);
            object6 = "ConfigurableIdentityRepopushing error due to mismatch [Pref:";
            object3 = new StringBuilder((String)object6);
            ((StringBuilder)object3).append(object4);
            ((StringBuilder)object3).append(string5);
            ((StringBuilder)object3).append(object2);
            ((StringBuilder)object3).append(string4);
            object3 = ((StringBuilder)object3).toString();
            cleverTapInstanceConfig.e(string3, (String)object3);
        } else {
            object6 = "ConfigurableIdentityRepoNo error found while comparing [Pref:";
            object3 = new StringBuilder((String)object6);
            ((StringBuilder)object3).append(object4);
            ((StringBuilder)object3).append(string5);
            ((StringBuilder)object3).append(object2);
            ((StringBuilder)object3).append(string4);
            object3 = ((StringBuilder)object3).toString();
            cleverTapInstanceConfig.e(string3, (String)object3);
        }
        boolean bl3 = ((HashSet)object5).isEmpty() ^ true;
        if (bl3) {
            this.a = object4;
            object2 = new StringBuilder("ConfigurableIdentityRepoIdentity Set activated from Pref[");
            object3 = this.a;
            ((StringBuilder)object2).append(object3);
            ((StringBuilder)object2).append(string4);
            object2 = ((StringBuilder)object2).toString();
            cleverTapInstanceConfig.e(string3, (String)object2);
        } else {
            bl3 = hashSet.isEmpty() ^ true;
            if (bl3) {
                this.a = object2;
                object2 = new StringBuilder("ConfigurableIdentityRepoIdentity Set activated from Config[");
                object3 = this.a;
                ((StringBuilder)object2).append(object3);
                ((StringBuilder)object2).append(string4);
                object2 = ((StringBuilder)object2).toString();
                cleverTapInstanceConfig.e(string3, (String)object2);
            } else {
                object3 = q50_0.b;
                this.a = object2 = new dd1_0((HashSet)object3);
                object2 = new StringBuilder("ConfigurableIdentityRepoIdentity Set activated from Default[");
                object3 = this.a;
                ((StringBuilder)object2).append(object3);
                ((StringBuilder)object2).append(string4);
                object2 = ((StringBuilder)object2).toString();
                cleverTapInstanceConfig.e(string3, (String)object2);
            }
        }
        boolean bl4 = ((HashSet)object5).isEmpty() ^ true;
        if (!bl4) {
            object2 = this.a.toString();
            object = gc3_0.e((Context)object).edit();
            object3 = gc3_0.l(cleverTapInstanceConfig, string2);
            gc3_0.i(object.putString((String)object3, (String)object2));
            super("saveIdentityKeysForAccount:");
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            cleverTapInstanceConfig.e(string3, (String)object);
            object3 = "ConfigurableIdentityRepoSaving Identity Keys in Pref[";
            object = new StringBuilder((String)object3);
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(string4);
            object = ((StringBuilder)object).toString();
            cleverTapInstanceConfig.e(string3, (String)object);
        }
    }

    public final boolean a(String string2) {
        HashSet hashSet = this.a.a;
        boolean bl2 = yz3_0.a(string2, hashSet);
        StringBuilder stringBuilder = new StringBuilder("ConfigurableIdentityRepoisIdentity [Key: ");
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

