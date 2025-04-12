/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.os.Bundle
 *  android.text.Layout$Alignment
 *  android.text.SpannableString
 */
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import com.google.common.base.Function;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from Qe0
 */
public final class qe0_0
implements Function {
    public final Object apply(Object object) {
        int n3;
        float f5;
        int n4;
        Object object2;
        int n7;
        Iterator iterator;
        object = (Bundle)object;
        Object object3 = Pe0.r;
        object3 = new Pe0$a();
        Object object4 = Pe0.r;
        object4 = object.getCharSequence((String)object4);
        int n8 = 1;
        if (object4 != null) {
            ((Pe0$a)object3).a = object4;
            iterator = Pe0.s;
            if ((iterator = object.getParcelableArrayList((String)((Object)iterator))) != null) {
                object4 = SpannableString.valueOf((CharSequence)object4);
                iterator = ((ArrayList)((Object)iterator)).iterator();
                while ((n7 = iterator.hasNext()) != 0) {
                    String string2;
                    object2 = (Bundle)iterator.next();
                    String string3 = Pf0.a;
                    n4 = object2.getInt(string3);
                    String string4 = Pf0.b;
                    int n10 = object2.getInt(string4);
                    String string5 = Pf0.c;
                    int n14 = object2.getInt(string5);
                    Object object5 = Pf0.d;
                    int n15 = -1;
                    int n16 = object2.getInt((String)object5, n15);
                    String string6 = Pf0.e;
                    object2 = object2.getBundle(string6);
                    if (n16 != n8) {
                        n15 = 2;
                        if (n16 != n15) {
                            n15 = 3;
                            if (n16 != n15) {
                                n15 = 4;
                                if (n16 != n15) continue;
                                object2.getClass();
                                string6 = GE3.b;
                                object2 = object2.getString(string6);
                                object2.getClass();
                                object5 = new GE3((String)object2);
                                object4.setSpan(object5, n4, n10, n14);
                                continue;
                            }
                            object2 = new u91();
                            object4.setSpan(object2, n4, n10, n14);
                            continue;
                        }
                        object2.getClass();
                        string6 = vj3_0.d;
                        n15 = object2.getInt(string6);
                        string2 = vj3_0.e;
                        int n17 = object2.getInt(string2);
                        String string7 = vj3_0.f;
                        n7 = object2.getInt(string7);
                        object5 = new vj3_0(n15, n17, n7);
                        object4.setSpan(object5, n4, n10, n14);
                        continue;
                    }
                    object2.getClass();
                    string6 = MQ2.c;
                    string6 = object2.getString(string6);
                    string6.getClass();
                    string2 = MQ2.d;
                    n7 = object2.getInt(string2);
                    object5 = new MQ2(string6, n7);
                    object4.setSpan(object5, n4, n10, n14);
                }
                ((Pe0$a)object3).a = object4;
            }
        }
        object4 = Pe0.t;
        if ((object4 = (Layout.Alignment)object.getSerializable((String)object4)) != null) {
            ((Pe0$a)object3).c = object4;
        }
        object4 = Pe0.u;
        if ((object4 = (Layout.Alignment)object.getSerializable((String)object4)) != null) {
            ((Pe0$a)object3).d = object4;
        }
        object4 = Pe0.v;
        object4 = (Bitmap)object.getParcelable((String)object4);
        iterator = null;
        if (object4 != null) {
            ((Pe0$a)object3).b = object4;
        } else {
            object4 = Pe0.w;
            if ((object4 = (Object)object.getByteArray((String)object4)) != null) {
                n7 = ((Object)object4).length;
                object4 = BitmapFactory.decodeByteArray((byte[])object4, (int)0, (int)n7);
                ((Pe0$a)object3).b = object4;
            }
        }
        object4 = Pe0.x;
        n7 = object.containsKey((String)object4);
        if (n7 != 0 && (n4 = (int)(object.containsKey((String)(object2 = Pe0.y)) ? 1 : 0)) != 0) {
            f5 = object.getFloat((String)object4);
            n7 = object.getInt((String)object2);
            ((Pe0$a)object3).e = f5;
            ((Pe0$a)object3).f = n7;
        }
        if ((n7 = (int)(object.containsKey((String)(object4 = Pe0.z)) ? 1 : 0)) != 0) {
            ((Pe0$a)object3).g = n3 = object.getInt((String)object4);
        }
        if ((n7 = (int)(object.containsKey((String)(object4 = Pe0.A)) ? 1 : 0)) != 0) {
            ((Pe0$a)object3).h = f5 = object.getFloat((String)object4);
        }
        if ((n7 = (int)(object.containsKey((String)(object4 = Pe0.B)) ? 1 : 0)) != 0) {
            ((Pe0$a)object3).i = n3 = object.getInt((String)object4);
        }
        if ((n7 = (int)(object.containsKey((String)(object4 = Pe0.D)) ? 1 : 0)) != 0 && (n4 = (int)(object.containsKey((String)(object2 = Pe0.C)) ? 1 : 0)) != 0) {
            f5 = object.getFloat((String)object4);
            n7 = object.getInt((String)object2);
            ((Pe0$a)object3).k = f5;
            ((Pe0$a)object3).j = n7;
        }
        if ((n7 = (int)(object.containsKey((String)(object4 = Pe0.E)) ? 1 : 0)) != 0) {
            ((Pe0$a)object3).l = f5 = object.getFloat((String)object4);
        }
        if ((n7 = (int)(object.containsKey((String)(object4 = Pe0.F)) ? 1 : 0)) != 0) {
            ((Pe0$a)object3).m = f5 = object.getFloat((String)object4);
        }
        if ((n7 = (int)(object.containsKey((String)(object4 = Pe0.G)) ? 1 : 0)) != 0) {
            ((Pe0$a)object3).o = n3 = object.getInt((String)object4);
            ((Pe0$a)object3).n = n8;
        }
        if ((n3 = (int)(object.getBoolean((String)(object4 = Pe0.H), false) ? 1 : 0)) == 0) {
            ((Pe0$a)object3).n = false;
        }
        if ((n8 = (int)(object.containsKey((String)(object4 = Pe0.I)) ? 1 : 0)) != 0) {
            ((Pe0$a)object3).p = n3 = object.getInt((String)object4);
        }
        if ((n8 = (int)(object.containsKey((String)(object4 = Pe0.J)) ? 1 : 0)) != 0) {
            float f6;
            ((Pe0$a)object3).q = f6 = object.getFloat((String)object4);
        }
        return ((Pe0$a)object3).a();
    }
}

