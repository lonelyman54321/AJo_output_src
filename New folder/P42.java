/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Builder
 *  android.app.Notification$InboxStyle
 *  android.os.Bundle
 */
import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

public final class P42
extends U42 {
    public final ArrayList e;

    public P42() {
        ArrayList arrayList;
        this.e = arrayList = new ArrayList();
    }

    public final void b(V42 object) {
        boolean bl2;
        object = ((V42)object).b;
        Object object2 = new Notification.InboxStyle((Notification.Builder)object);
        object = this.b;
        object = object2.setBigContentTitle((CharSequence)object);
        boolean bl3 = this.d;
        if (bl3) {
            object2 = this.c;
            object.setSummaryText((CharSequence)object2);
        }
        object2 = this.e.iterator();
        while (bl2 = object2.hasNext()) {
            CharSequence charSequence = (CharSequence)object2.next();
            object.addLine(charSequence);
        }
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.textLines");
    }

    public final String f() {
        return "androidx.core.app.NotificationCompat$InboxStyle";
    }

    public final void j(Bundle charSequenceArray) {
        super.j((Bundle)charSequenceArray);
        ArrayList arrayList = this.e;
        arrayList.clear();
        String string2 = "android.textLines";
        boolean bl2 = charSequenceArray.containsKey(string2);
        if (bl2) {
            charSequenceArray = charSequenceArray.getCharSequenceArray(string2);
            Collections.addAll(arrayList, charSequenceArray);
        }
    }
}

