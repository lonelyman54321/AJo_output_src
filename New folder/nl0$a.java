/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 */
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

public final class nl0$a {
    public final Context a;
    public final HashMap b;
    public final int c;
    public final ph3_0 d;
    public final boolean e;

    public nl0$a(Context object) {
        Object object2;
        int n3;
        if (object == null) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = object.getApplicationContext();
        }
        this.a = object2;
        n3 = gz3.a;
        object = object != null && (object = (TelephonyManager)object.getSystemService((String)(object2 = "phone"))) != null && (n3 = (int)(TextUtils.isEmpty((CharSequence)(object = object.getNetworkCountryIso())) ? 1 : 0)) == 0 ? Ascii.toUpperCase((String)object) : Ascii.toUpperCase(Locale.getDefault().getCountry());
        object = nl0_1.g((String)object);
        super(8);
        Number number = 0;
        Number number2 = 1000000L;
        ((HashMap)object2).put(number, number2);
        Object object3 = 2;
        number2 = object3;
        ImmutableList immutableList = nl0_1.n;
        Object object4 = object[0];
        Serializable serializable = (Long)immutableList.get((int)object4);
        ((HashMap)object2).put(number2, serializable);
        Object object5 = 3;
        serializable = Integer.valueOf(object5);
        Serializable serializable2 = nl0_1.o;
        int n4 = 1;
        Context context = object[n4];
        serializable2 = (Long)serializable2.get((int)context);
        ((HashMap)object2).put(serializable, serializable2);
        object4 = 4;
        serializable2 = Integer.valueOf((int)object4);
        ImmutableList immutableList2 = nl0_1.p;
        object3 = object[object3];
        number = (Long)immutableList2.get((int)object3);
        ((HashMap)object2).put(serializable2, number);
        object3 = 5;
        serializable2 = Integer.valueOf(object3);
        immutableList2 = nl0_1.q;
        object5 = object[object5];
        number2 = (Long)immutableList2.get((int)object5);
        ((HashMap)object2).put(serializable2, number2);
        number2 = 10;
        serializable2 = nl0_1.r;
        object4 = object[object4];
        serializable = (Long)serializable2.get((int)object4);
        ((HashMap)object2).put(number2, serializable);
        number2 = 9;
        serializable = nl0_1.s;
        object3 = object[object3];
        number = (Long)serializable.get((int)object3);
        ((HashMap)object2).put(number2, number);
        number = 7;
        Context context2 = object[0];
        object = (Long)immutableList.get((int)context2);
        ((HashMap)object2).put(number, object);
        this.b = object2;
        this.c = 2000;
        object = VV.a;
        this.d = object;
        this.e = n4;
    }

    public final nl0_1 a() {
        HashMap hashMap = this.b;
        ph3_0 ph3_02 = this.d;
        boolean bl2 = this.e;
        Context context = this.a;
        int n3 = this.c;
        nl0_1 nl0_12 = new nl0_1(context, hashMap, n3, ph3_02, bl2);
        return nl0_12;
    }
}

