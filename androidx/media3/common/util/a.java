/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.opengl.GLES20
 */
package androidx.media3.common.util;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.a$a;
import androidx.media3.common.util.a$b;
import java.util.HashMap;

public final class a {
    public final int a;
    public final a$a[] b;
    public final a$b[] c;
    public final HashMap d;
    public final HashMap e;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public a(String object, String string2) {
        HashMap hashMap;
        int n3;
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int n4;
        void var7_10;
        int n7;
        a a2 = this;
        this.a = n7 = GLES20.glCreateProgram();
        GlUtil.b();
        Object object2 = object;
        androidx.media3.common.util.a.a(n7, 35633, (String)object);
        object2 = string2;
        androidx.media3.common.util.a.a(n7, 35632, string2);
        GLES20.glLinkProgram((int)n7);
        int n8 = 0;
        object2 = new int[]{0};
        GLES20.glGetProgramiv((int)n7, (int)35714, (int[])object2, (int)0);
        Object object3 = object2[0];
        int n10 = 1;
        if (object3 == n10) {
            boolean bl2 = true;
        } else {
            boolean bl3 = false;
            object2 = null;
        }
        Object object4 = new StringBuilder("Unable to link shader program: \n");
        Object object5 = GLES20.glGetProgramInfoLog((int)n7);
        ((StringBuilder)object4).append((String)object5);
        object4 = ((StringBuilder)object4).toString();
        GlUtil.c((String)object4, (boolean)var7_10);
        GLES20.glUseProgram((int)n7);
        object2 = new HashMap();
        a2.d = object2;
        object2 = new int[n10];
        int n14 = 35721;
        GLES20.glGetProgramiv((int)n7, (int)n14, (int[])object2, (int)0);
        a$a[] a$aArray = new a$a[object2[0]];
        a2.b = a$aArray;
        n7 = 0;
        Object var12_21 = null;
        while (true) {
            a$a a$a;
            int n15;
            reference var14_26;
            Object object6;
            block9: {
                Object object7;
                if (n7 >= (object7 = object2[0])) break;
                n4 = a2.a;
                object4 = new int[object6];
                GLES20.glGetProgramiv((int)n4, (int)35722, (int[])object4, (int)0);
                var14_26 = object4[0];
                byte[] byArray = new byte[var14_26];
                nArray4 = new int[object6];
                nArray3 = new int[object6];
                int[] nArray5 = new int[object6];
                nArray2 = null;
                nArray = null;
                object7 = n4;
                int n16 = n7;
                Object object8 = var14_26;
                object = byArray;
                n3 = 0;
                Object var15_28 = null;
                object6 = var14_26;
                n15 = n4;
                n4 = 0;
                GLES20.glGetActiveAttrib((int)object7, (int)n7, (int)var14_26, (int[])nArray4, (int)0, (int[])nArray3, (int)0, (int[])nArray5, (int)0, (byte[])object, (int)0);
                for (var14_26 = (reference)false; var14_26 < object6; ++var14_26) {
                    object5 = object;
                    object8 = object[var14_26];
                    if (object8 != false) {
                        continue;
                    }
                    break block9;
                }
                object5 = object;
                var14_26 = object6;
            }
            object4 = new String((byte[])object5, 0, (int)var14_26);
            object6 = n15;
            GLES20.glGetAttribLocation((int)n15, (String)object4);
            a2.b[n7] = a$a;
            object5 = a2.d;
            ((HashMap)object5).put(object4, a$a);
            ++n7;
            object6 = true;
        }
        a2.e = hashMap = new HashMap();
        object2 = new int[1];
        n7 = a2.a;
        int n17 = 35718;
        GLES20.glGetProgramiv((int)n7, (int)n17, (int[])object2, (int)0);
        a$b[] a$bArray = new a$b[object2[0]];
        a2.c = a$bArray;
        n7 = 0;
        Object var12_24 = null;
        while (true) {
            block10: {
                Object object9;
                if (n7 >= (object9 = object2[0])) {
                    GlUtil.b();
                    return;
                }
                n4 = a2.a;
                int n18 = 1;
                int[] nArray6 = new int[n18];
                GLES20.glGetProgramiv((int)n4, (int)35719, (int[])nArray6, (int)0);
                nArray = new int[n18];
                n3 = nArray6[0];
                byte[] byArray = new byte[n3];
                int[] nArray7 = new int[n18];
                nArray2 = new int[n18];
                nArray4 = null;
                nArray3 = null;
                object9 = n4;
                int n19 = n7;
                Object object10 = n3;
                object = byArray;
                Object var18_38 = null;
                n8 = n3;
                Object object11 = object;
                n18 = 0;
                GLES20.glGetActiveUniform((int)n4, (int)n7, (int)n3, (int[])nArray7, (int)0, (int[])nArray2, (int)0, (int[])nArray, (int)0, (byte[])object, (int)0);
                Object var15_32 = null;
                for (n3 = 0; n3 < n8; ++n3) {
                    object4 = object;
                    object10 = object[n3];
                    if (object10 != 0) {
                        continue;
                    }
                    break block10;
                }
                object4 = object;
                n3 = n8;
            }
            n8 = 0;
            String string3 = new String((byte[])object4, 0, n3);
            GLES20.glGetUniformLocation((int)n4, (String)string3);
            a2.c[n7] = object4 = new Object();
            object5 = a2.e;
            ((HashMap)object5).put(string3, object4);
            ++n7;
        }
    }

    public static void a(int n3, int n4, String string2) {
        n4 = GLES20.glCreateShader((int)n4);
        GLES20.glShaderSource((int)n4, (String)string2);
        GLES20.glCompileShader((int)n4);
        boolean bl2 = false;
        Object object = new int[]{0};
        GLES20.glGetShaderiv((int)n4, (int)35713, (int[])object, (int)0);
        int n7 = object[0];
        int n8 = 1;
        if (n7 == n8) {
            bl2 = true;
        }
        object = new StringBuilder;
        ((StringBuilder)object)();
        String string3 = GLES20.glGetShaderInfoLog((int)n4);
        ((StringBuilder)object).append(string3);
        ((StringBuilder)object).append(", source: \n");
        ((StringBuilder)object).append(string2);
        GlUtil.c(((StringBuilder)object).toString(), bl2);
        GLES20.glAttachShader((int)n3, (int)n4);
        GLES20.glDeleteShader((int)n4);
        GlUtil.b();
    }

    public final int b(String string2) {
        int n3 = GLES20.glGetAttribLocation((int)this.a, (String)string2);
        GLES20.glEnableVertexAttribArray((int)n3);
        GlUtil.b();
        return n3;
    }
}

