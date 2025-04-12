/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.provider.Settings$Global
 *  org.xmlpull.v1.XmlPullParser
 */
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/*
 * Renamed from nk
 */
public final class nk_0 {
    public static final bb1_1 a(QB1 qB1, boolean n3, float f5, int n4, b30_0 b30_02, int n7) {
        float f6;
        Object object = b30_02;
        Object object2 = null;
        int n8 = 5;
        b30_02.u(683659508);
        int n10 = 2;
        int n14 = n7 & 2;
        int n15 = 1;
        int n16 = n14 != 0 ? 1 : n3;
        n14 = n7 & 0x20;
        float f7 = 1.0f;
        if (n14 != 0) {
            n14 = 1065353216;
            f6 = 1.0f;
        } else {
            f6 = f5;
        }
        int bl2 = n7 & 0x40;
        int n17 = bl2 != 0 ? 1 : n4;
        OB1 oB1 = OB1.Immediately;
        if (n17 > 0) {
            boolean bl3;
            boolean bl4 = Float.isInfinite(f6);
            if (!bl4 && !(bl3 = Float.isNaN(f6))) {
                mk_0 mk_02;
                object.u(2024497114);
                int n18 = -610207850;
                object.u(n18);
                Object object3 = b30_02.v();
                b30$a$a b30$a$a = b30$a.a;
                if (object3 == b30$a$a) {
                    object3 = new fb1_0();
                    object.o(object3);
                }
                Object object4 = object3;
                object4 = (bb1_1)object3;
                b30_02.I();
                b30_02.I();
                int n19 = -180606964;
                object.u(n19);
                object3 = b30_02.v();
                if (object3 == b30$a$a) {
                    object3 = J83.g(n16 != 0);
                    object.o(object3);
                }
                Object object5 = object3;
                object5 = (tr1_0)object3;
                b30_02.I();
                object.u(-180606834);
                object3 = AndroidCompositionLocals_androidKt.b;
                object3 = (Context)object.j((H30)object3);
                f7 = Settings.Global.getFloat((ContentResolver)object3.getContentResolver(), (String)"animator_duration_scale", (float)f7);
                float f8 = f6 / f7;
                b30_02.I();
                Object object6 = n16 != 0;
                Object object7 = Float.valueOf(f8);
                object3 = n17;
                Object[] objectArray = new Object[n8];
                objectArray[0] = qB1;
                objectArray[n15] = object6;
                objectArray[n10] = null;
                objectArray[3] = object7;
                n10 = 4;
                objectArray[n10] = object3;
                boolean bl5 = true;
                n14 = 0;
                f6 = 0.0f;
                object7 = mk_02;
                object2 = objectArray;
                objectArray = null;
                object6 = b30$a$a;
                b30$a$a = null;
                mk_02 = new mk_0(n16 != 0, bl5, (bb1_1)object4, qB1, n17, false, f8, null, oB1, false, (tr1_0)object5, null);
                object7 = ly0_0.a;
                object7 = b30_02.l();
                object2 = Arrays.copyOf(object2, n8);
                n8 = ((Object[])object2).length;
                boolean bl6 = false;
                for (n16 = 0; n16 < n8; n16 += n15) {
                    object3 = object2[n16];
                    boolean bl7 = object.J(object3);
                    bl6 |= bl7;
                }
                object2 = b30_02.v();
                if (bl6 || object2 == object6) {
                    object2 = new op1_0((CoroutineContext)object7, mk_02);
                    object.o(object2);
                }
                b30_02.I();
                return object4;
            }
            object = g9_0.a(f6, "Speed must be a finite number. It is ", ".");
            object = object.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        object = Gj0.b(n17, "Iterations must be a positive number (", ").");
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public static String b(XmlPullParser xmlPullParser, String string2) {
        int n3 = xmlPullParser.getAttributeCount();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3 = xmlPullParser.getAttributeName(i3);
            boolean bl2 = string3.equals(string2);
            if (!bl2) continue;
            return xmlPullParser.getAttributeValue(i3);
        }
        return null;
    }

    public static boolean c(XmlPullParser object, String string2) {
        boolean bl2;
        int n3;
        int n4 = object.getEventType();
        if (n4 == (n3 = 3) && (bl2 = ((String)(object = object.getName())).equals(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean d(XmlPullParser object, String string2) {
        boolean bl2;
        int n3;
        int n4 = object.getEventType();
        if (n4 == (n3 = 2) && (bl2 = ((String)(object = object.getName())).equals(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static final boolean e(String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "method");
        String string3 = "GET";
        boolean bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3 && !(bl2 = Intrinsics.areEqual(string2, string3 = "HEAD"))) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        return bl2;
    }

    public static final String f(b30_0 b30_02, int n3) {
        kb2_0 kb2_02 = AndroidCompositionLocals_androidKt.a;
        b30_02.j(kb2_02);
        kb2_02 = AndroidCompositionLocals_androidKt.b;
        return ((Context)b30_02.j(kb2_02)).getResources().getString(n3);
    }
}

