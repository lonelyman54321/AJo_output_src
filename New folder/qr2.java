/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

public final class qr2 {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public static qr2 a(Bundle bundle) {
        Object object = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        object = object != null ? IconCompat.b(object) : null;
        String string2 = bundle.getString("uri");
        String string3 = bundle.getString("key");
        boolean bl2 = bundle.getBoolean("isBot");
        boolean bl3 = bundle.getBoolean("isImportant");
        qr2 qr22 = new Object();
        qr22.a = charSequence;
        qr22.b = object;
        qr22.c = string2;
        qr22.d = string3;
        qr22.e = bl2;
        qr22.f = bl3;
        return qr22;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        bundle.putCharSequence("name", charSequence);
        IconCompat iconCompat = this.b;
        iconCompat = iconCompat != null ? iconCompat.l() : null;
        bundle.putBundle("icon", (Bundle)iconCompat);
        charSequence = this.c;
        bundle.putString("uri", (String)charSequence);
        charSequence = this.d;
        bundle.putString("key", (String)charSequence);
        boolean bl2 = this.e;
        bundle.putBoolean("isBot", bl2);
        bl2 = this.f;
        bundle.putBoolean("isImportant", bl2);
        return bundle;
    }

    public final boolean equals(Object object) {
        boolean bl2 = false;
        if (object == null) {
            return false;
        }
        boolean bl3 = object instanceof qr2;
        if (!bl3) {
            return false;
        }
        object = (qr2)object;
        Object object2 = this.d;
        Object object3 = ((qr2)object).d;
        if (object2 == null && object3 == null) {
            boolean bl4;
            boolean bl5;
            object2 = Objects.toString(this.a);
            bl3 = Objects.equals(object2, object3 = Objects.toString(((qr2)object).a));
            if (bl3 && (bl3 = Objects.equals(object2 = this.c, object3 = ((qr2)object).c)) && (bl3 = (object2 = Boolean.valueOf(this.e)).equals(object3 = Boolean.valueOf(bl5 = ((qr2)object).e))) && (bl4 = (object2 = Boolean.valueOf(bl3 = this.f)).equals(object = Boolean.valueOf(((qr2)object).f)))) {
                bl2 = true;
            }
            return bl2;
        }
        return Objects.equals(object2, object3);
    }

    public final int hashCode() {
        Object object = this.d;
        if (object != null) {
            return ((String)object).hashCode();
        }
        object = this.e;
        Boolean bl2 = this.f;
        CharSequence charSequence = this.a;
        String string2 = this.c;
        Object[] objectArray = new Object[]{charSequence, string2, object, bl2};
        return Objects.hash(objectArray);
    }
}

