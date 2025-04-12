/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lV0
 */
public final class lv0_0
implements jV0 {
    public final float[] a;
    public final float[] b;

    public lv0_0(float[] object, float[] object2) {
        int n3 = ((float[])object).length;
        int n4 = ((float[])object2).length;
        if (n3 == n4 && (n3 = ((float[])object).length) != 0) {
            this.a = object;
            this.b = object2;
            return;
        }
        object = new IllegalArgumentException;
        object2 = "Array lengths must match and be nonzero".toString();
        super((String)object2);
        throw object;
    }

    public final float a(float f5) {
        float[] fArray = this.b;
        float[] fArray2 = this.a;
        return lV0$a.a(f5, fArray, fArray2);
    }

    public final float b(float f5) {
        float[] fArray = this.a;
        float[] fArray2 = this.b;
        return lV0$a.a(f5, fArray, fArray2);
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        if (object == null) {
            return false;
        }
        boolean bl4 = object instanceof lv0_0;
        if (!bl4) {
            return false;
        }
        object = (lv0_0)object;
        float[] fArray = this.a;
        float[] fArray2 = ((lv0_0)object).a;
        bl4 = Arrays.equals(fArray, fArray2);
        if (!bl4 || !(bl2 = Arrays.equals(fArray2 = this.b, (float[])(object = (Object)((lv0_0)object).b)))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3 = Arrays.hashCode(this.a) * 31;
        return Arrays.hashCode(this.b) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string2 = Arrays.toString(this.a);
        String string3 = "toString(this)";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        stringBuilder.append(string2);
        stringBuilder.append(", toDpValues=");
        string2 = Arrays.toString(this.b);
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        stringBuilder.append(string2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

