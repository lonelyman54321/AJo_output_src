/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.opengl.GLES20
 *  android.opengl.GLU
 */
package androidx.media3.common.util;

import android.opengl.GLES20;
import android.opengl.GLU;
import androidx.media3.common.util.GlUtil$GlException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public final class GlUtil {
    public static void a(int n3, int n4) {
        GLES20.glBindTexture((int)n3, (int)n4);
        GlUtil.b();
        int n7 = 9729;
        GLES20.glTexParameteri((int)n3, (int)10240, (int)n7);
        GlUtil.b();
        GLES20.glTexParameteri((int)n3, (int)10241, (int)n7);
        GlUtil.b();
        n7 = 33071;
        GLES20.glTexParameteri((int)n3, (int)10242, (int)n7);
        GlUtil.b();
        GLES20.glTexParameteri((int)n3, (int)10243, (int)n7);
        GlUtil.b();
    }

    public static void b() {
        int n3;
        CharSequence charSequence = new StringBuilder();
        char c2 = '\u0000';
        Object object = null;
        while ((n3 = GLES20.glGetError()) != 0) {
            String string2;
            if (c2 != '\u0000') {
                c2 = '\n';
                ((StringBuilder)charSequence).append(c2);
            }
            if ((object = GLU.gluErrorString((int)n3)) == null) {
                String string3 = "error code: 0x";
                object = new StringBuilder(string3);
                string2 = Integer.toHexString(n3);
                ((StringBuilder)object).append(string2);
                object = ((StringBuilder)object).toString();
            }
            string2 = "glError: ";
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append((String)object);
            c2 = '\u0001';
        }
        if (c2 == '\u0000') {
            return;
        }
        charSequence = ((StringBuilder)charSequence).toString();
        object = new Exception((String)charSequence);
        throw object;
    }

    public static void c(String string2, boolean bl2) {
        if (bl2) {
            return;
        }
        GlUtil$GlException glUtil$GlException = new Exception(string2);
        throw glUtil$GlException;
    }

    public static FloatBuffer d(float[] fArray) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(fArray.length * 4);
        ByteOrder byteOrder = ByteOrder.nativeOrder();
        return (FloatBuffer)byteBuffer.order(byteOrder).asFloatBuffer().put(fArray).flip();
    }
}

