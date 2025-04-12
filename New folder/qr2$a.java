/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Person
 *  android.app.Person$Builder
 *  android.graphics.drawable.Icon
 */
import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompat$a;

public final class qr2$a {
    public static qr2 a(Person person) {
        Object object;
        CharSequence charSequence = person.getName();
        Object object2 = person.getIcon();
        if (object2 != null) {
            object2 = person.getIcon();
            object = IconCompat.k;
            object2 = IconCompat$a.a(object2);
        } else {
            object2 = null;
        }
        object = person.getUri();
        String string2 = person.getKey();
        boolean bl2 = person.isBot();
        boolean bl3 = person.isImportant();
        qr2 qr22 = new Object();
        qr22.a = charSequence;
        qr22.b = object2;
        qr22.c = object;
        qr22.d = string2;
        qr22.e = bl2;
        qr22.f = bl3;
        return qr22;
    }

    public static Person b(qr2 qr22) {
        Person.Builder builder = new Person.Builder();
        CharSequence charSequence = qr22.a;
        builder = builder.setName(charSequence);
        boolean bl2 = false;
        charSequence = null;
        IconCompat iconCompat = qr22.b;
        if (iconCompat != null) {
            charSequence = iconCompat.m(null);
        }
        builder = builder.setIcon((Icon)charSequence);
        charSequence = qr22.c;
        builder = builder.setUri((String)charSequence);
        charSequence = qr22.d;
        builder = builder.setKey((String)charSequence);
        bl2 = qr22.e;
        builder = builder.setBot(bl2);
        boolean bl3 = qr22.f;
        return builder.setImportant(bl3).build();
    }
}

