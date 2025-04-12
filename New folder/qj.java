/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  org.xmlpull.v1.XmlPullParser
 */
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

public final class qj {
    public final XmlPullParser a;
    public int b;
    public final tn2 c;

    public qj(XmlResourceParser object) {
        this.a = object;
        this.b = 0;
        float[] fArray = new float[64];
        object.a = fArray;
        this.c = object;
    }

    public final float a(TypedArray typedArray, String string2, int n3, float f5) {
        XmlPullParser xmlPullParser = this.a;
        boolean bl2 = dt3.f(xmlPullParser, string2);
        if (bl2) {
            f5 = typedArray.getFloat(n3, f5);
        }
        int n4 = typedArray.getChangingConfigurations();
        this.b(n4);
        return f5;
    }

    public final void b(int n3) {
        int n4 = this.b;
        this.b = n3 |= n4;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof qj;
        if (n3 == 0) {
            return false;
        }
        object = (qj)object;
        XmlPullParser xmlPullParser = this.a;
        XmlPullParser xmlPullParser2 = ((qj)object).a;
        n3 = Intrinsics.areEqual(xmlPullParser, xmlPullParser2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((qj)object).b;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = this.b;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AndroidVectorParser(xmlParser=");
        XmlPullParser xmlPullParser = this.a;
        stringBuilder.append(xmlPullParser);
        stringBuilder.append(", config=");
        int n3 = this.b;
        return tu.a(stringBuilder, n3, ')');
    }
}

