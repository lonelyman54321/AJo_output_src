/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
import android.os.Build;
import java.util.HashSet;

public abstract class mm
implements g40 {
    public static final HashSet c;
    public final String a;
    public final String b;

    static {
        HashSet hashSet;
        c = hashSet = new HashSet();
    }

    public mm(String string2, String string3) {
        this.a = string2;
        this.b = string3;
        c.add(this);
    }

    public final String a() {
        return this.a;
    }

    public abstract boolean b();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c() {
        HashSet hashSet = mm$a.a;
        String string2 = this.b;
        boolean bl2 = hashSet.contains(string2);
        if (bl2) return true;
        String string3 = "eng";
        CharSequence charSequence = Build.TYPE;
        boolean bl3 = string3.equals(charSequence);
        if (!bl3) {
            string3 = "userdebug";
            bl2 = string3.equals(charSequence);
            if (!bl2) return false;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(":dev");
        string2 = ((StringBuilder)charSequence).toString();
        boolean bl4 = hashSet.contains(string2);
        if (!bl4) return false;
        return true;
    }

    public final boolean isSupported() {
        boolean bl2 = this.b();
        bl2 = bl2 || (bl2 = this.c());
        return bl2;
    }
}

