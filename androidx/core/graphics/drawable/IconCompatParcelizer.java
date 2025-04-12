/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.os.Parcelable
 */
package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel object) {
        block12: {
            IconCompat iconCompat = new IconCompat();
            int n3 = iconCompat.a;
            iconCompat.a = n3 = ((VersionedParcel)object).j(n3, 1);
            Object object2 = iconCompat.c;
            int n4 = 2;
            boolean n7 = ((VersionedParcel)object).h(n4);
            if (n7) {
                object2 = ((VersionedParcel)object).f();
            }
            iconCompat.c = object2;
            object2 = iconCompat.d;
            int n8 = 3;
            boolean bl2 = ((VersionedParcel)object).h(n8);
            if (bl2) {
                object2 = ((VersionedParcel)object).k();
            }
            iconCompat.d = (Parcelable)object2;
            n3 = iconCompat.e;
            iconCompat.e = n3 = ((VersionedParcel)object).j(n3, 4);
            n3 = iconCompat.f;
            iconCompat.f = n3 = ((VersionedParcel)object).j(n3, 5);
            object2 = iconCompat.g;
            bl2 = ((VersionedParcel)object).h(6);
            if (bl2) {
                object2 = ((VersionedParcel)object).k();
            }
            object2 = (ColorStateList)object2;
            iconCompat.g = (ColorStateList)object2;
            object2 = iconCompat.i;
            bl2 = ((VersionedParcel)object).h(7);
            if (bl2) {
                object2 = ((VersionedParcel)object).l();
            }
            iconCompat.i = object2;
            object2 = iconCompat.j;
            bl2 = ((VersionedParcel)object).h(8);
            if (bl2) {
                object2 = ((VersionedParcel)object).l();
            }
            iconCompat.j = object2;
            object = PorterDuff.Mode.valueOf((String)iconCompat.i);
            iconCompat.h = object;
            int n10 = iconCompat.a;
            n3 = 0;
            object2 = null;
            switch (n10) {
                default: {
                    break;
                }
                case 3: {
                    iconCompat.b = object = (Object)iconCompat.c;
                    break;
                }
                case 2: 
                case 4: 
                case 6: {
                    String string2;
                    byte[] byArray = iconCompat.c;
                    Charset charset = Charset.forName("UTF-16");
                    iconCompat.b = object = new String(byArray, charset);
                    int n14 = iconCompat.a;
                    if (n14 != n4 || (string2 = iconCompat.j) != null) break;
                    string2 = ":";
                    int n15 = -1;
                    iconCompat.j = object = ((String)object).split(string2, n15)[0];
                    break;
                }
                case 1: 
                case 5: {
                    object = iconCompat.d;
                    if (object != null) {
                        iconCompat.b = object;
                        break;
                    }
                    iconCompat.b = object = (Object)iconCompat.c;
                    iconCompat.a = n8;
                    iconCompat.e = 0;
                    iconCompat.f = n10 = ((Object)object).length;
                    break;
                }
                case -1: {
                    object = iconCompat.d;
                    if (object == null) break block12;
                    iconCompat.b = object;
                }
            }
            return iconCompat;
        }
        object = new IllegalArgumentException("Invalid icon");
        throw object;
    }

    public static void write(IconCompat object, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        Object object2 = ((IconCompat)object).h.name();
        ((IconCompat)object).i = object2;
        int n3 = ((IconCompat)object).a;
        Object object3 = "UTF-16";
        switch (n3) {
            default: {
                break;
            }
            case 4: 
            case 6: {
                object2 = ((IconCompat)object).b.toString();
                object3 = Charset.forName((String)object3);
                object2 = ((String)object2).getBytes((Charset)object3);
                ((IconCompat)object).c = (byte[])object2;
                break;
            }
            case 3: {
                object2 = (byte[])((IconCompat)object).b;
                ((IconCompat)object).c = (byte[])object2;
                break;
            }
            case 2: {
                object2 = (String)((IconCompat)object).b;
                object3 = Charset.forName((String)object3);
                object2 = ((String)object2).getBytes((Charset)object3);
                ((IconCompat)object).c = (byte[])object2;
                break;
            }
            case 1: 
            case 5: {
                object2 = (Parcelable)((IconCompat)object).b;
                ((IconCompat)object).d = object2;
                break;
            }
            case -1: {
                object2 = (Parcelable)((IconCompat)object).b;
                ((IconCompat)object).d = object2;
            }
        }
        n3 = ((IconCompat)object).a;
        int n4 = -1;
        if (n4 != n3) {
            n4 = 1;
            versionedParcel.s(n3, n4);
        }
        if ((object2 = (Object)((IconCompat)object).c) != null) {
            n4 = 2;
            versionedParcel.n(n4);
            versionedParcel.p((byte[])object2);
        }
        if ((object2 = ((IconCompat)object).d) != null) {
            n4 = 3;
            versionedParcel.n(n4);
            versionedParcel.t((Parcelable)object2);
        }
        if ((n3 = ((IconCompat)object).e) != 0) {
            n4 = 4;
            versionedParcel.s(n3, n4);
        }
        if ((n3 = ((IconCompat)object).f) != 0) {
            n4 = 5;
            versionedParcel.s(n3, n4);
        }
        if ((object2 = ((IconCompat)object).g) != null) {
            n4 = 6;
            versionedParcel.n(n4);
            versionedParcel.t((Parcelable)object2);
        }
        if ((object2 = ((IconCompat)object).i) != null) {
            n4 = 7;
            versionedParcel.n(n4);
            versionedParcel.u((String)object2);
        }
        if ((object = ((IconCompat)object).j) != null) {
            n3 = 8;
            versionedParcel.n(n3);
            versionedParcel.u((String)object);
        }
    }
}

