/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import java.util.Objects;

public class lN1 {
    public final String a;
    public final int b;
    public final int c;

    public lN1(String string2, int n3, int n4) {
        this.a = string2;
        this.b = n3;
        this.c = n4;
    }

    public final boolean equals(Object object) {
        int n3;
        int n4;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n7 = object instanceof lN1;
        if (n7 == 0) {
            return false;
        }
        object = (lN1)object;
        n7 = this.c;
        String string2 = this.a;
        int n8 = this.b;
        if (n8 >= 0 && (n4 = ((lN1)object).b) >= 0) {
            int n10;
            String string3 = ((lN1)object).a;
            int n14 = TextUtils.equals((CharSequence)string2, (CharSequence)string3);
            if (n14 == 0 || n8 != (n14 = ((lN1)object).b) || n7 != (n10 = ((lN1)object).c)) {
                bl2 = false;
            }
            return bl2;
        }
        String string4 = ((lN1)object).a;
        boolean bl3 = TextUtils.equals((CharSequence)string2, (CharSequence)string4);
        if (!bl3 || n7 != (n3 = ((lN1)object).c)) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        Integer n3 = this.c;
        String string2 = this.a;
        Object[] objectArray = new Object[]{string2, n3};
        return Objects.hash(objectArray);
    }
}

