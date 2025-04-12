/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.opengl.GLES20
 */
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.common.util.a;

public final class BB2 {
    public static final float[] i;
    public static final float[] j;
    public static final float[] k;
    public int a;
    public BB2$a b;
    public a c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    static {
        float[] fArray;
        float[] fArray2;
        int n3 = 9;
        float[] fArray3 = fArray2 = new float[n3];
        float[] fArray4 = fArray2;
        fArray3[0] = 1.0f;
        fArray4[1] = 0.0f;
        fArray3[2] = 0.0f;
        fArray4[3] = 0.0f;
        fArray3[4] = -1.0f;
        fArray4[5] = 0.0f;
        fArray3[6] = 0.0f;
        fArray4[7] = 1.0f;
        fArray4[8] = 1.0f;
        i = fArray2;
        float[] fArray5 = fArray2 = new float[n3];
        float[] fArray6 = fArray2;
        fArray5[0] = 1.0f;
        fArray6[1] = 0.0f;
        fArray5[2] = 0.0f;
        fArray6[3] = 0.0f;
        fArray5[4] = -0.5f;
        fArray6[5] = 0.0f;
        fArray5[6] = 0.0f;
        fArray6[7] = 0.5f;
        fArray6[8] = 1.0f;
        j = fArray2;
        float[] fArray7 = fArray = new float[n3];
        float[] fArray8 = fArray;
        fArray7[0] = 0.5f;
        fArray8[1] = 0.0f;
        fArray7[2] = 0.0f;
        fArray8[3] = 0.0f;
        fArray7[4] = -1.0f;
        fArray8[5] = 0.0f;
        fArray7[6] = 0.0f;
        fArray8[7] = 1.0f;
        fArray8[8] = 1.0f;
        k = fArray;
    }

    public static boolean b(zB2 object) {
        Object object2 = object.a.a;
        int n3 = ((zB2$b[])object2).length;
        boolean bl2 = false;
        int n4 = 1;
        if (n3 == n4) {
            object2 = object2[0];
            int n7 = object2.a;
            if (n7 == 0 && (n7 = ((zB2$b[])(object = object.b.a)).length) == n4) {
                object = object[0];
                int n8 = object.a;
                if (n8 == 0) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a() {
        a a2;
        String string2 = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";
        String string3 = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";
        try {
            a2 = new a(string2, string3);
        }
        catch (GlUtil$GlException glUtil$GlException) {
            return;
        }
        this.c = a2;
        string2 = "uMvpMatrix";
        int n3 = a2.a;
        n3 = GLES20.glGetUniformLocation((int)n3, (String)string2);
        this.d = n3;
        a2 = this.c;
        string2 = "uTexMatrix";
        n3 = a2.a;
        n3 = GLES20.glGetUniformLocation((int)n3, (String)string2);
        this.e = n3;
        a2 = this.c;
        string2 = "aPosition";
        n3 = a2.b(string2);
        this.f = n3;
        a2 = this.c;
        string2 = "aTexCoords";
        n3 = a2.b(string2);
        this.g = n3;
        a2 = this.c;
        string2 = "uTexture";
        n3 = a2.a;
        n3 = GLES20.glGetUniformLocation((int)n3, (String)string2);
        this.h = n3;
    }
}

