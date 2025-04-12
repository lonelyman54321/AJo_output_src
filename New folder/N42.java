/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$Builder
 *  android.app.PendingIntent
 *  android.app.Person
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Icon
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.SpannableStringBuilder
 *  android.text.style.ForegroundColorSpan
 *  android.util.Log
 */
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import androidx.core.R$string;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompat$a;

public final class N42
extends U42 {
    public int e;
    public qr2 f;
    public PendingIntent g;
    public PendingIntent h;
    public PendingIntent i;
    public boolean j;
    public Integer k;
    public Integer l;
    public IconCompat m;
    public CharSequence n;

    public final void a(Bundle bundle) {
        int n3;
        CharSequence charSequence;
        int n4;
        super.a(bundle);
        int n7 = this.e;
        bundle.putInt("android.callType", n7);
        n7 = (int)(this.j ? 1 : 0);
        bundle.putBoolean("android.callIsVideo", n7 != 0);
        Object object = this.f;
        if (object != null) {
            n7 = Build.VERSION.SDK_INT;
            n4 = 28;
            if (n7 >= n4) {
                object = N42$c.b(qr2$a.b((qr2)object));
                charSequence = "android.callPerson";
                bundle.putParcelable((String)charSequence, (Parcelable)object);
            } else {
                object = ((qr2)object).b();
                charSequence = "android.callPersonCompat";
                bundle.putParcelable((String)charSequence, (Parcelable)object);
            }
        }
        if ((object = this.m) != null) {
            n7 = Build.VERSION.SDK_INT;
            n4 = 23;
            if (n7 >= n4) {
                charSequence = this.a.a;
                object = N42$b.a(((IconCompat)object).m((Context)charSequence));
                charSequence = "android.verificationIcon";
                bundle.putParcelable((String)charSequence, (Parcelable)object);
            } else {
                object = ((IconCompat)object).l();
                charSequence = "android.verificationIconCompat";
                bundle.putParcelable((String)charSequence, (Parcelable)object);
            }
        }
        charSequence = this.n;
        bundle.putCharSequence("android.verificationText", charSequence);
        charSequence = this.g;
        bundle.putParcelable("android.answerIntent", (Parcelable)charSequence);
        charSequence = this.h;
        bundle.putParcelable("android.declineIntent", (Parcelable)charSequence);
        charSequence = this.i;
        bundle.putParcelable("android.hangUpIntent", (Parcelable)charSequence);
        object = this.k;
        if (object != null) {
            charSequence = "android.answerColor";
            n3 = (Integer)object;
            bundle.putInt((String)charSequence, n3);
        }
        if ((object = this.l) != null) {
            charSequence = "android.declineColor";
            n3 = (Integer)object;
            bundle.putInt((String)charSequence, n3);
        }
    }

    public final void b(V42 object) {
        int n3 = Build.VERSION.SDK_INT;
        object = ((V42)object).b;
        int n4 = 31;
        int n7 = 2;
        int n8 = 1;
        int n10 = 3;
        Object object2 = null;
        if (n3 >= n4) {
            Object object3;
            n3 = this.e;
            if (n3 != n8) {
                if (n3 != n7) {
                    if (n3 != n10) {
                        object3 = "NotifCompat";
                        n3 = (int)(Log.isLoggable((String)object3, (int)n10) ? 1 : 0);
                        if (n3 != 0) {
                            n3 = this.e;
                            String.valueOf(n3);
                        }
                    } else {
                        object3 = this.f;
                        object3.getClass();
                        object3 = qr2$a.b((qr2)object3);
                        PendingIntent pendingIntent = this.i;
                        PendingIntent pendingIntent2 = this.g;
                        object2 = N42$d.c((Person)object3, pendingIntent, pendingIntent2);
                    }
                } else {
                    object3 = this.f;
                    object3.getClass();
                    object3 = qr2$a.b((qr2)object3);
                    PendingIntent pendingIntent = this.i;
                    object2 = N42$d.b((Person)object3, pendingIntent);
                }
            } else {
                object3 = this.f;
                object3.getClass();
                object3 = qr2$a.b((qr2)object3);
                PendingIntent pendingIntent = this.h;
                PendingIntent pendingIntent3 = this.g;
                object2 = N42$d.a((Person)object3, pendingIntent, pendingIntent3);
            }
            if (object2 != null) {
                K42.a(object2, (Notification.Builder)object);
                object = this.k;
                if (object != null) {
                    int bl2 = (Integer)object;
                    N42$d.d(object2, bl2);
                }
                if ((object = this.l) != null) {
                    int n14 = (Integer)object;
                    N42$d.e(object2, n14);
                }
                object = this.n;
                N42$d.h(object2, (CharSequence)object);
                object = this.m;
                if (object != null) {
                    object3 = this.a.a;
                    object = ((IconCompat)object).m((Context)object3);
                    N42$d.g(object2, (Icon)object);
                }
                boolean bl2 = this.j;
                N42$d.f(object2, bl2);
            }
        } else {
            Object object4;
            String string2;
            Object object5 = this.f;
            if (object5 != null) {
                object5 = ((qr2)object5).a;
            } else {
                n4 = 0;
                object5 = null;
            }
            object.setContentTitle((CharSequence)object5);
            object5 = this.a.C;
            if (object5 != null && (n4 = (int)(object5.containsKey(string2 = "android.text") ? 1 : 0)) != 0) {
                object5 = this.a.C.getCharSequence(string2);
            } else {
                n4 = 0;
                object5 = null;
            }
            if (object5 == null) {
                n4 = this.e;
                if (n4 != n8) {
                    if (n4 != n7) {
                        if (n4 == n10) {
                            object5 = this.a.a.getResources();
                            n7 = R$string.call_notification_screening_text;
                            object2 = object5.getString(n7);
                        }
                    } else {
                        object5 = this.a.a.getResources();
                        n7 = R$string.call_notification_ongoing_text;
                        object2 = object5.getString(n7);
                    }
                } else {
                    object5 = this.a.a.getResources();
                    n7 = R$string.call_notification_incoming_text;
                    object2 = object5.getString(n7);
                }
                object5 = object2;
            }
            object.setContentText((CharSequence)object5);
            object5 = this.f;
            if (object5 != null) {
                n7 = 23;
                if (n3 >= n7 && (object5 = ((qr2)object5).b) != null) {
                    Context context = this.a.a;
                    object5 = ((IconCompat)object5).m(context);
                    N42$b.b((Notification.Builder)object, (Icon)object5);
                }
                if (n3 >= (n4 = 28)) {
                    object4 = this.f;
                    object4.getClass();
                    object4 = qr2$a.b((qr2)object4);
                    N42$c.a((Notification.Builder)object, (Person)object4);
                } else {
                    object4 = this.f.c;
                    N42$a.a((Notification.Builder)object, (String)object4);
                }
            }
            object4 = "call";
            N42$a.b((Notification.Builder)object, (String)object4);
        }
    }

    public final String f() {
        return "androidx.core.app.NotificationCompat$CallStyle";
    }

    public final void j(Bundle bundle) {
        Object object;
        boolean bl2;
        int n3;
        super.j(bundle);
        this.e = n3 = bundle.getInt("android.callType");
        Object object2 = "android.callIsVideo";
        n3 = (int)(bundle.getBoolean((String)object2) ? 1 : 0);
        this.j = n3;
        n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4 && (bl2 = bundle.containsKey((String)(object = "android.callPerson")))) {
            this.f = object = qr2$a.a(L42.a(bundle.getParcelable((String)object)));
        } else {
            object = "android.callPersonCompat";
            bl2 = bundle.containsKey((String)object);
            if (bl2) {
                this.f = object = qr2.a(bundle.getBundle((String)object));
            }
        }
        n4 = 23;
        if (n3 >= n4 && (n4 = (int)(bundle.containsKey((String)(object2 = "android.verificationIcon")) ? 1 : 0)) != 0) {
            object2 = M42.b(bundle.getParcelable((String)object2));
            object = IconCompat.k;
            this.m = object2 = IconCompat$a.a(object2);
        } else {
            object2 = "android.verificationIconCompat";
            n4 = (int)(bundle.containsKey((String)object2) ? 1 : 0);
            if (n4 != 0) {
                this.m = object2 = IconCompat.b(bundle.getBundle((String)object2));
            }
        }
        this.n = object2 = bundle.getCharSequence("android.verificationText");
        object2 = (PendingIntent)bundle.getParcelable("android.answerIntent");
        this.g = object2;
        object2 = (PendingIntent)bundle.getParcelable("android.declineIntent");
        this.h = object2;
        object2 = (PendingIntent)bundle.getParcelable("android.hangUpIntent");
        this.i = object2;
        object2 = "android.answerColor";
        n4 = (int)(bundle.containsKey((String)object2) ? 1 : 0);
        bl2 = false;
        Integer n7 = null;
        if (n4 != 0) {
            n3 = bundle.getInt((String)object2);
            object2 = n3;
        } else {
            n3 = 0;
            object2 = null;
        }
        this.k = object2;
        object2 = "android.declineColor";
        n4 = (int)(bundle.containsKey((String)object2) ? 1 : 0);
        if (n4 != 0) {
            int n8 = bundle.getInt((String)object2);
            n7 = n8;
        }
        this.l = n7;
    }

    public final A42 l(int n3, int n4, Integer object, int n7, PendingIntent pendingIntent) {
        int n8;
        if (object == null) {
            n8 = t70.getColor(this.a.a, n7);
            object = n8;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Object object2 = this.a.a.getResources().getString(n4);
        spannableStringBuilder.append((CharSequence)object2);
        n8 = (Integer)object;
        object2 = new ForegroundColorSpan(n8);
        n8 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(object2, 0, n8, 18);
        object = this.a.a;
        PorterDuff.Mode mode = IconCompat.k;
        object.getClass();
        mode = object.getResources();
        object = object.getPackageName();
        Object object3 = IconCompat.d((Resources)mode, (String)object, n3);
        object2 = new A42$a((IconCompat)object3, (CharSequence)spannableStringBuilder, pendingIntent);
        object3 = ((A42$a)object2).a();
        ((A42)object3).a.putBoolean("key_action_priority", true);
        return object3;
    }
}

