/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 */
import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public final class A42$a {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public boolean d;
    public final Bundle e;
    public ArrayList f;
    public int g;
    public final boolean h;
    public boolean i;
    public boolean j;

    public A42$a(int n3, CharSequence charSequence, PendingIntent pendingIntent) {
        IconCompat iconCompat = null;
        if (n3 != 0) {
            String string2 = "";
            iconCompat = IconCompat.d(null, string2, n3);
        }
        Bundle bundle = new Bundle();
        this(iconCompat, charSequence, pendingIntent, bundle);
    }

    public A42$a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this(iconCompat, charSequence, pendingIntent, bundle);
    }

    public A42$a(IconCompat object, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean bl2;
        this.d = bl2 = true;
        this.h = bl2;
        this.a = object;
        this.b = object = J42.b(charSequence);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = bl2;
        this.g = 0;
        this.h = bl2;
        this.i = false;
        this.j = false;
    }

    public final A42 a() {
        GI2[] gI2Array;
        A42$a a42$a = this;
        int n3 = this.i;
        if (n3 == 0 || (gI2Array = this.c) != null) {
            GI2[] gI2Array2;
            Object object;
            GI2[] gI2Array3;
            boolean bl2;
            gI2Array = new ArrayList();
            ArrayList<GI2[]> arrayList = new ArrayList<GI2[]>();
            Object object2 = a42$a.f;
            if (object2 != null) {
                object2 = object2.iterator();
                while (bl2 = object2.hasNext()) {
                    gI2Array3 = (GI2[])object2.next();
                    int n4 = gI2Array3.d;
                    if (n4 == 0 && ((object = gI2Array3.c) == null || (n4 = ((CharSequence[])object).length) == 0) && (object = gI2Array3.g) != null && (n4 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
                        gI2Array.add(gI2Array3);
                        continue;
                    }
                    arrayList.add(gI2Array3);
                }
            }
            int n7 = gI2Array.isEmpty();
            bl2 = false;
            gI2Array3 = null;
            if (n7 != 0) {
                gI2Array2 = null;
            } else {
                n7 = gI2Array.size();
                object2 = new GI2[n7];
                gI2Array2 = gI2Array = gI2Array.toArray((T[])object2);
            }
            n3 = arrayList.isEmpty();
            if (n3 == 0) {
                n3 = arrayList.size();
                gI2Array = new GI2[n3];
                gI2Array3 = gI2Array = arrayList.toArray(gI2Array);
                gI2Array3 = gI2Array;
            }
            boolean bl3 = a42$a.d;
            int n8 = a42$a.g;
            boolean bl4 = a42$a.i;
            boolean bl5 = a42$a.j;
            IconCompat iconCompat = a42$a.a;
            CharSequence charSequence = a42$a.b;
            PendingIntent pendingIntent = a42$a.c;
            Bundle bundle = a42$a.e;
            boolean bl6 = a42$a.h;
            object = gI2Array;
            gI2Array = new A42(iconCompat, charSequence, pendingIntent, bundle, gI2Array3, gI2Array2, bl3, n8, bl6, bl4, bl5);
            return gI2Array;
        }
        gI2Array = new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        throw gI2Array;
    }
}

