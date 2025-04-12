/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/*
 * Renamed from SD3
 */
public abstract class sd3_0
extends An3 {
    public sd3_0() {
        int n3;
        this.b = 0;
        int n4 = 10;
        int[] nArray = new int[n4];
        this.c = nArray;
        nArray = new int[2];
        nArray[1] = n3 = 3;
        nArray[0] = n4;
        Object object = (float[][])Array.newInstance(Float.TYPE, nArray);
        this.d = object;
        object = new float[n3];
        this.g = (float[])object;
        this.h = false;
        this.j = 0.0f / 0.0f;
    }

    public final float d(float f5, long l2, Tn1 tn1, View view) {
        sd3_0 sd3_02 = this;
        long l3 = l2;
        Object object = tn1;
        View view2 = view;
        Object object2 = this.a;
        double d2 = f5;
        float[] fArray = this.g;
        ((zf0_1)object2).d(d2, fArray);
        object2 = this.g;
        int n3 = 1;
        reference var16_13 = object2[n3];
        int n4 = 2;
        String string2 = null;
        reference cfr_temp_0 = var16_13 - 0.0f;
        Object object3 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
        if (object3 == false) {
            this.h = false;
            return (float)object2[n4];
        }
        float f6 = this.j;
        Object object4 = Float.isNaN(f6);
        if (object4) {
            object2 = this.f;
            this.j = f6 = tn1.a(view, (String)object2);
            object4 = Float.isNaN(f6);
            if (object4) {
                this.j = 0.0f;
            }
        }
        long l4 = sd3_02.i;
        l4 = l3 - l4;
        f6 = sd3_02.j;
        double d5 = f6;
        double d7 = l4;
        double d9 = 1.0E-9;
        d7 *= d9;
        object4 = object3;
        double d12 = (double)var16_13;
        d7 = d7 * d12 + d5;
        d12 = 1.0;
        var16_13 = (reference)(d7 %= d12);
        sd3_02.j = (float)var16_13;
        string2 = sd3_02.f;
        object = ((Tn1)object).a;
        object3 = ((HashMap)object).containsKey(view2);
        if (object3 == false) {
            HashMap<String, float[]> hashMap = new HashMap<String, float[]>();
            float[] fArray2 = new float[n3];
            fArray2[0] = (float)var16_13;
            hashMap.put(string2, fArray2);
            ((HashMap)object).put(view2, hashMap);
        } else {
            boolean bl2;
            HashMap<String, Object> hashMap = (HashMap<String, Object>)((HashMap)object).get(view2);
            if (hashMap == null) {
                hashMap = new HashMap<String, Object>();
            }
            if (!(bl2 = hashMap.containsKey(string2))) {
                float[] fArray3 = new float[n3];
                fArray3[0] = (float)var16_13;
                hashMap.put(string2, fArray3);
                ((HashMap)object).put(view2, hashMap);
            } else {
                int n7;
                object = (float[])hashMap.get(string2);
                if (object == null) {
                    object = new float[0];
                }
                if ((n7 = ((Object)object).length) <= 0) {
                    object = Arrays.copyOf((float[])object, n3);
                }
                object[0] = var16_13;
                hashMap.put(string2, object);
            }
        }
        sd3_02.i = l3;
        float[] fArray4 = sd3_02.g;
        float f7 = fArray4[0];
        float f8 = sd3_02.j;
        f8 = sd3_02.a(f8);
        float f11 = sd3_02.g[n4];
        f8 = f8 * f7 + f11;
        f11 = 0.0f;
        object = null;
        float f12 = f7 - 0.0f;
        float f14 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (f14 == false && !object4) {
            n3 = 0;
        }
        sd3_02.h = n3;
        return f8;
    }

    public abstract boolean e(float var1, long var2, Tn1 var4, View var5);
}

