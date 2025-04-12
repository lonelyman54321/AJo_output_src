/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from qM0
 */
public class qm0_1
extends pm0_2 {
    public static boolean d(File object) {
        boolean bl2;
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object, string2);
        FileWalkDirection fileWalkDirection = FileWalkDirection.BOTTOM_UP;
        Intrinsics.checkNotNullParameter(object, string2);
        string2 = "direction";
        Intrinsics.checkNotNullParameter((Object)fileWalkDirection, string2);
        Intrinsics.checkNotNullParameter(object, "start");
        Intrinsics.checkNotNullParameter((Object)fileWalkDirection, string2);
        int n3 = 32;
        File file = object;
        im0_2 im0_22 = new im0_2((File)object, fileWalkDirection, null, null, null, 0, n3, null);
        object = im0_22.iterator();
        block0: while (true) {
            boolean bl3;
            bl2 = true;
            while (bl3 = object.hasNext()) {
                file = (File)object.next();
                boolean bl4 = file.delete();
                if ((bl4 || !(bl3 = file.exists())) && bl2) continue block0;
                bl2 = false;
            }
            break;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     */
    public static File e(File var0) {
        block10: {
            block9: {
                var1_1 = "<this>";
                Intrinsics.checkNotNullParameter(var0, (String)var1_1);
                var2_2 = "image_cache";
                var3_3 = "relative";
                Intrinsics.checkNotNullParameter(var2_2, (String)var3_3);
                var4_4 = new File((String)var2_2);
                Intrinsics.checkNotNullParameter(var0, (String)var1_1);
                Intrinsics.checkNotNullParameter(var4_4, (String)var3_3);
                Intrinsics.checkNotNullParameter(var4_4, (String)var1_1);
                var1_1 = var4_4.getPath();
                var2_2 = "getPath(...)";
                Intrinsics.checkNotNullExpressionValue(var1_1, (String)var2_2);
                var5_5 = File.separatorChar;
                var6_6 = false;
                var3_3 = null;
                var7_7 = 4;
                var8_8 = StringsKt.N((CharSequence)var1_1, var5_5, 0, false, var7_7);
                var9_9 = 1;
                if (var8_8 != 0) break block9;
                var8_8 = var1_1.length();
                var7_7 = var8_8 > var9_9 && (var8_8 = (int)var1_1.charAt(var9_9)) == var5_5 && (var8_8 = StringsKt.N((CharSequence)var1_1, var5_5, 2, false, var7_7)) >= 0 ? ((var7_7 = StringsKt.N((CharSequence)var1_1, var5_5, var8_8 += var9_9, false, var7_7)) >= 0 ? (var7_7 += var9_9) : var1_1.length()) : 1;
                break block10;
            }
            var7_7 = 58;
            if (var8_8 <= 0) ** GOTO lbl-1000
            var10_10 = var8_8 + -1;
            if ((var10_10 = (int)var1_1.charAt(var10_10)) == var7_7) {
                var7_7 = var8_8 + 1;
            } else lbl-1000:
            // 2 sources

            {
                var7_7 = var8_8 == (var10_10 = -1) && (var7_7 = (int)StringsKt.I((CharSequence)var1_1, (char)var7_7)) != 0 ? var1_1.length() : 0;
            }
        }
        if (var7_7 > 0) {
            var11_11 = 1;
        } else {
            var11_11 = 0;
            var1_1 = null;
        }
        if (var11_11 == 0) {
            var0 = var0.toString();
            var1_1 = "toString(...)";
            Intrinsics.checkNotNullExpressionValue(var0, (String)var1_1);
            var11_11 = var0.length();
            if (var11_11 == 0) {
                var6_6 = true;
            }
            if (!var6_6 && (var11_11 = (int)StringsKt.I((CharSequence)var0, var5_5)) == 0) {
                var3_3 = new StringBuilder();
                var3_3.append((String)var0);
                var3_3.append(var5_5);
                var3_3.append(var4_4);
                var0 = var3_3.toString();
                var1_1 = new File((String)var0);
lbl54:
                // 2 sources

                while (true) {
                    var4_4 = var1_1;
                    break;
                }
            } else {
                var2_2 = new StringBuilder();
                var2_2.append((String)var0);
                var2_2.append(var4_4);
                var0 = var2_2.toString();
                var1_1 = new File((String)var0);
                ** continue;
            }
        }
        return var4_4;
    }
}

