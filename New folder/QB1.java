/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Rect
 */
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class QB1 {
    public final Gq2 a;
    public final HashSet b;
    public Map c;
    public Map d;
    public float e;
    public Map f;
    public List g;
    public ca3 h;
    public pb1_0 i;
    public List j;
    public Rect k;
    public float l;
    public float m;
    public float n;
    public boolean o;
    public int p;

    public QB1() {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = hashSet = new HashSet();
        this.p = 0;
    }

    public final void a(String string2) {
        rx1.b(string2);
        this.b.add(string2);
    }

    public final float b() {
        float f5 = this.m;
        float f6 = this.l;
        f5 -= f6;
        f6 = this.n;
        return (long)(f5 / f6 * 1000.0f);
    }

    public final Map c() {
        float f5;
        float f6 = wz3.c();
        float f7 = f6 - (f5 = this.e);
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (f8 != false) {
            boolean bl2;
            Iterator iterator = this.d.entrySet().iterator();
            while (bl2 = iterator.hasNext()) {
                Object object = iterator.next();
                Map map2 = this.d;
                String string2 = (String)object.getKey();
                object = (DC1)object.getValue();
                float f11 = this.e / f6;
                int n3 = (int)((float)((DC1)object).a * f11);
                boolean bl3 = ((DC1)object).b;
                float f12 = (float)bl3 * f11;
                int n4 = (int)f12;
                String string3 = ((DC1)object).e;
                String string4 = ((DC1)object).c;
                String string5 = ((DC1)object).d;
                DC1 dC1 = new DC1(string4, string5, string3, n3, n4);
                object = ((DC1)object).f;
                if (object != null) {
                    bl3 = true;
                    f12 = Float.MIN_VALUE;
                    object = Bitmap.createScaledBitmap((Bitmap)object, (int)n3, (int)n4, (boolean)bl3);
                    dC1.f = object;
                }
                map2.put(string2, dC1);
            }
        }
        this.e = f6;
        return this.d;
    }

    public final jh1_0 d(String string2) {
        List list = this.g;
        int n3 = list.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            String string3;
            jh1_0 jh1_02 = (jh1_0)this.g.get(i3);
            String string4 = jh1_02.a;
            int n4 = string4.equalsIgnoreCase(string2);
            if (n4 == 0 && ((n4 = string4.endsWith(string3 = "\r")) == 0 || !(bl2 = (string4 = string4.substring(0, n4 = string4.length() + -1)).equalsIgnoreCase(string2)))) continue;
            return jh1_02;
        }
        return null;
    }

    public final String toString() {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder("LottieComposition:\n");
        Iterator iterator = this.j.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (pp1)iterator.next();
            String string2 = "\t";
            object = ((pp1)object).a(string2);
            stringBuilder.append((String)object);
        }
        return stringBuilder.toString();
    }
}

