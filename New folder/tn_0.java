/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build
 *  android.view.View
 */
import android.app.Activity;
import android.os.Build;
import android.view.View;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from Tn
 */
public final class tn_0 {
    public static final /* synthetic */ int a;

    static {
        new tn_0();
    }

    public static final String a(byte[] object) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(object, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int n4 = ((byte[])object).length;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            byte by2 = object[i3];
            Object object2 = StringCompanionObject.INSTANCE;
            Object object3 = Byte.valueOf(by2);
            object2 = new Object[n3];
            object2[0] = object3;
            object3 = Arrays.copyOf(object2, n3);
            object3 = String.format("%02x", object3);
            object2 = "format(format, *args)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            stringBuffer.append((String)object3);
        }
        object = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(object, "sb.toString()");
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final View b(Activity activity) {
        Class<tn_0> clazz = tn_0.class;
        boolean bl2 = td0.b(clazz);
        View view = null;
        if (bl2) {
            return null;
        }
        if (activity == null) {
            return null;
        }
        try {
            activity = activity.getWindow();
            if (activity == null) {
                return null;
            }
            activity = activity.getDecorView();
            return activity.getRootView();
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
            return view;
        }
        catch (Exception exception) {
            return view;
        }
    }

    public static final boolean c() {
        boolean bl2;
        block4: {
            block2: {
                String string2;
                boolean bl3;
                String string3;
                block3: {
                    string3 = Build.FINGERPRINT;
                    String string4 = "FINGERPRINT";
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    String string5 = "generic";
                    bl2 = false;
                    boolean bl4 = b.s(string3, string5, false);
                    if (bl4) break block2;
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    string4 = "unknown";
                    bl3 = b.s(string3, string4, false);
                    if (bl3) break block2;
                    string3 = Build.MODEL;
                    string4 = "MODEL";
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    string2 = "google_sdk";
                    boolean bl5 = StringsKt.F(string3, string2, false);
                    if (bl5) break block2;
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    String string6 = "Emulator";
                    bl5 = StringsKt.F(string3, string6, false);
                    if (bl5) break block2;
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    string4 = "Android SDK built for x86";
                    bl3 = StringsKt.F(string3, string4, false);
                    if (bl3) break block2;
                    string3 = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(string3, "MANUFACTURER");
                    string4 = "Genymotion";
                    bl3 = StringsKt.F(string3, string4, false);
                    if (bl3) break block2;
                    string3 = Build.BRAND;
                    string4 = "BRAND";
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    bl3 = b.s(string3, string5, false);
                    if (!bl3) break block3;
                    string3 = Build.DEVICE;
                    string4 = "DEVICE";
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    bl3 = b.s(string3, string5, false);
                    if (bl3) break block2;
                }
                if (!(bl3 = Intrinsics.areEqual(string2, string3 = Build.PRODUCT))) break block4;
            }
            bl2 = true;
        }
        return bl2;
    }
}

