/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Environment
 */
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.ratings.UploadImageAttributes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lR1
 */
public final class lr1_0 {
    public static final lR1$a Companion;
    public final Context a;
    public final J82 b;
    public String c;
    public Uri d;
    public final List e;
    public boolean f;
    public final N3 g;
    public final N3 h;
    public final N3 i;
    public final N3 j;
    public final N3 k;

    static {
        lR1$a lR1$a;
        Companion = lR1$a = new Object();
    }

    public lr1_0(Context object, K3 k3, J82 object2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(k3, "registry");
        Intrinsics.checkNotNullParameter(object2, "onImageSelectionListener");
        this.a = object;
        this.b = object2;
        this.c = "";
        object = xx_2.i("image/jpg", "image/jpeg", "image/png");
        this.e = object;
        object2 = new ir1_0(this);
        String string2 = "Open Gallery";
        object = k3.d(string2, (x3)object, (w3)object2);
        this.g = object;
        super();
        object2 = new jr1_1(this);
        object = k3.d("Request Gallery Permission", (x3)object, (w3)object2);
        this.h = object;
        super();
        object2 = new f81(this);
        object = k3.d("Request Camera Permission", (x3)object, (w3)object2);
        this.i = object;
        super();
        object2 = new kr1_2(this);
        object = k3.d("Open Camera", (x3)object, (w3)object2);
        this.j = object;
        super();
        object2 = new vo_2(this);
        object = k3.d(string2, (x3)object, (w3)object2);
        this.k = object;
    }

    public final boolean a(Uri object) {
        boolean bl2;
        int n3;
        Object object2;
        return object != null && (object = (object2 = this.a.getContentResolver()).getType((Uri)object)) != null && (n3 = object.length()) != 0 && (bl2 = (object2 = this.e).contains(object));
        {
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final UploadImageAttributes b(Uri var1_1) {
        block19: {
            block22: {
                block21: {
                    var2_2 /* !! */  = this.a;
                    var3_8 = null;
                    var4_9 = AJIOApplication.Companion;
                    var4_9.getClass();
                    var4_9 = AJIOApplication$a.a();
                    var4_9 = var4_9.getFilesDir();
                    var5_10 = System.currentTimeMillis();
                    var7_11 = String.valueOf(var5_10);
                    var9_13 = new StringBuilder();
                    var9_13.append((String)var7_11);
                    var7_11 = ".jpg";
                    var9_13.append((String)var7_11);
                    var7_11 = var9_13.toString();
                    var8_12 = new File((File)var4_9, (String)var7_11);
                    var4_9 = "com.ril.ajio.fileProvider";
                    var10_14 = FileProvider.d(var2_2 /* !! */ , (String)var4_9, (File)var8_12);
                    var2_2 /* !! */  = var2_2 /* !! */ .getContentResolver();
                    var4_9 = var1_1;
                    var4_9 = var2_2 /* !! */ .openInputStream(var1_1);
                    var7_11 = new FileOutputStream((File)var8_12);
                    if (var4_9 == null) ** GOTO lbl30
                    try {
                        ol3_0.b((InputStream)var4_9, (OutputStream)var7_11);
lbl30:
                        // 2 sources

                        ** try [egrp 4[TRYBLOCK] [38 : 166->216)] { 
lbl31:
                        // 1 sources

                        ** GOTO lbl37
                    }
                    catch (Throwable var2_3) {}
                    ** GOTO lbl-1000
lbl34:
                    // 2 sources

                    catch (Exception v0) {
                        block20: {
                            block18: {
                                var2_2 /* !! */  = null;
                                break block20;
lbl37:
                                // 1 sources

                                var11_15 = var8_12.getAbsolutePath();
                                var12_16 = "REVIEW_IMAGE";
                                var13_17 = "START";
                                var14_18 = 3576;
                                var9_13 = var2_2 /* !! */ ;
                                var2_2 /* !! */  = new UploadImageAttributes(var11_15, var10_14, var12_16, null, false, null, 0, null, null, var13_17, false, null, var14_18, null);
                                if (var4_9 == null) ** GOTO lbl46
                                try {
                                    var4_9.close();
lbl46:
                                    // 2 sources

                                    var7_11.close();
                                    if (var4_9 == null) break block18;
                                }
                                catch (Exception v1) {}
                                var4_9.close();
                            }
                            var7_11.close();
                            return var2_2 /* !! */ ;
                            catch (Throwable var2_5) {
                                var7_11 = null;
                            }
lbl-1000:
                            // 2 sources

                            {
                                var3_8 = var4_9;
                                break block19;
                            }
                            catch (Exception v2) {
                                var2_2 /* !! */  = null;
                                var7_11 = null;
                                break block20;
                            }
                            catch (Throwable var2_6) {
                                var7_11 = null;
                                break block19;
                            }
                            catch (Exception v3) {
                                var2_2 /* !! */  = null;
                                var7_11 = null;
                                break block21;
                            }
                        }
                        var3_8 = var4_9;
                    }
                }
                try {
                    var4_9 = yn3_0.a;
                    var8_12 = "Exception while creating file";
                    var9_13 = null;
                    var9_13 = new Object[]{};
                    var4_9.a((String)var8_12, var9_13);
                    if (var3_8 == null) break block22;
                }
                catch (Throwable var2_7) {
                    // empty catch block
                }
                var3_8.close();
            }
            if (var7_11 != null) {
                var7_11.close();
            }
            return var2_2 /* !! */ ;
        }
        if (var3_8 != null) {
            var3_8.close();
        }
        if (var7_11 != null) {
            var7_11.close();
        }
        throw var2_4;
    }

    public final void c() {
        Locale locale = Locale.getDefault();
        Object object = new SimpleDateFormat("yy-MM-dd-HH-mm-ss-SS", locale);
        long l2 = System.currentTimeMillis();
        Object object2 = l2;
        object = ((Format)object).format(object2);
        Intrinsics.checkNotNullExpressionValue(object, "format(...)");
        object2 = Environment.DIRECTORY_PICTURES;
        locale = this.a;
        object2 = locale.getExternalFilesDir((String)object2);
        String string2 = "FNL_";
        CharSequence charSequence = new StringBuilder(string2);
        charSequence.append((String)object);
        charSequence.append("_");
        object = charSequence.toString();
        charSequence = ".jpg";
        object = File.createTempFile((String)object, (String)charSequence, (File)object2);
        this.c = object2 = ((File)object).getAbsolutePath();
        ((File)object).getName();
        Intrinsics.checkNotNullExpressionValue(object, "apply(...)");
        object2 = "com.ril.ajio.fileProvider";
        object = FileProvider.d((Context)locale, (String)object2, (File)object);
        this.d = object;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            object2 = this.j;
            ((N3)object2).a(object);
        }
    }

    public final void d() {
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("image/*");
        String[] stringArray = (String[])this.e;
        boolean bl2 = stringArray.isEmpty();
        boolean bl3 = true;
        if (bl2 ^= bl3) {
            bl2 = false;
            Object object = new String[]{};
            stringArray = stringArray.toArray((T[])object);
            object = "android.intent.extra.MIME_TYPES";
            intent.putExtra((String)object, stringArray);
        }
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", bl3);
        this.k.a(intent);
    }
}

