/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.opengl.GLES20
 *  android.opengl.GLSurfaceView
 *  android.opengl.GLSurfaceView$Renderer
 *  javax.microedition.khronos.egl.EGLConfig
 *  javax.microedition.khronos.opengles.GL10
 */
package androidx.media3.exoplayer.video;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.common.util.a;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class VideoDecoderGLSurfaceView$a
implements GLSurfaceView.Renderer {
    public static final float[] j;
    public static final String[] k;
    public static final FloatBuffer l;
    public final GLSurfaceView a;
    public final int[] b;
    public final int[] c;
    public final int[] d;
    public final int[] e;
    public final AtomicReference f;
    public a g;
    public int h;
    public JB3 i;

    static {
        float[] fArray;
        float[] fArray2 = fArray = new float[9];
        float[] fArray3 = fArray;
        fArray2[0] = 1.164f;
        fArray3[1] = 1.164f;
        fArray2[2] = 1.164f;
        fArray3[3] = 0.0f;
        fArray2[4] = -0.213f;
        fArray3[5] = 2.112f;
        fArray2[6] = 1.793f;
        fArray3[7] = -0.533f;
        fArray3[8] = 0.0f;
        j = fArray;
        k = new String[]{"y_tex", "u_tex", "v_tex"};
        float[] fArray4 = fArray = new float[8];
        float[] fArray5 = fArray;
        fArray4[0] = -1.0f;
        fArray5[1] = 1.0f;
        fArray4[2] = -1.0f;
        fArray5[3] = -1.0f;
        fArray4[4] = 1.0f;
        fArray5[5] = 1.0f;
        fArray4[6] = 1.0f;
        fArray5[7] = -1.0f;
        l = GlUtil.d(fArray);
    }

    public VideoDecoderGLSurfaceView$a(GLSurfaceView gLSurfaceView) {
        this.a = gLSurfaceView;
        int n3 = 3;
        Object object = new int[n3];
        this.b = object;
        object = new int[n3];
        this.c = object;
        object = new int[n3];
        this.d = object;
        object = new int[n3];
        this.e = object;
        object = new AtomicReference;
        this.f = object;
        object = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            int[] nArray = this.d;
            int[] nArray2 = this.e;
            nArray2[i3] = n4 = -1;
            nArray[i3] = n4;
        }
    }

    public final void onDrawFrame(GL10 object) {
        JB3 jB3;
        object = this.f.getAndSet(null);
        if (object == null && (jB3 = this.i) == null) {
            return;
        }
        if (object != null) {
            jB3 = this.i;
            if (jB3 != null) {
                jB3.getClass();
                throw null;
            }
            this.i = object;
        }
        this.i.getClass();
        object = j;
        GLES20.glUniformMatrix3fv((int)this.h, (int)1, (boolean)false, (float[])object, (int)0);
        throw null;
    }

    public final void onSurfaceChanged(GL10 gL10, int n3, int n4) {
        GLES20.glViewport((int)0, (int)0, (int)n3, (int)n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSurfaceCreated(GL10 object, EGLConfig object2) {
        int[] nArray = this.c;
        String string2 = "varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n";
        Object object3 = "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n";
        Object object4 = new a(string2, (String)object3);
        this.g = object4;
        string2 = "in_pos";
        int n3 = ((a)object4).b(string2);
        FloatBuffer floatBuffer = l;
        int n4 = 2;
        int n7 = 5126;
        GLES20.glVertexAttribPointer((int)n3, (int)n4, (int)n7, (boolean)false, (int)0, (Buffer)floatBuffer);
        object4 = this.g;
        string2 = "in_tc_y";
        int n8 = ((a)object4).b(string2);
        string2 = null;
        nArray[0] = n8;
        object4 = this.g;
        object3 = "in_tc_u";
        n8 = ((a)object4).b((String)object3);
        int n10 = 1;
        nArray[n10] = n8;
        object4 = this.g;
        object3 = "in_tc_v";
        n8 = ((a)object4).b((String)object3);
        int n14 = 2;
        nArray[n14] = n8;
        a a2 = this.g;
        object4 = "mColorConversion";
        int n15 = a2.a;
        this.h = n15 = GLES20.glGetUniformLocation((int)n15, (String)object4);
        GlUtil.b();
        int[] nArray2 = this.b;
        n8 = 3;
        try {
            GLES20.glGenTextures((int)n8, (int[])nArray2, (int)0);
            for (int i3 = 0; i3 < n8; ++i3) {
                object3 = this.g;
                String[] stringArray = k;
                String string3 = stringArray[i3];
                int n16 = ((a)object3).a;
                n16 = GLES20.glGetUniformLocation((int)n16, (String)string3);
                GLES20.glUniform1i((int)n16, (int)i3);
                n16 = 33984 + i3;
                GLES20.glActiveTexture((int)n16);
                n16 = nArray2[i3];
                n4 = 3553;
                GlUtil.a(n4, n16);
            }
            GlUtil.b();
        }
        catch (GlUtil$GlException glUtil$GlException) {}
        try {
            GlUtil.b();
            return;
        }
        catch (GlUtil$GlException glUtil$GlException) {
            return;
        }
    }
}

