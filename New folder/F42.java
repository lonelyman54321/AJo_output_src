/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$BigPictureStyle
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Icon
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompat$a;

public final class F42
extends U42 {
    public IconCompat e;
    public IconCompat f;
    public boolean g;
    public boolean h;

    public static IconCompat l(Parcelable parcelable) {
        if (parcelable != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 23;
            if (n3 >= n4 && (n3 = (int)(D42.a(parcelable) ? 1 : 0)) != 0) {
                parcelable = E42.a(parcelable);
                PorterDuff.Mode mode = IconCompat.k;
                return IconCompat$a.a(parcelable);
            }
            n3 = parcelable instanceof Bitmap;
            if (n3 != 0) {
                parcelable = (Bitmap)parcelable;
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.b = parcelable;
                return iconCompat;
            }
        }
        return null;
    }

    public final void b(V42 object) {
        int n3;
        int n4;
        int n7;
        Object object2 = ((V42)object).b;
        Object object3 = new Notification.BigPictureStyle(object2);
        object2 = this.b;
        object2 = object3.setBigContentTitle((CharSequence)object2);
        object3 = this.e;
        object = ((V42)object).a;
        int n8 = 1;
        int n10 = 31;
        if (object3 != null) {
            n7 = Build.VERSION.SDK_INT;
            if (n7 >= n10) {
                object3 = ((IconCompat)object3).m((Context)object);
                F42$b.a((Notification.BigPictureStyle)object2, (Icon)object3);
            } else {
                n4 = ((IconCompat)object3).i();
                if (n4 == n8) {
                    object3 = this.e.e();
                    object2 = object2.bigPicture((Bitmap)object3);
                }
            }
        }
        n4 = this.g;
        n7 = 0;
        if (n4 != 0) {
            object3 = this.f;
            if (object3 == null) {
                object2.bigLargeIcon(null);
            } else {
                int n14 = Build.VERSION.SDK_INT;
                int n15 = 23;
                if (n14 >= n15) {
                    object = ((IconCompat)object3).m((Context)object);
                    F42$a.a((Notification.BigPictureStyle)object2, (Icon)object);
                } else {
                    n3 = ((IconCompat)object3).i();
                    if (n3 == n8) {
                        object = this.f.e();
                        object2.bigLargeIcon((Bitmap)object);
                    } else {
                        object2.bigLargeIcon(null);
                    }
                }
            }
        }
        if ((n3 = this.d) != 0) {
            object = this.c;
            object2.setSummaryText((CharSequence)object);
        }
        if ((n3 = Build.VERSION.SDK_INT) >= n10) {
            n3 = (int)(this.h ? 1 : 0);
            F42$b.c((Notification.BigPictureStyle)object2, n3 != 0);
            F42$b.b((Notification.BigPictureStyle)object2, null);
        }
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    public final String f() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    public final void j(Bundle bundle) {
        boolean bl2;
        super.j(bundle);
        Object object = "android.largeIcon.big";
        boolean bl3 = bundle.containsKey((String)object);
        if (bl3) {
            boolean bl4;
            this.f = object = F42.l(bundle.getParcelable((String)object));
            this.g = bl4 = true;
        }
        object = (object = bundle.getParcelable("android.picture")) != null ? F42.l((Parcelable)object) : F42.l(bundle.getParcelable("android.pictureIcon"));
        this.e = object;
        this.h = bl2 = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    public final void m(Bitmap object) {
        if (object == null) {
            object = null;
        } else {
            int n3 = 1;
            IconCompat iconCompat = new IconCompat(n3);
            iconCompat.b = object;
            object = iconCompat;
        }
        this.e = object;
    }

    public final void n(CharSequence charSequence) {
        this.c = charSequence = J42.b(charSequence);
        this.d = true;
    }
}

