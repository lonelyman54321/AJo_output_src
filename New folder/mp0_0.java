/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.content.Context
 *  org.json.JSONObject
 */
import android.app.UiModeManager;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.R$bool;
import com.clevertap.android.sdk.b;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONObject;

/*
 * Renamed from Mp0
 */
public final class mp0_0 {
    public static int l = 255;
    public final Object a;
    public boolean b;
    public mp0$a_0 c;
    public final CleverTapInstanceConfig d;
    public final Context e;
    public final Object f;
    public boolean g;
    public String h;
    public boolean i;
    public final E80 j;
    public final ArrayList k;

    public mp0_0(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, E80 e80) {
        Object object;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = false;
        this.f = object = new Object();
        this.g = false;
        this.h = null;
        this.i = false;
        this.k = arrayList = new ArrayList();
        this.e = context;
        this.d = cleverTapInstanceConfig;
        this.j = e80;
    }

    public static int h(Context context) {
        int n3 = l;
        int n4 = -1;
        if (n3 == n4) {
            block11: {
                Object object = "uimode";
                object = context.getSystemService((String)object);
                object = (UiModeManager)object;
                n3 = object.getCurrentModeType();
                n4 = 4;
                if (n3 != n4) break block11;
                n3 = 3;
                try {
                    l = n3;
                    return n3;
                }
                catch (Exception exception) {
                    com.clevertap.android.sdk.b.c();
                }
            }
            context = context.getResources();
            n3 = R$bool.ctIsTablet;
            int n7 = context.getBoolean(n3);
            n7 = n7 != 0 ? 2 : 1;
            try {
                l = n7;
            }
            catch (Exception exception) {
                com.clevertap.android.sdk.b.c();
                n7 = 0;
                context = null;
                l = 0;
            }
        }
        return l;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a() {
        Object object;
        Object object2;
        Object object3 = yz3_0.a;
        com.clevertap.android.sdk.b.h();
        object3 = "__i";
        synchronized (this) {
            object2 = "fallbackId:";
            object = new StringBuilder((String)object2);
            object2 = this.d;
            object2 = ((CleverTapInstanceConfig)object2).a;
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
            object2 = this.e;
            object = gc3_0.g((Context)object2, (String)object, null);
            if (object != null) {
            } else {
                object = this.f;
                synchronized (object) {
                    object2 = new StringBuilder((String)object3);
                    object3 = UUID.randomUUID();
                    object3 = ((UUID)object3).toString();
                    Object object4 = "-";
                    Object object5 = "";
                    object3 = ((String)object3).replace((CharSequence)object4, (CharSequence)object5);
                    ((StringBuilder)object2).append((String)object3);
                    object3 = ((StringBuilder)object2).toString();
                    object2 = this.d;
                    object4 = ((CleverTapInstanceConfig)object2).b();
                    object2 = ((CleverTapInstanceConfig)object2).a;
                    String string2 = "Updating the fallback id - ";
                    object5 = new StringBuilder(string2);
                    ((StringBuilder)object5).append((String)object3);
                    object5 = ((StringBuilder)object5).toString();
                    ((b)object4).b((String)object2, (String)object5);
                    object2 = this.e;
                    object5 = "fallbackId:";
                    object4 = new StringBuilder((String)object5);
                    object5 = this.d;
                    object5 = ((CleverTapInstanceConfig)object5).a;
                    ((StringBuilder)object4).append((String)object5);
                    object4 = ((StringBuilder)object4).toString();
                    gc3_0.k((Context)object2, (String)object4, (String)object3);
                }
                // MONITOREXIT @DISABLED, blocks:[5, 7] lbl47 : MonitorExitStatement: MONITOREXIT : this
                object = object3;
            }
        }
        object3 = this.e;
        object2 = this.g();
        gc3_0.i(gc3_0.e((Context)object3).edit().remove((String)object2));
        object3 = new StringBuilder("fallbackId:");
        object2 = this.d.a;
        ((StringBuilder)object3).append((String)object2);
        object3 = ((StringBuilder)object3).toString();
        object3 = gc3_0.g(this.e, (String)object3, null);
        object3 = new String[]{null, object3};
        this.k(21, (String[])object3);
        object3 = this.d.b();
        object2 = this.d.a;
        object3.getClass();
        com.clevertap.android.sdk.b.i();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String string2) {
        Object object = this.d.b();
        String string3 = this.d.a;
        String string4 = "Force updating the device ID to ";
        CharSequence charSequence = new StringBuilder(string4);
        charSequence.append(string2);
        charSequence = charSequence.toString();
        ((b)object).b(string3, (String)charSequence);
        object = this.f;
        synchronized (object) {
            string3 = this.e;
            charSequence = this.g();
            gc3_0.k((Context)string3, (String)charSequence, string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String c() {
        Object object = "__g";
        synchronized (this) {
            Throwable throwable2;
            Object object2;
            Object object3;
            Object object4;
            block9: {
                try {
                    object4 = this.d;
                    object4 = ((CleverTapInstanceConfig)object4).b();
                    object3 = new StringBuilder();
                    object2 = this.d;
                    object2 = ((CleverTapInstanceConfig)object2).a;
                    ((StringBuilder)object3).append((String)object2);
                    object2 = ":async_deviceID";
                    ((StringBuilder)object3).append((String)object2);
                    object3 = ((StringBuilder)object3).toString();
                    object2 = "generateDeviceID() called!";
                    ((b)object4).b((String)object3, (String)object2);
                    object4 = this.i();
                    if (object4 != null) {
                        object = ((String)object).concat((String)object4);
                        break block9;
                    }
                    object = this.f;
                    synchronized (object) {
                        object3 = "__";
                        object4 = new StringBuilder((String)object3);
                    }
                }
                catch (Throwable throwable2) {}
                {
                    object3 = UUID.randomUUID();
                    object3 = ((UUID)object3).toString();
                    object2 = "-";
                    String string2 = "";
                    object3 = ((String)object3).replace((CharSequence)object2, string2);
                    ((StringBuilder)object4).append((String)object3);
                    object4 = ((StringBuilder)object4).toString();
                }
                object = object4;
            }
            this.b((String)object);
            object4 = this.d;
            object4 = ((CleverTapInstanceConfig)object4).b();
            object3 = new StringBuilder();
            object2 = this.d;
            object2 = ((CleverTapInstanceConfig)object2).a;
            ((StringBuilder)object3).append((String)object2);
            object2 = ":async_deviceID";
            ((StringBuilder)object3).append((String)object2);
            object3 = ((StringBuilder)object3).toString();
            object2 = "generateDeviceID() done executing!";
            ((b)object4).b((String)object3, (String)object2);
            return object;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject d() {
        Object object = "ON_USER_LOGIN";
        String string2 = "]";
        CleverTapInstanceConfig cleverTapInstanceConfig = this.d;
        try {
            CharSequence charSequence = this.i();
            boolean bl2 = false;
            if (charSequence != null) {
                charSequence = this.e;
                Object object2 = "cachedGUIDsKey";
                String string3 = null;
                charSequence = gc3_0.h((Context)charSequence, cleverTapInstanceConfig, (String)object2, null);
                string3 = "getCachedGUIDs:[";
                object2 = new StringBuilder(string3);
                ((StringBuilder)object2).append((String)charSequence);
                ((StringBuilder)object2).append(string2);
                object2 = ((StringBuilder)object2).toString();
                cleverTapInstanceConfig.e((String)object, (String)object2);
                object2 = cleverTapInstanceConfig.b();
                string3 = cleverTapInstanceConfig.a;
                charSequence = si_2.d((String)charSequence, (b)object2, string3);
                int n3 = charSequence.length();
                int n4 = 1;
                if (n3 > n4) {
                    bl2 = true;
                }
                object2 = "deviceIsMultiUser:[";
                charSequence = new StringBuilder((String)object2);
                ((StringBuilder)charSequence).append(bl2);
                ((StringBuilder)charSequence).append(string2);
                string2 = ((StringBuilder)charSequence).toString();
                cleverTapInstanceConfig.e((String)object, string2);
            }
            object = this.j;
            boolean bl3 = this.g;
            return si_2.a(this, (E80)object, bl3, bl2);
        }
        catch (Throwable throwable) {
            cleverTapInstanceConfig.b().getClass();
            com.clevertap.android.sdk.b.m();
            return new JSONObject();
        }
    }

    public final mp0$a_0 e() {
        mp0$a_0 mp0$a_0 = this.c;
        if (mp0$a_0 == null) {
            this.c = mp0$a_0 = new mp0$a_0(this);
        }
        return this.c;
    }

    public final String f() {
        CharSequence charSequence = this.g();
        Context context = this.e;
        charSequence = gc3_0.g(context, (String)charSequence, null);
        Object object = this.d;
        boolean bl2 = ((CleverTapInstanceConfig)object).p;
        if (bl2 && charSequence == null) {
            charSequence = gc3_0.g(context, "deviceId", null);
        }
        if (charSequence == null) {
            String string2 = "fallbackId:";
            charSequence = new StringBuilder(string2);
            object = ((CleverTapInstanceConfig)object).a;
            ((StringBuilder)charSequence).append((String)object);
            charSequence = ((StringBuilder)charSequence).toString();
            charSequence = gc3_0.g(context, (String)charSequence, null);
        }
        return charSequence;
    }

    public final String g() {
        StringBuilder stringBuilder = new StringBuilder("deviceId:");
        String string2 = this.d.a;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String i() {
        Object object = this.a;
        synchronized (object) {
            return this.h;
        }
    }

    public final boolean j() {
        String string2;
        boolean bl2;
        String string3 = this.f();
        if (string3 != null && (bl2 = string3.startsWith(string2 = "__i"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string3 = null;
        }
        return bl2;
    }

    public final String k(int n3, String ... stringArray) {
        da3_1 da3_12 = zB1.a(stringArray, 514, n3);
        this.k.add(da3_12);
        return da3_12.b;
    }

    public final void l() {
        Object object;
        Object object2 = this.f();
        if (object2 == null) {
            object2 = null;
        } else {
            object = "OptOut:";
            object2 = ((String)object).concat((String)object2);
        }
        object = this.d;
        if (object2 == null) {
            object2 = ((CleverTapInstanceConfig)object).b();
            object = ((CleverTapInstanceConfig)object).a;
            ((b)object2).b((String)object, "Unable to set current user OptOut state from storage: storage key is null");
            return;
        }
        boolean bl2 = gc3_0.a(this.e, (CleverTapInstanceConfig)object, (String)object2);
        this.j.k(bl2);
        b b2 = ((CleverTapInstanceConfig)object).b();
        object = ((CleverTapInstanceConfig)object).a;
        StringBuilder stringBuilder = new StringBuilder("Set current user OptOut state from storage to: ");
        stringBuilder.append(bl2);
        stringBuilder.append(" for key: ");
        stringBuilder.append((String)object2);
        object2 = stringBuilder.toString();
        b2.b((String)object, (String)object2);
    }
}

