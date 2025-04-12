/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oS
 */
public final class os_2 {
    public static final float[][] a;
    public static final float[][] b;
    public static final float[] c;
    public static final float[][] d;

    static {
        float[] fArray;
        float[] fArray2;
        float[] fArray3;
        float[] fArray4;
        int n3 = 3;
        float[] fArray5 = fArray4 = new float[n3];
        fArray4[0] = 0.401288f;
        fArray5[1] = 0.650173f;
        fArray5[2] = -0.051461f;
        float[] fArray6 = fArray3 = new float[n3];
        fArray3[0] = -0.250268f;
        fArray6[1] = 1.204414f;
        fArray6[2] = 0.045854f;
        float[] fArray7 = fArray2 = new float[n3];
        fArray2[0] = -0.002079f;
        fArray7[1] = 0.048952f;
        fArray7[2] = 0.953127f;
        Object object = new float[n3][];
        object[0] = fArray4;
        int n4 = 1;
        object[n4] = fArray3;
        int n7 = 2;
        object[n7] = fArray2;
        a = object;
        float[] fArray8 = fArray2 = new float[n3];
        fArray2[0] = 1.8620678f;
        fArray8[1] = -1.0112547f;
        fArray8[2] = 0.14918678f;
        Object object2 = object = (Object)new float[n3];
        object[0] = (float[])0.38752654f;
        object2[1] = (float[])0.62144744f;
        object2[2] = (float[])-0.00897398f;
        float[] fArray9 = fArray = new float[n3];
        fArray[0] = -0.0158415f;
        fArray9[1] = -0.03412294f;
        fArray9[2] = 1.0499644f;
        float[][] fArrayArray = new float[n3][];
        fArrayArray[0] = fArray2;
        fArrayArray[n4] = (float[])object;
        fArrayArray[n7] = fArray;
        b = fArrayArray;
        float[] fArray10 = fArray2 = new float[n3];
        fArray2[0] = 95.047f;
        fArray10[1] = 100.0f;
        fArray10[2] = 108.883f;
        c = fArray2;
        float[] fArray11 = fArray2 = new float[n3];
        fArray2[0] = 0.41233894f;
        fArray11[1] = 0.35762063f;
        fArray11[2] = 0.18051042f;
        Object object3 = object = (Object)new float[n3];
        object[0] = (float[])0.2126f;
        object3[1] = (float[])0.7152f;
        object3[2] = (float[])0.0722f;
        float[] fArray12 = fArray = new float[n3];
        fArray[0] = 0.01932141f;
        fArray12[1] = 0.11916382f;
        fArray12[2] = 0.9503448f;
        float[][] fArrayArray2 = new float[n3][];
        fArrayArray2[0] = fArray2;
        fArrayArray2[n4] = (float[])object;
        fArrayArray2[n7] = fArray;
        d = fArrayArray2;
    }

    public static final byte[] a(CharsetEncoder object, CharSequence object2, int n3, int n4) {
        int n7;
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string2 = "input";
        Intrinsics.checkNotNullParameter(object2, string2);
        int n74 = object2 instanceof String;
        if (n74 != 0) {
            string2 = "getBytes(...)";
            if (n3 == 0) {
                Object charSequence = object2;
                charSequence = (String)object2;
                int n8 = ((String)charSequence).length();
                if (n4 == n8) {
                    object = ((CharsetEncoder)object).charset();
                    object = ((String)charSequence).getBytes((Charset)object);
                    Intrinsics.checkNotNullExpressionValue(object, string2);
                    return object;
                }
            }
            object2 = ((String)object2).substring(n3, n4);
            Intrinsics.checkNotNullExpressionValue(object2, "substring(...)");
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type java.lang.String");
            object = ((CharsetEncoder)object).charset();
            object = ((String)object2).getBytes((Charset)object);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            return object;
        }
        object2 = CharBuffer.wrap((CharSequence)object2, n3, n4);
        object = ((CharsetEncoder)object).encode((CharBuffer)object2);
        boolean n10 = ((ByteBuffer)object).hasArray();
        n3 = 0;
        Object object3 = null;
        if (n10 && (n7 = ((ByteBuffer)object).arrayOffset()) == 0 && (n4 = ((Object)(object2 = (Object)((ByteBuffer)object).array())).length) == (n74 = ((Buffer)object).remaining())) {
            object3 = object2;
        }
        if (object3 == null) {
            int n8 = ((Buffer)object).remaining();
            object3 = new byte[n8];
            ((ByteBuffer)object).get((byte[])object3);
        }
        return object3;
    }

    public static final String b(Charset object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = ((Charset)object).name();
        Intrinsics.checkNotNullExpressionValue(object, "name(...)");
        return object;
    }

    public static int c(float f5) {
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object < 0) {
            return -16777216;
        }
        f6 = 99.0f;
        float f8 = f5 - f6;
        object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object > 0) {
            return -1;
        }
        object = 1098907648;
        f6 = 16.0f;
        float f11 = f5 + f6;
        float f12 = 116.0f;
        float f14 = 8.0f;
        float f15 = 903.2963f;
        Object object2 = f5 == f14 ? 0 : (f5 > f14 ? 1 : -1);
        f5 = object2 > 0 ? (f11 /= f12) * f11 * f11 : (f5 /= f15);
        f14 = f11 * f11 * f11;
        int n3 = 1;
        float f16 = 0.008856452f;
        float f17 = f14 == f16 ? 0 : (f14 > f16 ? 1 : -1);
        if (f17 > 0) {
            f17 = 1.0f;
            f16 = Float.MIN_VALUE;
        } else {
            f17 = 0.0f;
            f16 = 0.0f;
        }
        float f18 = f17 != false ? f14 : (f11 * f12 - f6) / f15;
        if (f17 == false) {
            f11 = f11 * f12 - f6;
            f14 = f11 / f15;
        }
        float[] fArray = c;
        f11 = fArray[0];
        double d2 = f18 * f11;
        f11 = fArray[n3];
        double d5 = f5 * f11;
        f5 = fArray[2];
        double d7 = f14 * f5;
        return hZ.b(d2, d5, d7);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float d(int n3) {
        float f5 = (float)n3 / 255.0f;
        float f6 = 0.04045f;
        float f7 = 100.0f;
        Object object = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object <= 0) {
            int n4 = 1095678034;
            f6 = 12.92f;
            f5 /= f6;
            return f5 * f7;
        }
        int n7 = 1065814589;
        f6 = 1.055f;
        double d2 = (f5 += 0.055f) / f6;
        double d5 = 2.4f;
        d2 = Math.pow(d2, d5);
        f5 = (float)d2;
        return f5 * f7;
    }

    public static final void e(Context context, CleverTapInstanceConfig object, int n3, ae0_1 ae0_12) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(object, "config");
        Intrinsics.checkNotNullParameter(ae0_12, "cryptHandler");
        int n4 = ae0_12.d;
        int n7 = n3 ^ n4;
        b b2 = ((CleverTapInstanceConfig)object).b();
        String string2 = D70.b(n3, n4 &= n7, "Updating encryption flag status after error in ", " to ");
        String string3 = ((CleverTapInstanceConfig)object).a;
        b2.b(string3, string2);
        object = gc3_0.l((CleverTapInstanceConfig)object, "encryptionFlagStatus");
        gc3_0.j(context, n4, (String)object);
        ae0_12.d = n4;
    }

    public static float f() {
        return (float)Math.pow(((double)50.0f + 16.0) / 116.0, 3.0) * 100.0f;
    }
}

