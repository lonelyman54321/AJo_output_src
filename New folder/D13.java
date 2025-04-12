/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ClipData
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcelable
 *  android.widget.Toast
 */
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.chuckerteam.chucker.R$string;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class D13 {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(C13 var0, Activity var1_1, String var2_2, String var3_3, String var4_4, String var5_5, f80_0 var6_6) {
        block15: {
            block19: {
                block20: {
                    block16: {
                        block17: {
                            block18: {
                                var7_7 = var6_6 instanceof D13$a;
                                if (var7_7 == 0) ** GOTO lbl-1000
                                var8_8 = var6_6;
                                var8_8 = (D13$a)var6_6;
                                var9_9 = var8_8.g;
                                var10_10 = -1 << -1;
                                var11_11 = var9_9 & var10_10;
                                if (var11_11 != 0) {
                                    var8_8.g = var9_9 -= var10_10;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var8_8 = new h80_0((f80_0)var6_6);
                                }
                                var6_6 = var8_8.f;
                                var12_12 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                var10_10 = var8_8.g;
                                var11_11 = 0;
                                var13_13 = 1;
                                var14_14 = 2;
                                if (var10_10 == 0) break block16;
                                if (var10_10 == var13_13) break block17;
                                if (var10_10 != var14_14) break block18;
                                var0 = var8_8.e;
                                var1_1 /* !! */  = var8_8.d;
                                var2_2 = var8_8.c;
                                var3_3 = var8_8.b;
                                var4_4 = var8_8.a;
                                vl2_2.b(var6_6);
                                break block19;
                            }
                            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw var0;
                        }
                        var0 = var8_8.e;
                        var5_5 = var8_8.d;
                        var4_4 = var8_8.c;
                        var3_3 = var8_8.b;
                        var1_1 /* !! */  = var8_8.a;
                        vl2_2.b(var6_6);
                        break block20;
                    }
                    vl2_2.b(var6_6);
                    var6_6 = var1_1 /* !! */ .getCacheDir();
                    var15_15 = "message";
                    if (var6_6 == null) {
                        Intrinsics.checkNotNullParameter("Failed to obtain a valid cache directory for Chucker file export", (String)var15_15);
                        var16_16 = R$string.chucker_export_no_file;
                        Toast.makeText((Context)var1_1 /* !! */ , (int)var16_16, (int)0).show();
                        return null;
                    }
                    if ((var2_2 = qL0.a((File)var6_6, (String)var2_2)) == null) {
                        Intrinsics.checkNotNullParameter("Failed to create an export file for Chucker", (String)var15_15);
                        var16_17 = R$string.chucker_export_no_file;
                        Toast.makeText((Context)var1_1 /* !! */ , (int)var16_17, (int)0).show();
                        return null;
                    }
                    var6_6 = ir0_2.a;
                    var15_15 = new D13$c((C13)var0, var1_1 /* !! */ , null);
                    var8_8.a = var1_1 /* !! */ ;
                    var8_8.b = var3_3;
                    var8_8.c = var4_4;
                    var8_8.d = var5_5;
                    var8_8.e = var2_2;
                    var8_8.g = var13_13;
                    if ((var6_6 = Ae3.g((f80_0)var8_8, (CoroutineContext)var6_6, (Function2)var15_15)) == var12_12 /* !! */ ) {
                        return var12_12 /* !! */ ;
                    }
                    var0 = var2_2;
                }
                var6_6 = (a93_0)var6_6;
                var2_2 = ir0_2.a;
                var2_2 = em0_2.b;
                var15_15 = new D13$b((File)var0, (a93_0)var6_6, null);
                var8_8.a = var1_1 /* !! */ ;
                var8_8.b = var3_3;
                var8_8.c = var4_4;
                var8_8.d = var5_5;
                var8_8.e = var0;
                var8_8.g = var14_14;
                var2_2 = Ae3.g((f80_0)var8_8, (CoroutineContext)var2_2, (Function2)var15_15);
                if (var2_2 == var12_12 /* !! */ ) {
                    return var12_12 /* !! */ ;
                }
                var2_2 = var4_4;
                var4_4 = var1_1 /* !! */ ;
                var1_1 /* !! */  = var5_5;
            }
            var5_5 = Intrinsics.stringPlus(var4_4.getPackageName(), ".com.chuckerteam.chucker.provider");
            var0 = FileProvider.d((Context)var4_4, var5_5, (File)var0);
            var5_5 = new Intent();
            var6_6 = "android.intent.action.SEND";
            var5_5 = var5_5.setAction((String)var6_6);
            var12_12 /* !! */  = var4_4.getPackageName();
            var5_5.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", (String)var12_12 /* !! */ );
            var12_12 /* !! */  = var4_4.getPackageName();
            var5_5.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", (String)var12_12 /* !! */ );
            var7_7 = 524288;
            var5_5.addFlags(var7_7);
            var8_8 = var4_4;
            while ((var9_9 = var8_8 instanceof ContextWrapper) != 0) {
                var9_9 = var8_8 instanceof Activity;
                if (var9_9 != 0) {
                    var8_8 = (Activity)var8_8;
                    break block15;
                }
                var8_8 = ((ContextWrapper)var8_8).getBaseContext();
            }
            var7_7 = 0;
            var8_8 = null;
        }
        if (var8_8 != null) {
            var8_8 = var8_8.getComponentName();
            var5_5.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", (Parcelable)var8_8);
            var12_12 /* !! */  = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
            var5_5.putExtra((String)var12_12 /* !! */ , (Parcelable)var8_8);
        }
        var4_4 = ((Context)var4_4).getContentResolver().getType((Uri)var0);
        var5_5.setType(var4_4);
        var4_4 = "android.intent.extra.SUBJECT";
        var5_5.putExtra(var4_4, (String)var2_2);
        if (var0 != null) {
            var2_2 = new ArrayList<Object>();
            var2_2.add(var0);
        } else {
            var17_18 = 0;
            var2_2 = null;
        }
        var4_4 = "android.intent.extra.STREAM";
        if (var2_2 != null && (var7_7 = var2_2.size()) > var13_13) {
            var6_6 = "android.intent.action.SEND_MULTIPLE";
            var5_5.setAction((String)var6_6);
            var5_5.putParcelableArrayListExtra(var4_4, var2_2);
            E13.a((Intent)var5_5, var2_2);
        } else {
            var5_5.setAction((String)var6_6);
            if (var2_2 != null && !(var18_19 = var2_2.isEmpty())) {
                var6_6 = (Parcelable)var2_2.get(0);
                var5_5.putExtra(var4_4, (Parcelable)var6_6);
                E13.a((Intent)var5_5, var2_2);
            } else {
                var5_5.removeExtra(var4_4);
                var5_5.setClipData(null);
                var17_18 = var5_5.getFlags() & -2;
                var5_5.setFlags(var17_18);
            }
        }
        Intrinsics.checkNotNullExpressionValue(var5_5, "from(activity)\n        .setType(activity.contentResolver.getType(uri))\n        .setChooserTitle(intentTitle)\n        .setSubject(intentSubject)\n        .setStream(uri)\n        .intent");
        var0 = ClipData.newRawUri((CharSequence)var1_1 /* !! */ , (Uri)var0);
        var5_5.setClipData((ClipData)var0);
        var5_5.addFlags(var13_13);
        return Intent.createChooser((Intent)var5_5, (CharSequence)var3_3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object b(C13 var0, Activity var1_1, String var2_2, String var3_3, f80_0 var4_4) {
        block8: {
            var5_5 = var4_4 instanceof D13$d;
            if (!var5_5) ** GOTO lbl-1000
            var6_6 = var4_4;
            var6_6 = (D13$d)var4_4;
            var7_7 = var6_6.e;
            var8_8 = -1 << -1;
            var9_9 = var7_7 & var8_8;
            if (var9_9 != 0) {
                var6_6.e = var7_7 -= var8_8;
            } else lbl-1000:
            // 2 sources

            {
                var6_6 = new h80_0((f80_0)var4_4);
            }
            var4_4 = var6_6.d;
            var10_10 /* !! */  = j90_0.COROUTINE_SUSPENDED;
            var8_8 = var6_6.e;
            var9_9 = 0;
            var11_11 = 1;
            if (var8_8 == 0) ** GOTO lbl26
            if (var8_8 == var11_11) {
                var3_3 = var6_6.c;
                var2_2 = var6_6.b;
                var1_1 = var6_6.a;
                vl2_2.b(var4_4);
            } else {
                var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw var0;
lbl26:
                // 1 sources

                vl2_2.b(var4_4);
                var4_4 = ir0_2.a;
                var12_12 = new D13$e((C13)var0, var1_1, null);
                var6_6.a = var1_1;
                var6_6.b = var2_2;
                var6_6.c = var3_3;
                var6_6.e = var11_11;
                var4_4 = Ae3.g((f80_0)var6_6, (CoroutineContext)var4_4, (Function2)var12_12);
                if (var4_4 == var10_10 /* !! */ ) {
                    return var10_10 /* !! */ ;
                }
            }
            var4_4 = (String)var4_4;
            var1_1.getClass();
            var0 = new Intent();
            var6_6 = "android.intent.action.SEND";
            var0 = var0.setAction((String)var6_6);
            var12_12 = var1_1.getPackageName();
            var0.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", (String)var12_12);
            var10_10 /* !! */  = "android.support.v4.app.EXTRA_CALLING_PACKAGE";
            var12_12 = var1_1.getPackageName();
            var0.putExtra((String)var10_10 /* !! */ , (String)var12_12);
            var7_7 = 524288;
            var0.addFlags(var7_7);
            while ((var7_7 = var1_1 instanceof ContextWrapper) != 0) {
                var7_7 = var1_1 instanceof Activity;
                if (var7_7 == 0) {
                    var1_1 = ((ContextWrapper)var1_1).getBaseContext();
                    continue;
                }
                break block8;
            }
            var13_13 = 0;
            var1_1 = null;
        }
        if (var1_1 != null) {
            var1_1 = var1_1.getComponentName();
            var0.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", (Parcelable)var1_1);
            var10_10 /* !! */  = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";
            var0.putExtra((String)var10_10 /* !! */ , (Parcelable)var1_1);
        }
        var0.setType("text/plain");
        var0.putExtra("android.intent.extra.SUBJECT", var3_3);
        var0.putExtra("android.intent.extra.TEXT", (CharSequence)var4_4);
        var0.setAction((String)var6_6);
        var0.removeExtra("android.intent.extra.STREAM");
        var0.setClipData(null);
        var13_13 = var0.getFlags() & -2;
        var0.setFlags(var13_13);
        var0 = Intent.createChooser((Intent)var0, (CharSequence)var2_2);
        Intrinsics.checkNotNullExpressionValue(var0, "from(activity)\n        .setType(\"text/plain\")\n        .setChooserTitle(intentTitle)\n        .setSubject(intentSubject)\n        .setText(content)\n        .createChooserIntent()");
        return var0;
    }

    public static final String c(C13 object, Context object2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object2, string2);
        object = o72_0.b(object.a((Context)object2));
        try {
            object2 = ((ie2_2)object).h();
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                xj3_1.b((Closeable)object, throwable);
                throw throwable2;
            }
        }
        xj3_1.b((Closeable)object, null);
        return object2;
    }
}

