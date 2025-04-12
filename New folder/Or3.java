/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class Or3 {
    public final HashMap a;
    public View b;
    public final ArrayList c;

    public Or3() {
        Cloneable cloneable;
        this.a = cloneable = new Cloneable();
        this.c = cloneable;
    }

    public Or3(View view) {
        Cloneable cloneable;
        this.a = cloneable = new Cloneable();
        this.c = cloneable;
        this.b = view;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof Or3;
        if (bl2) {
            boolean bl3;
            Object object2 = this.b;
            object = (Or3)object;
            View view = ((Or3)object).b;
            if (object2 == view && (bl3 = (object2 = this.a).equals(object = ((Or3)object).a))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.b.hashCode() * 31;
        return this.a.hashCode() + n3;
    }

    public final String toString() {
        boolean bl2;
        CharSequence charSequence = new StringBuilder("TransitionValues@");
        int n3 = this.hashCode();
        String string2 = Integer.toHexString(n3);
        charSequence.append(string2);
        charSequence.append(":\n");
        charSequence = nn_2.a(charSequence.toString(), "    view = ");
        string2 = this.b;
        charSequence.append(string2);
        string2 = "\n";
        charSequence.append(string2);
        charSequence = Ft2.a(charSequence.toString(), "    values:");
        HashMap hashMap = this.a;
        Iterator iterator = hashMap.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            String string3 = (String)iterator.next();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append("    ");
            stringBuilder.append(string3);
            stringBuilder.append(": ");
            charSequence = hashMap.get(string3);
            stringBuilder.append((Object)charSequence);
            stringBuilder.append(string2);
            charSequence = stringBuilder.toString();
        }
        return charSequence;
    }
}

