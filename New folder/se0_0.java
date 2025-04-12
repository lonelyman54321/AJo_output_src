/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$CompressFormat
 *  android.os.Bundle
 *  android.text.Spanned
 */
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Spanned;
import com.google.common.base.Function;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * Renamed from Se0
 */
public final class se0_0
implements Function {
    public final Object apply(Object object) {
        Object object2;
        int n3 = 1;
        object = (Pe0)object;
        object.getClass();
        Bundle bundle = new Bundle();
        CharSequence charSequence = ((Pe0)object).a;
        if (charSequence != null) {
            ArrayList<jp1_2> arrayList = Pe0.r;
            bundle.putCharSequence((String)((Object)arrayList), charSequence);
            boolean bl2 = charSequence instanceof Spanned;
            if (bl2) {
                int n4;
                int n7;
                String string2;
                String string3;
                Bundle bundle2;
                Object object3;
                int n8;
                charSequence = (Spanned)charSequence;
                arrayList = Pf0.a;
                arrayList = new ArrayList<jp1_2>();
                int n10 = charSequence.length();
                Class clazz = MQ2.class;
                Object[] objectArray = (MQ2[])charSequence.getSpans(0, n10, clazz);
                int n14 = objectArray.length;
                for (n8 = 0; n8 < n14; n8 += n3) {
                    object3 = objectArray[n8];
                    object3.getClass();
                    bundle2 = new Bundle();
                    string3 = MQ2.c;
                    string2 = ((MQ2)object3).a;
                    bundle2.putString(string3, string2);
                    string3 = MQ2.d;
                    n7 = ((MQ2)object3).b;
                    bundle2.putInt(string3, n7);
                    object3 = Pf0.a((Spanned)charSequence, object3, n3, bundle2);
                    arrayList.add((jp1_2)object3);
                }
                n10 = charSequence.length();
                clazz = vj3_0.class;
                objectArray = (vj3_0[])charSequence.getSpans(0, n10, clazz);
                n14 = objectArray.length;
                for (n8 = 0; n8 < n14; n8 += n3) {
                    object3 = objectArray[n8];
                    object3.getClass();
                    bundle2 = new Bundle();
                    string3 = vj3_0.d;
                    n7 = ((vj3_0)object3).a;
                    bundle2.putInt(string3, n7);
                    string3 = vj3_0.e;
                    n7 = ((vj3_0)object3).b;
                    bundle2.putInt(string3, n7);
                    string3 = vj3_0.f;
                    n7 = ((vj3_0)object3).c;
                    bundle2.putInt(string3, n7);
                    n4 = 2;
                    object3 = Pf0.a((Spanned)charSequence, object3, n4, bundle2);
                    arrayList.add((jp1_2)object3);
                }
                n10 = charSequence.length();
                clazz = u91.class;
                objectArray = (u91[])charSequence.getSpans(0, n10, clazz);
                n14 = objectArray.length;
                for (n8 = 0; n8 < n14; n8 += n3) {
                    object3 = objectArray[n8];
                    int n15 = 3;
                    n4 = 0;
                    string3 = null;
                    object3 = Pf0.a((Spanned)charSequence, object3, n15, null);
                    arrayList.add((jp1_2)object3);
                }
                n10 = charSequence.length();
                clazz = GE3.class;
                objectArray = (GE3[])charSequence.getSpans(0, n10, clazz);
                n14 = objectArray.length;
                for (n8 = 0; n8 < n14; n8 += n3) {
                    object3 = objectArray[n8];
                    object3.getClass();
                    bundle2 = new Bundle();
                    string3 = GE3.b;
                    string2 = ((GE3)object3).a;
                    bundle2.putString(string3, string2);
                    n4 = 4;
                    object3 = Pf0.a((Spanned)charSequence, object3, n4, bundle2);
                    arrayList.add((jp1_2)object3);
                }
                n3 = (int)(arrayList.isEmpty() ? 1 : 0);
                if (n3 == 0) {
                    object2 = Pe0.s;
                    bundle.putParcelableArrayList((String)object2, arrayList);
                }
            }
        }
        object2 = Pe0.t;
        charSequence = ((Pe0)object).b;
        bundle.putSerializable((String)object2, (Serializable)((Object)charSequence));
        object2 = Pe0.u;
        charSequence = ((Pe0)object).c;
        bundle.putSerializable((String)object2, (Serializable)((Object)charSequence));
        object2 = Pe0.x;
        float f5 = ((Pe0)object).e;
        bundle.putFloat((String)object2, f5);
        object2 = Pe0.y;
        int n16 = ((Pe0)object).f;
        bundle.putInt((String)object2, n16);
        object2 = Pe0.z;
        n16 = ((Pe0)object).g;
        bundle.putInt((String)object2, n16);
        object2 = Pe0.A;
        f5 = ((Pe0)object).h;
        bundle.putFloat((String)object2, f5);
        object2 = Pe0.B;
        n16 = ((Pe0)object).i;
        bundle.putInt((String)object2, n16);
        object2 = Pe0.C;
        n16 = ((Pe0)object).n;
        bundle.putInt((String)object2, n16);
        object2 = Pe0.D;
        f5 = ((Pe0)object).o;
        bundle.putFloat((String)object2, f5);
        object2 = Pe0.E;
        f5 = ((Pe0)object).j;
        bundle.putFloat((String)object2, f5);
        object2 = Pe0.F;
        f5 = ((Pe0)object).k;
        bundle.putFloat((String)object2, f5);
        object2 = Pe0.H;
        n16 = (int)(((Pe0)object).l ? 1 : 0);
        bundle.putBoolean((String)object2, n16 != 0);
        object2 = Pe0.G;
        n16 = ((Pe0)object).m;
        bundle.putInt((String)object2, n16);
        object2 = Pe0.I;
        n16 = ((Pe0)object).p;
        bundle.putInt((String)object2, n16);
        object2 = Pe0.J;
        f5 = ((Pe0)object).q;
        bundle.putFloat((String)object2, f5);
        object = ((Pe0)object).d;
        if (object != null) {
            object2 = new ByteArrayOutputStream();
            charSequence = Bitmap.CompressFormat.PNG;
            boolean bl3 = object.compress((Bitmap.CompressFormat)charSequence, 0, (OutputStream)object2);
            ct3.f(bl3);
            object = Pe0.w;
            object2 = ((ByteArrayOutputStream)object2).toByteArray();
            bundle.putByteArray((String)object, (byte[])object2);
        }
        return bundle;
    }
}

