/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 */
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;

/*
 * Renamed from X42
 */
public final class x42_0
implements lu1,
SharedPreferences.OnSharedPreferenceChangeListener {
    public final jo_2 a;
    public final zr1_1 b;
    public final zr1_1 c;

    public x42_0() {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Object object = new jo_2((Context)aJIOApplication);
        this.a = object;
        this.b = object = new zr1_1();
        this.c = object;
    }

    public final void onSharedPreferenceChanged(SharedPreferences object, String object2) {
        boolean bl2;
        object = this.b;
        Object object3 = this.a;
        object3.getClass();
        if (object2 != null && (bl2 = ((String)object2).equals(object3 = "Notification_Count"))) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        object2 = bl2;
        ((LiveData)object).k(object2);
    }

    public final void registerPreferenceListner() {
        this.a.getPreferences().registerOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
    }

    public final void unregisterPreferenceListner() {
        this.a.getPreferences().unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener)this);
    }
}

