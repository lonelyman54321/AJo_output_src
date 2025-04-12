/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification$MessagingStyle$Message
 *  android.app.Person
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class R42$d {
    public final CharSequence a;
    public final long b;
    public final qr2 c;
    public final Bundle d;
    public String e;
    public Uri f;

    public R42$d(CharSequence charSequence, long l2, qr2 qr22) {
        Bundle bundle;
        this.d = bundle = new Bundle();
        this.a = charSequence;
        this.b = l2;
        this.c = qr22;
    }

    public static Bundle[] a(List list) {
        int n3 = list.size();
        Bundle[] bundleArray = new Bundle[n3];
        int n4 = list.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            String string2;
            R42$d r42$d = (R42$d)list.get(i3);
            r42$d.getClass();
            Bundle bundle = new Bundle();
            Object object = r42$d.a;
            if (object != null) {
                string2 = "text";
                bundle.putCharSequence(string2, (CharSequence)object);
            }
            long l2 = r42$d.b;
            bundle.putLong("time", l2);
            object = r42$d.c;
            if (object != null) {
                string2 = "sender";
                CharSequence charSequence = ((qr2)object).a;
                bundle.putCharSequence(string2, charSequence);
                int n7 = Build.VERSION.SDK_INT;
                int n8 = 28;
                if (n7 >= n8) {
                    object = R42$d$b.a(qr2$a.b((qr2)object));
                    string2 = "sender_person";
                    bundle.putParcelable(string2, (Parcelable)object);
                } else {
                    object = ((qr2)object).b();
                    string2 = "person";
                    bundle.putBundle(string2, (Bundle)object);
                }
            }
            if ((object = r42$d.e) != null) {
                string2 = "type";
                bundle.putString(string2, (String)object);
            }
            if ((object = r42$d.f) != null) {
                string2 = "uri";
                bundle.putParcelable(string2, (Parcelable)object);
            }
            if ((r42$d = r42$d.d) != null) {
                object = "extras";
                bundle.putBundle((String)object, (Bundle)r42$d);
            }
            bundleArray[i3] = bundle;
        }
        return bundleArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ArrayList b(Parcelable[] parcelableArray) {
        int n3 = parcelableArray.length;
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        n3 = 0;
        int n4 = 0;
        int n7;
        while (n4 < (n7 = parcelableArray.length)) {
            Parcelable parcelable = parcelableArray[n4];
            boolean bl2 = parcelable instanceof Bundle;
            if (bl2) {
                parcelable = (Bundle)parcelable;
                String string2 = "extras";
                String string3 = "uri";
                String string4 = "type";
                Object object = "sender";
                Object object2 = "sender_person";
                CharSequence charSequence = "person";
                String string5 = "time";
                String string6 = "text";
                Object object3 = null;
                try {
                    int n8 = parcelable.containsKey(string6);
                    if (n8 != 0 && (n8 = parcelable.containsKey(string5)) != 0) {
                        boolean bl3;
                        boolean bl4;
                        n8 = parcelable.containsKey(charSequence);
                        if (n8 != 0) {
                            object = parcelable.getBundle(charSequence);
                            object = qr2.a((Bundle)object);
                        } else {
                            int n10 = parcelable.containsKey((String)object2);
                            if (n10 != 0 && (n10 = Build.VERSION.SDK_INT) >= (n8 = 28)) {
                                object = parcelable.getParcelable((String)object2);
                                object = L42.a((Parcelable)object);
                                object = qr2$a.a((Person)object);
                            } else {
                                boolean bl5 = parcelable.containsKey((String)object);
                                if (bl5) {
                                    object = parcelable.getCharSequence((String)object);
                                    object2 = new Object();
                                    ((qr2)object2).a = object;
                                    ((qr2)object2).b = null;
                                    ((qr2)object2).c = null;
                                    ((qr2)object2).d = null;
                                    ((qr2)object2).e = false;
                                    ((qr2)object2).f = false;
                                    object = object2;
                                } else {
                                    bl4 = false;
                                    object = null;
                                }
                            }
                        }
                        charSequence = parcelable.getCharSequence(string6);
                        long l2 = parcelable.getLong(string5);
                        object2 = new R42$d(charSequence, l2, (qr2)object);
                        bl4 = parcelable.containsKey(string4);
                        if (bl4 && (bl4 = parcelable.containsKey(string3))) {
                            string4 = parcelable.getString(string4);
                            string3 = parcelable.getParcelable(string3);
                            string3 = (Uri)string3;
                            ((R42$d)object2).e = string4;
                            ((R42$d)object2).f = string3;
                        }
                        if (bl3 = parcelable.containsKey(string2)) {
                            string3 = ((R42$d)object2).d;
                            parcelable = parcelable.getBundle(string2);
                            string3.putAll((Bundle)parcelable);
                        }
                        object3 = object2;
                    }
                }
                catch (ClassCastException classCastException) {}
                if (object3 != null) {
                    arrayList.add(object3);
                }
            }
            ++n4;
        }
        return arrayList;
    }

    public final Notification.MessagingStyle.Message c() {
        Notification.MessagingStyle.Message message;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        Object object = null;
        long l2 = this.b;
        CharSequence charSequence = this.a;
        qr2 qr22 = this.c;
        if (n3 >= n4) {
            if (qr22 != null) {
                object = qr2$a.b(qr22);
            }
            message = R42$d$b.b(charSequence, l2, object);
        } else {
            if (qr22 != null) {
                object = qr22.a;
            }
            message = R42$d$a.a(charSequence, l2, (CharSequence)object);
        }
        String string2 = this.e;
        if (string2 != null) {
            object = this.f;
            R42$d$a.b(message, string2, (Uri)object);
        }
        return message;
    }
}

